package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgn extends zzgm<Status>
{
  public zzgn(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzbt paramzzbt)
  {
    AppMethodBeat.i(71375);
    zza(new Status(paramzzbt.statusCode));
    AppMethodBeat.o(71375);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgn
 * JD-Core Version:    0.6.2
 */