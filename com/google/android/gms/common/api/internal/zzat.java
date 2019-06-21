package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

abstract class zzat
  implements Runnable
{
  private zzat(zzaj paramzzaj)
  {
  }

  public void run()
  {
    zzaj.zzc(this.zzhv).lock();
    try
    {
      boolean bool = Thread.interrupted();
      if (bool);
      while (true)
      {
        return;
        zzaq();
        zzaj.zzc(this.zzhv).unlock();
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        zzaj.zzd(this.zzhv).zzb(localRuntimeException);
        zzaj.zzc(this.zzhv).unlock();
      }
    }
    finally
    {
      zzaj.zzc(this.zzhv).unlock();
    }
  }

  protected abstract void zzaq();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzat
 * JD-Core Version:    0.6.2
 */