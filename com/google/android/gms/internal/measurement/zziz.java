package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zziz
  implements Runnable
{
  zziz(zziw paramzziw, zzey paramzzey)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69344);
    synchronized (this.zzapn)
    {
      zziw.zza(this.zzapn, false);
      if (!this.zzapn.zzape.isConnected())
      {
        this.zzapn.zzape.zzge().zzis().log("Connected to remote service");
        this.zzapn.zzape.zza(this.zzapo);
      }
      AppMethodBeat.o(69344);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zziz
 * JD-Core Version:    0.6.2
 */