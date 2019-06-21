package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkh extends zzaby<zzkh>
{
  private static volatile zzkh[] zzase;
  public Integer zzarp;
  public String zzasf;
  public zzkf zzasg;

  public zzkh()
  {
    AppMethodBeat.i(69670);
    this.zzarp = null;
    this.zzasf = null;
    this.zzasg = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69670);
  }

  public static zzkh[] zzlh()
  {
    if (zzase == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzase == null)
        zzase = new zzkh[0];
      return zzase;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69671);
    if (paramObject == this)
      AppMethodBeat.o(69671);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkh))
      {
        AppMethodBeat.o(69671);
        bool = false;
      }
      else
      {
        paramObject = (zzkh)paramObject;
        if (this.zzarp == null)
        {
          if (paramObject.zzarp != null)
          {
            AppMethodBeat.o(69671);
            bool = false;
          }
        }
        else if (!this.zzarp.equals(paramObject.zzarp))
        {
          AppMethodBeat.o(69671);
          bool = false;
        }
        else if (this.zzasf == null)
        {
          if (paramObject.zzasf != null)
          {
            AppMethodBeat.o(69671);
            bool = false;
          }
        }
        else if (!this.zzasf.equals(paramObject.zzasf))
        {
          AppMethodBeat.o(69671);
          bool = false;
        }
        else if (this.zzasg == null)
        {
          if (paramObject.zzasg != null)
          {
            AppMethodBeat.o(69671);
            bool = false;
          }
        }
        else if (!this.zzasg.equals(paramObject.zzasg))
        {
          AppMethodBeat.o(69671);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69671);
          }
          else
          {
            AppMethodBeat.o(69671);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69671);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69672);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: zzkf localzzkf;
    int n;
    if (this.zzarp == null)
    {
      k = 0;
      if (this.zzasf != null)
        break label119;
      m = 0;
      localzzkf = this.zzasg;
      if (localzzkf != null)
        break label131;
      n = 0;
      label51: i1 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label141;
    }
    label131: label141: for (int i1 = i; ; i1 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69672);
      return (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31 + i1;
      k = this.zzarp.hashCode();
      break;
      label119: m = this.zzasf.hashCode();
      break label37;
      n = localzzkf.hashCode();
      break label51;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69674);
    int i = super.zza();
    int j = i;
    if (this.zzarp != null)
      j = i + zzabw.zzf(1, this.zzarp.intValue());
    i = j;
    if (this.zzasf != null)
      i = j + zzabw.zzc(2, this.zzasf);
    j = i;
    if (this.zzasg != null)
      j = i + zzabw.zzb(3, this.zzasg);
    AppMethodBeat.o(69674);
    return j;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69673);
    if (this.zzarp != null)
      paramzzabw.zze(1, this.zzarp.intValue());
    if (this.zzasf != null)
      paramzzabw.zzb(2, this.zzasf);
    if (this.zzasg != null)
      paramzzabw.zza(3, this.zzasg);
    super.zza(paramzzabw);
    AppMethodBeat.o(69673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkh
 * JD-Core Version:    0.6.2
 */