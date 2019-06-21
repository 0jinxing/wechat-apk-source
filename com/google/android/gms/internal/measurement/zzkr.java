package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkr extends zzaby<zzkr>
{
  public long[] zzauk;
  public long[] zzaul;

  public zzkr()
  {
    AppMethodBeat.i(69731);
    this.zzauk = zzach.zzbxm;
    this.zzaul = zzach.zzbxm;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69731);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69732);
    if (paramObject == this)
      AppMethodBeat.o(69732);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkr))
      {
        AppMethodBeat.o(69732);
        bool = false;
      }
      else
      {
        paramObject = (zzkr)paramObject;
        if (!zzacc.equals(this.zzauk, paramObject.zzauk))
        {
          AppMethodBeat.o(69732);
          bool = false;
        }
        else if (!zzacc.equals(this.zzaul, paramObject.zzaul))
        {
          AppMethodBeat.o(69732);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69732);
          }
          else
          {
            AppMethodBeat.o(69732);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69732);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(69733);
    int i = getClass().getName().hashCode();
    int j = zzacc.hashCode(this.zzauk);
    int k = zzacc.hashCode(this.zzaul);
    if ((this.zzbww == null) || (this.zzbww.isEmpty()));
    for (int m = 0; ; m = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69733);
      return m + (((i + 527) * 31 + j) * 31 + k) * 31;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69735);
    int i = super.zza();
    int k;
    if ((this.zzauk != null) && (this.zzauk.length > 0))
    {
      j = 0;
      k = 0;
      while (j < this.zzauk.length)
      {
        k += zzabw.zzao(this.zzauk[j]);
        j++;
      }
    }
    for (int j = i + k + this.zzauk.length * 1; ; j = i)
    {
      k = j;
      if (this.zzaul != null)
      {
        k = j;
        if (this.zzaul.length > 0)
        {
          k = 0;
          i = 0;
          while (k < this.zzaul.length)
          {
            i += zzabw.zzao(this.zzaul[k]);
            k++;
          }
          k = j + i + this.zzaul.length * 1;
        }
      }
      AppMethodBeat.o(69735);
      return k;
    }
  }

  public final void zza(zzabw paramzzabw)
  {
    int i = 0;
    AppMethodBeat.i(69734);
    int j;
    if ((this.zzauk != null) && (this.zzauk.length > 0))
      for (j = 0; j < this.zzauk.length; j++)
        paramzzabw.zza(1, this.zzauk[j]);
    if ((this.zzaul != null) && (this.zzaul.length > 0))
      for (j = i; j < this.zzaul.length; j++)
        paramzzabw.zza(2, this.zzaul[j]);
    super.zza(paramzzabw);
    AppMethodBeat.o(69734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkr
 * JD-Core Version:    0.6.2
 */