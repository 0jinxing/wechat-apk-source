package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener;

final class a$12
  implements TencentMap.OnMarkerClickListener
{
  a$12(a parama)
  {
  }

  public final boolean onMarkerClick(Marker paramMarker)
  {
    AppMethodBeat.i(51158);
    boolean bool;
    if (paramMarker == null)
    {
      ab.e("MicroMsg.DefaultTencentMapView", "realMarker is null");
      AppMethodBeat.o(51158);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.DefaultTencentMapView", "map:%s markerid:%s, onMarkerClick", new Object[] { this, paramMarker.getTag() });
      if (bo.isNullOrNil((String)paramMarker.getTag()))
      {
        ab.w("MicroMsg.DefaultTencentMapView", "realMarker.getTag is null, return");
        AppMethodBeat.o(51158);
        bool = false;
      }
      else if (((String)paramMarker.getTag()).endsWith("#label"))
      {
        ab.w("MicroMsg.DefaultTencentMapView", "realMarker.getTag is label marker, return");
        AppMethodBeat.o(51158);
        bool = false;
      }
      else
      {
        paramMarker = (a.d)this.hNv.Bh((String)paramMarker.getTag());
        if (paramMarker == null)
        {
          ab.e("MicroMsg.DefaultTencentMapView", "[onMarkerClickListener] map:%s appbrandMarker is null, return", new Object[] { this });
          AppMethodBeat.o(51158);
          bool = false;
        }
        else
        {
          if (this.hNv.hMV != null)
            break;
          ab.e("MicroMsg.DefaultTencentMapView", "[onMarkerClickListener] map:%s mapCalloutClick is null, return", new Object[] { this });
          AppMethodBeat.o(51158);
          bool = false;
        }
      }
    }
    Object localObject;
    if (paramMarker.hOa != null)
    {
      ab.e("MicroMsg.DefaultTencentMapView", "[onMarkerClickListener] map:%s mapCalloutClick is null, return", new Object[] { this });
      localObject = paramMarker.hOa.hOe;
      if ((localObject == null) || (((b.r.a)localObject).hOl != b.r.a.hOm) || (!paramMarker.hNK.isInfoWindowShown()))
        break label352;
      paramMarker.hNK.hideInfoWindow();
    }
    while (true)
    {
      if (paramMarker.hNK != null)
        paramMarker.hNK.set2Top();
      if (paramMarker.hNL != null)
        paramMarker.hNL.set2Top();
      if (this.hNv.hNq != null)
      {
        localObject = this.hNv.hNq;
        if (((d)localObject).hNK != null)
          ((d)localObject).hNK.set2Top();
      }
      bool = this.hNv.hMV.b(paramMarker);
      AppMethodBeat.o(51158);
      break;
      label352: paramMarker.hNK.showInfoWindow();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.12
 * JD-Core Version:    0.6.2
 */