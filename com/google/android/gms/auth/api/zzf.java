package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth.zzbh;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzf
{
  public static final Api<zzh> API;
  private static final Api.ClientKey<zzbh> zzas;
  private static final Api.AbstractClientBuilder<zzbh, zzh> zzat;

  static
  {
    AppMethodBeat.i(77052);
    zzas = new Api.ClientKey();
    zzat = new zzg();
    API = new Api("Auth.PROXY_API", zzat, zzas);
    AppMethodBeat.o(77052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.zzf
 * JD-Core Version:    0.6.2
 */