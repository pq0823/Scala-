package scala.com.scalatest.monad

/**
  * A monoid is an algebraic structure with a single associative binary operation and an identity element.
  * Monoids are semigroups with identity.
  * 1) Associativity: a，b, c ∈ G => (a • b) • c = a • (b • c).
  * 2) Identity element: Ǝ e ∈ G such that ∀ a ∈ S, e • a = a • e = a.
  * @tparam A element in the group
  */
trait Monoid[A] extends SemiGroup[A]{
  def ident: A
}

