package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzar extends zzav<Status>
{
  zzar(zzao paramzzao, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }

  protected final void zzd(Context paramContext, zzbc paramzzbc)
  {
    AppMethodBeat.i(50481);
    paramzzbc.zzd(new zzau(this), new zzbe(this.zzdt));
    AppMethodBeat.o(50481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzar
 * JD-Core Version:    0.6.2
 */