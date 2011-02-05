package fj
package data

import org.scalacheck.Arbitrary
import org.scalacheck.Arbitrary.arbitrary
import Array.array

object ArbitraryArray {
  implicit def arbitraryArray[A: Manifest : Arbitrary]: Arbitrary[Array[A]] =
    Arbitrary(arbitrary[scala.Array[A]].map(array(_: _*)))
}
