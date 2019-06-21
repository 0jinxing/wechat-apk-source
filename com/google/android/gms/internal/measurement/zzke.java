package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzke extends zzaby<zzke>
{
  private static volatile zzke[] zzaro;
  public Integer zzarp;
  public String zzarq;
  public zzkf[] zzarr;
  private Boolean zzars;
  public zzkg zzart;

  public zzke()
  {
    AppMethodBeat.i(69651);
    this.zzarp = null;
    this.zzarq = null;
    this.zzarr = zzkf.zzlg();
    this.zzars = null;
    this.zzart = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69651);
  }

  public static zzke[] zzlf()
  {
    if (zzaro == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzaro == null)
        zzaro = new zzke[0];
      return zzaro;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69652);
    if (paramObject == this)
      AppMethodBeat.o(69652);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzke))
      {
        AppMethodBeat.o(69652);
        bool = false;
      }
      else
      {
        paramObject = (zzke)paramObject;
        if (this.zzarp == null)
        {
          if (paramObject.zzarp != null)
          {
            AppMethodBeat.o(69652);
            bool = false;
          }
        }
        else if (!this.zzarp.equals(paramObject.zzarp))
        {
          AppMethodBeat.o(69652);
          bool = false;
        }
        else if (this.zzarq == null)
        {
          if (paramObject.zzarq != null)
          {
            AppMethodBeat.o(69652);
            bool = false;
          }
        }
        else if (!this.zzarq.equals(paramObject.zzarq))
        {
          AppMethodBeat.o(69652);
          bool = false;
        }
        else if (!zzacc.equals(this.zzarr, paramObject.zzarr))
        {
          AppMethodBeat.o(69652);
          bool = false;
        }
        else if (this.zzars == null)
        {
          if (paramObject.zzars != null)
          {
            AppMethodBeat.o(69652);
            bool = false;
          }
        }
        else if (!this.zzars.equals(paramObject.zzars))
        {
          AppMethodBeat.o(69652);
          bool = false;
        }
        else if (this.zzart == null)
        {
          if (paramObject.zzart != null)
          {
            AppMethodBeat.o(69652);
            bool = false;
          }
        }
        else if (!this.zzart.equals(paramObject.zzart))
        {
          AppMethodBeat.o(69652);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69652);
          }
          else
          {
            AppMethodBeat.o(69652);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69652);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69653);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    int i1;
    label56: zzkg localzzkg;
    int i2;
    if (this.zzarp == null)
    {
      k = 0;
      if (this.zzarq != null)
        break label150;
      m = 0;
      n = zzacc.hashCode(this.zzarr);
      if (this.zzars != null)
        break label162;
      i1 = 0;
      localzzkg = this.zzart;
      if (localzzkg != null)
        break label174;
      i2 = 0;
      label70: i3 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label184;
    }
    label150: label162: label174: label184: for (int i3 = i; ; i3 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69653);
      return (i2 + (i1 + ((m + (k + (j + 527) * 31) * 31) * 31 + n) * 31) * 31) * 31 + i3;
      k = this.zzarp.hashCode();
      break;
      m = this.zzarq.hashCode();
      break label37;
      i1 = this.zzars.hashCode();
      break label56;
      i2 = localzzkg.hashCode();
      break label70;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69655);
    int i = super.zza();
    int j = i;
    if (this.zzarp != null)
      j = i + zzabw.zzf(1, this.zzarp.intValue());
    i = j;
    if (this.zzarq != null)
      i = j + zzabw.zzc(2, this.zzarq);
    j = i;
    if (this.zzarr != null)
    {
      j = i;
      if (this.zzarr.length > 0)
      {
        int k = 0;
        while (k < this.zzarr.length)
        {
          zzkf localzzkf = this.zzarr[k];
          j = i;
          if (localzzkf != null)
            j = i + zzabw.zzb(3, localzzkf);
          k++;
          i = j;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzars != null)
    {
      this.zzars.booleanValue();
      i = j + (zzabw.zzaq(4) + 1);
    }
    j = i;
    if (this.zzart != null)
      j = i + zzabw.zzb(5, this.zzart);
    AppMethodBeat.o(69655);
    return j;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69654);
    if (this.zzarp != null)
      paramzzabw.zze(1, this.zzarp.intValue());
    if (this.zzarq != null)
      paramzzabw.zzb(2, this.zzarq);
    if ((this.zzarr != null) && (this.zzarr.length > 0))
      for (int i = 0; i < this.zzarr.length; i++)
      {
        zzkf localzzkf = this.zzarr[i];
        if (localzzkf != null)
          paramzzabw.zza(3, localzzkf);
      }
    if (this.zzars != null)
      paramzzabw.zza(4, this.zzars.booleanValue());
    if (this.zzart != null)
      paramzzabw.zza(5, this.zzart);
    super.zza(paramzzabw);
    AppMethodBeat.o(69654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzke
 * JD-Core Version:    0.6.2
 */