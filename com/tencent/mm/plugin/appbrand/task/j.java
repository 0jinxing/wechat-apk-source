package com.tencent.mm.plugin.appbrand.task;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

class j
{
  final String iFq;
  final Class<? extends Activity> iFr;
  private final Class iFs;
  final LinkedHashMap<String, Integer> iFt;
  final LinkedHashMap<String, AppBrandRemoteTaskController> iFu;
  g iFv;
  final Class ifs;

  j(Class<? extends Activity> paramClass, Class paramClass1, Class paramClass2)
  {
    AppMethodBeat.i(132874);
    this.iFt = new LinkedHashMap();
    this.iFu = new LinkedHashMap();
    this.iFv = g.iFh;
    this.iFq = paramClass.getName();
    this.iFr = paramClass;
    this.iFs = paramClass1;
    this.ifs = paramClass2;
    AppMethodBeat.o(132874);
  }

  void DI(String paramString)
  {
    AppMethodBeat.i(132878);
    this.iFt.remove(paramString);
    this.iFu.remove(paramString);
    if (this.iFt.isEmpty())
      this.iFv = g.iFh;
    AppMethodBeat.o(132878);
  }

  final Integer DT(String paramString)
  {
    AppMethodBeat.i(132880);
    paramString = (Integer)this.iFt.get(paramString);
    AppMethodBeat.o(132880);
    return paramString;
  }

  final AppBrandRemoteTaskController DU(String paramString)
  {
    AppMethodBeat.i(132881);
    paramString = (AppBrandRemoteTaskController)this.iFu.get(paramString);
    AppMethodBeat.o(132881);
    return paramString;
  }

  final void Dw()
  {
    AppMethodBeat.i(132876);
    if (this.iFs == null)
      AppMethodBeat.o(132876);
    while (true)
    {
      return;
      try
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        AppBrandPreloadProfiler localAppBrandPreloadProfiler = new com/tencent/mm/plugin/appbrand/task/AppBrandPreloadProfiler;
        localAppBrandPreloadProfiler.<init>();
        localAppBrandPreloadProfiler.aLK();
        localIntent.putExtra("preloadProfiler", localAppBrandPreloadProfiler);
        localIntent.setClass(ah.getContext(), this.iFs);
        this.iFv.G(localIntent);
        ah.getContext().sendBroadcast(localIntent);
        AppMethodBeat.o(132876);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(132876);
      }
    }
  }

  void a(String paramString, int paramInt, AppBrandRemoteTaskController paramAppBrandRemoteTaskController)
  {
    AppMethodBeat.i(132877);
    this.iFt.put(paramString, Integer.valueOf(paramInt));
    this.iFu.put(paramString, paramAppBrandRemoteTaskController);
    AppMethodBeat.o(132877);
  }

  protected boolean a(g paramg)
  {
    return true;
  }

  void aLJ()
  {
    AppMethodBeat.i(132879);
    if (!this.iFt.isEmpty())
      AppMethodBeat.o(132879);
    while (true)
    {
      return;
      Object localObject1 = (ActivityManager)ah.getContext().getSystemService("activity");
      Object localObject2 = ah.getContext().getPackageManager();
      if ((localObject1 == null) || (localObject2 == null))
      {
        AppMethodBeat.o(132879);
      }
      else
      {
        Object localObject3;
        try
        {
          localObject3 = new android/content/ComponentName;
          ((ComponentName)localObject3).<init>(ah.getContext(), this.iFr);
          localObject2 = ((PackageManager)localObject2).getActivityInfo((ComponentName)localObject3, 128).processName;
          localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
          if (localObject1 != null)
            break label109;
          AppMethodBeat.o(132879);
        }
        catch (Exception localException1)
        {
          AppMethodBeat.o(132879);
        }
        continue;
        label109: localObject1 = ((List)localObject1).iterator();
        while (true)
        {
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label170;
            localObject3 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject1).next();
            if (((ActivityManager.RunningAppProcessInfo)localObject3).processName.equals(localException1))
              try
              {
                Process.killProcess(((ActivityManager.RunningAppProcessInfo)localObject3).pid);
                AppMethodBeat.o(132879);
              }
              catch (Exception localException2)
              {
                AppMethodBeat.o(132879);
              }
          }
          break;
        }
        label170: AppMethodBeat.o(132879);
      }
    }
  }

  final void f(g paramg)
  {
    AppMethodBeat.i(132875);
    if (!a(paramg))
    {
      paramg = new IllegalStateException("AppBrandUITask not support this type. [" + paramg.name() + "]");
      AppMethodBeat.o(132875);
      throw paramg;
    }
    this.iFv = paramg;
    AppMethodBeat.o(132875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.j
 * JD-Core Version:    0.6.2
 */