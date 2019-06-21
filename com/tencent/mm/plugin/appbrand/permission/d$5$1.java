package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.b.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class d$5$1
  implements h.d
{
  d$5$1(d.5 param5)
  {
  }

  public final void a(int paramInt, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(102251);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(102251);
      while (true)
      {
        return;
        d.a(this.iwz.iwr, this.iwz.iwq, 1);
        d.aKt().put(d.a(this.iwz.iwr), d.b(this.iwz.iwr));
        ab.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, appId %s, api %s", new Object[] { d.a(this.iwz.iwr), d.b(this.iwz.iwr) });
        d.c(this.iwz.iwr).aIX();
        AppMethodBeat.o(102251);
        continue;
        d.a(this.iwz.iwr, this.iwz.iwq, 2);
        d.aKt().K(d.a(this.iwz.iwr), d.b(this.iwz.iwr));
        ab.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user deny, appId %s, api %s", new Object[] { d.a(this.iwz.iwr), d.b(this.iwz.iwr) });
        d.c(this.iwz.iwr).CW(null);
        AppMethodBeat.o(102251);
      }
      d.aKt().K(d.a(this.iwz.iwr), d.b(this.iwz.iwr));
      ab.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user cancel, appId %s, api %s", new Object[] { d.a(this.iwz.iwr), d.b(this.iwz.iwr) });
      d.c(this.iwz.iwr).onCancel();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.5.1
 * JD-Core Version:    0.6.2
 */