import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence
{
  private int currentIndex;
  private int[] data;

  //Construct the sequence by copying values from the other array into the data array
  public ArraySequence(int[] other)
  {
    for(int i = 0; i < other.length; i++)
    {
      data[i] = other[i];
    }
  }

  public boolean hasNext()
  {
    return (currentIndex >= 0 && currentIndex <= data.length);
  } //does the sequence have more elements?

  public int next()
  {
    if(!hasNext())
    {
      throw new NoSuchElementException("woopd");
    }
    return data[currentIndex ++];
  }

  public int length()
  {
    return data.length;

  }     //returns the total length of the sequence

  public void reset()
  {
    currentIndex = 0;

  }     //start over from the start of the sequence

}
