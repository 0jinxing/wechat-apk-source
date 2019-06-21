package com.google.android.gms.stats;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Future;

public class WakeLock$HeldLock
{
  private boolean zzaek = true;
  private Future zzael;
  private final String zzaem;

  private WakeLock$HeldLock(WakeLock paramWakeLock, String paramString)
  {
    this.zzaem = paramString;
  }

  public void finalize()
  {
    AppMethodBeat.i(113948);
    if (this.zzaek)
    {
      String str = String.valueOf(this.zzaem);
      if (str.length() == 0)
        break label45;
      "HeldLock finalized while still holding the WakeLock! Reason: ".concat(str);
    }
    while (true)
    {
      release(0);
      AppMethodBeat.o(113948);
      return;
      label45: new String("HeldLock finalized while still holding the WakeLock! Reason: ");
    }
  }

  public void release()
  {
    AppMethodBeat.i(113946);
    release(0);
    AppMethodBeat.o(113946);
  }

  public void release(int paramInt)
  {
    try
    {
      AppMethodBeat.i(113947);
      if (!this.zzaek)
        AppMethodBeat.o(113947);
      while (true)
      {
        return;
        this.zzaek = false;
        if (this.zzael != null)
        {
          this.zzael.cancel(false);
          this.zzael = null;
        }
        WakeLock.zza(this.zzaei, this.zzaem, paramInt);
        AppMethodBeat.o(113947);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.stats.WakeLock.HeldLock
 * JD-Core Version:    0.6.2
 */