package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.xweb.WebView;

final class ToolsProfile$3
  implements ap.a
{
  ToolsProfile$3(ToolsProfile paramToolsProfile)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = false;
    AppMethodBeat.i(15408);
    ab.i(ToolsProfile.access$000(), "onTimerExpired, check kill tools process");
    if (ToolsProfile.a(this.cfs) == 0)
    {
      ToolsProfile.a.BK();
      boolean bool2 = WebView.getCanReboot();
      ab.i(ToolsProfile.access$000(), "onTimerExpired, xwebCanReboot = %b", new Object[] { Boolean.valueOf(bool2) });
      if ((bool2) || (!ToolsProfile.a.isLocked()))
      {
        c.atD("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        AppMethodBeat.o(15408);
      }
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(15408);
      bool1 = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ToolsProfile.3
 * JD-Core Version:    0.6.2
 */