@echo off

:: Commands

DOSKEY ls=dir
DOSKEY alias= atom D:\ll\python\alias.cmd
DOSKEY c=  D:\ll\python\cmds\create.cmd $*
DOSKEY test=  D:\ll\python\cmds\test.bat $*
DOSKEY r=  D:\ll\python\cmds\run.cmd $*
DOSKEY ccon=  D:\ll\python\cmds\create_contest.cmd $*
DOSKEY template_cc= atom D:\ll\python\cmds\templates\template_cc.java
DOSKEY template_atc= atom D:\ll\python\cmds\templates\template_atc.java
DOSKEY template_cf= atom D:\ll\python\cmds\templates\template_cf.java
DOSKEY python2= C:\python27\python.exe $*

:: Common directories

DOSKEY code=cd "D:\ll\python"
DOSKEY cmds= cd "D:\ll\python\cmds"
DOSKEY cc = cd "D:\ll\python\c++\codechef\"
DOSKEY cf = cd "D:\ll\python\CodeForces-Contest"
DOSKEY atc = cd "D:\ll\python\Atcoder"
