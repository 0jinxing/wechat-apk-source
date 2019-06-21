package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service
{
  final ExecutorService bwk;
  private Binder bwl;
  private int bwm;
  private int bwn;
  private final Object lock;

  public zzb()
  {
    String str = String.valueOf(getClass().getSimpleName());
    if (str.length() != 0);
    for (str = "Firebase-".concat(str); ; str = new String("Firebase-"))
    {
      this.bwk = Executors.newSingleThreadExecutor(new NamedThreadFactory(str));
      this.lock = new Object();
      this.bwn = 0;
      return;
    }
  }

  private final void h(Intent arg1)
  {
    if (??? != null)
      WakefulBroadcastReceiver.completeWakefulIntent(???);
    synchronized (this.lock)
    {
      this.bwn -= 1;
      if (this.bwn == 0)
        stopSelfResult(this.bwm);
      return;
    }
  }

  protected Intent f(Intent paramIntent)
  {
    return paramIntent;
  }

  public abstract void g(Intent paramIntent);

  public boolean i(Intent paramIntent)
  {
    return false;
  }

  public final IBinder onBind(Intent paramIntent)
  {
    try
    {
      Log.isLoggable("EnhancedIntentService", 3);
      if (this.bwl == null)
      {
        paramIntent = new com/google/firebase/iid/w;
        paramIntent.<init>(this);
        this.bwl = paramIntent;
      }
      paramIntent = this.bwl;
      return paramIntent;
    }
    finally
    {
    }
    throw paramIntent;
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 2;
    while (true)
    {
      synchronized (this.lock)
      {
        this.bwm = paramInt2;
        this.bwn += 1;
        ??? = f(paramIntent);
        if (??? == null)
        {
          h(paramIntent);
          return paramInt1;
        }
      }
      if (i((Intent)???))
      {
        h(paramIntent);
      }
      else
      {
        this.bwk.execute(new t(this, (Intent)???, paramIntent));
        paramInt1 = 3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.zzb
 * JD-Core Version:    0.6.2
 */