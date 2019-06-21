package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.b.a.a;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.tencentmap.mapsdk.map.TencentMap;

final class a$15$1
  implements Runnable
{
  a$15$1(a.15 param15, a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138422);
    Object localObject1;
    double d1;
    double d2;
    if (this.hNI.hNv.hMT != null)
    {
      if (this.hNI.hNv.hNq == null)
      {
        this.hNI.hNv.hNq = new d(this.hNI.hNv.context);
        d locald = this.hNI.hNv.hNq;
        localObject1 = this.hNI.hNv.hMT;
        localObject2 = this.hNH;
        MarkerOptions localMarkerOptions = new MarkerOptions();
        localMarkerOptions.anchor(0.5F, 0.5F);
        localMarkerOptions.position(new LatLng(((a.a)localObject2).latitude, ((a.a)localObject2).longitude));
        localMarkerOptions.markerView(locald);
        localMarkerOptions.zIndex(2147483647);
        localMarkerOptions.flat(true);
        locald.hNK = ((SoSoMapView)localObject1).getMap().addMarker(localMarkerOptions);
      }
      localObject1 = this.hNI.hNv.hNq;
      d1 = this.hNH.latitude;
      d2 = this.hNH.longitude;
      Object localObject2 = this.hNH.bIy;
      double d3 = this.hNH.iSf;
      if ((((d)localObject1).hOt != -1.0D) || (((d)localObject1).hOu != -1.0D))
        break label373;
      ((d)localObject1).hOt = d1;
      ((d)localObject1).hOr = d1;
      ((d)localObject1).hOu = d2;
      ((d)localObject1).hOs = d2;
      if ((((d)localObject1).hOt != -1.0D) && (((d)localObject1).hOu != -1.0D))
        ((d)localObject1).hOy = f.a(((d)localObject1).hOu, ((d)localObject1).hOt, d2, d1, (String)localObject2, d3);
      if ((((d)localObject1).hOw != 900.0F) && (((d)localObject1).hOv != 900.0F))
        break label404;
      float f = (float)f.h(d1, d2);
      ((d)localObject1).hOv = f;
      ((d)localObject1).hOw = f;
    }
    while (true)
    {
      if (((d)localObject1).hNK != null)
        ((d)localObject1).hNK.setPosition(new LatLng(d1, d2));
      AppMethodBeat.o(138422);
      return;
      label373: ((d)localObject1).hOt = ((d)localObject1).hOr;
      ((d)localObject1).hOu = ((d)localObject1).hOs;
      ((d)localObject1).hOs = d2;
      ((d)localObject1).hOr = d1;
      break;
      label404: ((d)localObject1).hOw = ((d)localObject1).hOv;
      ((d)localObject1).hOv = ((float)f.h(d1, d2));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.15.1
 * JD-Core Version:    0.6.2
 */