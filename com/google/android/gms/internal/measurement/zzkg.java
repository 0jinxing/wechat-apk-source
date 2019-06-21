package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzkg extends zzaby<zzkg>
{
  public Integer zzarz;
  public Boolean zzasa;
  public String zzasb;
  public String zzasc;
  public String zzasd;

  public zzkg()
  {
    AppMethodBeat.i(69663);
    this.zzarz = null;
    this.zzasa = null;
    this.zzasb = null;
    this.zzasc = null;
    this.zzasd = null;
    this.zzbww = null;
    this.zzbxh = -1;
    AppMethodBeat.o(69663);
  }

  private final zzkg zzd(zzabv paramzzabv)
  {
    AppMethodBeat.i(69668);
    while (true)
    {
      int i = paramzzabv.zzuw();
      switch (i)
      {
      default:
        if (!super.zza(paramzzabv, i))
          AppMethodBeat.o(69668);
        break;
      case 0:
        while (true)
        {
          return this;
          AppMethodBeat.o(69668);
        }
      case 8:
        int j = paramzzabv.getPosition();
        int k;
        try
        {
          k = paramzzabv.zzuy();
          if ((k < 0) || (k > 4))
            break label143;
          this.zzarz = Integer.valueOf(k);
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramzzabv.zzam(j);
          zza(paramzzabv, i);
        }
        continue;
        IllegalArgumentException localIllegalArgumentException2 = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(46);
        localIllegalArgumentException2.<init>(k + " is not a valid enum ComparisonType");
        AppMethodBeat.o(69668);
        throw localIllegalArgumentException2;
      case 16:
        this.zzasa = Boolean.valueOf(paramzzabv.zzux());
        break;
      case 26:
        this.zzasb = paramzzabv.readString();
        break;
      case 34:
        this.zzasc = paramzzabv.readString();
        break;
      case 42:
        label143: this.zzasd = paramzzabv.readString();
      }
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(69664);
    if (paramObject == this)
      AppMethodBeat.o(69664);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzkg))
      {
        AppMethodBeat.o(69664);
        bool = false;
      }
      else
      {
        paramObject = (zzkg)paramObject;
        if (this.zzarz == null)
        {
          if (paramObject.zzarz != null)
          {
            AppMethodBeat.o(69664);
            bool = false;
          }
        }
        else if (!this.zzarz.equals(paramObject.zzarz))
        {
          AppMethodBeat.o(69664);
          bool = false;
        }
        else if (this.zzasa == null)
        {
          if (paramObject.zzasa != null)
          {
            AppMethodBeat.o(69664);
            bool = false;
          }
        }
        else if (!this.zzasa.equals(paramObject.zzasa))
        {
          AppMethodBeat.o(69664);
          bool = false;
        }
        else if (this.zzasb == null)
        {
          if (paramObject.zzasb != null)
          {
            AppMethodBeat.o(69664);
            bool = false;
          }
        }
        else if (!this.zzasb.equals(paramObject.zzasb))
        {
          AppMethodBeat.o(69664);
          bool = false;
        }
        else if (this.zzasc == null)
        {
          if (paramObject.zzasc != null)
          {
            AppMethodBeat.o(69664);
            bool = false;
          }
        }
        else if (!this.zzasc.equals(paramObject.zzasc))
        {
          AppMethodBeat.o(69664);
          bool = false;
        }
        else if (this.zzasd == null)
        {
          if (paramObject.zzasd != null)
          {
            AppMethodBeat.o(69664);
            bool = false;
          }
        }
        else if (!this.zzasd.equals(paramObject.zzasd))
        {
          AppMethodBeat.o(69664);
          bool = false;
        }
        else if ((this.zzbww == null) || (this.zzbww.isEmpty()))
        {
          if ((paramObject.zzbww == null) || (paramObject.zzbww.isEmpty()))
          {
            AppMethodBeat.o(69664);
          }
          else
          {
            AppMethodBeat.o(69664);
            bool = false;
          }
        }
        else
        {
          bool = this.zzbww.equals(paramObject.zzbww);
          AppMethodBeat.o(69664);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(69665);
    int j = getClass().getName().hashCode();
    int k;
    int m;
    label37: int n;
    label47: int i1;
    label57: int i2;
    if (this.zzarz == null)
    {
      k = 0;
      if (this.zzasa != null)
        break label147;
      m = 0;
      if (this.zzasb != null)
        break label159;
      n = 0;
      if (this.zzasc != null)
        break label171;
      i1 = 0;
      if (this.zzasd != null)
        break label183;
      i2 = 0;
      label67: i3 = i;
      if (this.zzbww != null)
        if (!this.zzbww.isEmpty())
          break label195;
    }
    label147: label159: label171: label183: label195: for (int i3 = i; ; i3 = this.zzbww.hashCode())
    {
      AppMethodBeat.o(69665);
      return (i2 + (i1 + (n + (m + (k + (j + 527) * 31) * 31) * 31) * 31) * 31) * 31 + i3;
      k = this.zzarz.intValue();
      break;
      m = this.zzasa.hashCode();
      break label37;
      n = this.zzasb.hashCode();
      break label47;
      i1 = this.zzasc.hashCode();
      break label57;
      i2 = this.zzasd.hashCode();
      break label67;
    }
  }

  protected final int zza()
  {
    AppMethodBeat.i(69667);
    int i = super.zza();
    int j = i;
    if (this.zzarz != null)
      j = i + zzabw.zzf(1, this.zzarz.intValue());
    i = j;
    if (this.zzasa != null)
    {
      this.zzasa.booleanValue();
      i = j + (zzabw.zzaq(2) + 1);
    }
    j = i;
    if (this.zzasb != null)
      j = i + zzabw.zzc(3, this.zzasb);
    i = j;
    if (this.zzasc != null)
      i = j + zzabw.zzc(4, this.zzasc);
    j = i;
    if (this.zzasd != null)
      j = i + zzabw.zzc(5, this.zzasd);
    AppMethodBeat.o(69667);
    return j;
  }

  public final void zza(zzabw paramzzabw)
  {
    AppMethodBeat.i(69666);
    if (this.zzarz != null)
      paramzzabw.zze(1, this.zzarz.intValue());
    if (this.zzasa != null)
      paramzzabw.zza(2, this.zzasa.booleanValue());
    if (this.zzasb != null)
      paramzzabw.zzb(3, this.zzasb);
    if (this.zzasc != null)
      paramzzabw.zzb(4, this.zzasc);
    if (this.zzasd != null)
      paramzzabw.zzb(5, this.zzasd);
    super.zza(paramzzabw);
    AppMethodBeat.o(69666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkg
 * JD-Core Version:    0.6.2
 */