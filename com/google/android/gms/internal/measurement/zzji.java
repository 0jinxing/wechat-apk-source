package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzji extends zzem
{
  zzji(zzjh paramzzjh, zzhi paramzzhi)
  {
    super(paramzzhi);
  }

  public final void run()
  {
    AppMethodBeat.i(69392);
    zzjh localzzjh = this.zzapx;
    localzzjh.zzab();
    long l = localzzjh.zzbt().elapsedRealtime();
    localzzjh.zzge().zzit().zzg("Session started, time", Long.valueOf(l));
    localzzjh.zzgf().zzakk.set(false);
    localzzjh.zzfu().zza("auto", "_s", new Bundle());
    localzzjh.zzgf().zzakl.set(localzzjh.zzbt().currentTimeMillis());
    AppMethodBeat.o(69392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzji
 * JD-Core Version:    0.6.2
 */