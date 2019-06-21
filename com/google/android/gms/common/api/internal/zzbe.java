package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

abstract class zzbe
{
  private final zzbc zzjg;

  protected zzbe(zzbc paramzzbc)
  {
    this.zzjg = paramzzbc;
  }

  protected abstract void zzaq();

  public final void zzc(zzbd paramzzbd)
  {
    zzbd.zza(paramzzbd).lock();
    try
    {
      zzbc localzzbc1 = zzbd.zzb(paramzzbd);
      zzbc localzzbc2 = this.zzjg;
      if (localzzbc1 != localzzbc2);
      while (true)
      {
        return;
        zzaq();
        zzbd.zza(paramzzbd).unlock();
      }
    }
    finally
    {
      zzbd.zza(paramzzbd).unlock();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbe
 * JD-Core Version:    0.6.2
 */