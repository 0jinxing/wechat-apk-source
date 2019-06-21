package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FieldCreator
  implements Parcelable.Creator<FastJsonResponse.Field>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public FastJsonResponse.Field createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61553);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    ConverterWrapper localConverterWrapper = null;
    String str1 = null;
    int j = 0;
    String str2 = null;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(i1))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, i1);
        break;
      case 1:
        n = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 2:
        m = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 3:
        bool2 = SafeParcelReader.readBoolean(paramParcel, i1);
        break;
      case 4:
        k = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 5:
        bool1 = SafeParcelReader.readBoolean(paramParcel, i1);
        break;
      case 6:
        str2 = SafeParcelReader.createString(paramParcel, i1);
        break;
      case 7:
        j = SafeParcelReader.readInt(paramParcel, i1);
        break;
      case 8:
        str1 = SafeParcelReader.createString(paramParcel, i1);
        break;
      case 9:
        localConverterWrapper = (ConverterWrapper)SafeParcelReader.createParcelable(paramParcel, i1, ConverterWrapper.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new FastJsonResponse.Field(n, m, bool2, k, bool1, str2, j, str1, localConverterWrapper);
    AppMethodBeat.o(61553);
    return paramParcel;
  }

  public FastJsonResponse.Field[] newArray(int paramInt)
  {
    return new FastJsonResponse.Field[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FieldCreator
 * JD-Core Version:    0.6.2
 */