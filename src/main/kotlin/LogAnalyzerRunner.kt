package spruce.task.parser

import arrow.core.*

fun main(args: Array<String>) {
    println("Log Analyzer Started")
    println("Generating test log file...")
    LogGenerator.createTestLogFile(ApplicationDefaults.DefaultLogPath)
    println("Log file generated.")

    fun printLog (data: Sequence<LogEntry>) {
        data.map { println(it)}.toList()
    }

    println("Reading log file and generating reports...")
    val logs =
        LogGenerator.readLogFile(ApplicationDefaults.DefaultLogPath)
        .map {LogParser.parse(it)}

    when (logs) {
        is Either.Left -> when(logs.a) {
            is LogGeneratorError.FailedToWrite -> Unit
            is LogGeneratorError.FailedToRead -> Unit
        }
        is Either.Right -> {
            printLog(logs.b)
            val analyzer = WebLogAnalyzer(logs.b)
            analyzer.printPagesByNumberOfUsers()
            analyzer.printPagesByUniqueHits()
            analyzer.printUserByUniquePageViews()
        }
    }
    println("Done.")
}