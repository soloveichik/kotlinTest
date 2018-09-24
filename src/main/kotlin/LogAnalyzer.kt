package spruce.task.parser

typealias Printer<T> = (String, String, Sequence<T>) -> Unit

class WebLogAnalyzer(val data: Sequence<LogEntry>) {
    val lstData = data.toList()
    val reportPrinter : Printer<Map.Entry<Int,List<Pair<String,Int>>>> = {name, header, data ->
        println("========== $name ==========")

        data.forEach {
            println("========== DAY ${it.key} | $header ==========")
            it.value.forEach {
                println("${it.first},${it.second}")
            }
        }
    }

    //just group by number of users visited
    fun genereatePagesByNumberOfUsers(): Map<Int, List<Pair<String,Int>>> {
        fun rankByNumberOfUsers(dayLogs: List<LogEntry>): List<Pair<String,Int>> {
            return (dayLogs
                    .groupBy { it.path }
                    .map {Pair(it.key, it.value.map {it.user}.distinct().count())}
                    .sortedBy { it.second })
        }
        return (
            lstData
            .filter { it.isDocument() }
            .groupBy { it.time }
            .map { Pair(it.key, rankByNumberOfUsers(it.value) ) }
            .toMap())

    }

    //not sure what it mean :) lets see unique sessions+path
    fun generatePagesByUniqueHits(): Map<Int, List<Pair<String,Int>>> {
        fun rankByUniquePageView(dayLogs: List<LogEntry>): List<Pair<String,Int>> {
            return (
                dayLogs
                .groupBy { it.path }
                .map { Pair(it.key, it.value.map { Pair(it.session,it.path) }.distinct().count())}
                )
        }
        return (
            lstData
            .groupBy { it.time }
            .map { Pair(it.key, rankByUniquePageView(it.value)) }
            .toMap())
    }

    //users grouped by sessionsId+path
    fun generateUserByUniquePageViews(): Map<Int, List<Pair<String,Int>>> {
        fun usersByUniquePageViews(dayLog: List<LogEntry>): List<Pair<String, Int>> {
            return (
                dayLog
                .groupBy { it.user }
                .map { Pair(it.key, it.value.map { Pair(it.session, it.path) }.distinct().count())}
            )
        }
        return (
            lstData
            .filter { it.isDocument() }
            .groupBy { it.time }
            .map { Pair(it.key, usersByUniquePageViews(it.value))}
            .toMap())

    }
    fun printUserByUniquePageViews() {
        val report = generateUserByUniquePageViews().asSequence()
        reportPrinter("UserByUniquePageViews", "User,Count", report)
    }
    fun printPagesByUniqueHits() {
        val report = generatePagesByUniqueHits().asSequence()
        reportPrinter("PagesByUniqueHits", "Page,HitCount", report)
    }
    fun printPagesByNumberOfUsers() {
        val report = genereatePagesByNumberOfUsers().asSequence()
        reportPrinter("PagesByNumOfUsers", "Page,UserCount", report)
    }
}