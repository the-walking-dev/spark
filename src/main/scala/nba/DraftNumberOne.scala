
// LOad players, their statistics and 
val dataBasePath = "src/main/resources/BasketballDB-20130121/"
val cvsLoader = {
    spark.read.format("csv")
        .option("header", "true")
        .option("ionferSchema", "true")
}
val players    = cvsLoader.load(dataBasePath + "basketball_master.csv")
val statistics = cvsLoader.load(dataBasePath + "basketball_players.csv")
val draft      = cvsLoader.load(dataBasePath + "basketball_draft.csv")

println("total players: " + players.count())
println("total statistics: " + statistics.count())
println("total draft: " + draft.count())
System.exit(0);