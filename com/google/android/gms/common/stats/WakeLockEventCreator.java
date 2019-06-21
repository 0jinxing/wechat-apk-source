package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class WakeLockEventCreator
  implements Parcelable.Creator<WakeLockEvent>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public WakeLockEvent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89981);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    long l1 = 0L;
    int k = 0;
    String str1 = null;
    int m = 0;
    ArrayList localArrayList = null;
    String str2 = null;
    long l2 = 0L;
    int n = 0;
    String str3 = null;
    String str4 = null;
    float f = 0.0F;
    long l3 = 0L;
    String str5 = null;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(i1))
      {
      case 3:
      case 7:
      case 9:
      default:
        SafeParcelReader.skipUnknownField(paramParcel, i1);
        break;
      case 1:
        j = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 2:
        l1 = SafeParcelReader.readLong(paramParcel, i1);
        break;
      case 4:
        str1 = SafeParcelReader.createString(paramParcel, i1);
        break;
      case 5:
        m = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 6:
        localArrayList = SafeParcelReader.createStringList(paramParcel, i1);
        break;
      case 8:
        l2 = SafeParcelReader.readLong(paramParcel, i1);
        break;
      case 10:
        str3 = SafeParcelReader.createString(paramParcel, i1);
        break;
      case 11:
        k = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 12:
        str2 = SafeParcelReader.createString(paramParcel, i1);
        break;
      case 13:
        str4 = SafeParcelReader.createString(paramParcel, i1);
        break;
      case 14:
        n = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 15:
        f = SafeParcelReader.readFloat(paramParcel, i1);
        break;
      case 16:
        l3 = SafeParcelReader.readLong(paramParcel, i1);
        break;
      case 17:
        str5 = SafeParcelReader.createString(paramParcel, i1);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new WakeLockEvent(j, l1, k, str1, m, localArrayList, str2, l2, n, str3, str4, f, l3, str5);
    AppMethodBeat.o(89981);
    return paramParcel;
  }

  public WakeLockEvent[] newArray(int paramInt)
  {
    return new WakeLockEvent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.WakeLockEventCreator
 * JD-Core Version:    0.6.2
 */