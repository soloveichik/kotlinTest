@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  Spruce-parser startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and SPRUCE_PARSER_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\Spruce-parser.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.2.70.jar;%APP_HOME%\lib\arrow-syntax-0.7.3.jar;%APP_HOME%\lib\arrow-instances-data-0.7.3.jar;%APP_HOME%\lib\arrow-data-0.7.3.jar;%APP_HOME%\lib\arrow-instances-core-0.7.3.jar;%APP_HOME%\lib\arrow-typeclasses-0.7.3.jar;%APP_HOME%\lib\arrow-core-0.7.3.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.2.70.jar;%APP_HOME%\lib\arrow-annotations-0.7.3.jar;%APP_HOME%\lib\kotlin-stdlib-1.2.70.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.2.70.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\kindedj-1.1.0.jar

@rem Execute Spruce-parser
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %SPRUCE_PARSER_OPTS%  -classpath "%CLASSPATH%" spruce.task.parser.LogAnalyzerRunnerKt %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable SPRUCE_PARSER_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%SPRUCE_PARSER_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
