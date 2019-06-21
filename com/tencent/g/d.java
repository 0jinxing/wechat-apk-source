package com.tencent.g;

public abstract class d<T extends e>
{
  private T[] AHz = dSC();
  private final Object mLock = new Object();
  private int qyr;

  private T dSF()
  {
    e locale = null;
    synchronized (this.mLock)
    {
      if (this.qyr > 0)
      {
        this.qyr -= 1;
        locale = this.AHz[this.qyr];
        this.AHz[this.qyr] = null;
      }
      return locale;
    }
  }

  public final void a(T paramT)
  {
    synchronized (this.mLock)
    {
      int i = this.AHz.length;
      if (this.qyr < i)
      {
        this.AHz[this.qyr] = paramT;
        this.qyr += 1;
      }
      return;
    }
  }

  protected abstract T[] dSC();

  protected abstract T dSD();

  public final T dSE()
  {
    e locale = dSF();
    if (locale == null)
      locale = dSD();
    while (true)
    {
      return locale;
      locale.reset();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.g.d
 * JD-Core Version:    0.6.2
 */