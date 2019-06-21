package com.tencent.mm.plugin.brandservice.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class MPVideoViewControlBar$2
  implements ap.a
{
  MPVideoViewControlBar$2(MPVideoViewControlBar paramMPVideoViewControlBar)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(14587);
    this.jZB.setVisibility(8);
    MPVideoViewControlBar.a(this.jZB).stopTimer();
    AppMethodBeat.o(14587);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoViewControlBar.2
 * JD-Core Version:    0.6.2
 */