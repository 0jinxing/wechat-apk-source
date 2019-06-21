package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzaq extends zzam
{
  zzaq(zzap paramzzap)
  {
  }

  public final void zzd(Status paramStatus, Credential paramCredential)
  {
    AppMethodBeat.i(50479);
    this.zzds.setResult(new zzan(paramStatus, paramCredential));
    AppMethodBeat.o(50479);
  }

  public final void zze(Status paramStatus)
  {
    AppMethodBeat.i(50480);
    this.zzds.setResult(zzan.zzf(paramStatus));
    AppMethodBeat.o(50480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzaq
 * JD-Core Version:    0.6.2
 */