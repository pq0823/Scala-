package scala.com.scalatest.monad

/**
  * A functor is a map between categories.
  * A functor F from C to D is a mapping that
  * 1) associates to each object  X in C an object F(X) in D
  * 2) associates to each morphism f : X -> Y in C a morphism F(f): F(X) -> F(Y)} in D such that the following two conditions hold:
  *     1] F(id_x) = id_F(x)
  * @tparam F
  */
trait Functor[F[_]] {
  def map[A, B](a: F[A])(f: A => B): F[B]
}
