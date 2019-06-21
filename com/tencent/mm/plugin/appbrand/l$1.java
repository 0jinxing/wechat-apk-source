package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.a;

final class l$1 extends a
{
  l$1(l paraml)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(128959);
    this.gOR.gNy.getApplication().unregisterActivityLifecycleCallbacks(this);
    AppMethodBeat.o(128959);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    if (this.gOR.gNy == paramActivity)
    {
      this.gOR.gOF = false;
      this.gOR.gOG = true;
    }
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    if (this.gOR.gNy == paramActivity)
    {
      this.gOR.gOF = true;
      this.gOR.gOG = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.1
 * JD-Core Version:    0.6.2
 */