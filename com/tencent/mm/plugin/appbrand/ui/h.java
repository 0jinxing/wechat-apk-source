package com.tencent.mm.plugin.appbrand.ui;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.plugin.appbrand.task.i.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUIAccountReleaseHandler;", "", "()V", "TAG", "", "processForegroundImportance", "", "", "[Ljava/lang/Integer;", "handleAccountRelease", "", "activity", "Landroid/app/Activity;", "finishHandler", "Lcom/tencent/mm/plugin/appbrand/task/AppBrandTaskUIController$FinishAllHandler;", "plugin-appbrand-integration_release"})
public final class h
{
  private static final Integer[] iJb;
  public static final h iJc;

  static
  {
    AppMethodBeat.i(135001);
    iJc = new h();
    iJb = new Integer[] { Integer.valueOf(100), Integer.valueOf(200) };
    AppMethodBeat.o(135001);
  }

  public static void a(Activity paramActivity, i.a parama)
  {
    AppMethodBeat.i(135000);
    j.p(paramActivity, "activity");
    j.p(parama, "finishHandler");
    try
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = new android/app/ActivityManager$RunningAppProcessInfo;
      localRunningAppProcessInfo.<init>();
      ActivityManager.getMyMemoryState(localRunningAppProcessInfo);
      parama = new h.a(parama, paramActivity);
      if ((localRunningAppProcessInfo == null) || (!org.apache.commons.b.a.contains(iJb, Integer.valueOf(localRunningAppProcessInfo.importance))))
      {
        paramActivity = new StringBuilder("finish directly importance[");
        if (localRunningAppProcessInfo != null)
        {
          i = localRunningAppProcessInfo.importance;
          ab.i("MicroMsg.AppBrandUIAccountReleaseHandler", i + ']');
          parama.aDt();
          AppMethodBeat.o(135000);
          return;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        Object localObject = null;
        continue;
        int i = -1;
        continue;
        parama = (AppBrandProxyUIProcessTask.b)new h.b(parama);
        com.tencent.mm.plugin.appbrand.ipc.a.a((Context)paramActivity, (AppBrandProxyUIProcessTask.ProcessRequest)new AccountReleaseProxyUILaunchRequest(), parama, new Intent().addFlags(67108864));
        AppMethodBeat.o(135000);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.h
 * JD-Core Version:    0.6.2
 */