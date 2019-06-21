package com.tencent.tinker.lib.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;

final class TinkerJobIntentService$c extends TinkerJobIntentService.h
{
  private final PowerManager.WakeLock bWD;
  private final PowerManager.WakeLock bWE;
  boolean bWF;
  boolean bWG;
  private final Context mContext;

  TinkerJobIntentService$c(Context paramContext, ComponentName paramComponentName)
  {
    super(paramComponentName);
    this.mContext = paramContext.getApplicationContext();
    if (this.mContext.checkPermission("android.permission.WAKE_LOCK", Process.myPid(), Process.myUid()) == 0)
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      this.bWD = paramContext.newWakeLock(1, paramComponentName.getClassName() + ":launch");
      this.bWD.setReferenceCounted(false);
      this.bWE = paramContext.newWakeLock(1, paramComponentName.getClassName() + ":run");
      this.bWE.setReferenceCounted(false);
    }
    while (true)
    {
      return;
      a.w("TinkerJobIntentService", "it would be better to grant WAKE_LOCK permission to your app so that tinker can use WakeLock to keep system awake.", new Object[0]);
      this.bWE = null;
      this.bWD = null;
    }
  }

  final void m(Intent paramIntent)
  {
    paramIntent = new Intent(paramIntent);
    paramIntent.setComponent(this.mComponentName);
    if (this.mContext.startService(paramIntent) != null);
    try
    {
      if (!this.bWF)
      {
        this.bWF = true;
        if ((!this.bWG) && (this.bWD != null))
          this.bWD.acquire(60000L);
      }
      return;
    }
    finally
    {
    }
    throw paramIntent;
  }

  public final void zk()
  {
    try
    {
      this.bWF = false;
      return;
    }
    finally
    {
    }
  }

  public final void zl()
  {
    try
    {
      if (!this.bWG)
      {
        this.bWG = true;
        if (this.bWE != null)
          this.bWE.acquire(600000L);
        if (this.bWD != null)
          this.bWD.release();
      }
      return;
    }
    finally
    {
    }
  }

  public final void zm()
  {
    try
    {
      if (this.bWG)
      {
        if ((this.bWF) && (this.bWD != null))
          this.bWD.acquire(60000L);
        this.bWG = false;
        if (this.bWE != null)
          this.bWE.release();
      }
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.TinkerJobIntentService.c
 * JD-Core Version:    0.6.2
 */