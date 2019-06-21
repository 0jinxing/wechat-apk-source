package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class w$9
  implements Runnable
{
  w$9(w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29667);
    if (this.yoa.ynU)
    {
      ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "remove setTagRunnable");
      al.af(this.yoa.ynV);
    }
    AppMethodBeat.o(29667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w.9
 * JD-Core Version:    0.6.2
 */