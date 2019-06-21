package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AuthAccountResultCreator
  implements Parcelable.Creator<AuthAccountResult>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public AuthAccountResult createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61654);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    Intent localIntent = null;
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
        j = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 3:
        localIntent = (Intent)SafeParcelReader.createParcelable(paramParcel, m, Intent.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new AuthAccountResult(k, j, localIntent);
    AppMethodBeat.o(61654);
    return paramParcel;
  }

  public AuthAccountResult[] newArray(int paramInt)
  {
    return new AuthAccountResult[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.AuthAccountResultCreator
 * JD-Core Version:    0.6.2
 */