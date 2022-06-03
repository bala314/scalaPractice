 class practiceScala {

    val ar = List("harpreet", "bala", "neela", "suresh", "sindhu")

    def printNames= {
      for (i <- 0 to ar.length-1) {
        println("Welcome " +ar(i))
      }
    }
  }
