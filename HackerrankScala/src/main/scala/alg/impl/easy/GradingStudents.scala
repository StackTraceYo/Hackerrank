package alg.impl.easy

object GradingStudents {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var grades = new Array[Int](n);
    for (grades_i <- 0 to n - 1) {
      grades(grades_i) = sc.nextInt();
    }
    val moveToNext5 = (n: Int) => n + (5 - n % 5)
    val isWithin3 = (n: Int) => (moveToNext5(n) - n) < 3
    val hardFail = (n: Int) => n < 38

    grades
      .map(grade => if (!hardFail(grade) && isWithin3(grade)) moveToNext5(grade) else grade)
      .foreach(println(_))


  }
}