package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkl extends zzaby<zzkl>
{
  private static volatile zzkl[] zzasu;
  public String value;
  public String zzny;

  public zzkl()
  {
    AppMethodBeat.i(69695);
    this.zzny = null;
    this.value = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69695);
  }

  public static zzkl[] zzlj()
  {
    if (zzasu == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzasu == null)
        zzasu = new zzkl[0];
      return zzasu;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69696);
    if (paramObject == this)
      AppMethodBeat.o(69696);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkl))
      {
        AppMethodBeat.o(69696);
        bool = false;
      }
      else
      {
        paramObject = (zzkl)paramObject;
        if (this.zzny == null)
        {
          if (paramObject.zzny != null)
          {
            AppMethodBeat.o(69696);
            bool = false;
          }
        }
        else if (!this.zzny.equals(paramObject.zzny))
        {
          AppMethodBeat.o(69696);
          bool = false;
        }
        else if (this.value == null)
        {
          if (paramObject.value != null)
          {
            AppMethodBeat.o(69696);
            bool = false;
          }
        }
        else if (!this.value.equals(paramObject.value))
        {
          AppMethodBeat.o(69696);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69696);
          }
          else
          {
            AppMethodBeat.o(69696);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69696);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69697);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    if (this.zzny == null)
    {
      k = 0;
      if (this.value != null)
        break label99;
      m = 0;
      label37: n = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label111;
    }
    label99: label111: for (int n = i; ; n = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69697);
      return (m + (k + (j + 527) * 31) * 31) * 31 + n;
      k = this.zzny.hashCode();
      break;
      m = this.value.hashCode();
      break label37;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69699);
    int i = super.zza();
    int j = i;
    if (this.zzny != null)
      j = i + zzabw.zzc(1, this.zzny);
    i = j;
    if (this.value != null)
      i = j + zzabw.zzc(2, this.value);
    AppMethodBeat.o(69699);
    return i;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69698);
    if (this.zzny != null)
      paramzzabw.zzb(1, this.zzny);
    if (this.value != null)
      paramzzabw.zzb(2, this.value);
    super.zza(paramzzabw);
    AppMethodBeat.o(69698);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkl
 * JD-Core Version:    0.6.2
 */