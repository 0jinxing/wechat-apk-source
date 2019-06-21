package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter;

public final class n$a
  implements TencentMap.InfoWindowAdapter
{
  private n$a(n paramn)
  {
  }

  public final View getInfoWindow(Marker paramMarker)
  {
    AppMethodBeat.i(113586);
    ab.i("ZItemOverlay", "get info window: %s", new Object[] { Integer.valueOf(this.nOD.nOA.getVisibility()) });
    if ("info_window_tag".equals(paramMarker.getTag()))
    {
      paramMarker = this.nOD.nOA;
      AppMethodBeat.o(113586);
    }
    while (true)
    {
      return paramMarker;
      paramMarker = null;
      AppMethodBeat.o(113586);
    }
  }

  public final void onInfoWindowDettached(Marker paramMarker, View paramView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.n.a
 * JD-Core Version:    0.6.2
 */