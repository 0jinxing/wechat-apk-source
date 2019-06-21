package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzau extends zzam
{
  private BaseImplementation.ResultHolder<Status> zzdu;

  zzau(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.zzdu = paramResultHolder;
  }

  public final void zze(Status paramStatus)
  {
    AppMethodBeat.i(50484);
    this.zzdu.setResult(paramStatus);
    AppMethodBeat.o(50484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzau
 * JD-Core Version:    0.6.2
 */