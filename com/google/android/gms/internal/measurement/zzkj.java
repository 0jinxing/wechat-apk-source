package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkj extends zzaby<zzkj>
{
  private static volatile zzkj[] zzasl;
  public String name;
  public Boolean zzasm;
  public Boolean zzasn;
  public Integer zzaso;

  public zzkj()
  {
    AppMethodBeat.i(69683);
    this.name = null;
    this.zzasm = null;
    this.zzasn = null;
    this.zzaso = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69683);
  }

  public static zzkj[] zzli()
  {
    if (zzasl == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzasl == null)
        zzasl = new zzkj[0];
      return zzasl;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69684);
    if (paramObject == this)
      AppMethodBeat.o(69684);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkj))
      {
        AppMethodBeat.o(69684);
        bool = false;
      }
      else
      {
        paramObject = (zzkj)paramObject;
        if (this.name == null)
        {
          if (paramObject.name != null)
          {
            AppMethodBeat.o(69684);
            bool = false;
          }
        }
        else if (!this.name.equals(paramObject.name))
        {
          AppMethodBeat.o(69684);
          bool = false;
        }
        else if (this.zzasm == null)
        {
          if (paramObject.zzasm != null)
          {
            AppMethodBeat.o(69684);
            bool = false;
          }
        }
        else if (!this.zzasm.equals(paramObject.zzasm))
        {
          AppMethodBeat.o(69684);
          bool = false;
        }
        else if (this.zzasn == null)
        {
          if (paramObject.zzasn != null)
          {
            AppMethodBeat.o(69684);
            bool = false;
          }
        }
        else if (!this.zzasn.equals(paramObject.zzasn))
        {
          AppMethodBeat.o(69684);
          bool = false;
        }
        else if (this.zzaso == null)
        {
          if (paramObject.zzaso != null)
          {
            AppMethodBeat.o(69684);
            bool = false;
          }
        }
        else if (!this.zzaso.equals(paramObject.zzaso))
        {
          AppMethodBeat.o(69684);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69684);
          }
          else
          {
            AppMethodBeat.o(69684);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69684);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69685);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    label47: int i1;
    if (this.name == null)
    {
      k = 0;
      if (this.zzasm != null)
        break label131;
      m = 0;
      if (this.zzasn != null)
        break label143;
      n = 0;
      if (this.zzaso != null)
        break label155;
      i1 = 0;
      label57: i2 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label167;
    }
    label131: label143: label155: label167: for (int i2 = i; ; i2 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69685);
      return (i1 + (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31) * 31 + i2;
      k = this.name.hashCode();
      break;
      m = this.zzasm.hashCode();
      break label37;
      n = this.zzasn.hashCode();
      break label47;
      i1 = this.zzaso.hashCode();
      break label57;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69687);
    int i = super.zza();
    int j = i;
    if (this.name != null)
      j = i + zzabw.zzc(1, this.name);
    i = j;
    if (this.zzasm != null)
    {
      this.zzasm.booleanValue();
      i = j + (zzabw.zzaq(2) + 1);
    }
    j = i;
    if (this.zzasn != null)
    {
      this.zzasn.booleanValue();
      j = i + (zzabw.zzaq(3) + 1);
    }
    i = j;
    if (this.zzaso != null)
      i = j + zzabw.zzf(4, this.zzaso.intValue());
    AppMethodBeat.o(69687);
    return i;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69686);
    if (this.name != null)
      paramzzabw.zzb(1, this.name);
    if (this.zzasm != null)
      paramzzabw.zza(2, this.zzasm.booleanValue());
    if (this.zzasn != null)
      paramzzabw.zza(3, this.zzasn.booleanValue());
    if (this.zzaso != null)
      paramzzabw.zze(4, this.zzaso.intValue());
    super.zza(paramzzabw);
    AppMethodBeat.o(69686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkj
 * JD-Core Version:    0.6.2
 */