package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzks extends zzaby<zzks>
{
  private static volatile zzks[] zzaum;
  public String name;
  public String zzajf;
  private Float zzarb;
  public Double zzarc;
  public Long zzate;
  public Long zzaun;

  public zzks()
  {
    AppMethodBeat.i(69737);
    this.zzaun = null;
    this.name = null;
    this.zzajf = null;
    this.zzate = null;
    this.zzarb = null;
    this.zzarc = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69737);
  }

  public static zzks[] zzlo()
  {
    if (zzaum == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzaum == null)
        zzaum = new zzks[0];
      return zzaum;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69738);
    if (paramObject == this)
      AppMethodBeat.o(69738);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzks))
      {
        AppMethodBeat.o(69738);
        bool = false;
      }
      else
      {
        paramObject = (zzks)paramObject;
        if (this.zzaun == null)
        {
          if (paramObject.zzaun != null)
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else if (!this.zzaun.equals(paramObject.zzaun))
        {
          AppMethodBeat.o(69738);
          bool = false;
        }
        else if (this.name == null)
        {
          if (paramObject.name != null)
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else if (!this.name.equals(paramObject.name))
        {
          AppMethodBeat.o(69738);
          bool = false;
        }
        else if (this.zzajf == null)
        {
          if (paramObject.zzajf != null)
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else if (!this.zzajf.equals(paramObject.zzajf))
        {
          AppMethodBeat.o(69738);
          bool = false;
        }
        else if (this.zzate == null)
        {
          if (paramObject.zzate != null)
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else if (!this.zzate.equals(paramObject.zzate))
        {
          AppMethodBeat.o(69738);
          bool = false;
        }
        else if (this.zzarb == null)
        {
          if (paramObject.zzarb != null)
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else if (!this.zzarb.equals(paramObject.zzarb))
        {
          AppMethodBeat.o(69738);
          bool = false;
        }
        else if (this.zzarc == null)
        {
          if (paramObject.zzarc != null)
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else if (!this.zzarc.equals(paramObject.zzarc))
        {
          AppMethodBeat.o(69738);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69738);
          }
          else
          {
            AppMethodBeat.o(69738);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69738);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69739);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    label47: int i1;
    label57: int i2;
    label67: int i3;
    if (this.zzaun == null)
    {
      k = 0;
      if (this.name != null)
        break label163;
      m = 0;
      if (this.zzajf != null)
        break label175;
      n = 0;
      if (this.zzate != null)
        break label187;
      i1 = 0;
      if (this.zzarb != null)
        break label199;
      i2 = 0;
      if (this.zzarc != null)
        break label211;
      i3 = 0;
      label77: i4 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label223;
    }
    label163: label175: label187: label199: label211: label223: for (int i4 = i; ; i4 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69739);
      return (i3 + (i2 + (i1 + (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i4;
      k = this.zzaun.hashCode();
      break;
      m = this.name.hashCode();
      break label37;
      n = this.zzajf.hashCode();
      break label47;
      i1 = this.zzate.hashCode();
      break label57;
      i2 = this.zzarb.hashCode();
      break label67;
      i3 = this.zzarc.hashCode();
      break label77;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69741);
    int i = super.zza();
    int j = i;
    if (this.zzaun != null)
      j = i + zzabw.zzc(1, this.zzaun.longValue());
    i = j;
    if (this.name != null)
      i = j + zzabw.zzc(2, this.name);
    j = i;
    if (this.zzajf != null)
      j = i + zzabw.zzc(3, this.zzajf);
    i = j;
    if (this.zzate != null)
      i = j + zzabw.zzc(4, this.zzate.longValue());
    j = i;
    if (this.zzarb != null)
    {
      this.zzarb.floatValue();
      j = i + (zzabw.zzaq(5) + 4);
    }
    i = j;
    if (this.zzarc != null)
    {
      this.zzarc.doubleValue();
      i = j + (zzabw.zzaq(6) + 8);
    }
    AppMethodBeat.o(69741);
    return i;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69740);
    if (this.zzaun != null)
      paramzzabw.zzb(1, this.zzaun.longValue());
    if (this.name != null)
      paramzzabw.zzb(2, this.name);
    if (this.zzajf != null)
      paramzzabw.zzb(3, this.zzajf);
    if (this.zzate != null)
      paramzzabw.zzb(4, this.zzate.longValue());
    if (this.zzarb != null)
      paramzzabw.zza(5, this.zzarb.floatValue());
    if (this.zzarc != null)
      paramzzabw.zza(6, this.zzarc.doubleValue());
    super.zza(paramzzabw);
    AppMethodBeat.o(69740);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzks
 * JD-Core Version:    0.6.2
 */