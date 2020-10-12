@echo off
set name=%1
if "%name%"=="" (goto :error) else (goto :noerror)
:noerror
  mkdir %name%
  echo %CD%
  cd %CD%/%name%
  echo %CD%
  atom in.txt
  goto :end
:error
  echo please give name
:end
