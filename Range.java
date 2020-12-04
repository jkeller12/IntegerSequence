import java.util.NoSuchElementException;

public class Range implements IntegerSequence
{
  private int start, end, current;

  // Start: the starting value (inclusive) <= end
  // End: the ending value, inclusive

  public Range(int start, int end)
  {

  }

  public void reset()
  {

  }

  public int length()
  {

  }

  public boolean hasNext()
  {
    // When current isn't a valid element in teh range, it should
    // return false.

  }

  public int next()
  {
    // Throws NoSuchElementException when hasNext() is false
    // This will return the current value, and increase current
    // value by 1.


  }

}
