package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbo extends zzbm
{
  zzbo(zzbn paramzzbn, GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest)
  {
    super(paramGoogleApiClient);
  }

  protected final void zzd(Context paramContext, zzbk paramzzbk)
  {
    AppMethodBeat.i(77108);
    paramzzbk.zzd(new zzbp(this), this.zzec);
    AppMethodBeat.o(77108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbo
 * JD-Core Version:    0.6.2
 */