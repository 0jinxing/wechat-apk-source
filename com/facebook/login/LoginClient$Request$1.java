package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginClient$Request$1
  implements Parcelable.Creator<LoginClient.Request>
{
  public final LoginClient.Request createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(96792);
    paramParcel = new LoginClient.Request(paramParcel, null);
    AppMethodBeat.o(96792);
    return paramParcel;
  }

  public final LoginClient.Request[] newArray(int paramInt)
  {
    return new LoginClient.Request[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginClient.Request.1
 * JD-Core Version:    0.6.2
 */