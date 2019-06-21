package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.stats.GCoreWakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zze extends Service
{
  private final Object lock = new Object();
  final ExecutorService zzax = Executors.newSingleThreadExecutor();
  private Binder zzay;
  private int zzaz;
  private int zzba = 0;

  private final void zzf(Intent arg1)
  {
    if (??? != null)
      GCoreWakefulBroadcastReceiver.completeWakefulIntent(???);
    synchronized (this.lock)
    {
      this.zzba -= 1;
      if (this.zzba == 0)
        stopSelfResult(this.zzaz);
      return;
    }
  }

  public abstract void handleIntent(Intent paramIntent);

  public final IBinder onBind(Intent paramIntent)
  {
    try
    {
      Log.isLoggable("EnhancedIntentService", 3);
      if (this.zzay == null)
      {
        paramIntent = new com/google/android/gms/iid/zzi;
        paramIntent.<init>(this);
        this.zzay = paramIntent;
      }
      paramIntent = this.zzay;
      return paramIntent;
    }
    finally
    {
    }
    throw paramIntent;
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    while (true)
    {
      synchronized (this.lock)
      {
        this.zzaz = paramInt2;
        this.zzba += 1;
        if (paramIntent == null)
        {
          zzf(paramIntent);
          paramInt1 = 2;
          return paramInt1;
        }
      }
      this.zzax.execute(new zzf(this, paramIntent, paramIntent));
      paramInt1 = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zze
 * JD-Core Version:    0.6.2
 */