package com.tencent.mapsdk.raster.model;

public class MapPoi
{
  private String mName;
  private LatLng mPosition;

  public MapPoi(String paramString, LatLng paramLatLng)
  {
    this.mName = paramString;
    this.mPosition = paramLatLng;
  }

  public String getName()
  {
    return this.mName;
  }

  public LatLng getPosition()
  {
    return this.mPosition;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.MapPoi
 * JD-Core Version:    0.6.2
 */