@echo off
set name=%1
set pf=%2
set cppOrJava=%3
if "%pf%"=="" set pf=cc
if "%name%"=="" (goto :error) else (goto :noerror)

:noerror
  if "%cppOrJava%"== "cpp" goto :cpp
  set "result=%name:.=" & set "result=%"
  for /f "tokens=1 delims=." %%a in ("%name%") do (
  set class_name=%%a
  )
  
  if "%result%"=="%name%" (set file_name=%name%.java) else (set file_name=%name%)

  if "%pf%"=="cf" goto :cf
  if "%pf%"=="cc" goto :cc
  if "%pf%"=="atc" goto :atc

  :cf
    javac %file_name% & java %class_name% < in.txt
    goto :end
  :cc
    javac %file_name% & java Codechef < in.txt
    goto :end
  :atc
    javac %file_name% & java Main < in.txt
    goto :end
  goto :end

:cpp
  echo running cpp file
  set "result=%name:.=" & set "result=%"
  for /f "tokens=1 delims=." %%a in ("%name%") do (
  set class_name=%%a
  )
  if "%result%"=="%name%" (set file_name=%name%.cpp) else (set file_name=%name%)
  g++ %file_name% & a.exe < in.txt
  goto :end
:error
  echo please give name
:end
