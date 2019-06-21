package com.tencent.mm.sdk.e;

import android.os.Looper;

public abstract class n
  implements h
{
  private final l<b, a> xDf = new l()
  {
  };

  public final void a(b paramb)
  {
    if (paramb != null)
      this.xDf.a(paramb, Looper.getMainLooper());
  }

  public final void a(b paramb, Looper paramLooper)
  {
    this.xDf.a(paramb, paramLooper);
  }

  protected abstract boolean apK();

  public final void b(int paramInt, n paramn, Object paramObject)
  {
    this.xDf.cF(new a(paramInt, paramn, paramObject));
    this.xDf.doNotify();
  }

  public final void b(b paramb)
  {
    if (paramb != null)
      this.xDf.remove(paramb);
  }

  final class a
  {
    Object obj;
    int xDt;
    n xDu;

    a(int paramn, n paramObject, Object arg4)
    {
      this.xDt = paramn;
      Object localObject;
      this.obj = localObject;
      this.xDu = paramObject;
    }
  }

  public static abstract interface b
  {
    public abstract void a(int paramInt, n paramn, Object paramObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.n
 * JD-Core Version:    0.6.2
 */