package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.h;

public class LatLngBounds
{
  private int mVersionCode;
  private LatLng northeast;
  private LatLng southwest;

  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    AppMethodBeat.i(101202);
    paramLatLng1 = new LatLngBounds.Builder().include(paramLatLng1).include(paramLatLng2);
    this.southwest = new LatLng(LatLngBounds.Builder.access$000(paramLatLng1), LatLngBounds.Builder.access$100(paramLatLng1));
    this.northeast = new LatLng(LatLngBounds.Builder.access$200(paramLatLng1), LatLngBounds.Builder.access$300(paramLatLng1));
    this.mVersionCode = paramInt;
    AppMethodBeat.o(101202);
  }

  public LatLngBounds(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this(1, paramLatLng1, paramLatLng2);
  }

  public static LatLngBounds.Builder builder()
  {
    AppMethodBeat.i(101203);
    LatLngBounds.Builder localBuilder = new LatLngBounds.Builder();
    AppMethodBeat.o(101203);
    return localBuilder;
  }

  private boolean containsLatitude(double paramDouble)
  {
    AppMethodBeat.i(101209);
    boolean bool;
    if ((this.southwest.getLatitude() <= paramDouble) && (paramDouble <= this.northeast.getLatitude()))
    {
      bool = true;
      AppMethodBeat.o(101209);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101209);
    }
  }

  private boolean containsLongitude(double paramDouble)
  {
    boolean bool = true;
    AppMethodBeat.i(101210);
    if (this.southwest.getLongitude() <= this.northeast.getLongitude())
      if ((this.southwest.getLongitude() <= paramDouble) && (paramDouble <= this.northeast.getLongitude()))
        AppMethodBeat.o(101210);
    while (true)
    {
      return bool;
      AppMethodBeat.o(101210);
      bool = false;
      continue;
      if ((this.southwest.getLongitude() <= paramDouble) || (paramDouble <= this.northeast.getLongitude()))
      {
        AppMethodBeat.o(101210);
      }
      else
      {
        AppMethodBeat.o(101210);
        bool = false;
      }
    }
  }

  private boolean intersect(LatLngBounds paramLatLngBounds)
  {
    boolean bool = false;
    AppMethodBeat.i(101207);
    if ((paramLatLngBounds == null) || (paramLatLngBounds.northeast == null) || (paramLatLngBounds.southwest == null) || (this.northeast == null) || (this.southwest == null))
      AppMethodBeat.o(101207);
    while (true)
    {
      return bool;
      double d1 = paramLatLngBounds.northeast.getLongitude();
      double d2 = paramLatLngBounds.southwest.getLongitude();
      double d3 = this.northeast.getLongitude();
      double d4 = this.southwest.getLongitude();
      double d5 = this.northeast.getLongitude();
      double d6 = this.southwest.getLongitude();
      double d7 = paramLatLngBounds.northeast.getLongitude();
      double d8 = paramLatLngBounds.southwest.getLongitude();
      double d9 = paramLatLngBounds.northeast.getLatitude();
      double d10 = paramLatLngBounds.southwest.getLatitude();
      double d11 = this.northeast.getLatitude();
      double d12 = this.southwest.getLatitude();
      double d13 = this.northeast.getLatitude();
      double d14 = this.southwest.getLatitude();
      double d15 = paramLatLngBounds.northeast.getLatitude();
      double d16 = paramLatLngBounds.southwest.getLatitude();
      if ((Math.abs(d1 + d2 - d3 - d4) < d5 - d6 + d7 - d8) && (Math.abs(d9 + d10 - d11 - d12) < d13 - d14 + d15 - d16))
      {
        bool = true;
        AppMethodBeat.o(101207);
      }
      else
      {
        AppMethodBeat.o(101207);
      }
    }
  }

  private static double longitudeDistanceHeadingEast(double paramDouble1, double paramDouble2)
  {
    return (paramDouble2 - paramDouble1 + 360.0D) % 360.0D;
  }

  private static double longitudeDistanceHeadingWest(double paramDouble1, double paramDouble2)
  {
    return (paramDouble1 - paramDouble2 + 360.0D) % 360.0D;
  }

  public boolean contains(LatLng paramLatLng)
  {
    AppMethodBeat.i(101204);
    boolean bool;
    if ((containsLatitude(paramLatLng.getLatitude())) && (containsLongitude(paramLatLng.getLongitude())))
    {
      bool = true;
      AppMethodBeat.o(101204);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101204);
    }
  }

  public boolean contains(LatLngBounds paramLatLngBounds)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(101205);
    if (paramLatLngBounds == null)
      AppMethodBeat.o(101205);
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (contains(paramLatLngBounds.southwest))
      {
        bool2 = bool1;
        if (contains(paramLatLngBounds.northeast))
          bool2 = true;
      }
      AppMethodBeat.o(101205);
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(101212);
    if (this == paramObject)
      AppMethodBeat.o(101212);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof LatLngBounds))
      {
        AppMethodBeat.o(101212);
        bool = false;
      }
      else
      {
        paramObject = (LatLngBounds)paramObject;
        if ((this.southwest.equals(paramObject.southwest)) && (this.northeast.equals(paramObject.northeast)))
        {
          AppMethodBeat.o(101212);
        }
        else
        {
          AppMethodBeat.o(101212);
          bool = false;
        }
      }
    }
  }

  public LatLng getNortheast()
  {
    return this.northeast;
  }

  public LatLng getSouthwest()
  {
    return this.southwest;
  }

  int getVersionCode()
  {
    return this.mVersionCode;
  }

  public int hashCode()
  {
    AppMethodBeat.i(101211);
    int i = h.a(new Object[] { this.southwest, this.northeast });
    AppMethodBeat.o(101211);
    return i;
  }

  public LatLngBounds including(LatLng paramLatLng)
  {
    AppMethodBeat.i(101208);
    double d1 = Math.min(this.southwest.getLatitude(), paramLatLng.getLatitude());
    double d2 = Math.max(this.northeast.getLatitude(), paramLatLng.getLatitude());
    double d3 = this.northeast.getLongitude();
    double d4 = this.southwest.getLongitude();
    double d5 = paramLatLng.getLongitude();
    double d6 = d4;
    double d7 = d3;
    if (!containsLongitude(d5))
    {
      if (longitudeDistanceHeadingWest(d4, d5) >= longitudeDistanceHeadingEast(d3, d5))
        break label139;
      d6 = d5;
      d7 = d3;
    }
    while (true)
    {
      paramLatLng = new LatLngBounds(new LatLng(d1, d6), new LatLng(d2, d7));
      AppMethodBeat.o(101208);
      return paramLatLng;
      label139: d7 = d5;
      d6 = d4;
    }
  }

  public boolean intersects(LatLngBounds paramLatLngBounds)
  {
    boolean bool = false;
    AppMethodBeat.i(101206);
    if (paramLatLngBounds == null)
      AppMethodBeat.o(101206);
    while (true)
    {
      return bool;
      if ((intersect(paramLatLngBounds)) || (paramLatLngBounds.intersect(this)))
      {
        bool = true;
        AppMethodBeat.o(101206);
      }
      else
      {
        AppMethodBeat.o(101206);
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(101213);
    String str = h.a(new String[] { h.a("southwest", this.southwest), h.a("northeast", this.northeast) });
    AppMethodBeat.o(101213);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.LatLngBounds
 * JD-Core Version:    0.6.2
 */