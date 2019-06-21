package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.mapsdk.raster.model.IndoorMapPoi;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.MapPoi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener;

final class a$19
  implements TencentMap.OnMapPoiClickListener
{
  a$19(a parama)
  {
  }

  public final void onClicked(MapPoi paramMapPoi)
  {
    AppMethodBeat.i(51168);
    if (this.hNv.hNd != null)
    {
      b.p localp = new b.p();
      localp.latitude = paramMapPoi.getPosition().getLatitude();
      localp.longitude = paramMapPoi.getPosition().getLongitude();
      localp.name = paramMapPoi.getName();
      if (((paramMapPoi instanceof IndoorMapPoi)) && (!bo.isNullOrNil(((IndoorMapPoi)paramMapPoi).getBuildingId())))
      {
        localp.buildingId = ((IndoorMapPoi)paramMapPoi).getBuildingId();
        localp.floorName = ((IndoorMapPoi)paramMapPoi).getFloorName();
      }
      this.hNv.hNd.a(localp);
    }
    AppMethodBeat.o(51168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.19
 * JD-Core Version:    0.6.2
 */