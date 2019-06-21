package com.google.android.exoplayer2.b;

public abstract class a
{
  public int flags;

  public void clear()
  {
    this.flags = 0;
  }

  public final void dB(int paramInt)
  {
    this.flags |= paramInt;
  }

  protected final boolean dC(int paramInt)
  {
    if ((this.flags & paramInt) == paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean qF()
  {
    return dC(-2147483648);
  }

  public final boolean qG()
  {
    return dC(4);
  }

  public final boolean qH()
  {
    return dC(1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b.a
 * JD-Core Version:    0.6.2
 */