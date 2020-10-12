@echo off

:: change class_name based on path. if atcode in path, change to Main etc.
set path_of_file=D:\ll\python\cmds\templates
set name=%1
set pf=%2
set cppOrJava=%3


if "%pf%" == "" (set pf=cc)
echo %name% is the name
if "%name%" == "" (goto :error) else (goto :noerror)


:error
  echo please give name of file
  GOTO :end

:noerror
  echo %pf% the value
  if "%cppOrJava%"== "cpp" goto :cpp
  set "result=%name:.=" & set "result=%"
  for /f "tokens=1 delims=." %%a in ("%name%") do (
  set class_name=%%a
  )
  echo %result%
  if "%result%"=="%name%" (set file_name=%name%.java) else (set file_name=%name%)

  echo %file_name% and %class_name%
  if "%pf%"=="cf" goto :cf
  if "%pf%"=="cc" goto :cc
  if "%pf%"=="atc" goto :atc
  :cf
    echo making from template at %path_of_file%\template_cf.java
    type %path_of_file%\template_cf.java >> %file_name%
    ::goto :end
    fart %file_name% {REPLACE_THIS_WITH_NAME} %class_name%
    atom %file_name%
    echo java file created from CodeForces template
    :goto end
  :cc
    echo making from template at %path_of_file%\template_cc.java
    type %path_of_file%\template_cc.java >> %file_name%
    atom %file_name%
    echo java file created from Codechef template
    :goto end
  :atc
    echo making from template at %path_of_file%\template_atc.java
    type %path_of_file%\template_atc.java >> %file_name%
    ::goto :end
    atom %file_name%
    echo java file created from atcoder template
    :goto end

:cpp
  echo "CPP"
  set "result=%name:.=" & set "result=%"
  for /f "tokens=1 delims=." %%a in ("%name%") do (
  set class_name=%%a
  )
  echo %result%
  if "%result%"=="%name%" (set file_name=%name%.cpp) else (set file_name=%name%)
  set path_of_file=D:\ll\python\cmds\templates
  echo %file_name% and %class_name%
  echo making from template at %path_of_file%\template_cpp.cpp
  type %path_of_file%\template_cpp.cpp >> %file_name%
  atom %file_name%
  goto :end

:end
