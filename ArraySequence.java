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

  }

  public void reset()
  {
    currentIndex = 0;

  }

  public ArraySequence(IntegerSequence otherseq)
  {

    for(int i = 0; i < otherseq.length(); i++)
    {
      data[i] = otherseq.next();
    }
    otherseq.reset(); 


    // Postcondition: otherseq will be reset


  }

}
