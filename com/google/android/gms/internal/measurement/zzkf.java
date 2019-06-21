package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkf extends zzaby<zzkf>
{
  private static volatile zzkf[] zzaru;
  public zzki zzarv;
  public zzkg zzarw;
  public Boolean zzarx;
  public String zzary;

  public zzkf()
  {
    AppMethodBeat.i(69657);
    this.zzarv = null;
    this.zzarw = null;
    this.zzarx = null;
    this.zzary = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69657);
  }

  public static zzkf[] zzlg()
  {
    if (zzaru == null);
    synchronized (zzacc.zzbxg)
    {
      if (zzaru == null)
        zzaru = new zzkf[0];
      return zzaru;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69658);
    if (paramObject == this)
      AppMethodBeat.o(69658);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkf))
      {
        AppMethodBeat.o(69658);
        bool = false;
      }
      else
      {
        paramObject = (zzkf)paramObject;
        if (this.zzarv == null)
        {
          if (paramObject.zzarv != null)
          {
            AppMethodBeat.o(69658);
            bool = false;
          }
        }
        else if (!this.zzarv.equals(paramObject.zzarv))
        {
          AppMethodBeat.o(69658);
          bool = false;
        }
        else if (this.zzarw == null)
        {
          if (paramObject.zzarw != null)
          {
            AppMethodBeat.o(69658);
            bool = false;
          }
        }
        else if (!this.zzarw.equals(paramObject.zzarw))
        {
          AppMethodBeat.o(69658);
          bool = false;
        }
        else if (this.zzarx == null)
        {
          if (paramObject.zzarx != null)
          {
            AppMethodBeat.o(69658);
            bool = false;
          }
        }
        else if (!this.zzarx.equals(paramObject.zzarx))
        {
          AppMethodBeat.o(69658);
          bool = false;
        }
        else if (this.zzary == null)
        {
          if (paramObject.zzary != null)
          {
            AppMethodBeat.o(69658);
            bool = false;
          }
        }
        else if (!this.zzary.equals(paramObject.zzary))
        {
          AppMethodBeat.o(69658);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69658);
          }
          else
          {
            AppMethodBeat.o(69658);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69658);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69659);
    int j = getClass().getName().hashCode();
    Object localObject = this.zzarv;
    int k;
    int m;
    label42: int n;
    label52: int i1;
    if (localObject == null)
    {
      k = 0;
      localObject = this.zzarw;
      if (localObject != null)
        break label135;
      m = 0;
      if (this.zzarx != null)
        break label144;
      n = 0;
      if (this.zzary != null)
        break label156;
      i1 = 0;
      label62: i2 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label168;
    }
    label135: label144: label156: label168: for (int i2 = i; ; i2 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69659);
      return (i1 + (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31) * 31 + i2;
      k = ((zzki)localObject).hashCode();
      break;
      m = ((zzkg)localObject).hashCode();
      break label42;
      n = this.zzarx.hashCode();
      break label52;
      i1 = this.zzary.hashCode();
      break label62;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69661);
    int i = super.zza();
    int j = i;
    if (this.zzarv != null)
      j = i + zzabw.zzb(1, this.zzarv);
    i = j;
    if (this.zzarw != null)
      i = j + zzabw.zzb(2, this.zzarw);
    j = i;
    if (this.zzarx != null)
    {
      this.zzarx.booleanValue();
      j = i + (zzabw.zzaq(3) + 1);
    }
    i = j;
    if (this.zzary != null)
      i = j + zzabw.zzc(4, this.zzary);
    AppMethodBeat.o(69661);
    return i;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69660);
    if (this.zzarv != null)
      paramzzabw.zza(1, this.zzarv);
    if (this.zzarw != null)
      paramzzabw.zza(2, this.zzarw);
    if (this.zzarx != null)
      paramzzabw.zza(3, this.zzarx.booleanValue());
    if (this.zzary != null)
      paramzzabw.zzb(4, this.zzary);
    super.zza(paramzzabw);
    AppMethodBeat.o(69660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkf
 * JD-Core Version:    0.6.2
 */