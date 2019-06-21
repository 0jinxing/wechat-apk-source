package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class a$17
  implements TencentMap.OnMapClickListener
{
  a$17(a parama)
  {
  }

  public final void onMapClick(LatLng paramLatLng)
  {
    AppMethodBeat.i(51166);
    Iterator localIterator = this.hNv.hNm.values().iterator();
    while (localIterator.hasNext())
    {
      paramLatLng = (a.d)localIterator.next();
      if ((paramLatLng.hOa != null) && (paramLatLng.hOa.hOe != null) && (paramLatLng.hOa.hOe.hOl == b.r.a.hOm) && (paramLatLng.hNK.isInfoWindowShown()))
        paramLatLng.hNK.hideInfoWindow();
    }
    if (this.hNv.hNc != null)
    {
      this.hNv.hNc.aDL();
      AppMethodBeat.o(51166);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(51166);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.17
 * JD-Core Version:    0.6.2
 */