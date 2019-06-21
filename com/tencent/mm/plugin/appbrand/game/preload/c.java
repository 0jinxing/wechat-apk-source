package com.tencent.mm.plugin.appbrand.game.preload;

import android.content.Context;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.b.d;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import junit.framework.Assert;

public final class c
  implements h
{
  private com.tencent.mm.plugin.appbrand.i gPI;
  public final LinkedHashSet<j> htl;

  public c(com.tencent.mm.plugin.appbrand.i parami)
  {
    AppMethodBeat.i(130289);
    this.gPI = parami;
    this.htl = new LinkedHashSet();
    AppMethodBeat.o(130289);
  }

  public final <T extends com.tencent.luggage.a.b> T B(Class<T> paramClass)
  {
    return null;
  }

  public final void B(Runnable paramRunnable)
  {
    AppMethodBeat.i(130292);
    al.d(paramRunnable);
    AppMethodBeat.o(130292);
  }

  public final void M(int paramInt, String paramString)
  {
  }

  public final void a(ah paramah)
  {
  }

  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
  }

  public final int aBw()
  {
    return 0;
  }

  public final com.tencent.mm.plugin.appbrand.h.i aBx()
  {
    return null;
  }

  public final Handler aBy()
  {
    return null;
  }

  public final <T extends j> T aa(Class<T> paramClass)
  {
    AppMethodBeat.i(130291);
    Object localObject1 = null;
    Iterator localIterator = this.htl.iterator();
    Object localObject3;
    do
    {
      localObject3 = localObject1;
      if (!localIterator.hasNext())
        break;
      localObject3 = (j)localIterator.next();
    }
    while (!paramClass.isInstance(localObject3));
    localObject1 = localObject3;
    if (localObject3 == null);
    try
    {
      localObject1 = (j)paramClass.newInstance();
      if (localObject1 != null)
      {
        bool = true;
        Assert.assertTrue(bool);
        AppMethodBeat.o(130291);
        return localObject1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WAGamePreloadComponent", "Make sure %s has default constructor", new Object[] { paramClass.getName() });
        Object localObject2 = localObject3;
        continue;
        boolean bool = false;
      }
    }
  }

  public final com.tencent.mm.plugin.appbrand.b.b asD()
  {
    AppMethodBeat.i(130290);
    com.tencent.mm.plugin.appbrand.b.b localb;
    if (this.gPI == null)
    {
      localb = com.tencent.mm.plugin.appbrand.b.b.gWw;
      AppMethodBeat.o(130290);
    }
    while (true)
    {
      return localb;
      localb = this.gPI.gNN.gWy.awz();
      AppMethodBeat.o(130290);
    }
  }

  public final p asE()
  {
    return null;
  }

  public final k asF()
  {
    return null;
  }

  public final com.tencent.mm.plugin.appbrand.h.i aua()
  {
    return null;
  }

  public final Map<String, m> aub()
  {
    return null;
  }

  public final void b(ah paramah)
  {
  }

  public final void bX(String paramString1, String paramString2)
  {
  }

  public final String getAppId()
  {
    return this.gPI.mAppId;
  }

  public final Context getContext()
  {
    return null;
  }

  public final com.tencent.mm.plugin.appbrand.i getRuntime()
  {
    return this.gPI;
  }

  public final boolean isRunning()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.c
 * JD-Core Version:    0.6.2
 */