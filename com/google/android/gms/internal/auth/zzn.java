package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzn extends zzq
{
  zzn(zzm paramzzm)
  {
  }

  public final void zzf(Account paramAccount)
  {
    AppMethodBeat.i(77139);
    zzm localzzm = this.zzah;
    if (paramAccount != null);
    for (Status localStatus = Status.RESULT_SUCCESS; ; localStatus = zzk.zzf())
    {
      localzzm.setResult(new zzr(localStatus, paramAccount));
      AppMethodBeat.o(77139);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzn
 * JD-Core Version:    0.6.2
 */