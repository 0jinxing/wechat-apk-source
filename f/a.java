package f;

public abstract class a
{
  public final int height;
  public final int width;

  protected a(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public abstract byte[] chS();

  public abstract byte[] n(int paramInt, byte[] paramArrayOfByte);

  public String toString()
  {
    byte[] arrayOfByte = new byte[this.width];
    StringBuilder localStringBuilder = new StringBuilder(this.height * (this.width + 1));
    int j;
    for (int i = 0; ; i++)
    {
      if (i >= this.height)
        return localStringBuilder.toString();
      arrayOfByte = n(i, arrayOfByte);
      j = 0;
      if (j < this.width)
        break;
      localStringBuilder.append('\n');
    }
    int k = arrayOfByte[j] & 0xFF;
    int m;
    if (k < 64)
    {
      k = 35;
      m = k;
    }
    while (true)
    {
      localStringBuilder.append(m);
      j++;
      break;
      if (k < 128)
      {
        k = 43;
        m = k;
      }
      else if (k < 192)
      {
        k = 46;
        m = k;
      }
      else
      {
        k = 32;
        m = k;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     f.a
 * JD-Core Version:    0.6.2
 */