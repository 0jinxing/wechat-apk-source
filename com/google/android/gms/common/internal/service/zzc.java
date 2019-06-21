package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzc<R extends Result> extends BaseImplementation.ApiMethodImpl<R, CommonClient>
{
  public zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(Common.API, paramGoogleApiClient);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.service.zzc
 * JD-Core Version:    0.6.2
 */