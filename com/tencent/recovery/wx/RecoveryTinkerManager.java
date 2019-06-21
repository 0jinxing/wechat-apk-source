package com.tencent.recovery.wx;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.tencent.recovery.log.RecoveryLog;
import java.util.Iterator;
import java.util.List;

public class RecoveryTinkerManager
{
  private static boolean bI(Context paramContext, String paramString)
  {
    try
    {
      Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
      do
      {
        do
        {
          if (!localIterator.hasNext())
            break;
          paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        }
        while (paramContext.processName == null);
        bool = paramContext.processName.equals(paramString);
      }
      while (!bool);
      bool = true;
      return bool;
    }
    catch (Exception paramContext)
    {
      while (true)
        boolean bool = false;
    }
  }

  public static int bY(Context paramContext, String paramString)
  {
    int i;
    if (bI(paramContext, iD(paramContext)))
      i = -2;
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT < 26)
        i = bZ(paramContext, paramString);
      else
        i = ca(paramContext, paramString);
    }
  }

  private static int bZ(Context paramContext, String paramString)
  {
    int i = 0;
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.setClassName(paramContext, "com.tencent.tinker.lib.service.IntentServiceRunner");
      localIntent.putExtra("patch_path_extra", paramString);
      localIntent.putExtra("patch_result_class", "com.tencent.mm.modelrecovery.RecoveryTinkerResultService");
      paramContext.startService(localIntent);
      return i;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        RecoveryLog.e("Recovery.RecoveryTinkerManager", "start patch service fail, exception:".concat(String.valueOf(paramContext)), new Object[0]);
        i = -1;
      }
    }
  }

  @TargetApi(21)
  private static int ca(Context paramContext, String paramString)
  {
    try
    {
      JobInfo.Builder localBuilder = new android/app/job/JobInfo$Builder;
      Object localObject = new android/content/ComponentName;
      ((ComponentName)localObject).<init>(paramContext, "com.tencent.tinker.lib.service.JobServiceRunner");
      localBuilder.<init>(-252579085, (ComponentName)localObject);
      localObject = new android/os/PersistableBundle;
      ((PersistableBundle)localObject).<init>();
      ((PersistableBundle)localObject).putString("patch_path_extra", paramString);
      ((PersistableBundle)localObject).putString("patch_result_class", "com.tencent.mm.modelrecovery.RecoveryTinkerResultService");
      localBuilder.setExtras((PersistableBundle)localObject);
      localBuilder.setOverrideDeadline(5L);
      paramContext = (JobScheduler)paramContext.getSystemService("jobscheduler");
      if (paramContext != null)
        if (paramContext.schedule(localBuilder.build()) == 1)
          i = 0;
      while (true)
      {
        return i;
        RecoveryLog.e("Recovery.RecoveryTinkerManager", "fail to schedule job.", new Object[0]);
        i = -1;
        continue;
        RecoveryLog.e("Recovery.RecoveryTinkerManager", "fail to get job scheduler service.", new Object[0]);
        i = -1;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        RecoveryLog.e("Recovery.RecoveryTinkerManager", "start patch service fail, exception:".concat(String.valueOf(paramContext)), new Object[0]);
        int i = -1;
      }
    }
  }

  private static String iD(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    String str;
    if (Build.VERSION.SDK_INT < 26)
      str = "com.tencent.tinker.lib.service.IntentServiceRunner";
    while (true)
    {
      paramContext = new ComponentName(paramContext, str);
      try
      {
        paramContext = localPackageManager.getServiceInfo(paramContext, 0);
        paramContext = paramContext.processName;
        return paramContext;
        str = "com.tencent.tinker.lib.service.JobServiceRunner";
      }
      catch (Throwable paramContext)
      {
        while (true)
          paramContext = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.RecoveryTinkerManager
 * JD-Core Version:    0.6.2
 */