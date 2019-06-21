package com.tencent.tinker.lib.util;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class TinkerJobIntentService extends Service
{
  static final HashMap<ComponentName, TinkerJobIntentService.h> Ef = new HashMap();
  static final Object sLock = new Object();
  TinkerJobIntentService.b ACd;
  TinkerJobIntentService.h ACe;
  TinkerJobIntentService.a ACf;
  boolean Ed = false;
  final ArrayList<TinkerJobIntentService.d> Ee;
  boolean mDestroyed = false;
  boolean mStopped = false;

  public TinkerJobIntentService()
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (this.Ee = null; ; this.Ee = new ArrayList())
      return;
  }

  public static void a(Context paramContext, ComponentName paramComponentName, int paramInt, Intent paramIntent)
  {
    synchronized (sLock)
    {
      paramContext = b(paramContext, paramComponentName, true, paramInt);
      paramContext.fV(paramInt);
      paramContext.m(paramIntent);
      return;
    }
  }

  private static TinkerJobIntentService.h b(Context paramContext, ComponentName paramComponentName, boolean paramBoolean, int paramInt)
  {
    TinkerJobIntentService.h localh = (TinkerJobIntentService.h)Ef.get(paramComponentName);
    Object localObject = localh;
    if (localh == null)
    {
      if (Build.VERSION.SDK_INT < 26)
        break label69;
      if (!paramBoolean)
        throw new IllegalArgumentException("Can't be here without a job id");
    }
    label69: for (paramContext = new TinkerJobIntentService.g(paramContext, paramComponentName, paramInt); ; paramContext = new TinkerJobIntentService.c(paramContext, paramComponentName))
    {
      Ef.put(paramComponentName, paramContext);
      localObject = paramContext;
      return localObject;
    }
  }

  @TargetApi(11)
  final void bb(boolean paramBoolean)
  {
    if (this.ACf == null)
    {
      this.ACf = new TinkerJobIntentService.a(this);
      if ((this.ACe != null) && (paramBoolean))
        this.ACe.zl();
      this.ACf.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
  }

  final TinkerJobIntentService.e dSi()
  {
    TinkerJobIntentService.e locale;
    if (this.ACd != null)
      locale = this.ACd.dSi();
    while (true)
    {
      return locale;
      synchronized (this.Ee)
      {
        if (this.Ee.size() > 0)
          locale = (TinkerJobIntentService.e)this.Ee.remove(0);
      }
      Object localObject2 = null;
    }
  }

  protected abstract void l(Intent paramIntent);

  public IBinder onBind(Intent paramIntent)
  {
    if (this.ACd != null);
    for (paramIntent = this.ACd.zj(); ; paramIntent = null)
      return paramIntent;
  }

  public void onCreate()
  {
    super.onCreate();
    if (Build.VERSION.SDK_INT >= 26)
      this.ACd = new TinkerJobIntentService.f(this);
    for (this.ACe = null; ; this.ACe = b(this, new ComponentName(this, getClass()), false, 0))
    {
      return;
      this.ACd = null;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.Ee != null);
    synchronized (this.Ee)
    {
      this.mDestroyed = true;
      this.ACe.zm();
      return;
    }
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (this.Ee != null)
      this.ACe.zk();
    while (true)
    {
      synchronized (this.Ee)
      {
        ArrayList localArrayList2 = this.Ee;
        TinkerJobIntentService.d locald = new com/tencent/tinker/lib/util/TinkerJobIntentService$d;
        if (paramIntent != null)
        {
          locald.<init>(this, paramIntent, paramInt2);
          localArrayList2.add(locald);
          bb(true);
          paramInt1 = 3;
          return paramInt1;
        }
        paramIntent = new Intent();
      }
      paramInt1 = 2;
    }
  }

  final void zh()
  {
    if (this.Ee != null);
    synchronized (this.Ee)
    {
      this.ACf = null;
      if ((this.Ee != null) && (this.Ee.size() > 0))
        bb(false);
      while (this.mDestroyed)
        return;
      this.ACe.zm();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.TinkerJobIntentService
 * JD-Core Version:    0.6.2
 */