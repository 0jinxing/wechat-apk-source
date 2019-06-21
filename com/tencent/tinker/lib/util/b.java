package com.tencent.tinker.lib.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Process;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.util.Iterator;
import java.util.List;

public final class b extends ShareTinkerInternals
{
  private static String ACl = null;

  private static String c(Context paramContext, Class<? extends Service> paramClass)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    paramContext = new ComponentName(paramContext, paramClass);
    try
    {
      paramContext = localPackageManager.getServiceInfo(paramContext, 0);
      paramContext = paramContext.processName;
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
        paramContext = null;
    }
  }

  public static void iY(Context paramContext)
  {
    String str = ja(paramContext);
    if (str == null);
    while (true)
    {
      return;
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
      if (paramContext != null)
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
          if (localRunningAppProcessInfo.processName.equals(str))
            Process.killProcess(localRunningAppProcessInfo.pid);
        }
      }
    }
  }

  public static boolean iZ(Context paramContext)
  {
    Object localObject = (ActivityManager)paramContext.getSystemService("activity");
    paramContext = ja(paramContext);
    boolean bool;
    if (paramContext == null)
      bool = false;
    while (true)
    {
      return bool;
      try
      {
        localObject = ((ActivityManager)localObject).getRunningAppProcesses();
        if (localObject == null)
        {
          bool = false;
          continue;
        }
        localObject = ((List)localObject).iterator();
        do
        {
          if (!((Iterator)localObject).hasNext())
            break;
          bool = ((ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next()).processName.equals(paramContext);
        }
        while (!bool);
        bool = true;
      }
      catch (Exception paramContext)
      {
        new StringBuilder("isTinkerPatchServiceRunning Exception: ").append(paramContext.toString());
        bool = false;
      }
      catch (Error paramContext)
      {
        new StringBuilder("isTinkerPatchServiceRunning Error: ").append(paramContext.toString());
        bool = false;
      }
      continue;
      bool = false;
    }
  }

  private static String ja(Context paramContext)
  {
    if (ACl != null)
      paramContext = ACl;
    while (true)
    {
      return paramContext;
      paramContext = c(paramContext, TinkerPatchService.class);
      if (paramContext == null)
        paramContext = null;
      else
        ACl = paramContext;
    }
  }

  public static boolean jb(Context paramContext)
  {
    String str = aD(paramContext);
    paramContext = ja(paramContext);
    if ((paramContext == null) || (paramContext.length() == 0));
    for (boolean bool = false; ; bool = str.equals(paramContext))
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.b
 * JD-Core Version:    0.6.2
 */