package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgw extends zzgm<DataItemBuffer>
{
  public zzgw(BaseImplementation.ResultHolder<DataItemBuffer> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zzb(DataHolder paramDataHolder)
  {
    AppMethodBeat.i(71386);
    zza(new DataItemBuffer(paramDataHolder));
    AppMethodBeat.o(71386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgw
 * JD-Core Version:    0.6.2
 */