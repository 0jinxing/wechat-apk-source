package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzki extends zzaby<zzki>
{
  public Integer zzash;
  public String zzasi;
  public Boolean zzasj;
  public String[] zzask;

  public zzki()
  {
    AppMethodBeat.i(69676);
    this.zzash = null;
    this.zzasi = null;
    this.zzasj = null;
    this.zzask = zzach.zzbxq;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69676);
  }

  private final zzki zze(zzabv paramzzabv)
  {
    AppMethodBeat.i(69681);
    while (true)
    {
      int i = paramzzabv.zzuw();
      int j;
      int k;
      label136: Object localObject;
      switch (i)
      {
      default:
        if (!super.zza(paramzzabv, i))
          AppMethodBeat.o(69681);
        break;
      case 0:
        while (true)
        {
          return this;
          AppMethodBeat.o(69681);
        }
      case 8:
        j = paramzzabv.getPosition();
        try
        {
          k = paramzzabv.zzuy();
          if ((k < 0) || (k > 6))
            break label136;
          this.zzash = Integer.valueOf(k);
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramzzabv.zzam(j);
          zza(paramzzabv, i);
        }
        continue;
        IllegalArgumentException localIllegalArgumentException2 = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(41);
        localIllegalArgumentException2.<init>(k + " is not a valid enum MatchType");
        AppMethodBeat.o(69681);
        throw localIllegalArgumentException2;
      case 18:
        this.zzasi = paramzzabv.readString();
        break;
      case 24:
        this.zzasj = Boolean.valueOf(paramzzabv.zzux());
        break;
      case 34:
        j = zzach.zzb(paramzzabv, 34);
        if (this.zzask == null);
        for (k = 0; ; k = this.zzask.length)
        {
          localObject = new String[j + k];
          j = k;
          if (k != 0)
            System.arraycopy(this.zzask, 0, localObject, 0, k);
          for (j = k; j < localObject.length - 1; j++)
          {
            localObject[j] = paramzzabv.readString();
            paramzzabv.zzuw();
          }
        }
        localObject[j] = paramzzabv.readString();
        this.zzask = ((String[])localObject);
      }
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69677);
    if (paramObject == this)
      AppMethodBeat.o(69677);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzki))
      {
        AppMethodBeat.o(69677);
        bool = false;
      }
      else
      {
        paramObject = (zzki)paramObject;
        if (this.zzash == null)
        {
          if (paramObject.zzash != null)
          {
            AppMethodBeat.o(69677);
            bool = false;
          }
        }
        else if (!this.zzash.equals(paramObject.zzash))
        {
          AppMethodBeat.o(69677);
          bool = false;
        }
        else if (this.zzasi == null)
        {
          if (paramObject.zzasi != null)
          {
            AppMethodBeat.o(69677);
            bool = false;
          }
        }
        else if (!this.zzasi.equals(paramObject.zzasi))
        {
          AppMethodBeat.o(69677);
          bool = false;
        }
        else if (this.zzasj == null)
        {
          if (paramObject.zzasj != null)
          {
            AppMethodBeat.o(69677);
            bool = false;
          }
        }
        else if (!this.zzasj.equals(paramObject.zzasj))
        {
          AppMethodBeat.o(69677);
          bool = false;
        }
        else if (!zzacc.equals(this.zzask, paramObject.zzask))
        {
          AppMethodBeat.o(69677);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69677);
          }
          else
          {
            AppMethodBeat.o(69677);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69677);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69678);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    label47: int i1;
    if (this.zzash == null)
    {
      k = 0;
      if (this.zzasi != null)
        break label130;
      m = 0;
      if (this.zzasj != null)
        break label142;
      n = 0;
      i1 = zzacc.hashCode(this.zzask);
      i2 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label154;
    }
    label130: label142: label154: for (int i2 = i; ; i2 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69678);
      return ((n + (m + (k + (j + 527) * 31) * 31) * 31) * 31 + i1) * 31 + i2;
      k = this.zzash.intValue();
      break;
      m = this.zzasi.hashCode();
      break label37;
      n = this.zzasj.hashCode();
      break label47;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69680);
    int i = super.zza();
    int j = i;
    if (this.zzash != null)
      j = i + zzabw.zzf(1, this.zzash.intValue());
    i = j;
    if (this.zzasi != null)
      i = j + zzabw.zzc(2, this.zzasi);
    j = i;
    if (this.zzasj != null)
    {
      this.zzasj.booleanValue();
      j = i + (zzabw.zzaq(3) + 1);
    }
    i = j;
    int k;
    int m;
    if (this.zzask != null)
    {
      i = j;
      if (this.zzask.length > 0)
      {
        k = 0;
        i = 0;
        m = 0;
        if (k < this.zzask.length)
        {
          String str = this.zzask[k];
          if (str == null)
            break label160;
          m++;
          i = zzabw.zzfm(str) + i;
        }
      }
    }
    label160: 
    while (true)
    {
      k++;
      break;
      i = j + i + m * 1;
      AppMethodBeat.o(69680);
      return i;
    }
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69679);
    if (this.zzash != null)
      paramzzabw.zze(1, this.zzash.intValue());
    if (this.zzasi != null)
      paramzzabw.zzb(2, this.zzasi);
    if (this.zzasj != null)
      paramzzabw.zza(3, this.zzasj.booleanValue());
    if ((this.zzask != null) && (this.zzask.length > 0))
      for (int i = 0; i < this.zzask.length; i++)
      {
        String str = this.zzask[i];
        if (str != null)
          paramzzabw.zzb(4, str);
      }
    super.zza(paramzzabw);
    AppMethodBeat.o(69679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzki
 * JD-Core Version:    0.6.2
 */