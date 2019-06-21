package com.tencent.mm.sdk.e;

import android.os.Looper;

public abstract class k
  implements g
{
  protected final l<a, m> xDf = new l()
  {
  };
  private final l<Object, String> xDg = new l()
  {
  };

  public void a(a parama, Looper paramLooper)
  {
    this.xDf.a(parama, paramLooper);
  }

  public final void anF(String paramString)
  {
    paramString = new m(paramString);
    this.xDf.cF(paramString);
    this.xDf.doNotify();
  }

  public void b(String paramString, int paramInt, Object paramObject)
  {
    m localm = new m();
    localm.ctq = paramString;
    localm.hsh = paramInt;
    localm.obj = paramObject;
    localm.xDr = this;
    this.xDf.cF(localm);
    this.xDf.doNotify();
  }

  public void c(a parama)
  {
    this.xDf.a(parama, Looper.getMainLooper());
  }

  public void d(a parama)
  {
    this.xDf.remove(parama);
  }

  public final void doNotify()
  {
    m localm = new m("*");
    this.xDf.cF(localm);
    this.xDf.doNotify();
  }

  public void lock()
  {
    this.xDf.lock();
  }

  public void unlock()
  {
    this.xDf.unlock();
  }

  public static abstract interface a
  {
    public abstract void a(String paramString, m paramm);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.k
 * JD-Core Version:    0.6.2
 */