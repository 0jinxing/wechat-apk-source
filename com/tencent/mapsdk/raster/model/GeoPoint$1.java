package com.tencent.mapsdk.raster.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GeoPoint$1
  implements Parcelable.Creator<GeoPoint>
{
  public final GeoPoint createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(101176);
    paramParcel = new GeoPoint(paramParcel, null);
    AppMethodBeat.o(101176);
    return paramParcel;
  }

  public final GeoPoint[] newArray(int paramInt)
  {
    return new GeoPoint[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.GeoPoint.1
 * JD-Core Version:    0.6.2
 */