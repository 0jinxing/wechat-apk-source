package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class dz
{
  public static double a(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    AppMethodBeat.i(101331);
    double d1 = paramLatLng1.getLongitude();
    double d2 = paramLatLng1.getLatitude();
    double d3 = paramLatLng2.getLongitude();
    double d4 = paramLatLng2.getLatitude();
    d1 *= 0.01745329251994329D;
    double d5 = d2 * 0.01745329251994329D;
    double d6 = d3 * 0.01745329251994329D;
    d2 = d4 * 0.01745329251994329D;
    d3 = Math.sin(d1);
    d4 = Math.sin(d5);
    d1 = Math.cos(d1);
    double d7 = Math.cos(d5);
    d5 = Math.sin(d6);
    double d8 = Math.sin(d2);
    d6 = Math.cos(d6);
    d2 = Math.cos(d2);
    paramLatLng2 = new double[3];
    paramLatLng1 = new double[3];
    paramLatLng2[0] = (d1 * d7);
    paramLatLng2[1] = (d7 * d3);
    paramLatLng2[2] = d4;
    paramLatLng1[0] = (d2 * d6);
    paramLatLng1[1] = (d2 * d5);
    paramLatLng1[2] = d8;
    d4 = Math.asin(Math.sqrt((paramLatLng2[0] - paramLatLng1[0]) * (paramLatLng2[0] - paramLatLng1[0]) + (paramLatLng2[1] - paramLatLng1[1]) * (paramLatLng2[1] - paramLatLng1[1]) + (paramLatLng2[2] - paramLatLng1[2]) * (paramLatLng2[2] - paramLatLng1[2])) / 2.0D);
    AppMethodBeat.o(101331);
    return d4 * 12742001.579854401D;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dz
 * JD-Core Version:    0.6.2
 */