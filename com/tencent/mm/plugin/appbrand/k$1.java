package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.a;

final class k$1 extends a
{
  k$1(k paramk)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(86710);
    this.gOH.gNy.getApplication().unregisterActivityLifecycleCallbacks(this);
    AppMethodBeat.o(86710);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    if (this.gOH.gNy == paramActivity)
    {
      this.gOH.gOF = false;
      this.gOH.gOG = true;
    }
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    if (this.gOH.gNy == paramActivity)
    {
      this.gOH.gOF = true;
      this.gOH.gOG = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.1
 * JD-Core Version:    0.6.2
 */