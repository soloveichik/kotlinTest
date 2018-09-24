package spruce.task.parser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00042\b\b\u0002\u0010\f\u001a\u00020\bJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002\u00a8\u0006\u000f"}, d2 = {"Lspruce/task/parser/LogGenerator;", "", "()V", "createTestLogFile", "Larrow/core/Either;", "Lspruce/task/parser/LogGeneratorError;", "", "fullFilePath", "", "generateFakeLogData", "Lkotlin/sequences/Sequence;", "readLogFile", "fileFullPath", "saveLog", "logData", "Spruce-parser"})
public final class LogGenerator {
    public static final spruce.task.parser.LogGenerator INSTANCE = null;
    
    private final kotlin.sequences.Sequence<java.lang.String> generateFakeLogData() {
        return null;
    }
    
    private final void saveLog(java.lang.String fileFullPath, kotlin.sequences.Sequence<java.lang.String> logData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final arrow.core.Either<spruce.task.parser.LogGeneratorError, kotlin.Unit> createTestLogFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fullFilePath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final arrow.core.Either<spruce.task.parser.LogGeneratorError, kotlin.sequences.Sequence<java.lang.String>> readLogFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileFullPath) {
        return null;
    }
    
    private LogGenerator() {
        super();
    }
}