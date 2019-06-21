package com.tencent.mm.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import java.util.HashSet;
import java.util.Set;

final class ToolsProfile$4
  implements Application.ActivityLifecycleCallbacks
{
  private Set<Activity> cft;

  ToolsProfile$4(ToolsProfile paramToolsProfile)
  {
    AppMethodBeat.i(15409);
    this.cft = new HashSet();
    AppMethodBeat.o(15409);
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(15410);
    ToolsProfile.b(this.cfs);
    this.cft.add(paramActivity);
    AppMethodBeat.o(15410);
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(15411);
    ToolsProfile.c(this.cfs);
    ab.d(ToolsProfile.access$000(), "onActivityDestroyed, after destroy, activityInstanceNum = %d", new Object[] { Integer.valueOf(ToolsProfile.a(this.cfs)) });
    if (ToolsProfile.a(this.cfs) == 0)
    {
      ToolsProfile.a.BK();
      boolean bool = WebView.getCanReboot();
      ab.i(ToolsProfile.access$000(), "onActivityDestroyed, xwebCanReboot = %b", new Object[] { Boolean.valueOf(bool) });
      if ((bool) && (!ToolsProfile.a.isLocked()))
        Process.killProcess(Process.myPid());
    }
    this.cft.remove(paramActivity);
    AppMethodBeat.o(15411);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    AppMethodBeat.i(15412);
    this.cft.remove(paramActivity);
    ToolsProfile.a.BL();
    AppMethodBeat.o(15412);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(15413);
    if (!this.cft.contains(paramActivity))
      ToolsProfile.a.BM();
    AppMethodBeat.o(15413);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ToolsProfile.4
 * JD-Core Version:    0.6.2
 */