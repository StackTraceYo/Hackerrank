package alg.warmup

object CompareTheTriplets {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();


    val values = List(a0, a1, a2).zip(List(b0, b1, b2))
      .map(x => if(x._1 > x._2) 1 else if (x._2 > x._1) 2 else 0)
      .groupBy(identity)
      .mapValues(_.size)

    val alice = values.getOrElse(1, 0)
    val bob = values.getOrElse(2, 0)

    println(s"$alice $bob")

  }
}
