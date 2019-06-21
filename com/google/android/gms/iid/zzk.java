package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class zzk
  implements ServiceConnection
{
  private final Intent zzbl;
  private final ScheduledExecutorService zzbm;
  private final Queue<zzg> zzbn;
  private zzi zzbo;
  private boolean zzbp;
  private final Context zzk;

  public zzk(Context paramContext, String paramString)
  {
    this(paramContext, paramString, new ScheduledThreadPoolExecutor(0));
    AppMethodBeat.i(57569);
    AppMethodBeat.o(57569);
  }

  private zzk(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    AppMethodBeat.i(57570);
    this.zzbn = new ArrayDeque();
    this.zzbp = false;
    this.zzk = paramContext.getApplicationContext();
    this.zzbl = new Intent(paramString).setPackage(this.zzk.getPackageName());
    this.zzbm = paramScheduledExecutorService;
    AppMethodBeat.o(57570);
  }

  private final void zzl()
  {
    try
    {
      AppMethodBeat.i(57572);
      Log.isLoggable("EnhancedIntentService", 3);
      while (true)
      {
        if (this.zzbn.isEmpty())
          break label210;
        Log.isLoggable("EnhancedIntentService", 3);
        if ((this.zzbo == null) || (!this.zzbo.isBinderAlive()))
          break;
        Log.isLoggable("EnhancedIntentService", 3);
        zzg localzzg = (zzg)this.zzbn.poll();
        this.zzbo.zzd(localzzg);
      }
    }
    finally
    {
    }
    boolean bool;
    if (Log.isLoggable("EnhancedIntentService", 3))
    {
      if (this.zzbp)
        break label167;
      bool = true;
    }
    while (true)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(39);
      localStringBuilder.append("binder is dead. start connection? ").append(bool);
      if (!this.zzbp)
        this.zzbp = true;
      try
      {
        bool = ConnectionTracker.getInstance().bindService(this.zzk, this.zzbl, this, 65);
        if (bool)
          AppMethodBeat.o(57572);
        while (true)
        {
          return;
          label167: bool = false;
          break;
          label172: 
          while (!this.zzbn.isEmpty())
            ((zzg)this.zzbn.poll()).finish();
          AppMethodBeat.o(57572);
          continue;
          label210: AppMethodBeat.o(57572);
        }
      }
      catch (SecurityException localSecurityException)
      {
        break label172;
      }
    }
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(57573);
    try
    {
      this.zzbp = false;
      this.zzbo = ((zzi)paramIBinder);
      if (Log.isLoggable("EnhancedIntentService", 3))
      {
        paramIBinder = String.valueOf(paramComponentName);
        int i = String.valueOf(paramIBinder).length();
        paramComponentName = new java/lang/StringBuilder;
        paramComponentName.<init>(i + 20);
        paramComponentName.append("onServiceConnected: ").append(paramIBinder);
      }
      zzl();
      return;
    }
    finally
    {
      AppMethodBeat.o(57573);
    }
    throw paramComponentName;
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(57574);
    if (Log.isLoggable("EnhancedIntentService", 3))
    {
      paramComponentName = String.valueOf(paramComponentName);
      new StringBuilder(String.valueOf(paramComponentName).length() + 23).append("onServiceDisconnected: ").append(paramComponentName);
    }
    zzl();
    AppMethodBeat.o(57574);
  }

  public final void zzd(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    try
    {
      AppMethodBeat.i(57571);
      Log.isLoggable("EnhancedIntentService", 3);
      Queue localQueue = this.zzbn;
      zzg localzzg = new com/google/android/gms/iid/zzg;
      localzzg.<init>(paramIntent, paramPendingResult, this.zzbm);
      localQueue.add(localzzg);
      zzl();
      AppMethodBeat.o(57571);
      return;
    }
    finally
    {
      paramIntent = finally;
    }
    throw paramIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzk
 * JD-Core Version:    0.6.2
 */