package com.tencent.mm.plugin.appbrand.e;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.tencent.luggage.i.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

public final class a
  implements f
{
  private com.tencent.luggage.i.a.d<g> hpG;
  private ConcurrentHashMap<String, g> hpH;
  private ConcurrentHashMap<String, ConcurrentLinkedQueue<b>> hpI;
  private e hpJ;

  public a()
  {
    AppMethodBeat.i(117330);
    this.hpH = new ConcurrentHashMap();
    this.hpI = new ConcurrentHashMap();
    AppMethodBeat.o(117330);
  }

  private void a(String paramString, g paramg)
  {
    AppMethodBeat.i(117336);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", ">>>>>> flushPendingJsApis start, key:%s", new Object[] { paramString });
    Object localObject = (ConcurrentLinkedQueue)this.hpI.get(paramString);
    if ((localObject != null) && (!((ConcurrentLinkedQueue)localObject).isEmpty()))
    {
      Iterator localIterator = ((ConcurrentLinkedQueue)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (b)localIterator.next();
        paramg.a(((b)localObject).hvw, ((b)localObject).hnx, ((b)localObject).hwj, ((b)localObject).hwi);
      }
    }
    this.hpI.remove(paramString);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "<<<<<< flushPendingJsApis end");
    AppMethodBeat.o(117336);
  }

  private void a(String paramString, m paramm, c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(117335);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", ">>>>>> savePendingJsApi start, key:%s, jsapi:%s", new Object[] { paramString, paramm.getName() });
    ConcurrentLinkedQueue localConcurrentLinkedQueue1 = (ConcurrentLinkedQueue)this.hpI.get(paramString);
    ConcurrentLinkedQueue localConcurrentLinkedQueue2 = localConcurrentLinkedQueue1;
    if (localConcurrentLinkedQueue1 == null)
    {
      localConcurrentLinkedQueue2 = new ConcurrentLinkedQueue();
      this.hpI.put(paramString, localConcurrentLinkedQueue2);
    }
    localConcurrentLinkedQueue2.add(new b(paramJSONObject, paramm, paramc, paramInt));
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "<<<<<< savePendingJsApi end");
    AppMethodBeat.o(117335);
  }

  public final String a(String paramString, int paramInt1, c paramc, JSONObject paramJSONObject, m paramm, int paramInt2)
  {
    AppMethodBeat.i(117331);
    String str = d.bc(paramString, paramInt1);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "handleJsApi, key:%s, jsapi:%s", new Object[] { str, paramm.getName() });
    paramString = (g)this.hpH.get(str);
    if (paramString == null)
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "handleJsApi, handler is null");
      a(str, paramm, paramc, paramJSONObject, paramInt2);
      AppMethodBeat.o(117331);
    }
    while (true)
    {
      return "";
      if (paramString.a(paramm))
      {
        paramString.a(paramc, paramJSONObject, paramm, paramInt2);
        AppMethodBeat.o(117331);
      }
      else
      {
        a(str, paramm, paramc, paramJSONObject, paramInt2);
        AppMethodBeat.o(117331);
      }
    }
  }

  public final void a(com.tencent.luggage.i.a.d<g> paramd)
  {
    this.hpG = paramd;
  }

  public final void a(e parame)
  {
    this.hpJ = parame;
  }

  public final void onPluginDestroy(String paramString, int paramInt)
  {
    AppMethodBeat.i(117333);
    paramString = d.bc(paramString, paramInt);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginDestroy, key:%s", new Object[] { paramString });
    paramString = (g)this.hpH.get(paramString);
    if (paramString == null)
    {
      ab.w("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginDestroy, do you forget to call ready before?");
      AppMethodBeat.o(117333);
    }
    while (true)
    {
      return;
      paramString.yr();
      AppMethodBeat.o(117333);
    }
  }

  public final void onPluginReady(String paramString, int paramInt, SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(117332);
    String str = d.bc(paramString, paramInt);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginReady, key:%s", new Object[] { str });
    g localg = (g)this.hpH.get(str);
    if (localg != null)
    {
      ab.w("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginReady, handle plugin ready again");
      localg.d(paramSurfaceTexture);
      a(str, localg);
      AppMethodBeat.o(117332);
    }
    while (true)
    {
      return;
      if (this.hpG != null)
      {
        localg = (g)this.hpG.bS(paramString);
        if (localg != null)
        {
          ab.w("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginReady, created new plugin handler");
          localg.setId(paramInt);
          localg.setType(paramString);
          localg.a(this);
          this.hpH.put(str, localg);
          localg.d(paramSurfaceTexture);
          a(str, localg);
          AppMethodBeat.o(117332);
        }
        else
        {
          ab.e("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginReady, no handler for this view?");
        }
      }
      else
      {
        AppMethodBeat.o(117332);
      }
    }
  }

  public final void onPluginTouch(String paramString, int paramInt, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(117334);
    paramString = d.bc(paramString, paramInt);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginTouch, key:%s", new Object[] { paramString });
    paramString = (g)this.hpH.get(paramString);
    if (paramString == null)
    {
      ab.w("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginClientProxy", "onPluginTouch, no handler created for this key?");
      AppMethodBeat.o(117334);
    }
    while (true)
    {
      return;
      paramString.m(paramMotionEvent);
      AppMethodBeat.o(117334);
    }
  }

  public final e yp()
  {
    return this.hpJ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.e.a
 * JD-Core Version:    0.6.2
 */