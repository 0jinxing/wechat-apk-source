package com.tencent.mm.plugin.appbrand.jsapi.o;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.permission.e;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends b
{
  public final SparseArray<c> hVp;

  public a()
  {
    AppMethodBeat.i(131429);
    this.hVp = new SparseArray();
    AppMethodBeat.o(131429);
  }

  public final void W(int paramInt, String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(131430);
    while (true)
    {
      synchronized (this.hVp)
      {
        c localc = (c)this.hVp.get(paramInt, null);
        if (localc == null)
        {
          AppMethodBeat.o(131430);
          return;
        }
        this.hVp.remove(paramInt);
        a.f.b.j.p(localc, "info");
        ??? = localc.hVq;
        a.f.b.j.o(???, "info.component");
        ??? = ((h)???).getRuntime();
        if ((??? instanceof o))
          break label209;
        localObject1 = (o)localObject1;
        if (localObject1 != null)
        {
          localObject1 = ((o)localObject1).xY();
          if (localObject1 != null)
          {
            paramInt = ((e)localObject1).a((com.tencent.mm.plugin.appbrand.jsapi.c)localc.hVq, localc.hVr, localc.data, false);
            long l1 = bo.yz();
            long l2 = localc.startTime;
            com.tencent.mm.plugin.appbrand.report.model.j.a(localc.hVq.getAppId(), localc.path, localc.hVr.getName(), localc.data, paramInt, l1 - l2, paramString);
            AppMethodBeat.o(131430);
          }
        }
      }
      paramInt = -1;
      continue;
      label209: localObject1 = ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.o.a
 * JD-Core Version:    0.6.2
 */