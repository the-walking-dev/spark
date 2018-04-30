Spark
=====

This repo is about learning Spark.


There is a page with [glossary][] of terms.


Documentation
-------------

  - [intro](./doc/intro.md), an introduction to Spark.
  - [management](./doc/management.md), about how to start/stop a Spark cluster.


Exercises and examples
----------------------

### Word Count

[WordCount](./src/main/scala/WordCount.scala) is the first Scala example that counts the words of a this file (the project's README.md).

```
val textFile   = sc.textFile("README.md")
val wordCounts = { textFile
                    .flatMap(line => line.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey((a, b) => a + b)
                 }
wordCounts.collect();
System.exit(0);
```

To run this script, from project root:

```
$ [spark-root]/bin/spark-shell -i src/main/scala/wordcount/WordCount.scala
```

### NBA

There are different samples with NBA data. For example:

```
$ [spark-root]/bin/spark-shell -i src/main/scala/nba/DraftNumberOne.scala
```


Resources
---------

  - [Coursera : Big Data Analysis with Scala and Spark](https://www.coursera.org/learn/scala-spark-big-data)


[glossary]: ./doc/glossary.md "Glossary"
