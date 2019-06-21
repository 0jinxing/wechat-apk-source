package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzia
  implements Runnable
{
  zzia(zzhk paramzzhk, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69232);
    this.zzanw.zzgf().zzaki.set(this.zzaod);
    this.zzanw.zzge().zzis().zzg("Minimum session duration set", Long.valueOf(this.zzaod));
    AppMethodBeat.o(69232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzia
 * JD-Core Version:    0.6.2
 */