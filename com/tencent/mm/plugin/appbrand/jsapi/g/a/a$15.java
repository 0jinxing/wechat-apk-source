package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.s.b.a.a;
import com.tencent.mm.plugin.appbrand.s.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class a$15
  implements a.b
{
  a$15(a parama)
  {
  }

  public final void a(int paramInt, String paramString, a.a parama)
  {
    AppMethodBeat.i(138423);
    if (paramInt != 0)
    {
      ab.e("MicroMsg.DefaultTencentMapView", "errCode:%d, errStr:%s", new Object[] { Integer.valueOf(paramInt), paramString });
      AppMethodBeat.o(138423);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.DefaultTencentMapView", "refresh location latitude = %f, longitude = %f", new Object[] { Double.valueOf(parama.latitude), Double.valueOf(parama.longitude) });
      if (!g.o(ah.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
      {
        ab.w("MicroMsg.DefaultTencentMapView", "refresh location fail, no perrmission");
        AppMethodBeat.o(138423);
      }
      else if ((!this.hNv.hNp) || (this.hNv.isBackground))
      {
        AppMethodBeat.o(138423);
      }
      else
      {
        m.runOnUiThread(new a.15.1(this, parama));
        AppMethodBeat.o(138423);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.15
 * JD-Core Version:    0.6.2
 */