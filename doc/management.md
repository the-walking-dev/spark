Spark management
================

Master
------

To start a **master** node: `$ [SPARK_HOME]/sbin/start-master.sh [--webui.port <PORT>]`
To stop a **master** node: `$ [SPARK_HOME]/sbin/stop-master.sh`

Once the master is up&running the Web User Interface is accessible in `http://localhost:8080`, or the port defined when startup the master.

*Example*: Start a master node in out local environment: `$ [SPARK_HOME]/sbin/start-master.sh`. Then access to console, form a browser: `http://localhost:8080`, and you can check the URL is *`spark://josemoreno.local:7077`*

![spark-web-ui-master-only][spark-web-ui-master-only]

> The **URL** field is the **fully-qualified Spark master URL**. It will be used in many scenarios.
 

Slaves workers
--------------

To start a slave worker node: `$ [SPARK_HOME]/sbin/start-slave.sh [SPARK_MASTER_MASTER_URL]`
To stop one slave worker node: `$ [SPARK_HOME]/sbin/stop-slave.sh`

![spark-web-ui-one-worker][spark-web-ui-one-worker]


Start shell to a cluster
------------------------

[spark-web-ui-master-only]: ./images/spark-web-ui-master-only.png "Spark WebUI master only"
[spark-web-ui-one-worker]: ./images/spark-web-ui-one-worker.png "Spark WebUI one worker"
