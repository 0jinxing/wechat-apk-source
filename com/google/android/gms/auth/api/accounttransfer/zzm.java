package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzae;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzm extends AccountTransferClient.zzf
{
  zzm(AccountTransferClient paramAccountTransferClient, zzae paramzzae)
  {
    super(null);
  }

  protected final void zzd(zzac paramzzac)
  {
    AppMethodBeat.i(77000);
    paramzzac.zzd(this.zzbi, this.zzbf);
    AppMethodBeat.o(77000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.zzm
 * JD-Core Version:    0.6.2
 */