package com.tencent.recovery;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.recovery.handler.RecoveryMessageHandler;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.util.Util;

public class Recovery
{
  private static RecoveryMessageHandler AqQ;
  private static long AqR;
  private static String AqS;
  private static boolean AqT = false;
  private static boolean AqU = false;
  private static int AqV = 0;
  private static Application.ActivityLifecycleCallbacks AqW = new Application.ActivityLifecycleCallbacks()
  {
    public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
    {
      if (Recovery.AqU);
      while (true)
      {
        return;
        if (!Recovery.dPZ().hasMessages(3))
        {
          Recovery.dPZ().removeCallbacksAndMessages(null);
          paramAnonymousActivity = Util.iC(Recovery.dQa());
          paramAnonymousBundle = Recovery.dQa().getSharedPreferences(Recovery.AqS, 0).edit();
          paramAnonymousBundle.putInt("KeyComponentOnCreateForeground", 1);
          paramAnonymousBundle.putInt("KeyComponentOnCreateExceptionType", 4096);
          paramAnonymousBundle.apply();
          paramAnonymousBundle = OptionFactory.eN(paramAnonymousActivity, 1);
          Recovery.dPZ().sendEmptyMessageDelayed(3, paramAnonymousBundle.azs);
          RecoveryLog.i("Recovery", "%s markActivityOnCreated %s", new Object[] { paramAnonymousActivity, Long.valueOf(System.currentTimeMillis() - Recovery.AqR) });
        }
      }
    }

    public final void onActivityDestroyed(Activity paramAnonymousActivity)
    {
    }

    public final void onActivityPaused(Activity paramAnonymousActivity)
    {
    }

    public final void onActivityResumed(Activity paramAnonymousActivity)
    {
    }

    public final void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
    {
    }

    public final void onActivityStarted(Activity paramAnonymousActivity)
    {
      Recovery.dQb();
    }

    public final void onActivityStopped(Activity paramAnonymousActivity)
    {
      Recovery.dQc();
      if (Recovery.AN() == 0)
      {
        RecoveryLog.i("Recovery", "%s onActivityStopped: activityForegroundCount is 0", new Object[] { Util.iC(Recovery.dQa()) });
        Recovery.QY(16);
      }
    }
  };
  private static Application application;
  private static Context context;

  public static void QY(int paramInt)
  {
    if (context == null);
    while (true)
    {
      return;
      if (!AqU)
      {
        dPY();
        Object localObject = Util.iC(context);
        SharedPreferences localSharedPreferences = context.getSharedPreferences(AqS, 0);
        RecoveryLog.i("Recovery", "%s Recovery.normal %s %d", new Object[] { localObject, Integer.toHexString(paramInt), Long.valueOf(System.currentTimeMillis() - AqR) });
        AqQ.removeCallbacksAndMessages(null);
        localObject = localSharedPreferences.edit();
        ((SharedPreferences.Editor)localObject).remove("KeyComponentOnCreateExceptionType");
        ((SharedPreferences.Editor)localObject).putInt("KeyComponentOnCreateNormalType", paramInt);
        ((SharedPreferences.Editor)localObject).apply();
        destroy();
      }
    }
  }

  public static void dPV()
  {
    if (AqU);
    while (true)
    {
      return;
      if (!AqT)
      {
        AqT = true;
        Object localObject = Util.iC(context);
        int i = RecoveryLogic.bW(context, (String)localObject);
        RecoveryLog.i("Recovery", "%s markApplicationOnCreateNormal %d", new Object[] { localObject, Long.valueOf(System.currentTimeMillis() - AqR) });
        SharedPreferences.Editor localEditor = context.getSharedPreferences(AqS, 0).edit();
        localEditor.remove("KeyAppOnCreateExceptionType");
        localEditor.putInt("KeyAppOnCreateNormalType", 256);
        if (RecoveryLogic.bW(context, (String)localObject) == 16)
        {
          localEditor.putInt("KeyComponentOnCreateForeground", i);
          localEditor.putInt("KeyComponentOnCreateExceptionType", 4096);
          localObject = OptionFactory.eN((String)localObject, i);
          AqQ.sendEmptyMessageDelayed(2, ((ProcessOptions)localObject).azs);
        }
        localEditor.apply();
      }
    }
  }

  public static void dPW()
  {
    if (context == null)
      return;
    SharedPreferences.Editor localEditor;
    if (!AqU)
    {
      dPY();
      RecoveryLog.i("Recovery", "%s Recovery.crash %d", new Object[] { Util.iC(context), Long.valueOf(System.currentTimeMillis() - AqR) });
      localEditor = context.getSharedPreferences(AqS, 0).edit();
      if (!AqT)
        break label94;
      localEditor.putInt("KeyComponentOnCreateExceptionType", 65536);
    }
    while (true)
    {
      localEditor.apply();
      destroy();
      break;
      break;
      label94: localEditor.putInt("KeyAppOnCreateExceptionType", 65536);
    }
  }

  public static void dPX()
  {
    if (context == null)
      return;
    SharedPreferences.Editor localEditor;
    if (!AqU)
    {
      dPY();
      RecoveryLog.i("Recovery", "%s Recovery.anr %d", new Object[] { Util.iC(context), Long.valueOf(System.currentTimeMillis() - AqR) });
      localEditor = context.getSharedPreferences(AqS, 0).edit();
      if (!AqT)
        break label94;
      localEditor.putInt("KeyComponentOnCreateExceptionType", 1048576);
    }
    while (true)
    {
      localEditor.apply();
      destroy();
      break;
      break;
      label94: localEditor.putInt("KeyAppOnCreateExceptionType", 1048576);
    }
  }

  private static void dPY()
  {
    if (context == null);
    while (true)
    {
      return;
      if (!AqU)
      {
        RecoveryLog.i("Recovery", "%s markFinalStatus", new Object[] { Util.iC(context) });
        AqU = true;
      }
    }
  }

  private static void destroy()
  {
    if (application != null)
      application.unregisterActivityLifecycleCallbacks(AqW);
  }

  public static Context getContext()
  {
    return context;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.Recovery
 * JD-Core Version:    0.6.2
 */