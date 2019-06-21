package com.tencent.map.lib.basemap.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GeoPoint
  implements Parcelable
{
  public static final Parcelable.Creator<GeoPoint> CREATOR;
  private int mLatitudeE6;
  private int mLongitudeE6;

  static
  {
    AppMethodBeat.i(97850);
    CREATOR = new GeoPoint.1();
    AppMethodBeat.o(97850);
  }

  public GeoPoint()
  {
    this.mLatitudeE6 = -85000001;
    this.mLongitudeE6 = -180000001;
  }

  public GeoPoint(int paramInt1, int paramInt2)
  {
    this.mLatitudeE6 = paramInt1;
    this.mLongitudeE6 = paramInt2;
  }

  private GeoPoint(Parcel paramParcel)
  {
    AppMethodBeat.i(97849);
    this.mLatitudeE6 = paramParcel.readInt();
    this.mLongitudeE6 = paramParcel.readInt();
    AppMethodBeat.o(97849);
  }

  public GeoPoint(GeoPoint paramGeoPoint)
  {
    this();
    this.mLatitudeE6 = paramGeoPoint.mLatitudeE6;
    this.mLongitudeE6 = paramGeoPoint.mLongitudeE6;
  }

  public static GeoPoint formString(String paramString)
  {
    AppMethodBeat.i(97847);
    GeoPoint localGeoPoint = new GeoPoint();
    if (paramString != null);
    try
    {
      paramString = paramString.split(",");
      if ((paramString != null) && (paramString.length == 2))
      {
        localGeoPoint.mLatitudeE6 = Integer.parseInt(paramString[0]);
        localGeoPoint.mLongitudeE6 = Integer.parseInt(paramString[1]);
      }
      label54: AppMethodBeat.o(97847);
      return localGeoPoint;
    }
    catch (Exception paramString)
    {
      break label54;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof GeoPoint))
    {
      paramObject = (GeoPoint)paramObject;
      bool2 = bool1;
      if (this.mLatitudeE6 == paramObject.mLatitudeE6)
      {
        bool2 = bool1;
        if (this.mLongitudeE6 == paramObject.mLongitudeE6)
          bool2 = true;
      }
    }
    return bool2;
  }

  public int getLatitudeE6()
  {
    return this.mLatitudeE6;
  }

  public int getLongitudeE6()
  {
    return this.mLongitudeE6;
  }

  public void setGeoPoint(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(97845);
    this.mLatitudeE6 = paramGeoPoint.getLatitudeE6();
    this.mLongitudeE6 = paramGeoPoint.getLongitudeE6();
    AppMethodBeat.o(97845);
  }

  public void setLatitudeE6(int paramInt)
  {
    this.mLatitudeE6 = paramInt;
  }

  public void setLongitudeE6(int paramInt)
  {
    this.mLongitudeE6 = paramInt;
  }

  public String toString()
  {
    AppMethodBeat.i(97846);
    String str = this.mLatitudeE6 + "," + this.mLongitudeE6;
    AppMethodBeat.o(97846);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(97848);
    paramParcel.writeInt(this.mLatitudeE6);
    paramParcel.writeInt(this.mLongitudeE6);
    AppMethodBeat.o(97848);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.basemap.data.GeoPoint
 * JD-Core Version:    0.6.2
 */