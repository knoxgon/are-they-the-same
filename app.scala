/*
    Codewars link:
    https://www.codewars.com/kata/550498447451fbbd7600041c

    Scala solution for the Kata:
    - Are they the "same"?
*/

object Solution {
  def comp(seq1: Seq[Int], seq2: Seq[Int]) : Boolean = {
    if (seq1 == null || seq2 == null) false
    else seq1.sorted.zip(seq2.sorted).forall {
      case (a,b) => a * a == b
      case _ => false
    }
  }
}