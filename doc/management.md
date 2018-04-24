Spark management
================

Master
------

To start a **master** node: `$ [SPARK_HOME]/sbin/start-master.sh [--webui.port <PORT>]`
To stop a **master** node: `$ [SPARK_HOME]/sbin/stop-master.sh`

Once the master is up&running the Web User Interface is accessible in `http://localhost:8080`, or the port defined when startup the master.

>*Example*:
>
>Start a master node in out local environment: `$ [SPARK_HOME]/sbin/start-master.sh`. Then access to console, form a browser: `http://localhost:8080`, and you can check the URL is *`spark://josemoreno.local:7077`*

![spark-web-ui-master-only][spark-web-ui-master-only]

> The **URL** field is the **fully-qualified Spark master URL**. It will be used in many scenarios.
 

Worker/Slave nodes
------------------

Once you have master up&running  you can start worker/slave nodes.

To start a slave worker node: `$ [SPARK_HOME]/sbin/start-slave.sh [SPARK_MASTER_MASTER_URL]`
To stop one slave worker node: `$ [SPARK_HOME]/sbin/stop-slave.sh`

>*Example*:
>
>To start a worker node attached to previous master: `$ ./sbin/start-slave.sh spark://josemoreno.local:7077`. Next image shows the master with the just started worker.

![spark-web-ui-one-worker][spark-web-ui-one-worker]


Start shell attached to a cluster
---------------------------------

`$ [SPARK_HOME]/bin/spark-shell [SPARK_MASTER_MASTER_URL]`

> *Example*:
>
> Start shell attahced to previous example master node:
> `$ [SPARK_HOME]/bin/spark-shell spark://josemoreno.local:7077`
> 


Stop a custer
-------------

To stop all workers and master node: `$ [SPARK_HOME]/sbin/stop-all.sh`


[spark-web-ui-master-only]: ./images/spark-web-ui-master-only.png "Spark WebUI master only"
[spark-web-ui-one-worker]: ./images/spark-web-ui-one-worker.png "Spark WebUI one worker"
