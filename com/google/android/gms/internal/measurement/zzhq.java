package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzhq
  implements Runnable
{
  zzhq(zzhk paramzzhk, long paramLong)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    AppMethodBeat.i(69222);
    zzhk localzzhk = this.zzanw;
    long l = this.zzaoa;
    localzzhk.zzab();
    localzzhk.zzch();
    localzzhk.zzge().zzis().log("Resetting analytics data (FE)");
    localzzhk.zzgc().zzkj();
    if (localzzhk.zzgg().zzba(localzzhk.zzfv().zzah()))
      localzzhk.zzgf().zzajz.set(l);
    boolean bool2 = localzzhk.zzacw.isEnabled();
    if (!localzzhk.zzgg().zzhg())
    {
      zzfr localzzfr = localzzhk.zzgf();
      if (!bool2)
      {
        bool3 = true;
        localzzfr.zzh(bool3);
      }
    }
    else
    {
      localzzhk.zzfx().resetAnalyticsData();
      if (bool2)
        break label145;
    }
    label145: for (boolean bool3 = bool1; ; bool3 = false)
    {
      localzzhk.zzanu = bool3;
      AppMethodBeat.o(69222);
      return;
      bool3 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhq
 * JD-Core Version:    0.6.2
 */