package com.google.android.gms.internal.wearable;

public abstract class zzn<M extends zzn<M>> extends zzt
{
  protected zzp zzhc;

  public void zza(zzl paramzzl)
  {
    if (this.zzhc == null);
    while (true)
    {
      return;
      for (int i = 0; i < this.zzhc.size(); i++)
        this.zzhc.zzp(i).zza(paramzzl);
    }
  }

  protected final boolean zza(zzk paramzzk, int paramInt)
  {
    int i = paramzzk.getPosition();
    boolean bool;
    if (!paramzzk.zzd(paramInt))
    {
      bool = false;
      return bool;
    }
    int j = paramInt >>> 3;
    zzv localzzv = new zzv(paramInt, paramzzk.zzb(i, paramzzk.getPosition() - i));
    paramzzk = null;
    if (this.zzhc == null)
      this.zzhc = new zzp();
    while (true)
    {
      Object localObject = paramzzk;
      if (paramzzk == null)
      {
        localObject = new zzq();
        this.zzhc.zza(j, (zzq)localObject);
      }
      ((zzq)localObject).zza(localzzv);
      bool = true;
      break;
      paramzzk = this.zzhc.zzo(j);
    }
  }

  protected int zzg()
  {
    if (this.zzhc != null)
    {
      int i = 0;
      for (int j = 0; ; j = k + j)
      {
        k = j;
        if (i >= this.zzhc.size())
          break;
        k = this.zzhc.zzp(i).zzg();
        i++;
      }
    }
    int k = 0;
    return k;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzn
 * JD-Core Version:    0.6.2
 */