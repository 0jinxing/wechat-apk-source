package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzag;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzh extends AccountTransferClient.zze<byte[]>
{
  zzh(AccountTransferClient paramAccountTransferClient, zzag paramzzag)
  {
    super(null);
  }

  protected final void zzd(zzac paramzzac)
  {
    AppMethodBeat.i(76995);
    paramzzac.zzd(new zzi(this, this), this.zzba);
    AppMethodBeat.o(76995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.zzh
 * JD-Core Version:    0.6.2
 */