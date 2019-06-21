package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkm extends zzaby<zzkm>
{
  private static volatile zzkm[] zzasv;
  public Integer zzarl;
  public zzkr zzasw;
  public zzkr zzasx;
  public Boolean zzasy;

  public zzkm()
  {
    AppMethodBeat.i(69701);
    this.zzarl = null;
    this.zzasw = null;
    this.zzasx = null;
    this.zzasy = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69701);
  }

  public static zzkm[] zzlk()
  {
    if (zzasv == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzasv == null)
        zzasv = new zzkm[0];
      return zzasv;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69702);
    if (paramObject == this)
      AppMethodBeat.o(69702);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkm))
      {
        AppMethodBeat.o(69702);
        bool = false;
      }
      else
      {
        paramObject = (zzkm)paramObject;
        if (this.zzarl == null)
        {
          if (paramObject.zzarl != null)
          {
            AppMethodBeat.o(69702);
            bool = false;
          }
        }
        else if (!this.zzarl.equals(paramObject.zzarl))
        {
          AppMethodBeat.o(69702);
          bool = false;
        }
        else if (this.zzasw == null)
        {
          if (paramObject.zzasw != null)
          {
            AppMethodBeat.o(69702);
            bool = false;
          }
        }
        else if (!this.zzasw.equals(paramObject.zzasw))
        {
          AppMethodBeat.o(69702);
          bool = false;
        }
        else if (this.zzasx == null)
        {
          if (paramObject.zzasx != null)
          {
            AppMethodBeat.o(69702);
            bool = false;
          }
        }
        else if (!this.zzasx.equals(paramObject.zzasx))
        {
          AppMethodBeat.o(69702);
          bool = false;
        }
        else if (this.zzasy == null)
        {
          if (paramObject.zzasy != null)
          {
            AppMethodBeat.o(69702);
            bool = false;
          }
        }
        else if (!this.zzasy.equals(paramObject.zzasy))
        {
          AppMethodBeat.o(69702);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69702);
          }
          else
          {
            AppMethodBeat.o(69702);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69702);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69703);
    int j = getClass().getName().hashCode();
    int k;
    zzkr localzzkr;
    int m;
    label41: int n;
    label55: int i1;
    if (this.zzarl == null)
    {
      k = 0;
      localzzkr = this.zzasw;
      if (localzzkr != null)
        break label139;
      m = 0;
      localzzkr = this.zzasx;
      if (localzzkr != null)
        break label149;
      n = 0;
      if (this.zzasy != null)
        break label159;
      i1 = 0;
      label65: i2 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label171;
    }
    label139: label149: label159: label171: for (int i2 = i; ; i2 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69703);
      return (i1 + (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31) * 31 + i2;
      k = this.zzarl.hashCode();
      break;
      m = localzzkr.hashCode();
      break label41;
      n = localzzkr.hashCode();
      break label55;
      i1 = this.zzasy.hashCode();
      break label65;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69705);
    int i = super.zza();
    int j = i;
    if (this.zzarl != null)
      j = i + zzabw.zzf(1, this.zzarl.intValue());
    i = j;
    if (this.zzasw != null)
      i = j + zzabw.zzb(2, this.zzasw);
    j = i;
    if (this.zzasx != null)
      j = i + zzabw.zzb(3, this.zzasx);
    i = j;
    if (this.zzasy != null)
    {
      this.zzasy.booleanValue();
      i = j + (zzabw.zzaq(4) + 1);
    }
    AppMethodBeat.o(69705);
    return i;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69704);
    if (this.zzarl != null)
      paramzzabw.zze(1, this.zzarl.intValue());
    if (this.zzasw != null)
      paramzzabw.zza(2, this.zzasw);
    if (this.zzasx != null)
      paramzzabw.zza(3, this.zzasx);
    if (this.zzasy != null)
      paramzzabw.zza(4, this.zzasy.booleanValue());
    super.zza(paramzzabw);
    AppMethodBeat.o(69704);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkm
 * JD-Core Version:    0.6.2
 */