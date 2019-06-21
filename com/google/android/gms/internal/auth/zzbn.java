package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzbn
  implements ProxyApi
{
  public final PendingResult<ProxyApi.ProxyResult> performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest)
  {
    AppMethodBeat.i(77107);
    Preconditions.checkNotNull(paramGoogleApiClient);
    Preconditions.checkNotNull(paramProxyRequest);
    paramGoogleApiClient = paramGoogleApiClient.execute(new zzbo(this, paramGoogleApiClient, paramProxyRequest));
    AppMethodBeat.o(77107);
    return paramGoogleApiClient;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbn
 * JD-Core Version:    0.6.2
 */