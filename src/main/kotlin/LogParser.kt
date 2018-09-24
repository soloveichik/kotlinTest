package spruce.task.parser

import arrow.core.*
import java.util.*

object LogParser {
    private val basicParser: (String) -> Option<LogEntry> = { s ->
        val parts = s.split(',')
        if (parts.size == 4) {
            Try {
                parts[0].toInt()
            }
            .toOption() //swallows error if not parsed
            .map { LogEntry(it, parts[1], UUID.fromString(parts[2]), parts[3]) }
        } else {
            None
        }
    }
    fun parse(content: Sequence<String>, parser: ((String) -> Option<LogEntry>) = basicParser): Sequence<LogEntry> {
        val folder: (MutableList<LogEntry>, Option<LogEntry>) -> MutableList<LogEntry> = { lst, entry ->
            when (entry) {
                is Some -> { lst.add(entry.t); lst }
                is None -> { println("WARN|failed to parse log line"); lst}
            }
        }
        return content
                .map{ parser(it) }
                .fold( mutableListOf(), folder)
                .asSequence()
    }
}

