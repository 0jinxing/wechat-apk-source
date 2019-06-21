package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class zzjv
  implements zzek
{
  zzkq zzaqv;
  List<Long> zzaqw;
  List<zzkn> zzaqx;
  private long zzaqy;

  private zzjv(zzjr paramzzjr)
  {
  }

  private static long zza(zzkn paramzzkn)
  {
    AppMethodBeat.i(69491);
    long l = paramzzkn.zzatb.longValue() / 1000L / 60L / 60L;
    AppMethodBeat.o(69491);
    return l;
  }

  public final boolean zza(long paramLong, zzkn paramzzkn)
  {
    AppMethodBeat.i(69490);
    Preconditions.checkNotNull(paramzzkn);
    if (this.zzaqx == null)
      this.zzaqx = new ArrayList();
    if (this.zzaqw == null)
      this.zzaqw = new ArrayList();
    boolean bool;
    if ((this.zzaqx.size() > 0) && (zza((zzkn)this.zzaqx.get(0)) != zza(paramzzkn)))
    {
      AppMethodBeat.o(69490);
      bool = false;
    }
    while (true)
    {
      return bool;
      long l = this.zzaqy + paramzzkn.zzvm();
      if (l >= Math.max(0, ((Integer)zzew.zzagq.get()).intValue()))
      {
        AppMethodBeat.o(69490);
        bool = false;
      }
      else
      {
        this.zzaqy = l;
        this.zzaqx.add(paramzzkn);
        this.zzaqw.add(Long.valueOf(paramLong));
        if (this.zzaqx.size() >= Math.max(1, ((Integer)zzew.zzagr.get()).intValue()))
        {
          AppMethodBeat.o(69490);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(69490);
          bool = true;
        }
      }
    }
  }

  public final void zzb(zzkq paramzzkq)
  {
    AppMethodBeat.i(69489);
    Preconditions.checkNotNull(paramzzkq);
    this.zzaqv = paramzzkq;
    AppMethodBeat.o(69489);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjv
 * JD-Core Version:    0.6.2
 */