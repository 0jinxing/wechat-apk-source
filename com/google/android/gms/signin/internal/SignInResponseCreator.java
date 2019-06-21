package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SignInResponseCreator
  implements Parcelable.Creator<SignInResponse>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public SignInResponse createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61705);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    ResolveAccountResponse localResolveAccountResponse = null;
    ConnectionResult localConnectionResult = null;
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
        localConnectionResult = (ConnectionResult)SafeParcelReader.createParcelable(paramParcel, k, ConnectionResult.CREATOR);
        break;
      case 3:
        localResolveAccountResponse = (ResolveAccountResponse)SafeParcelReader.createParcelable(paramParcel, k, ResolveAccountResponse.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new SignInResponse(j, localConnectionResult, localResolveAccountResponse);
    AppMethodBeat.o(61705);
    return paramParcel;
  }

  public SignInResponse[] newArray(int paramInt)
  {
    return new SignInResponse[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.SignInResponseCreator
 * JD-Core Version:    0.6.2
 */