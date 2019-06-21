package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.f;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;

final class z
  implements f
{
  public final e c(c paramc)
  {
    AppMethodBeat.i(86790);
    if ((paramc instanceof e))
    {
      paramc = (e)paramc;
      AppMethodBeat.o(86790);
    }
    while (true)
    {
      return paramc;
      if ((paramc instanceof q))
      {
        paramc = ((q)paramc).getCurrentPageView();
        AppMethodBeat.o(86790);
      }
      else
      {
        paramc = null;
        AppMethodBeat.o(86790);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.z
 * JD-Core Version:    0.6.2
 */