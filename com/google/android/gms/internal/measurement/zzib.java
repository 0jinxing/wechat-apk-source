package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzib
  implements Runnable
{
  zzib(zzhk paramzzhk, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69233);
    this.zzanw.zzgf().zzakj.set(this.zzaod);
    this.zzanw.zzge().zzis().zzg("Session timeout duration set", Long.valueOf(this.zzaod));
    AppMethodBeat.o(69233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzib
 * JD-Core Version:    0.6.2
 */