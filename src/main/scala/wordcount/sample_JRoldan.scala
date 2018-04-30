
// persist es una accion que guarda los datos 
val readmeRdd_2: RDD[String] = sc.textFile("README.md").map(l => l).persist()

// cache es un sinónimo de persist, pero sólo en memoria
val readmeRdd_1: RDD[String] = sc.textFile("README.md").map(l => l.).cache()
