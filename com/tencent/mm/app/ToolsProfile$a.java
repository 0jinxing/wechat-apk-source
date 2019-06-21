package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.util.ArrayMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.BaseIPCService;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ToolsProfile$a
{
  private static final AtomicInteger cfu;
  private static Object cfv;

  static
  {
    AppMethodBeat.i(15419);
    cfu = new AtomicInteger(0);
    AppMethodBeat.o(15419);
  }

  private static boolean BJ()
  {
    AppMethodBeat.i(15415);
    try
    {
      if (cfv == null)
      {
        Object localObject1 = ah.getContext();
        Object localObject2 = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
        ((Method)localObject2).setAccessible(true);
        localObject2 = ((Method)localObject2).invoke(null, new Object[0]);
        if (localObject2 != null)
        {
          cfv = localObject2;
          localObject2 = (ArrayMap)org.a.a.ep(localObject2).awS("mServices").object;
          int i = ((ArrayMap)localObject2).size();
          if (i > 0)
            break label134;
          AppMethodBeat.o(15415);
          bool = true;
        }
        while (true)
        {
          return bool;
          localObject2 = localObject1.getClass().getField("mLoadedApk");
          ((Field)localObject2).setAccessible(true);
          localObject1 = ((Field)localObject2).get(localObject1);
          localObject2 = localObject1.getClass().getDeclaredField("mActivityThread");
          ((Field)localObject2).setAccessible(true);
          localObject2 = ((Field)localObject2).get(localObject1);
          break;
          label134: if (((ArrayMap)localObject2).size() == 1)
          {
            bool = localObject2.values().toArray()[0] instanceof BaseIPCService;
            if (bool)
            {
              AppMethodBeat.o(15415);
              bool = true;
            }
          }
          else
          {
            AppMethodBeat.o(15415);
            bool = false;
          }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.e("MicroMsg.ToolsProcessLocker", "skipServiceConditionIfOnlyIPCServiceAlive, hack ActivityThread_mServices e=%s", new Object[] { localThrowable });
        AppMethodBeat.o(15415);
        boolean bool = false;
      }
    }
  }

  public static boolean isLocked()
  {
    boolean bool1 = false;
    AppMethodBeat.i(15414);
    int i;
    if (cfu.get() <= 0)
    {
      Object localObject = (ActivityManager)ah.getContext().getSystemService("activity");
      if (localObject == null)
        break label236;
      localObject = ((ActivityManager)localObject).getRunningAppProcesses();
      if (localObject == null)
        break label236;
      localObject = ((List)localObject).iterator();
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      }
      while (!((h)com.tencent.mm.kernel.g.RM().Rn()).eHT.equals(localRunningAppProcessInfo.processName));
      i = localRunningAppProcessInfo.importance;
      if (!com.tencent.mm.compatible.loader.a.contains(new int[] { 100 }, i))
      {
        i = localRunningAppProcessInfo.importance;
        if ((!com.tencent.mm.compatible.loader.a.contains(new int[] { 300, 125 }, i)) || (BJ()))
        {
          i = localRunningAppProcessInfo.importanceReasonCode;
          if (!com.tencent.mm.compatible.loader.a.contains(new int[] { 1, 2 }, i))
            break label230;
        }
      }
      bool2 = true;
      ab.i("MicroMsg.ToolsProcessLocker", "hasRunningServicesOrProviders:%b %d %d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(localRunningAppProcessInfo.importance), Integer.valueOf(localRunningAppProcessInfo.importanceReasonCode) });
      if (!bool2)
        break label236;
      i = 1;
      label214: if (i == 0)
        break label241;
    }
    else
    {
      AppMethodBeat.o(15414);
    }
    for (boolean bool2 = true; ; bool2 = bool1)
    {
      return bool2;
      label230: bool2 = false;
      break;
      label236: i = 0;
      break label214;
      label241: AppMethodBeat.o(15414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ToolsProfile.a
 * JD-Core Version:    0.6.2
 */