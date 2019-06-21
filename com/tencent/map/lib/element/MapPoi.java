package com.tencent.map.lib.element;

public class MapPoi
{
  double a;
  String b;
  private double c;

  public MapPoi(double paramDouble1, double paramDouble2, String paramString)
  {
    this.c = paramDouble1;
    this.a = paramDouble2;
    this.b = paramString;
  }

  public double getLatitude()
  {
    return this.c;
  }

  public double getLongitude()
  {
    return this.a;
  }

  public String getPoiName()
  {
    return this.b;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.MapPoi
 * JD-Core Version:    0.6.2
 */