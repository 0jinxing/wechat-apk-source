package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.ad;
import com.tencent.mm.plugin.appbrand.widget.input.o;
import java.lang.ref.WeakReference;

final class e$1
  implements Runnable
{
  e$1(e parame, WeakReference paramWeakReference, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123540);
    u localu = (u)this.hKr.get();
    if (localu == null)
    {
      AppMethodBeat.o(123540);
      return;
    }
    if (localu.aJw() != null)
      localu.aJw().aqX();
    if (o.b(localu, this.hKt));
    for (String str = "ok"; ; str = "fail")
    {
      localu.M(this.eIl, this.hKu.j(str, null));
      AppMethodBeat.o(123540);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.e.1
 * JD-Core Version:    0.6.2
 */