package android.support.constraint.a;

final class g$b<T>
  implements g.a<T>
{
  private final Object[] gH = new Object[256];
  private int gI;

  public final T aA()
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

  public final void b(T[] paramArrayOfT, int paramInt)
  {
    int i = paramInt;
    if (paramInt > paramArrayOfT.length)
      i = paramArrayOfT.length;
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      T ? = paramArrayOfT[paramInt];
      if (this.gI < this.gH.length)
      {
        this.gH[this.gI] = ?;
        this.gI += 1;
      }
    }
  }

  public final boolean release(T paramT)
  {
    if (this.gI < this.gH.length)
    {
      this.gH[this.gI] = paramT;
      this.gI += 1;
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.g.b
 * JD-Core Version:    0.6.2
 */