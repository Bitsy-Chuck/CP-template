# CP-template
Java competitive template
This will help you create and run codes from templates automatically for java and cpp.

## FOR WINDOWS OS (Using CMD)
Support has been added for codeforces, codechef and atcoder.

for codeforces use cf
for codechef use cc
for atcoder use atc

To run you need to do the following on windows, you need to run alias.cmd everytime your cmd boots up.
> 1. Create shortcut of alias.cmd
> 2. press Windows+R and type "shell:startup"
> 3. Put your shortcut into that folder. Now you can use alias defined in the alias.cmd.

How to create codes
> 1. Open create.cmd and edit the line 2 to the path of your templates folder.
> 2. Syntax is ```c <filename> <platform> <cpp or java>```

  NOTE: c is defined as alias for creating. You can go to alias.cmd to change it to whatever you like.

How to run codes
> 1. Syntax is ```r <filename> <platform> <cpp or java>```

NOTE: for codeforces the java template would replace the class name as the filename and would declare the class as public

Template has all the templates. You can read them at your convinence.
Top are ProblemSolver class, InputReader, OutputWriter, Number Theory and Debug class.

#### Maybe future update:  To analyse the bytecode using asm or something to get the variable name. Current verdict is that it cannot be done and I think that is true (and No, reflection does not work for local variables).