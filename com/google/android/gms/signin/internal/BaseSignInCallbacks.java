package com.google.android.gms.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public class BaseSignInCallbacks extends ISignInCallbacks.Stub
{
  public void onAuthAccountComplete(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult)
  {
  }

  public void onGetCurrentAccountComplete(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount)
  {
  }

  public void onRecordConsentComplete(Status paramStatus)
  {
  }

  public void onSaveAccountToSessionStoreComplete(Status paramStatus)
  {
  }

  public void onSignInComplete(SignInResponse paramSignInResponse)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.BaseSignInCallbacks
 * JD-Core Version:    0.6.2
 */