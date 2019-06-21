package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SignInButtonConfigCreator
  implements Parcelable.Creator<SignInButtonConfig>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public SignInButtonConfig createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61375);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    Scope[] arrayOfScope = null;
    int j = 0;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(n))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, n);
        break;
      case 1:
        m = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 2:
        k = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 3:
        j = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 4:
        arrayOfScope = (Scope[])SafeParcelReader.createTypedArray(paramParcel, n, Scope.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new SignInButtonConfig(m, k, j, arrayOfScope);
    AppMethodBeat.o(61375);
    return paramParcel;
  }

  public SignInButtonConfig[] newArray(int paramInt)
  {
    return new SignInButtonConfig[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.SignInButtonConfigCreator
 * JD-Core Version:    0.6.2
 */