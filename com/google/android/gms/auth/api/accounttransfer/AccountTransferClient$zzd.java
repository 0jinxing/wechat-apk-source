package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzv;
import com.tencent.matrix.trace.core.AppMethodBeat;

class AccountTransferClient$zzd<T> extends zzv
{
  private AccountTransferClient.zze<T> zzbg;

  public AccountTransferClient$zzd(AccountTransferClient.zze<T> paramzze)
  {
    this.zzbg = paramzze;
  }

  public final void onFailure(Status paramStatus)
  {
    AppMethodBeat.i(76978);
    this.zzbg.zzd(paramStatus);
    AppMethodBeat.o(76978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd
 * JD-Core Version:    0.6.2
 */