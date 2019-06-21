package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ConnectionResultCreator
  implements Parcelable.Creator<ConnectionResult>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ConnectionResult createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89349);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    String str = null;
    PendingIntent localPendingIntent = null;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(m))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, m);
        break;
      case 1:
        k = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 2:
        j = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 3:
        localPendingIntent = (PendingIntent)SafeParcelReader.createParcelable(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 4:
        str = SafeParcelReader.createString(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ConnectionResult(k, j, localPendingIntent, str);
    AppMethodBeat.o(89349);
    return paramParcel;
  }

  public ConnectionResult[] newArray(int paramInt)
  {
    return new ConnectionResult[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResultCreator
 * JD-Core Version:    0.6.2
 */