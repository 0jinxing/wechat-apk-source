package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class y
  implements ServiceConnection
{
  private final Context bvF;
  private w bwA;
  private boolean bwB;
  private final Intent bwx;
  private final ScheduledExecutorService bwy;
  private final Queue<u> bwz;

  public y(Context paramContext, String paramString)
  {
    this(paramContext, paramString, new ScheduledThreadPoolExecutor(0));
    AppMethodBeat.i(108778);
    AppMethodBeat.o(108778);
  }

  private y(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    AppMethodBeat.i(108779);
    this.bwz = new ArrayDeque();
    this.bwB = false;
    this.bvF = paramContext.getApplicationContext();
    this.bwx = new Intent(paramString).setPackage(this.bvF.getPackageName());
    this.bwy = paramScheduledExecutorService;
    AppMethodBeat.o(108779);
  }

  private final void zzc()
  {
    while (true)
    {
      w localw;
      try
      {
        AppMethodBeat.i(108781);
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.bwz.isEmpty())
          break label301;
        Log.isLoggable("EnhancedIntentService", 3);
        if ((this.bwA == null) || (!this.bwA.isBinderAlive()))
          break;
        Log.isLoggable("EnhancedIntentService", 3);
        Object localObject = (u)this.bwz.poll();
        localw = this.bwA;
        if (Binder.getCallingUid() != Process.myUid())
        {
          localObject = new java/lang/SecurityException;
          ((SecurityException)localObject).<init>("Binding only allowed within app");
          AppMethodBeat.o(108781);
          throw ((Throwable)localObject);
        }
      }
      finally
      {
      }
      Log.isLoggable("EnhancedIntentService", 3);
      if (localw.bwu.i(localu.intent))
      {
        localu.finish();
      }
      else
      {
        Log.isLoggable("EnhancedIntentService", 3);
        ExecutorService localExecutorService = localw.bwu.bwk;
        x localx = new com/google/firebase/iid/x;
        localx.<init>(localw, localu);
        localExecutorService.execute(localx);
      }
    }
    boolean bool;
    if (Log.isLoggable("EnhancedIntentService", 3))
    {
      if (this.bwB)
        break label257;
      bool = true;
    }
    while (true)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(39);
      localStringBuilder.append("binder is dead. start connection? ").append(bool);
      if (!this.bwB)
        this.bwB = true;
      try
      {
        bool = ConnectionTracker.getInstance().bindService(this.bvF, this.bwx, this, 65);
        if (bool)
          AppMethodBeat.o(108781);
        while (true)
        {
          return;
          label257: bool = false;
          break;
          label263: 
          while (!this.bwz.isEmpty())
            ((u)this.bwz.poll()).finish();
          AppMethodBeat.o(108781);
          continue;
          label301: AppMethodBeat.o(108781);
        }
      }
      catch (SecurityException localSecurityException)
      {
        break label263;
      }
    }
  }

  public final void a(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    try
    {
      AppMethodBeat.i(108780);
      Log.isLoggable("EnhancedIntentService", 3);
      Queue localQueue = this.bwz;
      u localu = new com/google/firebase/iid/u;
      localu.<init>(paramIntent, paramPendingResult, this.bwy);
      localQueue.add(localu);
      zzc();
      AppMethodBeat.o(108780);
      return;
    }
    finally
    {
      paramIntent = finally;
    }
    throw paramIntent;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(108782);
    try
    {
      this.bwB = false;
      this.bwA = ((w)paramIBinder);
      if (Log.isLoggable("EnhancedIntentService", 3))
      {
        paramIBinder = String.valueOf(paramComponentName);
        int i = String.valueOf(paramIBinder).length();
        paramComponentName = new java/lang/StringBuilder;
        paramComponentName.<init>(i + 20);
        paramComponentName.append("onServiceConnected: ").append(paramIBinder);
      }
      zzc();
      return;
    }
    finally
    {
      AppMethodBeat.o(108782);
    }
    throw paramComponentName;
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(108783);
    if (Log.isLoggable("EnhancedIntentService", 3))
    {
      paramComponentName = String.valueOf(paramComponentName);
      new StringBuilder(String.valueOf(paramComponentName).length() + 23).append("onServiceDisconnected: ").append(paramComponentName);
    }
    zzc();
    AppMethodBeat.o(108783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.y
 * JD-Core Version:    0.6.2
 */