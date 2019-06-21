package com.tencent.mm.modelstat;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class d$a
  implements Application.ActivityLifecycleCallbacks
{
  private int fSb;
  private int fSc;
  int fSd;
  int fSe;

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(78702);
    d.a(d.ake(), 1, paramActivity);
    AppMethodBeat.o(78702);
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(78707);
    d.a(d.ake(), 6, paramActivity);
    AppMethodBeat.o(78707);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    AppMethodBeat.i(78705);
    this.fSc += 1;
    ab.i("MicroMsg.ClickFlowStatSender", "paused[%d]", new Object[] { Integer.valueOf(this.fSc) });
    d.a(d.ake(), 4, paramActivity);
    f localf = f.akh();
    if ((paramActivity != null) && ((paramActivity instanceof MMActivity)))
    {
      String str = paramActivity.getClass().getName();
      long l = ((MMActivity)paramActivity).dyi();
      localf.u(str, l);
      ab.v("MicroMsg.MMActivityBrowseMgr", "onPause activity[%s] time[%d] map[%d]", new Object[] { str, Long.valueOf(l), Integer.valueOf(localf.fSR.size()) });
    }
    AppMethodBeat.o(78705);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(78704);
    this.fSb += 1;
    ab.i("MicroMsg.ClickFlowStatSender", "resumed[%d]", new Object[] { Integer.valueOf(this.fSb) });
    d.a(d.ake(), 3, paramActivity);
    AppMethodBeat.o(78704);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
    AppMethodBeat.i(78703);
    this.fSd += 1;
    ab.i("MicroMsg.ClickFlowStatSender", "started[%d]", new Object[] { Integer.valueOf(this.fSd) });
    d.a(d.ake(), 2, paramActivity);
    AppMethodBeat.o(78703);
  }

  public final void onActivityStopped(Activity paramActivity)
  {
    AppMethodBeat.i(78706);
    this.fSe += 1;
    ab.i("MicroMsg.ClickFlowStatSender", "stopped[%d]", new Object[] { Integer.valueOf(this.fSe) });
    d.a(d.ake(), 5, paramActivity);
    AppMethodBeat.o(78706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.d.a
 * JD-Core Version:    0.6.2
 */