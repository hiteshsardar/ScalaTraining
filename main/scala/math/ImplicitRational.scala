package math

class ImplicitRational(n: Int, d: Int = 1) {

  val numer: Int = n
  val denom: Int = d

  def + (rational: ImplicitRational): ImplicitRational ={
    new ImplicitRational( numer * rational.denom + rational.numer * denom, denom * rational.denom)
  }

  def + (implicit no: Int): ImplicitRational ={
    new ImplicitRational( denom * no + numer, denom)
  }
  override def toString()= numer + "/" + denom

}



