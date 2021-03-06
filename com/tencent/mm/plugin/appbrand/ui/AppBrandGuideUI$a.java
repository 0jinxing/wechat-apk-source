package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ui.banner.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class AppBrandGuideUI$a
  implements Application.ActivityLifecycleCallbacks, f
{
  public boolean iGD = false;
  String iGE;

  public static Application aMe()
  {
    AppMethodBeat.i(132959);
    Application localApplication = (Application)ah.getContext().getApplicationContext();
    AppMethodBeat.o(132959);
    return localApplication;
  }

  public final void DV(String paramString)
  {
    this.iGD = true;
    this.iGE = paramString;
  }

  public final void bg(String paramString, int paramInt)
  {
    this.iGD = false;
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    if ((paramActivity instanceof AppBrandGuideUI))
      this.iGD = false;
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
  }

  public final void onActivityPaused(Activity paramActivity)
  {
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(132960);
    if (((paramActivity instanceof AppBrandGuideUI)) || ((paramActivity instanceof AppBrandLauncherUI)))
      this.iGD = false;
    ActivityManager.RunningTaskInfo localRunningTaskInfo;
    int i;
    if ((g.RK()) && (this.iGD))
    {
      localRunningTaskInfo = bo.av(paramActivity, paramActivity.getTaskId());
      if ((localRunningTaskInfo != null) && (localRunningTaskInfo.baseActivity != null))
        break label88;
      i = 0;
    }
    while (true)
    {
      if (i != 0)
      {
        this.iGD = false;
        paramActivity.startActivity(new Intent(paramActivity, AppBrandGuideUI.class));
      }
      AppMethodBeat.o(132960);
      return;
      label88: if ((!localRunningTaskInfo.baseActivity.getClassName().endsWith(".LauncherUI")) && (localRunningTaskInfo.baseActivity.getClassName().contains(".AppBrandUI")))
        i = 0;
      else
        i = 1;
    }
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a
 * JD-Core Version:    0.6.2
 */