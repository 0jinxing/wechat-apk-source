package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzi extends zzn<zzi>
{
  private static volatile zzi[] zzgb;
  public int type;
  public zzj zzgc;

  public zzi()
  {
    AppMethodBeat.i(70691);
    this.type = 1;
    this.zzgc = null;
    this.zzhc = null;
    this.zzhl = -1;
    AppMethodBeat.o(70691);
  }

  private final zzi zzb(zzk paramzzk)
  {
    AppMethodBeat.i(70696);
    while (true)
    {
      int i = paramzzk.zzj();
      switch (i)
      {
      default:
        if (!super.zza(paramzzk, i))
          AppMethodBeat.o(70696);
        break;
      case 0:
        while (true)
        {
          return this;
          AppMethodBeat.o(70696);
        }
      case 8:
        int j = paramzzk.getPosition();
        int k;
        try
        {
          k = paramzzk.zzk();
          if ((k <= 0) || (k > 15))
            break label117;
          this.type = k;
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramzzk.zzg(j);
          zza(paramzzk, i);
        }
        continue;
        IllegalArgumentException localIllegalArgumentException2 = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(36);
        localIllegalArgumentException2.<init>(k + " is not a valid enum Type");
        AppMethodBeat.o(70696);
        throw localIllegalArgumentException2;
      case 18:
        label117: if (this.zzgc == null)
          this.zzgc = new zzj();
        paramzzk.zza(this.zzgc);
      }
    }
  }

  public static zzi[] zzi()
  {
    if (zzgb == null);
    synchronized (zzr.zzhk)
    {
      if (zzgb == null)
        zzgb = new zzi[0];
      return zzgb;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70692);
    if (paramObject == this)
      AppMethodBeat.o(70692);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzi))
      {
        AppMethodBeat.o(70692);
        bool = false;
      }
      else
      {
        paramObject = (zzi)paramObject;
        if (this.type != paramObject.type)
        {
          AppMethodBeat.o(70692);
          bool = false;
        }
        else if (this.zzgc == null)
        {
          if (paramObject.zzgc != null)
          {
            AppMethodBeat.o(70692);
            bool = false;
          }
        }
        else if (!this.zzgc.equals(paramObject.zzgc))
        {
          AppMethodBeat.o(70692);
          bool = false;
        }
        else if ((this.zzhc == null) || (this.zzhc.isEmpty()))
        {
          if ((paramObject.zzhc == null) || (paramObject.zzhc.isEmpty()))
          {
            AppMethodBeat.o(70692);
          }
          else
          {
            AppMethodBeat.o(70692);
            bool = false;
          }
        }
        else
        {
          bool = this.zzhc.equals(paramObject.zzhc);
          AppMethodBeat.o(70692);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(70693);
    int j = getClass().getName().hashCode();
    int k = this.type;
    zzj localzzj = this.zzgc;
    int m;
    if (localzzj == null)
    {
      m = 0;
      n = i;
      if (this.zzhc != null)
        if (!this.zzhc.isEmpty())
          break label98;
    }
    label98: for (int n = i; ; n = this.zzhc.hashCode())
    {
      AppMethodBeat.o(70693);
      return (m + ((j + 527) * 31 + k) * 31) * 31 + n;
      m = localzzj.hashCode();
      break;
    }
  }

  public final void zza(zzl paramzzl)
  {
    AppMethodBeat.i(70694);
    paramzzl.zzd(1, this.type);
    if (this.zzgc != null)
      paramzzl.zza(2, this.zzgc);
    super.zza(paramzzl);
    AppMethodBeat.o(70694);
  }

  protected final int zzg()
  {
    AppMethodBeat.i(70695);
    int i = super.zzg() + zzl.zze(1, this.type);
    int j = i;
    if (this.zzgc != null)
      j = i + zzl.zzb(2, this.zzgc);
    AppMethodBeat.o(70695);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzi
 * JD-Core Version:    0.6.2
 */