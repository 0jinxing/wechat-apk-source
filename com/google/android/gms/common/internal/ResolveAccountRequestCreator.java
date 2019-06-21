package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ResolveAccountRequestCreator
  implements Parcelable.Creator<ResolveAccountRequest>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ResolveAccountRequest createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61361);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    GoogleSignInAccount localGoogleSignInAccount = null;
    int j = 0;
    Account localAccount = null;
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
        localAccount = (Account)SafeParcelReader.createParcelable(paramParcel, m, Account.CREATOR);
        break;
      case 3:
        j = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 4:
        localGoogleSignInAccount = (GoogleSignInAccount)SafeParcelReader.createParcelable(paramParcel, m, GoogleSignInAccount.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ResolveAccountRequest(k, localAccount, j, localGoogleSignInAccount);
    AppMethodBeat.o(61361);
    return paramParcel;
  }

  public ResolveAccountRequest[] newArray(int paramInt)
  {
    return new ResolveAccountRequest[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ResolveAccountRequestCreator
 * JD-Core Version:    0.6.2
 */