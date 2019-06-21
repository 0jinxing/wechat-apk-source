package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ConverterWrapperCreator
  implements Parcelable.Creator<ConverterWrapper>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ConverterWrapper createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61445);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    StringToIntConverter localStringToIntConverter = null;
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
        localStringToIntConverter = (StringToIntConverter)SafeParcelReader.createParcelable(paramParcel, k, StringToIntConverter.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ConverterWrapper(j, localStringToIntConverter);
    AppMethodBeat.o(61445);
    return paramParcel;
  }

  public ConverterWrapper[] newArray(int paramInt)
  {
    return new ConverterWrapper[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.ConverterWrapperCreator
 * JD-Core Version:    0.6.2
 */