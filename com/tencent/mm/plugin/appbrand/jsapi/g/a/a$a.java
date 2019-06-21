package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.view.View;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter;

public final class a$a
  implements TencentMap.InfoWindowAdapter
{
  public a$a(a parama)
  {
  }

  public final View getInfoWindow(Marker paramMarker)
  {
    AppMethodBeat.i(51175);
    if (paramMarker == null)
    {
      ab.w("MicroMsg.DefaultTencentMapView", "realMarker is null, return");
      AppMethodBeat.o(51175);
      paramMarker = null;
    }
    while (true)
    {
      return paramMarker;
      if (bo.isNullOrNil((String)paramMarker.getTag()))
      {
        ab.w("MicroMsg.DefaultTencentMapView", "realMarker.getTag is null, return");
        AppMethodBeat.o(51175);
        paramMarker = null;
      }
      else if (((String)paramMarker.getTag()).endsWith("#label"))
      {
        AppMethodBeat.o(51175);
        paramMarker = null;
      }
      else
      {
        paramMarker = (a.d)this.hNv.Bh((String)paramMarker.getTag());
        if (paramMarker == null)
        {
          ab.e("MicroMsg.DefaultTencentMapView", "[getInfoWindow] appbrandMarker is null, return");
          AppMethodBeat.o(51175);
          paramMarker = null;
        }
        else if (paramMarker.hOa == null)
        {
          ab.e("MicroMsg.DefaultTencentMapView", "[getInfoWindow] appBrandMarker.appBrandMarkerOptions is null, return");
          AppMethodBeat.o(51175);
          paramMarker = null;
        }
        else
        {
          b.r.a locala = paramMarker.hOa.hOe;
          if (locala == null)
          {
            AppMethodBeat.o(51175);
            paramMarker = null;
          }
          else
          {
            a locala1 = this.hNv;
            b localb = i.aEe();
            paramMarker = localb;
            if (localb == null)
              paramMarker = new b(locala1.context);
            paramMarker.setText("");
            paramMarker.setTextSize(12);
            paramMarker.setTextColor(b.jjZ);
            paramMarker.setTitlePadding(0);
            paramMarker.setGravity("center");
            int i = b.jka;
            paramMarker.x(0, 0, i, i);
            paramMarker.setText(locala.content);
            paramMarker.setTextSize(locala.hOg);
            paramMarker.setTextColor(locala.color);
            paramMarker.setTitlePadding(locala.padding);
            paramMarker.setGravity(locala.hdq);
            paramMarker.x(locala.hOh, locala.borderWidth, locala.borderColor, locala.bgColor);
            AppMethodBeat.o(51175);
          }
        }
      }
    }
  }

  public final void onInfoWindowDettached(Marker paramMarker, View paramView)
  {
    AppMethodBeat.i(51176);
    if ((paramView instanceof b))
    {
      ab.d("MicroMsg.DefaultTencentMapView", "recycler calloutView");
      i.a((b)paramView);
    }
    AppMethodBeat.o(51176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.a
 * JD-Core Version:    0.6.2
 */