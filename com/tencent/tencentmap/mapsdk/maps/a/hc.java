package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class hc
{
  private static double a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    return (1.0D - paramFloat) * (1.0D - paramFloat) * paramInt1 + 2.0F * paramFloat * (1.0D - paramFloat) * paramInt2 + paramFloat * paramFloat * paramInt3;
  }

  private static double a(DoublePoint paramDoublePoint1, DoublePoint paramDoublePoint2)
  {
    AppMethodBeat.i(99524);
    double d1 = paramDoublePoint2.x - paramDoublePoint1.x;
    double d2 = paramDoublePoint2.y - paramDoublePoint1.y;
    d2 = Math.sqrt(d1 * d1 + d2 * d2);
    AppMethodBeat.o(99524);
    return d2;
  }

  private static float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    float f1 = (paramInt2 - paramInt1) * 3.0F;
    float f2 = (paramInt3 - paramInt2) * 3.0F - f1;
    float f3 = paramInt4 - paramInt1;
    float f4 = paramFloat * paramFloat;
    return f1 * paramFloat + (f2 * f4 + (f3 - f1 - f2) * (f4 * paramFloat)) + paramInt1;
  }

  public static int a(List<GeoPoint> paramList, int[] paramArrayOfInt, fw paramfw)
  {
    int i = 0;
    AppMethodBeat.i(99521);
    if (paramList == null)
      AppMethodBeat.o(99521);
    while (true)
    {
      return i;
      int j = paramList.size();
      if (j < 2)
      {
        AppMethodBeat.o(99521);
      }
      else
      {
        int k = 0;
        i = 0;
        while (k < j - 1)
        {
          GeoPoint localGeoPoint1 = (GeoPoint)paramList.get(k);
          GeoPoint localGeoPoint2 = (GeoPoint)paramList.get(k + 1);
          double d = a(paramfw.b(localGeoPoint1), paramfw.b(localGeoPoint2));
          int m = (int)d / 500;
          m = (int)d / Math.max(4, m * 4);
          paramArrayOfInt[k] = m;
          i += m;
          k++;
        }
        AppMethodBeat.o(99521);
      }
    }
  }

  private static GeoPoint a(List<GeoPoint> paramList, float paramFloat)
  {
    AppMethodBeat.i(99523);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(99523);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      int i = paramList.size();
      if ((i != 3) && (i != 4))
      {
        AppMethodBeat.o(99523);
        paramList = null;
      }
      else
      {
        GeoPoint localGeoPoint1;
        GeoPoint localGeoPoint2;
        if (i == 3)
        {
          localGeoPoint1 = (GeoPoint)paramList.get(0);
          localGeoPoint2 = (GeoPoint)paramList.get(1);
          paramList = (GeoPoint)paramList.get(2);
          if ((localGeoPoint1 == null) || (localGeoPoint2 == null) || (paramList == null))
          {
            AppMethodBeat.o(99523);
            paramList = null;
          }
          else
          {
            i = (int)a(localGeoPoint1.getLongitudeE6(), localGeoPoint2.getLongitudeE6(), paramList.getLongitudeE6(), paramFloat);
            paramList = new GeoPoint((int)a(localGeoPoint1.getLatitudeE6(), localGeoPoint2.getLatitudeE6(), paramList.getLatitudeE6(), paramFloat), i);
            AppMethodBeat.o(99523);
          }
        }
        else
        {
          localGeoPoint2 = (GeoPoint)paramList.get(0);
          localGeoPoint1 = (GeoPoint)paramList.get(1);
          GeoPoint localGeoPoint3 = (GeoPoint)paramList.get(2);
          paramList = (GeoPoint)paramList.get(3);
          if ((localGeoPoint2 == null) || (localGeoPoint1 == null) || (localGeoPoint3 == null) || (paramList == null))
          {
            AppMethodBeat.o(99523);
            paramList = null;
          }
          else
          {
            i = (int)a(localGeoPoint2.getLongitudeE6(), localGeoPoint1.getLongitudeE6(), localGeoPoint3.getLongitudeE6(), paramList.getLongitudeE6(), paramFloat);
            paramList = new GeoPoint((int)a(localGeoPoint2.getLatitudeE6(), localGeoPoint1.getLatitudeE6(), localGeoPoint3.getLatitudeE6(), paramList.getLatitudeE6(), paramFloat), i);
            AppMethodBeat.o(99523);
          }
        }
      }
    }
  }

  public static List<GeoPoint> a(List<GeoPoint> paramList, int paramInt)
  {
    AppMethodBeat.i(99522);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = null;
      AppMethodBeat.o(99522);
    }
    while (true)
    {
      return paramList;
      int i = paramList.size();
      ArrayList localArrayList = new ArrayList(paramInt);
      GeoPoint localGeoPoint1 = (GeoPoint)paramList.get(0);
      GeoPoint localGeoPoint2 = (GeoPoint)paramList.get(i - 1);
      int j = (localGeoPoint1.getLongitudeE6() + localGeoPoint2.getLongitudeE6()) / 2;
      int k = (localGeoPoint1.getLatitudeE6() + localGeoPoint2.getLatitudeE6()) / 2;
      for (int m = 0; m < i; m++)
      {
        localGeoPoint2 = (GeoPoint)paramList.get(m);
        localGeoPoint2.setLongitudeE6(localGeoPoint2.getLongitudeE6() - j);
        localGeoPoint2.setLatitudeE6(localGeoPoint2.getLatitudeE6() - k);
      }
      float f1 = 1.0F / (paramInt + 1);
      m = 0;
      float f2 = f1;
      while (m < paramInt)
      {
        localGeoPoint2 = a(paramList, f2);
        localGeoPoint2.setLongitudeE6(localGeoPoint2.getLongitudeE6() + j);
        localGeoPoint2.setLatitudeE6(localGeoPoint2.getLatitudeE6() + k);
        localArrayList.add(localGeoPoint2);
        f2 += f1;
        m++;
      }
      AppMethodBeat.o(99522);
      paramList = localArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hc
 * JD-Core Version:    0.6.2
 */