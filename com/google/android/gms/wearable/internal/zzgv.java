package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgv extends zzgm<DataApi.DataItemResult>
{
  public zzgv(BaseImplementation.ResultHolder<DataApi.DataItemResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzec paramzzec)
  {
    AppMethodBeat.i(71385);
    zza(new zzcg(zzgd.zzb(paramzzec.statusCode), paramzzec.zzdy));
    AppMethodBeat.o(71385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgv
 * JD-Core Version:    0.6.2
 */