package com.tencent.mm.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class LauncherUITabView$2 extends ak
{
  LauncherUITabView$2(LauncherUITabView paramLauncherUITabView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(29516);
    ab.v("MicroMsg.LauncherUITabView", "onMainTabClick");
    LauncherUITabView.d(this.ykN).onTabClick(0);
    AppMethodBeat.o(29516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUITabView.2
 * JD-Core Version:    0.6.2
 */