package fi.piet.roman

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RomanConverterTest extends Spec with ShouldMatchers {

  val converter = new RomanConverter();

  describe("Converting constants") {
    it("Single char constants return correct arabic values") {
      converter.toArabic("I") should be(1)
      converter.toArabic("V") should be(5)
      converter.toArabic("X") should be(10)
      converter.toArabic("L") should be(50)
      converter.toArabic("C") should be(100)
    }
    it("double char constants return correct arabic values") {
      converter.toArabic("IV") should be(4)
      converter.toArabic("IX") should be(9)
      converter.toArabic("XL") should be(40)
      converter.toArabic("XC") should be(90)
    }
    it("multichar values return correct arabic values") {
      converter.toArabic("VII") should be(7)
      converter.toArabic("XI") should be(11)
    }
  }
}