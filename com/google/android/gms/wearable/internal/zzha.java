package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzha extends zzgm<ChannelApi.OpenChannelResult>
{
  public zzha(BaseImplementation.ResultHolder<ChannelApi.OpenChannelResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzfq paramzzfq)
  {
    AppMethodBeat.i(71389);
    zza(new zzam(zzgd.zzb(paramzzfq.statusCode), paramzzfq.zzck));
    AppMethodBeat.o(71389);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzha
 * JD-Core Version:    0.6.2
 */