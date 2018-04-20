Introduction to Spark
=====================

Spark is a distributed data processing framework and engine. The main goals of these frameworks are:

  - Capable for processing block of data distributed across acluster of computers.
  - Process data in a parallel way, so a huge amount of data processing can be divided into multiple task processed in parallel, so processing time can be reduced.
  - Capable to use all processing power (cores or processors) in a computer.
  - Capable to use all available computers in a cluster.


Spark have APIs in differente languages:

  - Scala
  - Python
  - Java
  - SQL
  - R

And also it has a **REPL** (Read, Evaluate, Print and Loop) CLI interface.

The main Spark component is the **Apache Spark Core**, core processing engine. It's the one which is able to deal with distrubuted task. In addition, Spark comes with a stack of domain specific libraries for big data processing needs.

![alt text][logo]

Library | Usage | Supported languages  
--- | --- | --- |
Spark SQL | Enables the use of **SQL** or **DataFrame API** inside Spark applications | Scala Java Python R
Spark Streamming | Enables processing of live data streams | Scala Java Python
Spark MLlib | Enables development of *machine learning* applications | Scala Java Python R
Spark GraphX | Enables graph processing and supports a growing library of graph algorithms | Scala


[logo]: ./images/spark-stack.png "Apache Spark stack"
