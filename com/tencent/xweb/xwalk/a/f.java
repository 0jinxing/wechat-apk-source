package com.tencent.xweb.xwalk.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.k.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;

public final class f
  implements k.a
{
  public String ASK = "";
  public f.a ASL = null;
  public g ASM = null;

  public static boolean dVS()
  {
    AppMethodBeat.i(85420);
    Object localObject1 = XWalkEnvironment.getSharedPreferencesForPluginUpdateInfo();
    boolean bool;
    if (localObject1 == null)
    {
      AppMethodBeat.o(85420);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = ((SharedPreferences)localObject1).getInt("nUpdatingProcessId", -1);
      if (i < 0)
      {
        AppMethodBeat.o(85420);
        bool = false;
      }
      else
      {
        int j = Process.myPid();
        int k = Process.myUid();
        if (i == j)
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "current process is updating plugin");
          AppMethodBeat.o(85420);
          bool = true;
        }
        else
        {
          localObject1 = (ActivityManager)XWalkEnvironment.getApplicationContext().getSystemService("activity");
          try
          {
            localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
            if (localObject1 != null)
            {
              Iterator localIterator = ((List)localObject1).iterator();
              while (localIterator.hasNext())
              {
                localObject1 = (ActivityManager.RunningAppProcessInfo)localIterator.next();
                if (((ActivityManager.RunningAppProcessInfo)localObject1).pid == i)
                  if (((ActivityManager.RunningAppProcessInfo)localObject1).uid == k)
                  {
                    XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "other process is in updating plugin progress");
                    AppMethodBeat.o(85420);
                    bool = true;
                  }
              }
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              Log.e("XWalkPluginUp", localException.getMessage());
              Object localObject2 = null;
            }
            XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "plugin update process pid invalid, clear");
            dVT();
            AppMethodBeat.o(85420);
            bool = false;
          }
        }
      }
    }
  }

  public static void dVT()
  {
    AppMethodBeat.i(85421);
    Object localObject = XWalkEnvironment.getSharedPreferencesForPluginUpdateInfo();
    if (localObject == null)
      AppMethodBeat.o(85421);
    while (true)
    {
      return;
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).remove("nUpdatingProcessId");
      ((SharedPreferences.Editor)localObject).commit();
      XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "plugin update progress finish");
      AppMethodBeat.o(85421);
    }
  }

  public static void nQ(long paramLong)
  {
    AppMethodBeat.i(85419);
    Object localObject = XWalkEnvironment.getSharedPreferencesForPluginUpdateInfo();
    if (localObject == null)
    {
      XWalkEnvironment.addXWalkInitializeLog("XWalkPluginUp", "set time sp is null");
      AppMethodBeat.o(85419);
    }
    while (true)
    {
      return;
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putLong("nLastFetchPluginConfigTime", paramLong);
      ((SharedPreferences.Editor)localObject).commit();
      AppMethodBeat.o(85419);
    }
  }

  public final void a(Context paramContext, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(85418);
    this.ASM = new g();
    this.ASM.a(paramHashMap, this.ASK, this.ASL);
    this.ASM.execute(new String[0]);
    this.ASK = "";
    this.ASL = null;
    AppMethodBeat.o(85418);
  }

  public final boolean isBusy()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.ASM != null)
    {
      bool2 = bool1;
      if (!this.ASM.ASV)
        bool2 = true;
    }
    return bool2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.f
 * JD-Core Version:    0.6.2
 */