package alg.impl.easy

object AppleAndOrange {

  def appleAndOrange(s: Int, t: Int, a: Int, b: Int, apple: Array[Int], orange: Array[Int]): Array[Int] = {
    // Complete this function
    //s and t is the house
    // a is where apple is and b is where orange is
    // apple falls
    //orange falls
    val didLandInHouse = (x: Int) => x >= s && x<= t
    val mapDistanceDrop = (start: Int, distance: Int) => start + distance

    val appleFell = apple
      .map(mapDistanceDrop(a, _))
      .count(didLandInHouse)

    val orangeFell = orange
      .map(mapDistanceDrop(b, _))
      .count(didLandInHouse)

    Array(appleFell, orangeFell)

  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var s = sc.nextInt();
    var t = sc.nextInt();
    var a = sc.nextInt();
    var b = sc.nextInt();
    var m = sc.nextInt();
    var n = sc.nextInt();
    var apple = new Array[Int](m);
    for (apple_i <- 0 to m - 1) {
      apple(apple_i) = sc.nextInt();
    }
    var orange = new Array[Int](n);
    for (orange_i <- 0 to n - 1) {
      orange(orange_i) = sc.nextInt();
    }
    val result = appleAndOrange(s, t, a, b, apple, orange);
    println(result.mkString("\n"))


  }
}

