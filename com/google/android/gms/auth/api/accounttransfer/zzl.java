package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzak;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzl extends AccountTransferClient.zzf
{
  zzl(AccountTransferClient paramAccountTransferClient, zzak paramzzak)
  {
    super(null);
  }

  protected final void zzd(zzac paramzzac)
  {
    AppMethodBeat.i(76999);
    paramzzac.zzd(this.zzbi, this.zzbe);
    AppMethodBeat.o(76999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.zzl
 * JD-Core Version:    0.6.2
 */