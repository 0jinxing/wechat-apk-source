package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkn extends zzaby<zzkn>
{
  private static volatile zzkn[] zzasz;
  public Integer count;
  public String name;
  public zzko[] zzata;
  public Long zzatb;
  public Long zzatc;

  public zzkn()
  {
    AppMethodBeat.i(69707);
    this.zzata = zzko.zzlm();
    this.name = null;
    this.zzatb = null;
    this.zzatc = null;
    this.count = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69707);
  }

  public static zzkn[] zzll()
  {
    if (zzasz == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzasz == null)
        zzasz = new zzkn[0];
      return zzasz;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69708);
    if (paramObject == this)
      AppMethodBeat.o(69708);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkn))
      {
        AppMethodBeat.o(69708);
        bool = false;
      }
      else
      {
        paramObject = (zzkn)paramObject;
        if (!zzacc.equals(this.zzata, paramObject.zzata))
        {
          AppMethodBeat.o(69708);
          bool = false;
        }
        else if (this.name == null)
        {
          if (paramObject.name != null)
          {
            AppMethodBeat.o(69708);
            bool = false;
          }
        }
        else if (!this.name.equals(paramObject.name))
        {
          AppMethodBeat.o(69708);
          bool = false;
        }
        else if (this.zzatb == null)
        {
          if (paramObject.zzatb != null)
          {
            AppMethodBeat.o(69708);
            bool = false;
          }
        }
        else if (!this.zzatb.equals(paramObject.zzatb))
        {
          AppMethodBeat.o(69708);
          bool = false;
        }
        else if (this.zzatc == null)
        {
          if (paramObject.zzatc != null)
          {
            AppMethodBeat.o(69708);
            bool = false;
          }
        }
        else if (!this.zzatc.equals(paramObject.zzatc))
        {
          AppMethodBeat.o(69708);
          bool = false;
        }
        else if (this.count == null)
        {
          if (paramObject.count != null)
          {
            AppMethodBeat.o(69708);
            bool = false;
          }
        }
        else if (!this.count.equals(paramObject.count))
        {
          AppMethodBeat.o(69708);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69708);
          }
          else
          {
            AppMethodBeat.o(69708);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69708);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69709);
    int j = getClass().getName().hashCode();
    int k = zzacc.hashCode(this.zzata);
    int m;
    int n;
    label46: int i1;
    label56: int i2;
    if (this.name == null)
    {
      m = 0;
      if (this.zzatb != null)
        break label147;
      n = 0;
      if (this.zzatc != null)
        break label159;
      i1 = 0;
      if (this.count != null)
        break label171;
      i2 = 0;
      label66: i3 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label183;
    }
    label147: label159: label171: label183: for (int i3 = i; ; i3 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69709);
      return (i2 + (i1 + (n + (m + ((j + 527) * 31 + k) * 31) * 31) * 31) * 31) * 31 + i3;
      m = this.name.hashCode();
      break;
      n = this.zzatb.hashCode();
      break label46;
      i1 = this.zzatc.hashCode();
      break label56;
      i2 = this.count.hashCode();
      break label66;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69711);
    int i = super.zza();
    int j = i;
    if (this.zzata != null)
    {
      j = i;
      if (this.zzata.length > 0)
      {
        int k = 0;
        while (true)
        {
          j = i;
          if (k >= this.zzata.length)
            break;
          zzko localzzko = this.zzata[k];
          j = i;
          if (localzzko != null)
            j = i + zzabw.zzb(1, localzzko);
          k++;
          i = j;
        }
      }
    }
    i = j;
    if (this.name != null)
      i = j + zzabw.zzc(2, this.name);
    j = i;
    if (this.zzatb != null)
      j = i + zzabw.zzc(3, this.zzatb.longValue());
    i = j;
    if (this.zzatc != null)
      i = j + zzabw.zzc(4, this.zzatc.longValue());
    j = i;
    if (this.count != null)
      j = i + zzabw.zzf(5, this.count.intValue());
    AppMethodBeat.o(69711);
    return j;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69710);
    if ((this.zzata != null) && (this.zzata.length > 0))
      for (int i = 0; i < this.zzata.length; i++)
      {
        zzko localzzko = this.zzata[i];
        if (localzzko != null)
          paramzzabw.zza(1, localzzko);
      }
    if (this.name != null)
      paramzzabw.zzb(2, this.name);
    if (this.zzatb != null)
      paramzzabw.zzb(3, this.zzatb.longValue());
    if (this.zzatc != null)
      paramzzabw.zzb(4, this.zzatc.longValue());
    if (this.count != null)
      paramzzabw.zze(5, this.count.intValue());
    super.zza(paramzzabw);
    AppMethodBeat.o(69710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkn
 * JD-Core Version:    0.6.2
 */