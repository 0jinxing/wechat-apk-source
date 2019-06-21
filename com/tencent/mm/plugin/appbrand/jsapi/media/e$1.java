package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.vending.j.a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class e$1
  implements Runnable
{
  e$1(e parame, q paramq, String paramString, WeakReference paramWeakReference, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114357);
    Iterator localIterator = e.aEm().iterator();
    Object localObject1 = null;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = ((e.b)localIterator.next()).h(this.hsD.getRuntime(), this.val$url);
      localObject1 = localObject2;
      if (localObject2 != null)
        localObject1 = localObject2;
    }
    if ((this.hQb.get() != null) && (((q)this.hQb.get()).isRunning()))
      if (localObject1 != null)
        switch (e.2.hQd[((e.e)localObject1.get(0)).ordinal()])
        {
        default:
          localObject1 = this.hQc.j("fail", null);
          ((q)this.hQb.get()).M(this.eIl, (String)localObject1);
          AppMethodBeat.o(114357);
        case 1:
        case 2:
        }
    while (true)
    {
      return;
      localObject1 = this.hQc.j("fail:file not found", null);
      break;
      localObject2 = new HashMap(2);
      ((Map)localObject2).put("width", Integer.valueOf(((e.c)((a)localObject1).get(1)).width));
      ((Map)localObject2).put("height", Integer.valueOf(((e.c)((a)localObject1).get(1)).height));
      ((Map)localObject2).put("orientation", ((e.c)((a)localObject1).get(1)).hfh);
      ((Map)localObject2).put("type", ((e.c)((a)localObject1).get(1)).type);
      localObject1 = this.hQc.j("ok", (Map)localObject2);
      break;
      ((q)this.hQb.get()).M(this.eIl, this.hQc.j("fail:file not found", null));
      AppMethodBeat.o(114357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.e.1
 * JD-Core Version:    0.6.2
 */