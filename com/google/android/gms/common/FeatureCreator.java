package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FeatureCreator
  implements Parcelable.Creator<Feature>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public Feature createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89357);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    String str = null;
    int j = 0;
    long l = -1L;
    while (paramParcel.dataPosition() < i)
    {
      int k = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(k))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, k);
        break;
      case 1:
        str = SafeParcelReader.createString(paramParcel, k);
        break;
      case 2:
        j = SafeParcelReader.readInt(paramParcel, k);
        break;
      case 3:
        l = SafeParcelReader.readLong(paramParcel, k);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new Feature(str, j, l);
    AppMethodBeat.o(89357);
    return paramParcel;
  }

  public Feature[] newArray(int paramInt)
  {
    return new Feature[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.FeatureCreator
 * JD-Core Version:    0.6.2
 */