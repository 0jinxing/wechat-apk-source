package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ConnectionEventCreator
  implements Parcelable.Creator<ConnectionEvent>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ConnectionEvent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89950);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    long l1 = 0L;
    int k = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    long l2 = 0L;
    long l3 = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int m = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(m))
      {
      case 3:
      case 9:
      default:
        SafeParcelReader.skipUnknownField(paramParcel, m);
        break;
      case 1:
        j = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 2:
        l1 = SafeParcelReader.readLong(paramParcel, m);
        break;
      case 4:
        str1 = SafeParcelReader.createString(paramParcel, m);
        break;
      case 5:
        str2 = SafeParcelReader.createString(paramParcel, m);
        break;
      case 6:
        str3 = SafeParcelReader.createString(paramParcel, m);
        break;
      case 7:
        str4 = SafeParcelReader.createString(paramParcel, m);
        break;
      case 8:
        str5 = SafeParcelReader.createString(paramParcel, m);
        break;
      case 10:
        l2 = SafeParcelReader.readLong(paramParcel, m);
        break;
      case 11:
        l3 = SafeParcelReader.readLong(paramParcel, m);
        break;
      case 12:
        k = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 13:
        str6 = SafeParcelReader.createString(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ConnectionEvent(j, l1, k, str1, str2, str3, str4, str5, str6, l2, l3);
    AppMethodBeat.o(89950);
    return paramParcel;
  }

  public ConnectionEvent[] newArray(int paramInt)
  {
    return new ConnectionEvent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.ConnectionEventCreator
 * JD-Core Version:    0.6.2
 */