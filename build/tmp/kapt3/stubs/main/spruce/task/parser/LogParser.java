package spruce.task.parser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lspruce/task/parser/LogParser;", "", "()V", "basicParser", "Lkotlin/Function1;", "", "Larrow/core/Option;", "Lspruce/task/parser/LogEntry;", "parse", "Lkotlin/sequences/Sequence;", "content", "parser", "Spruce-parser"})
public final class LogParser {
    private static final kotlin.jvm.functions.Function1<java.lang.String, arrow.core.Option<spruce.task.parser.LogEntry>> basicParser = null;
    public static final spruce.task.parser.LogParser INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.sequences.Sequence<spruce.task.parser.LogEntry> parse(@org.jetbrains.annotations.NotNull()
    kotlin.sequences.Sequence<java.lang.String> content, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, ? extends arrow.core.Option<spruce.task.parser.LogEntry>> parser) {
        return null;
    }
    
    private LogParser() {
        super();
    }
}