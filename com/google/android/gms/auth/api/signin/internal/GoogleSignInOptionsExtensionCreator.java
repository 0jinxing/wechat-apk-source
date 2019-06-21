package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GoogleSignInOptionsExtensionCreator
  implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(60383);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    Bundle localBundle = null;
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
        localBundle = SafeParcelReader.createBundle(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new GoogleSignInOptionsExtensionParcelable(k, j, localBundle);
    AppMethodBeat.o(60383);
    return paramParcel;
  }

  public GoogleSignInOptionsExtensionParcelable[] newArray(int paramInt)
  {
    return new GoogleSignInOptionsExtensionParcelable[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionCreator
 * JD-Core Version:    0.6.2
 */