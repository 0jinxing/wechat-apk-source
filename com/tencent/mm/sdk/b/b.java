package com.tencent.mm.sdk.b;

public abstract class b
{
  public Runnable callback = null;
  protected boolean xxG;
  private int xxH = 0;

  final int dnS()
  {
    if (this.xxH == 0)
      this.xxH = getClass().getName().hashCode();
    return this.xxH;
  }

  public final boolean dnT()
  {
    return this.xxG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.b.b
 * JD-Core Version:    0.6.2
 */