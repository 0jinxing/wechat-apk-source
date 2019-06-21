package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzas extends zzav<Status>
{
  zzas(zzao paramzzao, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }

  protected final void zzd(Context paramContext, zzbc paramzzbc)
  {
    AppMethodBeat.i(50482);
    paramzzbc.zzd(new zzau(this), new zzay(this.zzdt));
    AppMethodBeat.o(50482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzas
 * JD-Core Version:    0.6.2
 */