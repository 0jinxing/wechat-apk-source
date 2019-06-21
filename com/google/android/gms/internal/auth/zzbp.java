package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbp extends zzbg
{
  zzbp(zzbo paramzzbo)
  {
  }

  public final void zzd(ProxyResponse paramProxyResponse)
  {
    AppMethodBeat.i(77109);
    this.zzed.setResult(new zzbq(paramProxyResponse));
    AppMethodBeat.o(77109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbp
 * JD-Core Version:    0.6.2
 */