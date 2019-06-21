package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

@Deprecated
public abstract interface WorkAccountApi
{
  @Deprecated
  public abstract PendingResult<WorkAccountApi.AddAccountResult> addWorkAccount(GoogleApiClient paramGoogleApiClient, String paramString);

  @Deprecated
  public abstract PendingResult<Result> removeWorkAccount(GoogleApiClient paramGoogleApiClient, Account paramAccount);

  @Deprecated
  public abstract void setWorkAuthenticatorEnabled(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);

  @Deprecated
  public abstract PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.account.WorkAccountApi
 * JD-Core Version:    0.6.2
 */