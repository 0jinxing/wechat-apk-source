package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138414);
    if ((this.hNv.hNq != null) && (this.hNv.hNp))
    {
      double d1 = this.hNv.hNq.getLatitude();
      double d2 = this.hNv.hNq.getLongitude();
      this.hNv.hMT.getIController().animateTo(d1, d2);
      ab.d("MicroMsg.DefaultTencentMapView", "[moveToMapLocation]latitude:%f, longtitude:%f", new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
    }
    AppMethodBeat.o(138414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.3
 * JD-Core Version:    0.6.2
 */