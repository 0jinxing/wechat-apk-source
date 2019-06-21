package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgo extends zzgm<Status>
{
  public zzgo(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zzb(zzbt paramzzbt)
  {
    AppMethodBeat.i(71376);
    zza(new Status(paramzzbt.statusCode));
    AppMethodBeat.o(71376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgo
 * JD-Core Version:    0.6.2
 */