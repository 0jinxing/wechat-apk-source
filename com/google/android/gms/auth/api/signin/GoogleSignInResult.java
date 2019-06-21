package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GoogleSignInResult
  implements Result
{
  private Status mStatus;
  private GoogleSignInAccount zzen;

  public GoogleSignInResult(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    this.zzen = paramGoogleSignInAccount;
    this.mStatus = paramStatus;
  }

  public GoogleSignInAccount getSignInAccount()
  {
    return this.zzen;
  }

  public Status getStatus()
  {
    return this.mStatus;
  }

  public boolean isSuccess()
  {
    AppMethodBeat.i(50396);
    boolean bool = this.mStatus.isSuccess();
    AppMethodBeat.o(50396);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInResult
 * JD-Core Version:    0.6.2
 */