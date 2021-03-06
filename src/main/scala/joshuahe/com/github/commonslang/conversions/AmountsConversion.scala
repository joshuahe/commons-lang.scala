package joshuahe.com.github.commonslang.conversions


import java.math.{BigDecimal => JBigDecimal}
/**
  * Created by Jing on 11/08/15.
  */
object AmountsConversion {


  implicit def safeJBigDecimal2BigDecimal(amount:JBigDecimal) = {

    if (amount==null) BigDecimal(0) else BigDecimal(amount)

  }

  implicit def bigDecimal2JBigDecimal(amount: BigDecimal) = {

    amount.bigDecimal
  }

  implicit def int2JBigDecimal(i:Int) = {

    new JBigDecimal(i)

  }

  implicit def double2JBigDecimal(d:Double) = {

    new JBigDecimal(d)

  }

}
