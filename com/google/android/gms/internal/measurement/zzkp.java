package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkp extends zzaby<zzkp>
{
  public zzkq[] zzatf;

  public zzkp()
  {
    AppMethodBeat.i(69719);
    this.zzatf = zzkq.zzln();
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69719);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69720);
    if (paramObject == this)
      AppMethodBeat.o(69720);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkp))
      {
        AppMethodBeat.o(69720);
        bool = false;
      }
      else
      {
        paramObject = (zzkp)paramObject;
        if (!zzacc.equals(this.zzatf, paramObject.zzatf))
        {
          AppMethodBeat.o(69720);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69720);
          }
          else
          {
            AppMethodBeat.o(69720);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69720);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(69721);
    int i = getClass().getName().hashCode();
    int j = zzacc.hashCode(this.zzatf);
    if ((this.zzbww == null) || (this.zzbww.isEmpty()));
    for (int k = 0; ; k = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69721);
      return k + ((i + 527) * 31 + j) * 31;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69723);
    int i = super.zza();
    int j = i;
    if (this.zzatf != null)
    {
      j = i;
      if (this.zzatf.length > 0)
      {
        int k = 0;
        while (true)
        {
          j = i;
          if (k >= this.zzatf.length)
            break;
          zzkq localzzkq = this.zzatf[k];
          j = i;
          if (localzzkq != null)
            j = i + zzabw.zzb(1, localzzkq);
          k++;
          i = j;
        }
      }
    }
    AppMethodBeat.o(69723);
    return j;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69722);
    if ((this.zzatf != null) && (this.zzatf.length > 0))
      for (int i = 0; i < this.zzatf.length; i++)
      {
        zzkq localzzkq = this.zzatf[i];
        if (localzzkq != null)
          paramzzabw.zza(1, localzzkq);
      }
    super.zza(paramzzabw);
    AppMethodBeat.o(69722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkp
 * JD-Core Version:    0.6.2
 */