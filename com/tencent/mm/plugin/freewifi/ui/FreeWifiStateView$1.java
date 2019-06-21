package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiStateView$1
  implements Runnable
{
  FreeWifiStateView$1(FreeWifiStateView paramFreeWifiStateView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21080);
    this.mAe.invalidate();
    AppMethodBeat.o(21080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateView.1
 * JD-Core Version:    0.6.2
 */