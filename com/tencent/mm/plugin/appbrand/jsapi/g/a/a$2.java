package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener;

final class a$2
  implements TencentMap.OnMapCameraChangeListener
{
  a$2(a parama, b.s params)
  {
  }

  public final void onCameraChange(CameraPosition paramCameraPosition)
  {
    AppMethodBeat.i(138412);
    if (this.hNw != null)
    {
      b.a locala = new b.a();
      locala.hNM = new b.h(paramCameraPosition.getTarget().getLatitude(), paramCameraPosition.getTarget().getLongitude());
      locala.zoom = paramCameraPosition.getZoom();
      locala.rotate = paramCameraPosition.getBearing();
      locala.skew = paramCameraPosition.getSkew();
      this.hNw.a(locala);
    }
    AppMethodBeat.o(138412);
  }

  public final void onCameraChangeFinish(CameraPosition paramCameraPosition)
  {
    AppMethodBeat.i(138413);
    this.hNv.hMZ = paramCameraPosition;
    if (this.hNw != null)
    {
      b.a locala = new b.a();
      locala.hNM = new b.h(paramCameraPosition.getTarget().getLatitude(), paramCameraPosition.getTarget().getLongitude());
      locala.zoom = paramCameraPosition.getZoom();
      locala.rotate = paramCameraPosition.getBearing();
      locala.skew = paramCameraPosition.getSkew();
      this.hNw.a(locala, this.hNv.hNe);
    }
    a.a(this.hNv);
    AppMethodBeat.o(138413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.2
 * JD-Core Version:    0.6.2
 */