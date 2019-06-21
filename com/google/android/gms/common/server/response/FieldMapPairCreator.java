package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FieldMapPairCreator
  implements Parcelable.Creator<FieldMappingDictionary.FieldMapPair>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public FieldMappingDictionary.FieldMapPair createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61556);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    FastJsonResponse.Field localField = null;
    String str = null;
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
        str = SafeParcelReader.createString(paramParcel, k);
        break;
      case 3:
        localField = (FastJsonResponse.Field)SafeParcelReader.createParcelable(paramParcel, k, FastJsonResponse.Field.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new FieldMappingDictionary.FieldMapPair(j, str, localField);
    AppMethodBeat.o(61556);
    return paramParcel;
  }

  public FieldMappingDictionary.FieldMapPair[] newArray(int paramInt)
  {
    return new FieldMappingDictionary.FieldMapPair[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMapPairCreator
 * JD-Core Version:    0.6.2
 */