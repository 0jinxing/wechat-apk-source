package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class FieldMappingDictionaryCreator
  implements Parcelable.Creator<FieldMappingDictionary>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public FieldMappingDictionary createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61575);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    String str = null;
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
        localArrayList = SafeParcelReader.createTypedList(paramParcel, k, FieldMappingDictionary.Entry.CREATOR);
        break;
      case 3:
        str = SafeParcelReader.createString(paramParcel, k);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new FieldMappingDictionary(j, localArrayList, str);
    AppMethodBeat.o(61575);
    return paramParcel;
  }

  public FieldMappingDictionary[] newArray(int paramInt)
  {
    return new FieldMappingDictionary[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMappingDictionaryCreator
 * JD-Core Version:    0.6.2
 */