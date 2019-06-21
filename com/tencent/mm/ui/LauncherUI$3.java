package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.x;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

final class LauncherUI$3
  implements Runnable
{
  LauncherUI$3(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29446);
    aw.hold();
    x localx = new x();
    a.xxA.m(localx);
    if (w.a(this.yjV.getIntent(), "LauncherUI.From.Scaner.Shortcut", false))
      LauncherUI.c(this.yjV);
    g.RQ().lL("switch account ,delay logout");
    LauncherUI.a(this.yjV, this.yjV);
    aw.unhold();
    AppMethodBeat.o(29446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUI.3
 * JD-Core Version:    0.6.2
 */