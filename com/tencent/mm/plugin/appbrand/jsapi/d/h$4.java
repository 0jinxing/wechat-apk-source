package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.c;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.v;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.widget.input.aa;
import com.tencent.mm.plugin.appbrand.widget.input.i.b;
import java.lang.ref.WeakReference;

final class h$4
  implements i.b
{
  h$4(h paramh, WeakReference paramWeakReference)
  {
  }

  public final void a(aa paramaa, int paramInt)
  {
    AppMethodBeat.i(123548);
    try
    {
      u localu = (u)this.hKr.get();
      if (localu == null)
        AppMethodBeat.o(123548);
      while (true)
      {
        return;
        paramInt = g.pZ(paramInt);
        localu.h("onKeyboardShow", com.tencent.mm.aa.h.QC().J("inputId", paramaa.getInputId()).J("height", paramInt).toString(), 0);
        v localv = new com/tencent/mm/plugin/appbrand/jsapi/v;
        localv.<init>();
        localv.a(paramInt, localu.xT(), localu, Integer.valueOf(paramaa.getInputId()));
        AppMethodBeat.o(123548);
      }
    }
    catch (Exception paramaa)
    {
      while (true)
        AppMethodBeat.o(123548);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.h.4
 * JD-Core Version:    0.6.2
 */