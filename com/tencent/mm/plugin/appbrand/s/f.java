package com.tencent.mm.plugin.appbrand.s;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class f
  implements Application.ActivityLifecycleCallbacks
{
  public Application app;
  public final Queue<f.a> iRm;
  private int iRn;
  public boolean iRo;

  public f()
  {
    AppMethodBeat.i(126633);
    this.iRm = new LinkedList();
    this.iRn = 0;
    this.iRo = false;
    AppMethodBeat.o(126633);
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(126634);
    this.iRn += 1;
    if (this.iRn == 1)
    {
      ab.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnActivityCreated ");
      paramBundle = this.iRm.iterator();
      while (paramBundle.hasNext())
        ((f.a)paramBundle.next()).da(paramActivity);
    }
    AppMethodBeat.o(126634);
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(126635);
    this.iRn -= 1;
    if (this.iRn == 0)
    {
      ab.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnNoActivityLeft ");
      paramActivity = this.iRm.iterator();
      while (paramActivity.hasNext())
        ((f.a)paramActivity.next()).aNZ();
      if ((this.iRo) && (this.app != null))
      {
        paramActivity = this.app;
        ab.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.release ");
        paramActivity.unregisterActivityLifecycleCallbacks(this);
        this.iRm.clear();
        this.app = null;
        this.iRo = false;
        this.iRo = false;
        this.app = null;
      }
    }
    AppMethodBeat.o(126635);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
  }

  public final void onActivityResumed(Activity paramActivity)
  {
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.f
 * JD-Core Version:    0.6.2
 */