package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzp<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzh>
{
  public zzp(GoogleApiClient paramGoogleApiClient)
  {
    super(Auth.GOOGLE_SIGN_IN_API, paramGoogleApiClient);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzp
 * JD-Core Version:    0.6.2
 */