package com.tencent.map.lib.util;

import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigDecimal;

public class MathUtil
{
  public static double angle2Radian(double paramDouble)
  {
    return 3.141592653589793D * paramDouble / 180.0D;
  }

  public static double calShortestAngleDistance(double paramDouble)
  {
    double d = paramDouble % 360.0D;
    if (d > 180.0D)
      paramDouble = d - 360.0D;
    while (true)
    {
      return paramDouble;
      paramDouble = d;
      if (d < -180.0D)
        paramDouble = d + 360.0D;
    }
  }

  public static GeoPoint findClosetPoint(GeoPoint paramGeoPoint1, GeoPoint paramGeoPoint2, GeoPoint paramGeoPoint3)
  {
    AppMethodBeat.i(98212);
    int i = paramGeoPoint2.getLatitudeE6() - paramGeoPoint1.getLatitudeE6();
    int j = paramGeoPoint2.getLongitudeE6() - paramGeoPoint1.getLongitudeE6();
    if ((i == 0) && (j == 0))
    {
      paramGeoPoint1 = null;
      AppMethodBeat.o(98212);
    }
    while (true)
    {
      return paramGeoPoint1;
      double d = ((paramGeoPoint3.getLatitudeE6() - paramGeoPoint1.getLatitudeE6()) * i + (paramGeoPoint3.getLongitudeE6() - paramGeoPoint1.getLongitudeE6()) * j) / (i * i + j * j);
      if (d < 0.0D)
      {
        paramGeoPoint1 = new GeoPoint(paramGeoPoint1);
        AppMethodBeat.o(98212);
      }
      else if (d > 1.0D)
      {
        paramGeoPoint1 = new GeoPoint(paramGeoPoint2);
        AppMethodBeat.o(98212);
      }
      else
      {
        int k = paramGeoPoint1.getLatitudeE6();
        i = (int)(i * d);
        int m = paramGeoPoint1.getLongitudeE6();
        paramGeoPoint1 = new GeoPoint(i + k, (int)(d * j) + m);
        AppMethodBeat.o(98212);
      }
    }
  }

  public static Rect getBound(GeoPoint paramGeoPoint1, GeoPoint paramGeoPoint2)
  {
    AppMethodBeat.i(98211);
    if ((paramGeoPoint1 == null) || (paramGeoPoint2 == null) || (paramGeoPoint1.equals(paramGeoPoint2)))
    {
      paramGeoPoint1 = null;
      AppMethodBeat.o(98211);
    }
    while (true)
    {
      return paramGeoPoint1;
      int i = Math.abs(paramGeoPoint1.getLongitudeE6() - paramGeoPoint2.getLongitudeE6());
      int j = Math.abs(paramGeoPoint1.getLatitudeE6() - paramGeoPoint2.getLatitudeE6());
      paramGeoPoint1 = new Rect(paramGeoPoint1.getLongitudeE6() - i, paramGeoPoint1.getLatitudeE6() - j, i + paramGeoPoint1.getLongitudeE6(), j + paramGeoPoint1.getLatitudeE6());
      AppMethodBeat.o(98211);
    }
  }

  public static double getDoubleByDecimalNum(double paramDouble, int paramInt)
  {
    AppMethodBeat.i(98207);
    try
    {
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramDouble);
      double d = localBigDecimal.setScale(paramInt, 4).doubleValue();
      paramDouble = d;
      AppMethodBeat.o(98207);
      return paramDouble;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(98207);
    }
  }

  public static Rect getExtendedBound(GeoPoint paramGeoPoint, Rect paramRect)
  {
    AppMethodBeat.i(98210);
    int i = Math.max(Math.abs(paramRect.left - paramGeoPoint.getLongitudeE6()), Math.abs(paramRect.right - paramGeoPoint.getLongitudeE6()));
    int j = Math.max(Math.abs(paramRect.top - paramGeoPoint.getLatitudeE6()), Math.abs(paramRect.bottom - paramGeoPoint.getLatitudeE6()));
    paramGeoPoint = new Rect(paramGeoPoint.getLongitudeE6() - j, paramGeoPoint.getLatitudeE6() - i, j + paramGeoPoint.getLongitudeE6(), i + paramGeoPoint.getLatitudeE6());
    AppMethodBeat.o(98210);
    return paramGeoPoint;
  }

  public static float getFloatByDecimalNum(float paramFloat, int paramInt)
  {
    AppMethodBeat.i(98208);
    try
    {
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramFloat);
      float f = localBigDecimal.setScale(paramInt, 4).floatValue();
      paramFloat = f;
      AppMethodBeat.o(98208);
      return paramFloat;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(98208);
    }
  }

  public static PointF getPoiWith2Line(PointF paramPointF1, PointF paramPointF2, PointF paramPointF3, PointF paramPointF4)
  {
    Object localObject = null;
    AppMethodBeat.i(98209);
    if ((paramPointF2.x == paramPointF1.x) || (paramPointF4.x == paramPointF3.x))
    {
      AppMethodBeat.o(98209);
      paramPointF1 = localObject;
    }
    while (true)
    {
      return paramPointF1;
      float f1 = (paramPointF2.y - paramPointF1.y) / (paramPointF2.x - paramPointF1.x);
      float f2 = (paramPointF4.y - paramPointF3.y) / (paramPointF4.x - paramPointF3.x);
      if (f1 == f2)
      {
        AppMethodBeat.o(98209);
        paramPointF1 = localObject;
      }
      else
      {
        float f3 = (paramPointF1.y * paramPointF2.x - paramPointF2.y * paramPointF1.x) / (paramPointF2.x - paramPointF1.x);
        float f4 = (paramPointF3.y * paramPointF4.x - paramPointF4.y * paramPointF3.x) / (paramPointF4.x - paramPointF3.x);
        f1 = (f4 - f3) / (f1 - f2);
        paramPointF1 = new PointF(f1, f2 * f1 + f4);
        AppMethodBeat.o(98209);
      }
    }
  }

  public static double radian2Angle(double paramDouble)
  {
    return 180.0D * paramDouble / 3.141592653589793D;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.MathUtil
 * JD-Core Version:    0.6.2
 */