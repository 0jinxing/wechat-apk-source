package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class StringToIntConverterCreator
  implements Parcelable.Creator<StringToIntConverter>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public StringToIntConverter createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61459);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(k))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, k);
        break;
      case 1:
        j = SafeParcelReader.readInt(paramParcel, k);
        break;
      case 2:
        localArrayList = SafeParcelReader.createTypedList(paramParcel, k, StringToIntConverter.Entry.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new StringToIntConverter(j, localArrayList);
    AppMethodBeat.o(61459);
    return paramParcel;
  }

  public StringToIntConverter[] newArray(int paramInt)
  {
    return new StringToIntConverter[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.StringToIntConverterCreator
 * JD-Core Version:    0.6.2
 */