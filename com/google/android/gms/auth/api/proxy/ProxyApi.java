package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

@KeepForSdk
public abstract interface ProxyApi
{
  @KeepForSdk
  public abstract PendingResult<ProxyApi.ProxyResult> performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.proxy.ProxyApi
 * JD-Core Version:    0.6.2
 */