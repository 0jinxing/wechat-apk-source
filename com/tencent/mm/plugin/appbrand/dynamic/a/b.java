package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.c;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

final class b
  implements d
{
  c hmc;
  Runnable hmd;
  Runnable hme;
  Runnable hmf;

  b(c paramc)
  {
    AppMethodBeat.i(10737);
    this.hmd = new b.1(this);
    this.hme = new b.2(this);
    this.hmf = new b.3(this);
    this.hmc = paramc;
    AppMethodBeat.o(10737);
  }

  public final void exit()
  {
    AppMethodBeat.i(10738);
    com.tencent.mm.plugin.appbrand.dynamic.b.D(this.hme);
    AppMethodBeat.o(10738);
  }

  public final void pk(String paramString)
  {
    AppMethodBeat.i(10740);
    paramString = this.hmc.bd(paramString);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(10740);
    while (true)
    {
      return;
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        paramString = (View)localIterator.next();
        if ((paramString != null) && ((paramString instanceof IPCDynamicPageView)))
        {
          ab.v("MicroMsg.DynamicPagePerformance", "pauseAllView, do pause view(%s)", new Object[] { Integer.valueOf(paramString.hashCode()) });
          ((IPCDynamicPageView)paramString).onPause();
        }
      }
      AppMethodBeat.o(10740);
    }
  }

  public final void pl(String paramString)
  {
    AppMethodBeat.i(10741);
    paramString = this.hmc.bd(paramString);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(10741);
    while (true)
    {
      return;
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        paramString = (View)localIterator.next();
        if ((paramString != null) && ((paramString instanceof IPCDynamicPageView)))
        {
          ab.v("MicroMsg.DynamicPagePerformance", "pauseAllView, do resume view(%s)", new Object[] { Integer.valueOf(paramString.hashCode()) });
          ((IPCDynamicPageView)paramString).onResume();
        }
      }
      AppMethodBeat.o(10741);
    }
  }

  public final void restart()
  {
    AppMethodBeat.i(10739);
    com.tencent.mm.plugin.appbrand.dynamic.b.D(this.hmf);
    com.tencent.mm.plugin.appbrand.dynamic.b.j(this.hmd, 2000L);
    AppMethodBeat.o(10739);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.b
 * JD-Core Version:    0.6.2
 */