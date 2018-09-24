package spruce.task.parser

import java.util.*

data class LogEntry(val time: Int, val user: String, val session: UUID, val path: String)

fun LogEntry.isDocument(): Boolean = when {
   path.endsWith(ApplicationDefaults.DefaultDocumentExtension) -> true
    else -> false
}
