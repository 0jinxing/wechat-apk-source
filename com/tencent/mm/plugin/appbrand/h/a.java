package com.tencent.mm.plugin.appbrand.h;

import android.util.SparseArray;
import com.tencent.mm.d.a.c;
import com.tencent.mm.d.a.l;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class a extends d
  implements i, k, m, q, r, s
{
  private final c cid = r(paramString, paramArrayOfByte);
  public final l ieS = a(this.cid, e.aGX());
  private final e ieT = new e(new a.1(this));
  private m.a ieU;

  public a(String paramString, byte[] paramArrayOfByte)
  {
    paramString = this.ieT;
    ab.i("MicroMsg.AppBrandJ2V8ContextMgr", "setMainContext id:%d", new Object[] { Integer.valueOf(1) });
    paramString.ifa.put(1, this);
  }

  protected abstract l a(c paramc, int paramInt);

  public final void a(m.a parama)
  {
    try
    {
      this.ieU = parama;
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  protected final c aGQ()
  {
    return this.cid;
  }

  protected final l aGR()
  {
    return this.ieS;
  }

  public final boolean aGS()
  {
    return true;
  }

  public final int aGT()
  {
    return e.aGX();
  }

  public final g aGU()
  {
    return this.ieT.oO(1);
  }

  public final g aGV()
  {
    return this.ieT.aGV();
  }

  public void destroy()
  {
    this.ieS.chO.l(new a.2(this));
    e locale = this.ieT;
    SparseArray localSparseArray = locale.ifa;
    int i = 0;
    try
    {
      if (i < locale.ifa.size())
      {
        int j = locale.ifa.keyAt(i);
        if (j != 1)
        {
          ab.i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d", new Object[] { Integer.valueOf(j) });
          if (locale.ifa.get(j) != null)
            break label117;
          ab.w("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d null", new Object[] { Integer.valueOf(j) });
        }
        while (true)
        {
          i++;
          break;
          label117: ((d)locale.ifa.get(j)).destroy();
        }
      }
    }
    finally
    {
    }
    localObject.ifa.clear();
    super.destroy();
    this.cid.quit();
  }

  public final g oO(int paramInt)
  {
    return this.ieT.oO(paramInt);
  }

  public final void oP(int paramInt)
  {
    e locale = this.ieT;
    ab.i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyJsContext id:%d", new Object[] { Integer.valueOf(paramInt) });
    synchronized (locale.ifa)
    {
      d locald = (d)locale.ifa.get(paramInt);
      locale.ifa.delete(paramInt);
      if (locald != null)
        locald.destroy();
      return;
    }
  }

  protected abstract c r(String paramString, byte[] paramArrayOfByte);

  public void setJsExceptionHandler(h paramh)
  {
    this.ieS.a(e.aGX(), paramh);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.a
 * JD-Core Version:    0.6.2
 */