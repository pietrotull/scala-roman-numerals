package fi.piet.roman

import scala.collection.immutable.HashMap

class RomanConverter {
  val cons = HashMap("I" -> 1, "IV" -> 4, "V" -> 5, "IX" -> 9, "X" -> 10, "XL" -> 40, "L" -> 50, "XC" -> 90, "C" -> 100)

  def toArabic(src: String): Int = {
    if (src.length() == 0) {
      0
    } else {
      val step = if (src.length() >= 2 && cons.contains(src take 2)) 2 else 1
      val arabicNumber = cons.get(src take step);
      arabicNumber.get + toArabic(src.substring(step));
    }
  }
}