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

  pubic boolean hasNext
  {
    return (current >= 0 && current <= data.length);
  } //does the sequence have more elements?

  public int next()
  {
    if(!hasNext())
    {
      throw new NoSuchElementException("woopd");
    }
    return data[currentIndex++];
  }

  public int length()
  {

  }     //returns the total length of the sequence

  public void reset()
  {

  }     //start over from the start of the sequence

}
