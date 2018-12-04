package scala.com.scalatest.monad

/**
  * Semigroup is an algebraic structure consisting of a set together with
  * an associative binary operation.
  *
  * A group in Category theory category C must follow
  * 1) m : a，b ∈ G => a*b ∈ G(associativity)
  * 2) e : 1 → G (inclusion of the identity element)
  * 3) inv: G → G (inversion operation)
  *
  * @tparam A element in the group
  */
trait SemiGroup[A] {
  def op(a1 : A, a2 : A) : A
}
