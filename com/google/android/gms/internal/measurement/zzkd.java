package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkd extends zzaby<zzkd>
{
  private static volatile zzkd[] zzark;
  public Integer zzarl;
  public zzkh[] zzarm;
  public zzke[] zzarn;

  public zzkd()
  {
    AppMethodBeat.i(69645);
    this.zzarl = null;
    this.zzarm = zzkh.zzlh();
    this.zzarn = zzke.zzlf();
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69645);
  }

  public static zzkd[] zzle()
  {
    if (zzark == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzark == null)
        zzark = new zzkd[0];
      return zzark;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69646);
    if (paramObject == this)
      AppMethodBeat.o(69646);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkd))
      {
        AppMethodBeat.o(69646);
        bool = false;
      }
      else
      {
        paramObject = (zzkd)paramObject;
        if (this.zzarl == null)
        {
          if (paramObject.zzarl != null)
          {
            AppMethodBeat.o(69646);
            bool = false;
          }
        }
        else if (!this.zzarl.equals(paramObject.zzarl))
        {
          AppMethodBeat.o(69646);
          bool = false;
        }
        else if (!zzacc.equals(this.zzarm, paramObject.zzarm))
        {
          AppMethodBeat.o(69646);
          bool = false;
        }
        else if (!zzacc.equals(this.zzarn, paramObject.zzarn))
        {
          AppMethodBeat.o(69646);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69646);
          }
          else
          {
            AppMethodBeat.o(69646);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69646);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69647);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    int n;
    if (this.zzarl == null)
    {
      k = 0;
      m = zzacc.hashCode(this.zzarm);
      n = zzacc.hashCode(this.zzarn);
      i1 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label113;
    }
    label113: for (int i1 = i; ; i1 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69647);
      return (((k + (j + 527) * 31) * 31 + m) * 31 + n) * 31 + i1;
      k = this.zzarl.hashCode();
      break;
    }
  }

  protected final int zza()
  {
    int i = 0;
    AppMethodBeat.i(69649);
    int j = super.zza();
    int k = j;
    if (this.zzarl != null)
      k = j + zzabw.zzf(1, this.zzarl.intValue());
    j = k;
    Object localObject;
    if (this.zzarm != null)
    {
      j = k;
      if (this.zzarm.length > 0)
      {
        m = 0;
        for (j = k; m < this.zzarm.length; j = k)
        {
          localObject = this.zzarm[m];
          k = j;
          if (localObject != null)
            k = j + zzabw.zzb(2, (zzace)localObject);
          m++;
        }
      }
    }
    int m = j;
    if (this.zzarn != null)
    {
      m = j;
      if (this.zzarn.length > 0)
      {
        k = i;
        while (true)
        {
          m = j;
          if (k >= this.zzarn.length)
            break;
          localObject = this.zzarn[k];
          m = j;
          if (localObject != null)
            m = j + zzabw.zzb(3, (zzace)localObject);
          k++;
          j = m;
        }
      }
    }
    AppMethodBeat.o(69649);
    return m;
  }

  public final void zza(zzabw paramzzabw)
  {
    int i = 0;
    AppMethodBeat.i(69648);
    if (this.zzarl != null)
      paramzzabw.zze(1, this.zzarl.intValue());
    int j;
    Object localObject;
    if ((this.zzarm != null) && (this.zzarm.length > 0))
      for (j = 0; j < this.zzarm.length; j++)
      {
        localObject = this.zzarm[j];
        if (localObject != null)
          paramzzabw.zza(2, (zzace)localObject);
      }
    if ((this.zzarn != null) && (this.zzarn.length > 0))
      for (j = i; j < this.zzarn.length; j++)
      {
        localObject = this.zzarn[j];
        if (localObject != null)
          paramzzabw.zza(3, (zzace)localObject);
      }
    super.zza(paramzzabw);
    AppMethodBeat.o(69648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkd
 * JD-Core Version:    0.6.2
 */