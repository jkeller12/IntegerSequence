public interface IntegerSequence{
  boolean hasNext() ;//does the sequence have more elements?
  int next();         //return the current value in the sequence and advances to the next element
  int length();     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence
}
// What's an integer Sequence
// -> A way to interact w/ a collection of numbers
// -->regardless of underlying implementation.
// -->

// Range Object
// An integer sequence that's contiguous rnage from a to b inclusive [a, b]
// Range doesn't allow for non-consecutvie values
// Can store a big set of number w/o taking up a lot of space!
// You'll implement this using a start/end values//
// Then you'll keep track of the current values
// You'll throw a No Such ElementException when the user tries to
// get the next value when there are no more values left
