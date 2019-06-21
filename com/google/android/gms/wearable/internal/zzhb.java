package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

final class zzhb extends zzgm<DataApi.DataItemResult>
{
  private final List<FutureTask<Boolean>> zzev;

  zzhb(BaseImplementation.ResultHolder<DataApi.DataItemResult> paramResultHolder, List<FutureTask<Boolean>> paramList)
  {
    super(paramResultHolder);
    this.zzev = paramList;
  }

  public final void zza(zzfu paramzzfu)
  {
    AppMethodBeat.i(71390);
    zza(new zzcg(zzgd.zzb(paramzzfu.statusCode), paramzzfu.zzdy));
    if (paramzzfu.statusCode != 0)
    {
      paramzzfu = this.zzev.iterator();
      while (paramzzfu.hasNext())
        ((FutureTask)paramzzfu.next()).cancel(true);
    }
    AppMethodBeat.o(71390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhb
 * JD-Core Version:    0.6.2
 */