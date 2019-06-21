package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ValidateAccountRequestCreator
  implements Parcelable.Creator<ValidateAccountRequest>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ValidateAccountRequest createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89725);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
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
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ValidateAccountRequest(j);
    AppMethodBeat.o(89725);
    return paramParcel;
  }

  public ValidateAccountRequest[] newArray(int paramInt)
  {
    return new ValidateAccountRequest[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ValidateAccountRequestCreator
 * JD-Core Version:    0.6.2
 */