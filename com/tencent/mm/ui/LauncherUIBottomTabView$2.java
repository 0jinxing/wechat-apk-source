package com.tencent.mm.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class LauncherUIBottomTabView$2 extends ak
{
  LauncherUIBottomTabView$2(LauncherUIBottomTabView paramLauncherUIBottomTabView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(29487);
    ab.v("MicroMsg.LauncherUITabView", "onMainTabClick");
    LauncherUIBottomTabView.d(this.yky).onTabClick(0);
    AppMethodBeat.o(29487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUIBottomTabView.2
 * JD-Core Version:    0.6.2
 */