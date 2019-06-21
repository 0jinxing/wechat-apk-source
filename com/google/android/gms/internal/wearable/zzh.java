package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzh extends zzn<zzh>
{
  private static volatile zzh[] zzfz;
  public String name;
  public zzi zzga;

  public zzh()
  {
    AppMethodBeat.i(70685);
    this.name = "";
    this.zzga = null;
    this.zzhc = null;
    this.zzhl = -1;
    AppMethodBeat.o(70685);
  }

  public static zzh[] zzh()
  {
    if (zzfz == null);
    synchronized (zzr.zzhk)
    {
      if (zzfz == null)
        zzfz = new zzh[0];
      return zzfz;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70686);
    if (paramObject == this)
      AppMethodBeat.o(70686);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzh))
      {
        AppMethodBeat.o(70686);
        bool = false;
      }
      else
      {
        paramObject = (zzh)paramObject;
        if (this.name == null)
        {
          if (paramObject.name != null)
          {
            AppMethodBeat.o(70686);
            bool = false;
          }
        }
        else if (!this.name.equals(paramObject.name))
        {
          AppMethodBeat.o(70686);
          bool = false;
        }
        else if (this.zzga == null)
        {
          if (paramObject.zzga != null)
          {
            AppMethodBeat.o(70686);
            bool = false;
          }
        }
        else if (!this.zzga.equals(paramObject.zzga))
        {
          AppMethodBeat.o(70686);
          bool = false;
        }
        else if ((this.zzhc == null) || (this.zzhc.isEmpty()))
        {
          if ((paramObject.zzhc == null) || (paramObject.zzhc.isEmpty()))
          {
            AppMethodBeat.o(70686);
          }
          else
          {
            AppMethodBeat.o(70686);
            bool = false;
          }
        }
        else
        {
          bool = this.zzhc.equals(paramObject.zzhc);
          AppMethodBeat.o(70686);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(70687);
    int j = getClass().getName().hashCode();
    int k;
    zzi localzzi;
    int m;
    if (this.name == null)
    {
      k = 0;
      localzzi = this.zzga;
      if (localzzi != null)
        break label103;
      m = 0;
      label41: n = i;
      if (this.zzhc != null)
        if (!this.zzhc.isEmpty())
          break label113;
    }
    label103: label113: for (int n = i; ; n = this.zzhc.hashCode())
    {
      AppMethodBeat.o(70687);
      return (m + (k + (j + 527) * 31) * 31) * 31 + n;
      k = this.name.hashCode();
      break;
      m = localzzi.hashCode();
      break label41;
    }
  }

  public final void zza(zzl paramzzl)
  {
    AppMethodBeat.i(70688);
    paramzzl.zza(1, this.name);
    if (this.zzga != null)
      paramzzl.zza(2, this.zzga);
    super.zza(paramzzl);
    AppMethodBeat.o(70688);
  }

  protected final int zzg()
  {
    AppMethodBeat.i(70689);
    int i = super.zzg() + zzl.zzb(1, this.name);
    int j = i;
    if (this.zzga != null)
      j = i + zzl.zzb(2, this.zzga);
    AppMethodBeat.o(70689);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzh
 * JD-Core Version:    0.6.2
 */