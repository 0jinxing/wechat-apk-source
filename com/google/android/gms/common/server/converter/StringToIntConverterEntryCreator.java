package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class StringToIntConverterEntryCreator
  implements Parcelable.Creator<StringToIntConverter.Entry>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public StringToIntConverter.Entry createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61462);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    String str = null;
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
        str = SafeParcelReader.createString(paramParcel, m);
        break;
      case 3:
        j = SafeParcelReader.readInt(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new StringToIntConverter.Entry(k, str, j);
    AppMethodBeat.o(61462);
    return paramParcel;
  }

  public StringToIntConverter.Entry[] newArray(int paramInt)
  {
    return new StringToIntConverter.Entry[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.StringToIntConverterEntryCreator
 * JD-Core Version:    0.6.2
 */