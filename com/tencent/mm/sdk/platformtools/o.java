package com.tencent.mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public final class o
{
  private static BroadcastReceiver broadcastReceiver;
  private static int xyj;
  private static int xyk;
  private static o.b xyl;

  static
  {
    AppMethodBeat.i(52000);
    broadcastReceiver = null;
    xyj = 0;
    xyk = -1;
    xyl = new a();
    AppMethodBeat.o(52000);
  }

  public static int a(ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo)
  {
    AppMethodBeat.i(51996);
    if (!(xyl instanceof a))
      AppMethodBeat.o(51996);
    for (int i = -1; ; i = -1)
    {
      while (true)
      {
        return i;
        Field localField = ((a)xyl).xym;
        if ((Build.VERSION.SDK_INT >= 21) && (localField != null))
          try
          {
            i = localField.getInt(paramRunningAppProcessInfo);
            AppMethodBeat.o(51996);
          }
          catch (Throwable paramRunningAppProcessInfo)
          {
            ab.printErrStackTrace("MicroMsg.GreenManUtil", paramRunningAppProcessInfo, "", new Object[0]);
          }
      }
      AppMethodBeat.o(51996);
    }
  }

  public static String cc(Context paramContext)
  {
    AppMethodBeat.i(51999);
    if (!eA(paramContext))
    {
      paramContext = "";
      AppMethodBeat.o(51999);
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = (ActivityManager)paramContext.getSystemService("activity");
        if (Build.VERSION.SDK_INT >= 23)
        {
          paramContext = paramContext.getAppTasks();
          if ((paramContext == null) || (paramContext.size() <= 0))
          {
            paramContext = "";
            AppMethodBeat.o(51999);
          }
          else
          {
            paramContext = paramContext.iterator();
            if (paramContext.hasNext())
            {
              paramContext = ((ActivityManager.AppTask)paramContext.next()).getTaskInfo().topActivity;
              if (paramContext == null)
              {
                paramContext = null;
                AppMethodBeat.o(51999);
                continue;
              }
              paramContext = paramContext.getClassName();
              AppMethodBeat.o(51999);
            }
          }
        }
        else
        {
          paramContext = ((ActivityManager.RunningTaskInfo)paramContext.getRunningTasks(1).get(0)).topActivity.getClassName();
          AppMethodBeat.o(51999);
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.GreenManUtil", "getTopActivityName Exception:%s stack:%s", new Object[] { paramContext.getMessage(), bo.l(paramContext) });
        paramContext = "";
        AppMethodBeat.o(51999);
      }
    }
  }

  public static boolean eA(Context paramContext)
  {
    AppMethodBeat.i(51995);
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(51995);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.iterator();
      while (true)
        if (paramContext.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
          if ((localRunningAppProcessInfo.importance == 100) && (localRunningAppProcessInfo.processName.startsWith("com.tencent.mm")))
          {
            bool = true;
            AppMethodBeat.o(51995);
            break;
          }
        }
      AppMethodBeat.o(51995);
      bool = false;
    }
  }

  public static boolean gl(Context paramContext)
  {
    AppMethodBeat.i(51994);
    try
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (Build.VERSION.SDK_INT >= 20)
      {
        bool = paramContext.isInteractive();
        AppMethodBeat.o(51994);
      }
      while (true)
      {
        return bool;
        bool = paramContext.isScreenOn();
        AppMethodBeat.o(51994);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.GreenManUtil", "isScreenOn ERROR use isScreenOn e:%s", new Object[] { bo.l(paramContext) });
        AppMethodBeat.o(51994);
        boolean bool = false;
      }
    }
  }

  public static void gm(Context paramContext)
  {
    AppMethodBeat.i(51997);
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(10);
    if (paramContext == null)
      AppMethodBeat.o(51997);
    while (true)
    {
      return;
      Iterator localIterator = paramContext.iterator();
      while (localIterator.hasNext())
      {
        paramContext = (ActivityManager.RunningServiceInfo)localIterator.next();
        ab.i("MicroMsg.GreenManUtil", "dumpRunningServices %s %s", new Object[] { paramContext.service, Boolean.valueOf(paramContext.foreground), Long.valueOf(paramContext.activeSince) });
      }
      AppMethodBeat.o(51997);
    }
  }

  public static boolean gn(Context paramContext)
  {
    AppMethodBeat.i(51998);
    boolean bool = xyl.go(paramContext);
    AppMethodBeat.o(51998);
    return bool;
  }

  static final class a
    implements o.b
  {
    Field xym;

    a()
    {
      AppMethodBeat.i(51992);
      this.xym = null;
      if (Build.VERSION.SDK_INT >= 21);
      while (true)
      {
        try
        {
          if (this.xym == null)
          {
            Field localField = ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
            localField.setAccessible(true);
            this.xym = localField;
          }
          AppMethodBeat.o(51992);
          return;
        }
        catch (Throwable localThrowable)
        {
          ab.printErrStackTrace("MicroMsg.GreenManUtil", localThrowable, "", new Object[0]);
        }
        AppMethodBeat.o(51992);
      }
    }

    public final boolean go(Context paramContext)
    {
      AppMethodBeat.i(51993);
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
      if (paramContext == null)
        AppMethodBeat.o(51993);
      for (boolean bool = false; ; bool = false)
      {
        return bool;
        Iterator localIterator = paramContext.iterator();
        label38: 
        while (localIterator.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if (localRunningAppProcessInfo.processName.startsWith("com.tencent.mm"))
          {
            if ((Build.VERSION.SDK_INT >= 21) && (this.xym != null));
            while (true)
            {
              try
              {
                i = this.xym.getInt(localRunningAppProcessInfo);
                ab.i("MicroMsg.GreenManUtil", "isAppForeground processState %s", new Object[] { Integer.valueOf(i) });
                if (i <= 2)
                {
                  AppMethodBeat.o(51993);
                  bool = true;
                  break;
                }
                i = 0;
                if ((i == 0) || (localRunningAppProcessInfo.importance != 100))
                  break label38;
                AppMethodBeat.o(51993);
                bool = true;
              }
              catch (Throwable paramContext)
              {
                ab.printErrStackTrace("MicroMsg.GreenManUtil", paramContext, "", new Object[0]);
              }
              int i = 1;
            }
          }
        }
        AppMethodBeat.o(51993);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.o
 * JD-Core Version:    0.6.2
 */