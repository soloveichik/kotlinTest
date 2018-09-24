package spruce.task.parser

import arrow.core.*
import java.io.*
import java.util.*
import kotlin.coroutines.experimental.buildSequence

sealed class LogGeneratorError(val message: String, val cause: Throwable) {
    class FailedToRead(message: String, cause: Throwable): LogGeneratorError(message, cause)
    class FailedToWrite(message: String, cause: Throwable): LogGeneratorError(message, cause)
}

object LogGenerator {
    private fun generateFakeLogData(): Sequence<String> {
        val random = Random()
        val users = listOf(
                "Pasha",
                "Sasha",
                "Masha",
                "Dasha",
                "Petya",
                "Vasya"
        )
        val pages = listOf(
                "/index.html",
                "/media/image1.png",
                "/media/image2.png",
                "/scripts/script.js",
                "/about.html",
                "/styles/stylesheet.css",
                "/contacts.html",
                "/feedback.html"
        )
        val timeRange = 10

        fun rand(from: Int, to: Int): Int {
            return random.nextInt(to - from) + from
        }
        return buildSequence {
            for (time in 1..timeRange) {
                val howManySessions = rand(1, users.size*2)
                for(session in 1 .. howManySessions) {
                    val sessionId = UUID.randomUUID()
                    val user = rand(0, users.size)
                    val howManyPages = rand(1, pages.size)
                    for (page in 1 .. howManyPages) {
                        val page = rand(0, pages.size)
                        yield("$time,${users[user]},${sessionId.toString()},${pages[page]}")
                    }

                }
            }
        }
    }

    private fun saveLog(fileFullPath: String, logData: Sequence<String>) {
        File(fileFullPath)
            .bufferedWriter()
            .use { out ->
                logData.forEach { out.write(it + "\n" ) }
            }
    }

    fun createTestLogFile(fullFilePath: String = "web.log"): Either<LogGeneratorError,Unit> {
        return Try {
            val logLines = generateFakeLogData()
            saveLog(fullFilePath, logLines)
        }
        .toEither()
        .mapLeft  { LogGeneratorError.FailedToWrite("Error while creating test log file", it)}

    }

    fun readLogFile(fileFullPath: String = "web.log"): Either<LogGeneratorError,Sequence<String>> {
        return Try {
            File(fileFullPath)
                    .inputStream()
                    .bufferedReader()
                    .lineSequence()
        }
        .toEither()
        .mapLeft { LogGeneratorError.FailedToRead("Error reading file", it) }
    }
}

