@echo off

set name=%1
set pf=%2
if "%pf%" == "" (set pf=cc) else (set pf=cf)
echo %name% is the name
if "%name%" == "" (goto :error) else (goto :noerror)
:error
  echo please give name of file
  GOTO end

:noerror
  set "result=%name:.=" & set "result=%"
  for /f "tokens=1 delims=." %%a in ("%name%") do (
  set class_name=%%a
  )
  echo %result%
  if "%result%"=="%name%" (set file_name=%name%.java) else (set file_name=%name%)
  set path_of_file=D:\ll\python
  echo %file_name% and %class_name%
  echo making from template at %path_of_file%\template.java
  type %path_of_file%\template.java >> %file_name%
  ::goto :end
  :changename


:changename
    fart %file_name% {REPLACE_THIS_WITH_NAME} %class_name%
    atom %file_name%

:end
