package com.tencent.tencentmap.mapsdk.map;

import com.tencent.mapsdk.raster.model.IndoorBuilding;

public abstract interface TencentMap$OnIndoorStateChangeListener
{
  public abstract boolean onIndoorBuildingDeactivated();

  public abstract boolean onIndoorBuildingFocused();

  public abstract boolean onIndoorLevelActivated(IndoorBuilding paramIndoorBuilding);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
 * JD-Core Version:    0.6.2
 */