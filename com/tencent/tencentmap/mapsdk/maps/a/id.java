package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.db;

public class id
{
  public static double a(db paramdb1, db paramdb2)
  {
    AppMethodBeat.i(99835);
    double d1 = paramdb1.b;
    double d2 = paramdb1.a;
    double d3 = paramdb2.b;
    double d4 = paramdb2.a;
    double d5 = d1 * 0.01745329251994329D;
    double d6 = d2 * 0.01745329251994329D;
    d1 = d3 * 0.01745329251994329D;
    d2 = d4 * 0.01745329251994329D;
    d3 = Math.sin(d5);
    d4 = Math.sin(d6);
    d5 = Math.cos(d5);
    double d7 = Math.cos(d6);
    d6 = Math.sin(d1);
    double d8 = Math.sin(d2);
    d1 = Math.cos(d1);
    d2 = Math.cos(d2);
    paramdb2 = new double[3];
    paramdb1 = new double[3];
    paramdb2[0] = (d5 * d7);
    paramdb2[1] = (d7 * d3);
    paramdb2[2] = d4;
    paramdb1[0] = (d2 * d1);
    paramdb1[1] = (d2 * d6);
    paramdb1[2] = d8;
    d4 = Math.asin(Math.sqrt((paramdb2[0] - paramdb1[0]) * (paramdb2[0] - paramdb1[0]) + (paramdb2[1] - paramdb1[1]) * (paramdb2[1] - paramdb1[1]) + (paramdb2[2] - paramdb1[2]) * (paramdb2[2] - paramdb1[2])) / 2.0D);
    AppMethodBeat.o(99835);
    return d4 * 12742001.579854401D;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.id
 * JD-Core Version:    0.6.2
 */