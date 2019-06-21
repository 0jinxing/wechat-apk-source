package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener;

final class a$1
  implements TencentMap.OnInfoWindowClickListener
{
  a$1(a parama)
  {
  }

  public final void onInfoWindowClick(Marker paramMarker)
  {
    AppMethodBeat.i(51149);
    if (paramMarker == null)
    {
      ab.e("MicroMsg.DefaultTencentMapView", "realMarker is null");
      AppMethodBeat.o(51149);
    }
    while (true)
    {
      return;
      paramMarker = (a.d)this.hNv.Bh((String)paramMarker.getTag());
      if (paramMarker == null)
      {
        ab.e("MicroMsg.DefaultTencentMapView", "[onInfoWindowClick] map:%s appbrandMarker is null, return", new Object[] { this });
        AppMethodBeat.o(51149);
      }
      else if (this.hNv.hMU == null)
      {
        ab.e("MicroMsg.DefaultTencentMapView", "[onInfoWindowClick] map:%s mapCalloutClick is null, return", new Object[] { this });
        AppMethodBeat.o(51149);
      }
      else
      {
        this.hNv.hMU.a(paramMarker);
        AppMethodBeat.o(51149);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.1
 * JD-Core Version:    0.6.2
 */