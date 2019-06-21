package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ClientIdentityCreator
  implements Parcelable.Creator<ClientIdentity>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ClientIdentity createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61313);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
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
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ClientIdentity(j, str);
    AppMethodBeat.o(61313);
    return paramParcel;
  }

  public ClientIdentity[] newArray(int paramInt)
  {
    return new ClientIdentity[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ClientIdentityCreator
 * JD-Core Version:    0.6.2
 */