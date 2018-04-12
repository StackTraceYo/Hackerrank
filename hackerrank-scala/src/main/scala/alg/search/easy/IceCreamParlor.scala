package alg.search.easy

object IceCreamParlor {

  /*
        Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together  dollars for ice cream. On any given day, the parlor offers a line of  flavors. Each flavor, , is numbered sequentially with a unique ID number from  to  and has a cost, , associated with it.

      Given the value of  and the cost of each flavor for  trips to the Ice Cream Parlor, help Sunny and Johnny choose two flavors such that they spend their entire pool of money () during each visit. For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.

      Note: Two ice creams having unique IDs  and  may have the same cost (i.e., ).

      Input Format

      The first line contains an integer, , denoting the number of trips to the ice cream parlor. The  subsequent lines describe all of Sunny and Johnny's trips to the parlor; each trip is described as follows:

      The first line contains .
      The second line contains .
      The third line contains  space-separated integers denoting the cost of each respective flavor. The  integer corresponding to the cost, , for the ice cream with ID number  (where ).
      Constraints

      , where
      It is guaranteed that there will always be a unique solution.
      Output Format

      Print two space-separated integers denoting the respective ID numbers for the flavors they choose to purchase, where the smaller ID is printed first and the larger ID is printed second. Recall that each ice cream flavor has a unique ID number in the inclusive range from  to .

      Sample Input

      2
      4
      5
      1 4 5 3 2
      4
      4
      2 2 4 3
      Sample Output

      1 4
      1 2
      Explanation

      Sunny and Johnny make the following two trips to the parlor:

      The first time, they pool together  dollars. There are five flavors available that day and flavors  and  have a total cost of . Thus, we print 1 4 on a new line.
      The second time, they pool together  dollars. There are four flavors available that day and flavors  and have a total cost of . Thus, we print 1 2 on a new line.
   */


  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;
    while (a0 < t) {
      var m = sc.nextInt();
      var n = sc.nextInt();
      var arr = new Array[Int](n);
      for (arr_i <- 0 to n - 1) {
        arr(arr_i) = sc.nextInt();
      }
      val filtered = arr
        .toList
        .zipWithIndex
        .map(x => x.swap)
        .filter(pair => pair._2 < m)

      var stop = false
      for (pair <- filtered if !stop) {
        val one = pair._2
        val two = filtered.find(pairTwo => pairTwo._2 + one == m)
        if (two.isDefined) {
          if (pair._1 != two.get._1) {
            stop = true
            println(Array(pair._1, two.get._1).map(_ + 1).sorted.mkString(" "))
          }
        }
      }
      a0 += 1;
    }
  }


}
