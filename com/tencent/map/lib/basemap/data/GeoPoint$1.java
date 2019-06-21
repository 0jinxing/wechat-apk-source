package com.tencent.map.lib.basemap.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GeoPoint$1
  implements Parcelable.Creator<GeoPoint>
{
  public final GeoPoint a(Parcel paramParcel)
  {
    AppMethodBeat.i(97842);
    paramParcel = new GeoPoint(paramParcel, null);
    AppMethodBeat.o(97842);
    return paramParcel;
  }

  public final GeoPoint[] a(int paramInt)
  {
    return new GeoPoint[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.basemap.data.GeoPoint.1
 * JD-Core Version:    0.6.2
 */