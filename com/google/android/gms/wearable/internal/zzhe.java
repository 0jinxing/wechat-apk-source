package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzhe extends zzgm<MessageApi.SendMessageResult>
{
  public zzhe(BaseImplementation.ResultHolder<MessageApi.SendMessageResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzga paramzzga)
  {
    AppMethodBeat.i(71393);
    zza(new zzey(zzgd.zzb(paramzzga.statusCode), paramzzga.zzeh));
    AppMethodBeat.o(71393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhe
 * JD-Core Version:    0.6.2
 */