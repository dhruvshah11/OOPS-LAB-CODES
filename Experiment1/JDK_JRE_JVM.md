Understanding JDK, JRE, and JVM

JVM (Java Virtual Machine)
- The JVM is an abstract machine that provides a runtime environment for Java bytecode to execute.
- It is platform-dependent (different for Windows, Linux, Mac).
- Main responsibilities:
  - Loads, verifies, and executes Java bytecode
  - Memory management and garbage collection
  - Provides runtime environment for Java applications

JRE (Java Runtime Environment)
- The JRE is an implementation of the JVM along with supporting libraries.
- It contains everything needed to run compiled Java programs but not to develop them.
- Components:
  - JVM
  - Core libraries and supporting files
  - Java application launcher

JDK (Java Development Kit)
- The JDK is a software development kit used to develop Java applications.
- It includes the JRE plus development tools.
- Components:
  - JRE (which includes the JVM)
  - Compiler (javac)
  - Debugger (jdb)
  - Documentation generator (javadoc)
  - Other development tools

Relationship
- JDK contains JRE, which contains JVM
- For development: Use JDK
- For running Java applications: JRE is sufficient
- For executing bytecode: JVM is the core component

Verification of Java Environment
To verify your Java installation, open a command prompt and type:
```
java -version
javac -version
```

If both commands display version information, your Java environment is properly set up.