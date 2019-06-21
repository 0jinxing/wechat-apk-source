package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.h;

public final class VisibleRegion
{
  private final LatLng farLeft;
  private final LatLng farRight;
  private final LatLngBounds latLngBounds;
  private final int mVersionCode;
  private final LatLng nearLeft;
  private final LatLng nearRight;

  protected VisibleRegion(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2, LatLng paramLatLng3, LatLng paramLatLng4, LatLngBounds paramLatLngBounds)
  {
    this.mVersionCode = paramInt;
    this.nearLeft = paramLatLng1;
    this.nearRight = paramLatLng2;
    this.farLeft = paramLatLng3;
    this.farRight = paramLatLng4;
    this.latLngBounds = paramLatLngBounds;
  }

  public VisibleRegion(LatLng paramLatLng1, LatLng paramLatLng2, LatLng paramLatLng3, LatLng paramLatLng4, LatLngBounds paramLatLngBounds)
  {
    this(1, paramLatLng1, paramLatLng2, paramLatLng3, paramLatLng4, paramLatLngBounds);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(101225);
    if (this == paramObject)
      AppMethodBeat.o(101225);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof VisibleRegion))
      {
        AppMethodBeat.o(101225);
        bool = false;
      }
      else
      {
        paramObject = (VisibleRegion)paramObject;
        if ((getNearLeft().equals(paramObject.getNearLeft())) && (getNearRight().equals(paramObject.getNearRight())) && (getFarLeft().equals(paramObject.getFarLeft())) && (getFarRight().equals(paramObject.getFarRight())) && (getLatLngBounds().equals(paramObject.getLatLngBounds())))
        {
          AppMethodBeat.o(101225);
        }
        else
        {
          AppMethodBeat.o(101225);
          bool = false;
        }
      }
    }
  }

  public final LatLng getFarLeft()
  {
    return this.farLeft;
  }

  public final LatLng getFarRight()
  {
    return this.farRight;
  }

  public final LatLngBounds getLatLngBounds()
  {
    return this.latLngBounds;
  }

  public final LatLng getNearLeft()
  {
    return this.nearLeft;
  }

  public final LatLng getNearRight()
  {
    return this.nearRight;
  }

  protected final int getVersionCode()
  {
    return this.mVersionCode;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(101224);
    int i = h.a(new Object[] { getNearLeft(), getNearRight(), getFarLeft(), getFarRight(), getLatLngBounds() });
    AppMethodBeat.o(101224);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(101226);
    String str = h.a(new String[] { h.a("nearLeft", getNearLeft()), h.a("nearRight", getNearRight()), h.a("farLeft", getFarLeft()), h.a("farRight", getFarRight()), h.a("latLngBounds", getLatLngBounds()) });
    AppMethodBeat.o(101226);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.VisibleRegion
 * JD-Core Version:    0.6.2
 */