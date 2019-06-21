package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.page.u;
import java.lang.ref.WeakReference;

public final class l
  implements f.b, f.c
{
  final WeakReference<u> jdm;

  public l(u paramu)
  {
    AppMethodBeat.i(123674);
    this.jdm = new WeakReference(paramu);
    paramu.a(this);
    paramu.a(this);
    AppMethodBeat.o(123674);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(123676);
    u localu = (u)this.jdm.get();
    if (localu != null)
    {
      if ((localu.mContext instanceof ad))
        ((ad)localu.mContext).aqX();
      o.v(localu);
      o.w(localu);
      e.t(localu);
      localu.b(this);
      localu.b(this);
      if (localu.aJz() != null)
        h.aQx().b(localu.aJz());
    }
    AppMethodBeat.o(123676);
  }

  public final void wW()
  {
    AppMethodBeat.i(123675);
    u localu = (u)this.jdm.get();
    if (localu != null)
      o.v(localu);
    AppMethodBeat.o(123675);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.l
 * JD-Core Version:    0.6.2
 */