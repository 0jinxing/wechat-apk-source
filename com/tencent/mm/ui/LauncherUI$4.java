package com.tencent.mm.ui;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class LauncherUI$4
  implements Runnable
{
  long cvc = 2000L;

  LauncherUI$4(LauncherUI paramLauncherUI)
  {
  }

  @TargetApi(17)
  public final void run()
  {
    AppMethodBeat.i(29447);
    ab.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck tid[%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
    al.af(this);
    if (aw.ZM())
    {
      g.RN();
      ab.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck done uin[%d]", new Object[] { Integer.valueOf(a.QF()) });
      AppMethodBeat.o(29447);
    }
    while (true)
    {
      return;
      if ((com.tencent.mm.modelstat.d.akd()) || (b.foreground))
      {
        this.cvc += 2000L;
        if (this.cvc > 10000L)
          this.cvc = 2000L;
        ab.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck isAppOnForeground[%b] foreground[%b] trigger next [%d]", new Object[] { Boolean.valueOf(com.tencent.mm.modelstat.d.akd()), Boolean.valueOf(b.foreground), Long.valueOf(this.cvc) });
        al.n(this, this.cvc);
        AppMethodBeat.o(29447);
      }
      else
      {
        ab.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit!!!");
        if (WXHardCoderJNI.isCheckEnv())
          com.tencent.mm.sdk.g.d.post(new LauncherUI.4.1(this), "terminateApp");
        ab.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit app done");
        AppMethodBeat.o(29447);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUI.4
 * JD-Core Version:    0.6.2
 */