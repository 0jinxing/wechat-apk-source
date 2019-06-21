package com.tencent.tencentmap.mapsdk.map;

import android.view.View;
import com.tencent.mapsdk.raster.model.Marker;

public abstract interface TencentMap$InfoWindowAdapter
{
  public abstract View getInfoWindow(Marker paramMarker);

  public abstract void onInfoWindowDettached(Marker paramMarker, View paramView);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
 * JD-Core Version:    0.6.2
 */