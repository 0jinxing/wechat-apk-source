package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SafeParcelResponseCreator
  implements Parcelable.Creator<SafeParcelResponse>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public SafeParcelResponse createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61623);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    FieldMappingDictionary localFieldMappingDictionary = null;
    Parcel localParcel = null;
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
        localParcel = SafeParcelReader.createParcel(paramParcel, k);
        break;
      case 3:
        localFieldMappingDictionary = (FieldMappingDictionary)SafeParcelReader.createParcelable(paramParcel, k, FieldMappingDictionary.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new SafeParcelResponse(j, localParcel, localFieldMappingDictionary);
    AppMethodBeat.o(61623);
    return paramParcel;
  }

  public SafeParcelResponse[] newArray(int paramInt)
  {
    return new SafeParcelResponse[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.SafeParcelResponseCreator
 * JD-Core Version:    0.6.2
 */