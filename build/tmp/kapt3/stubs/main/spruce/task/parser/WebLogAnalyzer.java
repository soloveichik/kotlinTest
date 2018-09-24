package spruce.task.parser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u00110\t0\u0017J$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u00110\t0\u0017J$\u0010\u0019\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u00110\t0\u0017J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bRu\u0010\f\u001af\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012(\u0012&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u00110\t0\u000f0\u0003\u0012\u0004\u0012\u00020\u00120\rj&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u00110\t0\u000f`\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lspruce/task/parser/WebLogAnalyzer;", "", "data", "Lkotlin/sequences/Sequence;", "Lspruce/task/parser/LogEntry;", "(Lkotlin/sequences/Sequence;)V", "getData", "()Lkotlin/sequences/Sequence;", "lstData", "", "getLstData", "()Ljava/util/List;", "reportPrinter", "Lkotlin/Function3;", "", "", "", "Lkotlin/Pair;", "", "Lspruce/task/parser/Printer;", "getReportPrinter", "()Lkotlin/jvm/functions/Function3;", "generatePagesByUniqueHits", "", "generateUserByUniquePageViews", "genereatePagesByNumberOfUsers", "printPagesByNumberOfUsers", "printPagesByUniqueHits", "printUserByUniquePageViews", "Spruce-parser"})
public final class WebLogAnalyzer {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<spruce.task.parser.LogEntry> lstData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, kotlin.sequences.Sequence<? extends java.util.Map.Entry<java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>>>>, kotlin.Unit> reportPrinter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.sequences.Sequence<spruce.task.parser.LogEntry> data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<spruce.task.parser.LogEntry> getLstData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, kotlin.sequences.Sequence<? extends java.util.Map.Entry<java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>>>>, kotlin.Unit> getReportPrinter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>>> genereatePagesByNumberOfUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>>> generatePagesByUniqueHits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>>> generateUserByUniquePageViews() {
        return null;
    }
    
    public final void printUserByUniquePageViews() {
    }
    
    public final void printPagesByUniqueHits() {
    }
    
    public final void printPagesByNumberOfUsers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.sequences.Sequence<spruce.task.parser.LogEntry> getData() {
        return null;
    }
    
    public WebLogAnalyzer(@org.jetbrains.annotations.NotNull()
    kotlin.sequences.Sequence<spruce.task.parser.LogEntry> data) {
        super();
    }
}