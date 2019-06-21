package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkk extends zzaby<zzkk>
{
  public String zzadm;
  public Long zzasp;
  private Integer zzasq;
  public zzkl[] zzasr;
  public zzkj[] zzass;
  public zzkd[] zzast;

  public zzkk()
  {
    AppMethodBeat.i(69689);
    this.zzasp = null;
    this.zzadm = null;
    this.zzasq = null;
    this.zzasr = zzkl.zzlj();
    this.zzass = zzkj.zzli();
    this.zzast = zzkd.zzle();
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69689);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69690);
    if (paramObject == this)
      AppMethodBeat.o(69690);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkk))
      {
        AppMethodBeat.o(69690);
        bool = false;
      }
      else
      {
        paramObject = (zzkk)paramObject;
        if (this.zzasp == null)
        {
          if (paramObject.zzasp != null)
          {
            AppMethodBeat.o(69690);
            bool = false;
          }
        }
        else if (!this.zzasp.equals(paramObject.zzasp))
        {
          AppMethodBeat.o(69690);
          bool = false;
        }
        else if (this.zzadm == null)
        {
          if (paramObject.zzadm != null)
          {
            AppMethodBeat.o(69690);
            bool = false;
          }
        }
        else if (!this.zzadm.equals(paramObject.zzadm))
        {
          AppMethodBeat.o(69690);
          bool = false;
        }
        else if (this.zzasq == null)
        {
          if (paramObject.zzasq != null)
          {
            AppMethodBeat.o(69690);
            bool = false;
          }
        }
        else if (!this.zzasq.equals(paramObject.zzasq))
        {
          AppMethodBeat.o(69690);
          bool = false;
        }
        else if (!zzacc.equals(this.zzasr, paramObject.zzasr))
        {
          AppMethodBeat.o(69690);
          bool = false;
        }
        else if (!zzacc.equals(this.zzass, paramObject.zzass))
        {
          AppMethodBeat.o(69690);
          bool = false;
        }
        else if (!zzacc.equals(this.zzast, paramObject.zzast))
        {
          AppMethodBeat.o(69690);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69690);
          }
          else
          {
            AppMethodBeat.o(69690);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69690);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69691);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    label47: int i1;
    int i2;
    int i3;
    if (this.zzasp == null)
    {
      k = 0;
      if (this.zzadm != null)
        break label160;
      m = 0;
      if (this.zzasq != null)
        break label172;
      n = 0;
      i1 = zzacc.hashCode(this.zzasr);
      i2 = zzacc.hashCode(this.zzass);
      i3 = zzacc.hashCode(this.zzast);
      i4 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label184;
    }
    label160: label172: label184: for (int i4 = i; ; i4 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69691);
      return ((((n + (m + (k + (j + 527) * 31) * 31) * 31) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4;
      k = this.zzasp.hashCode();
      break;
      m = this.zzadm.hashCode();
      break label37;
      n = this.zzasq.hashCode();
      break label47;
    }
  }

  protected final int zza()
  {
    int i = 0;
    AppMethodBeat.i(69693);
    int j = super.zza();
    int k = j;
    if (this.zzasp != null)
      k = j + zzabw.zzc(1, this.zzasp.longValue());
    int m = k;
    if (this.zzadm != null)
      m = k + zzabw.zzc(2, this.zzadm);
    j = m;
    if (this.zzasq != null)
      j = m + zzabw.zzf(3, this.zzasq.intValue());
    k = j;
    Object localObject;
    if (this.zzasr != null)
    {
      k = j;
      if (this.zzasr.length > 0)
      {
        m = 0;
        for (k = j; m < this.zzasr.length; k = j)
        {
          localObject = this.zzasr[m];
          j = k;
          if (localObject != null)
            j = k + zzabw.zzb(4, (zzace)localObject);
          m++;
        }
      }
    }
    j = k;
    if (this.zzass != null)
    {
      j = k;
      if (this.zzass.length > 0)
      {
        j = 0;
        while (j < this.zzass.length)
        {
          localObject = this.zzass[j];
          m = k;
          if (localObject != null)
            m = k + zzabw.zzb(5, (zzace)localObject);
          j++;
          k = m;
        }
        j = k;
      }
    }
    m = j;
    if (this.zzast != null)
    {
      m = j;
      if (this.zzast.length > 0)
      {
        k = i;
        while (true)
        {
          m = j;
          if (k >= this.zzast.length)
            break;
          localObject = this.zzast[k];
          m = j;
          if (localObject != null)
            m = j + zzabw.zzb(6, (zzace)localObject);
          k++;
          j = m;
        }
      }
    }
    AppMethodBeat.o(69693);
    return m;
  }

  public final void zza(zzabw paramzzabw)
  {
    int i = 0;
    AppMethodBeat.i(69692);
    if (this.zzasp != null)
      paramzzabw.zzb(1, this.zzasp.longValue());
    if (this.zzadm != null)
      paramzzabw.zzb(2, this.zzadm);
    if (this.zzasq != null)
      paramzzabw.zze(3, this.zzasq.intValue());
    int j;
    Object localObject;
    if ((this.zzasr != null) && (this.zzasr.length > 0))
      for (j = 0; j < this.zzasr.length; j++)
      {
        localObject = this.zzasr[j];
        if (localObject != null)
          paramzzabw.zza(4, (zzace)localObject);
      }
    if ((this.zzass != null) && (this.zzass.length > 0))
      for (j = 0; j < this.zzass.length; j++)
      {
        localObject = this.zzass[j];
        if (localObject != null)
          paramzzabw.zza(5, (zzace)localObject);
      }
    if ((this.zzast != null) && (this.zzast.length > 0))
      for (j = i; j < this.zzast.length; j++)
      {
        localObject = this.zzast[j];
        if (localObject != null)
          paramzzabw.zza(6, (zzace)localObject);
      }
    super.zza(paramzzabw);
    AppMethodBeat.o(69692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkk
 * JD-Core Version:    0.6.2
 */