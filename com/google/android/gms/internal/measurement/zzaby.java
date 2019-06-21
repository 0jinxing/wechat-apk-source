package com.google.android.gms.internal.measurement;

public abstract class zzaby<M extends zzaby<M>> extends zzace
{
  protected zzaca zzbww;

  protected int zza()
  {
    if (this.zzbww != null)
    {
      int i = 0;
      for (int j = 0; ; j = k + j)
      {
        k = j;
        if (i >= this.zzbww.size())
          break;
        k = this.zzbww.zzau(i).zza();
        i++;
      }
    }
    int k = 0;
    return k;
  }

  public final <T> T zza(zzabz<M, T> paramzzabz)
  {
    Object localObject = null;
    if (this.zzbww == null);
    while (true)
    {
      return localObject;
      zzacb localzzacb = this.zzbww.zzat(paramzzabz.tag >>> 3);
      if (localzzacb != null)
        localObject = localzzacb.zzb(paramzzabz);
    }
  }

  public void zza(zzabw paramzzabw)
  {
    if (this.zzbww == null);
    while (true)
    {
      return;
      for (int i = 0; i < this.zzbww.size(); i++)
        this.zzbww.zzau(i).zza(paramzzabw);
    }
  }

  protected final boolean zza(zzabv paramzzabv, int paramInt)
  {
    int i = paramzzabv.getPosition();
    boolean bool;
    if (!paramzzabv.zzak(paramInt))
    {
      bool = false;
      return bool;
    }
    int j = paramInt >>> 3;
    zzacg localzzacg = new zzacg(paramInt, paramzzabv.zzc(i, paramzzabv.getPosition() - i));
    paramzzabv = null;
    if (this.zzbww == null)
      this.zzbww = new zzaca();
    while (true)
    {
      Object localObject = paramzzabv;
      if (paramzzabv == null)
      {
        localObject = new zzacb();
        this.zzbww.zza(j, (zzacb)localObject);
      }
      ((zzacb)localObject).zza(localzzacg);
      bool = true;
      break;
      paramzzabv = this.zzbww.zzat(j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaby
 * JD-Core Version:    0.6.2
 */