package com.tencent.tencentmap.mapsdk.map;

public class CameraUpdate
{
  private final CameraParameter camerPara;

  CameraUpdate(CameraParameter paramCameraParameter)
  {
    this.camerPara = paramCameraParameter;
  }

  public CameraParameter getParams()
  {
    return this.camerPara;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.CameraUpdate
 * JD-Core Version:    0.6.2
 */