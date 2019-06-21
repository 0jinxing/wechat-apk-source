package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzko extends zzaby<zzko>
{
  private static volatile zzko[] zzatd;
  public String name;
  public String zzajf;
  private Float zzarb;
  public Double zzarc;
  public Long zzate;

  public zzko()
  {
    AppMethodBeat.i(69713);
    this.name = null;
    this.zzajf = null;
    this.zzate = null;
    this.zzarb = null;
    this.zzarc = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69713);
  }

  public static zzko[] zzlm()
  {
    if (zzatd == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzatd == null)
        zzatd = new zzko[0];
      return zzatd;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69714);
    if (paramObject == this)
      AppMethodBeat.o(69714);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzko))
      {
        AppMethodBeat.o(69714);
        bool = false;
      }
      else
      {
        paramObject = (zzko)paramObject;
        if (this.name == null)
        {
          if (paramObject.name != null)
          {
            AppMethodBeat.o(69714);
            bool = false;
          }
        }
        else if (!this.name.equals(paramObject.name))
        {
          AppMethodBeat.o(69714);
          bool = false;
        }
        else if (this.zzajf == null)
        {
          if (paramObject.zzajf != null)
          {
            AppMethodBeat.o(69714);
            bool = false;
          }
        }
        else if (!this.zzajf.equals(paramObject.zzajf))
        {
          AppMethodBeat.o(69714);
          bool = false;
        }
        else if (this.zzate == null)
        {
          if (paramObject.zzate != null)
          {
            AppMethodBeat.o(69714);
            bool = false;
          }
        }
        else if (!this.zzate.equals(paramObject.zzate))
        {
          AppMethodBeat.o(69714);
          bool = false;
        }
        else if (this.zzarb == null)
        {
          if (paramObject.zzarb != null)
          {
            AppMethodBeat.o(69714);
            bool = false;
          }
        }
        else if (!this.zzarb.equals(paramObject.zzarb))
        {
          AppMethodBeat.o(69714);
          bool = false;
        }
        else if (this.zzarc == null)
        {
          if (paramObject.zzarc != null)
          {
            AppMethodBeat.o(69714);
            bool = false;
          }
        }
        else if (!this.zzarc.equals(paramObject.zzarc))
        {
          AppMethodBeat.o(69714);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69714);
          }
          else
          {
            AppMethodBeat.o(69714);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69714);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69715);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    label47: int i1;
    label57: int i2;
    if (this.name == null)
    {
      k = 0;
      if (this.zzajf != null)
        break label147;
      m = 0;
      if (this.zzate != null)
        break label159;
      n = 0;
      if (this.zzarb != null)
        break label171;
      i1 = 0;
      if (this.zzarc != null)
        break label183;
      i2 = 0;
      label67: i3 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label195;
    }
    label147: label159: label171: label183: label195: for (int i3 = i; ; i3 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69715);
      return (i2 + (i1 + (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31) * 31) * 31 + i3;
      k = this.name.hashCode();
      break;
      m = this.zzajf.hashCode();
      break label37;
      n = this.zzate.hashCode();
      break label47;
      i1 = this.zzarb.hashCode();
      break label57;
      i2 = this.zzarc.hashCode();
      break label67;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69717);
    int i = super.zza();
    int j = i;
    if (this.name != null)
      j = i + zzabw.zzc(1, this.name);
    i = j;
    if (this.zzajf != null)
      i = j + zzabw.zzc(2, this.zzajf);
    j = i;
    if (this.zzate != null)
      j = i + zzabw.zzc(3, this.zzate.longValue());
    i = j;
    if (this.zzarb != null)
    {
      this.zzarb.floatValue();
      i = j + (zzabw.zzaq(4) + 4);
    }
    j = i;
    if (this.zzarc != null)
    {
      this.zzarc.doubleValue();
      j = i + (zzabw.zzaq(5) + 8);
    }
    AppMethodBeat.o(69717);
    return j;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69716);
    if (this.name != null)
      paramzzabw.zzb(1, this.name);
    if (this.zzajf != null)
      paramzzabw.zzb(2, this.zzajf);
    if (this.zzate != null)
      paramzzabw.zzb(3, this.zzate.longValue());
    if (this.zzarb != null)
      paramzzabw.zza(4, this.zzarb.floatValue());
    if (this.zzarc != null)
      paramzzabw.zza(5, this.zzarc.doubleValue());
    super.zza(paramzzabw);
    AppMethodBeat.o(69716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzko
 * JD-Core Version:    0.6.2
 */