package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzv<O extends Api.ApiOptions> extends GoogleApi<O>
{
  private final Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> zzdh;
  private final Api.Client zzgd;
  private final zzp zzge;
  private final ClientSettings zzgf;

  public zzv(Context paramContext, Api<O> paramApi, Looper paramLooper, Api.Client paramClient, zzp paramzzp, ClientSettings paramClientSettings, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> paramAbstractClientBuilder)
  {
    super(paramContext, paramApi, paramLooper);
    AppMethodBeat.i(60980);
    this.zzgd = paramClient;
    this.zzge = paramzzp;
    this.zzgf = paramClientSettings;
    this.zzdh = paramAbstractClientBuilder;
    this.zzcq.zza(this);
    AppMethodBeat.o(60980);
  }

  public final Api.Client zza(Looper paramLooper, GoogleApiManager.zza<O> paramzza)
  {
    AppMethodBeat.i(60981);
    this.zzge.zza(paramzza);
    paramLooper = this.zzgd;
    AppMethodBeat.o(60981);
    return paramLooper;
  }

  public final zzby zza(Context paramContext, Handler paramHandler)
  {
    AppMethodBeat.i(60982);
    paramContext = new zzby(paramContext, paramHandler, this.zzgf, this.zzdh);
    AppMethodBeat.o(60982);
    return paramContext;
  }

  public final Api.Client zzae()
  {
    return this.zzgd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzv
 * JD-Core Version:    0.6.2
 */