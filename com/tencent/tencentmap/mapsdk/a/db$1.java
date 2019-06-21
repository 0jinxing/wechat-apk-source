package com.tencent.tencentmap.mapsdk.a;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class db$1
  implements Parcelable.Creator<db>
{
  public final db a(Parcel paramParcel)
  {
    AppMethodBeat.i(100981);
    paramParcel = new db(paramParcel, null);
    AppMethodBeat.o(100981);
    return paramParcel;
  }

  public final db[] a(int paramInt)
  {
    return new db[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.db.1
 * JD-Core Version:    0.6.2
 */