import java.util.NoSuchElementException;

public class Range implements IntegerSequence
{
  private int start, end, current;

  // Start: the starting value (inclusive) <= end
  // End: the ending value, inclusive

  public Range(int start, int end)
  {
    this.start = start;
    this.end = end;
    this.current = start;

  }

  public void reset()
  {
    current = start;


  }

  public int length()
  {
    return end - start;

  }

  public boolean hasNext()
  {
    return (current >= start && current <= end);
    // When current isn't a valid element in teh range, it should
    // return false.

  }

  public int next()
  {
    // Throws NoSuchElementException when hasNext() is false
    // This will return the current value, and increase current
    // value by 1.
    if(!hasNext())
    {
      throw new NoSuchElementException();
    }
    return current++;


  }

}
