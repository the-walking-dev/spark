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

![spark-stack][spark-stack]

Library | Usage | Supported languages  
--- | --- | --- |
Spark SQL | Enables the use of **SQL** or **DataFrame API** inside Spark applications | Scala Java Python R
Spark Streamming | Enables processing of live data streams | Scala Java Python
Spark MLlib | Enables development of *machine learning* applications | Scala Java Python R
Spark GraphX | Enables graph processing and supports a growing library of graph algorithms | Scala


Deployment
----------

Spark can be deployed in:
  - **standalone mode** on a single node. 
  - in a **cluster** on:
    - [Hadoop YARN](https://hadoop.apache.org/docs/current/hadoop-yarn/hadoop-yarn-site/YARN.html)
    - [Apache Mesos](http://mesos.apache.org/) 
  - in cloud infrastructure, like:
    - [AWS EMR](https://aws.amazon.com/emr/) 
    - [Google Dataproc](https://cloud.google.com/dataproc/).


Data stores
-----------

Spark can access data from a huge variety of data storages, like:

  - HDFS
  - Apache Cassandra
  - HBase
  - Hive
  - ...


Application Fundamentals
------------------------

In distributed applications is common to have **one driver programm** that control the execution and **N worker nodes**.

Driver program allocates task to the workers. In a Spark  application the `SparkContext` object is the driver program and it communicates with the cluster manager to run the tasks. It submits the *Spark jobs* to the nodes.


[spark-stack]: ./images/spark-stack.png "Apache Spark stack"
