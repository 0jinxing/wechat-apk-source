package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzg extends zzn<zzg>
{
  public zzh[] zzfy;

  public zzg()
  {
    AppMethodBeat.i(70678);
    this.zzfy = zzh.zzh();
    this.zzhc = null;
    this.zzhl = -1;
    AppMethodBeat.o(70678);
  }

  public static zzg zza(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(70683);
    paramArrayOfByte = (zzg)zzt.zza(new zzg(), paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(70683);
    return paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70679);
    if (paramObject == this)
      AppMethodBeat.o(70679);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzg))
      {
        AppMethodBeat.o(70679);
        bool = false;
      }
      else
      {
        paramObject = (zzg)paramObject;
        if (!zzr.equals(this.zzfy, paramObject.zzfy))
        {
          AppMethodBeat.o(70679);
          bool = false;
        }
        else if ((this.zzhc == null) || (this.zzhc.isEmpty()))
        {
          if ((paramObject.zzhc == null) || (paramObject.zzhc.isEmpty()))
          {
            AppMethodBeat.o(70679);
          }
          else
          {
            AppMethodBeat.o(70679);
            bool = false;
          }
        }
        else
        {
          bool = this.zzhc.equals(paramObject.zzhc);
          AppMethodBeat.o(70679);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70680);
    int i = getClass().getName().hashCode();
    int j = zzr.hashCode(this.zzfy);
    if ((this.zzhc == null) || (this.zzhc.isEmpty()));
    for (int k = 0; ; k = this.zzhc.hashCode())
    {
      AppMethodBeat.o(70680);
      return k + ((i + 527) * 31 + j) * 31;
    }
  }

  public final void zza(zzl paramzzl)
  {
    AppMethodBeat.i(70681);
    if ((this.zzfy != null) && (this.zzfy.length > 0))
      for (int i = 0; i < this.zzfy.length; i++)
      {
        zzh localzzh = this.zzfy[i];
        if (localzzh != null)
          paramzzl.zza(1, localzzh);
      }
    super.zza(paramzzl);
    AppMethodBeat.o(70681);
  }

  protected final int zzg()
  {
    AppMethodBeat.i(70682);
    int i = super.zzg();
    int j = i;
    if (this.zzfy != null)
    {
      j = i;
      if (this.zzfy.length > 0)
      {
        int k = 0;
        while (true)
        {
          j = i;
          if (k >= this.zzfy.length)
            break;
          zzh localzzh = this.zzfy[k];
          j = i;
          if (localzzh != null)
            j = i + zzl.zzb(1, localzzh);
          k++;
          i = j;
        }
      }
    }
    AppMethodBeat.o(70682);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzg
 * JD-Core Version:    0.6.2
 */