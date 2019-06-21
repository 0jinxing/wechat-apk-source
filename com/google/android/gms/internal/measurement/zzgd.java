package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgd
  implements Runnable
{
  zzgd(zzgb paramzzgb, zzgl paramzzgl, long paramLong, Bundle paramBundle, Context paramContext, zzfg paramzzfg, BroadcastReceiver.PendingResult paramPendingResult)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68985);
    long l1 = this.zzalb.zzgf().zzajz.get();
    long l2 = this.zzald;
    long l3 = l2;
    if (l1 > 0L)
      if (l2 < l1)
      {
        l3 = l2;
        if (l2 > 0L);
      }
      else
      {
        l3 = l1 - 1L;
      }
    if (l3 > 0L)
      this.zzale.putLong("click_timestamp", l3);
    this.zzale.putString("_cis", "referrer broadcast");
    AppMeasurement.getInstance(this.val$context).logEventInternal("auto", "_cmp", this.zzale);
    this.zzalc.zzit().log("Install campaign recorded");
    if (this.zzqu != null)
      this.zzqu.finish();
    AppMethodBeat.o(68985);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgd
 * JD-Core Version:    0.6.2
 */