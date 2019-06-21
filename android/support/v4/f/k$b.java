package android.support.v4.f;

public class k$b<T>
  implements k.a<T>
{
  private final Object[] gH;
  private int gI;

  public k$b(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("The max pool size must be > 0");
    this.gH = new Object[paramInt];
  }

  public T aA()
  {
    Object localObject;
    if (this.gI > 0)
    {
      int i = this.gI - 1;
      localObject = this.gH[i];
      this.gH[i] = null;
      this.gI -= 1;
    }
    while (true)
    {
      return localObject;
      localObject = null;
    }
  }

  public boolean release(T paramT)
  {
    boolean bool = false;
    int i = 0;
    if (i < this.gI)
      if (this.gH[i] != paramT);
    for (i = 1; ; i = 0)
    {
      if (i == 0)
        break label49;
      throw new IllegalStateException("Already in the pool!");
      i++;
      break;
    }
    label49: if (this.gI < this.gH.length)
    {
      this.gH[this.gI] = paramT;
      this.gI += 1;
      bool = true;
    }
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.f.k.b
 * JD-Core Version:    0.6.2
 */