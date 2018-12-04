package scala.com.scalatest.monad

/**
  * In functional programming, a monad is a design pattern that allows structuring programs
  * generically while automating away bookkeeping code needed by the program logic.
  * Monads achieve this by providing their own data type, which represents a specific form of computation,
  * along with one procedure to wrap values of any basic type within the monad (yielding a monadic value)
  * and another to compose functions that output monadic values (called monadic functions).
  * @tparam M
  */
trait Monad[M[_]] {
  def unit[A](a : A) : M[A]
  def join[A](mma : M[M[A]]) : M[A]
}
