package com.tencent.mm.plugin.appbrand.jsapi.audio;

public abstract class a
  implements c, Runnable
{
  private long hzT = 0L;
  private long hzU = 0L;

  public final void aCr()
  {
    this.hzT = System.currentTimeMillis();
    b.I(this);
  }

  public final void aCs()
  {
    this.hzT = System.currentTimeMillis();
    Dp();
  }

  public void run()
  {
    this.hzU = System.currentTimeMillis();
    Dp();
  }

  public void wM()
  {
    String str = getClass().getName();
    if (str.contains("$"))
    {
      str.substring(str.lastIndexOf("$") + 1);
      System.currentTimeMillis();
      System.currentTimeMillis();
      this.hzU = 0L;
      this.hzT = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.a
 * JD-Core Version:    0.6.2
 */