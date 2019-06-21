package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgx extends zzgm<DataApi.GetFdForAssetResult>
{
  public zzgx(BaseImplementation.ResultHolder<DataApi.GetFdForAssetResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzee paramzzee)
  {
    AppMethodBeat.i(71387);
    zza(new zzci(zzgd.zzb(paramzzee.statusCode), paramzzee.zzdz));
    AppMethodBeat.o(71387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgx
 * JD-Core Version:    0.6.2
 */