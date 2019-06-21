package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class MMAppMgr$1
  implements ap.a
{
  MMAppMgr$1(MMAppMgr paramMMAppMgr)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(29547);
    String str = bo.cc(ah.getContext());
    if ((str != null) && (str.toLowerCase().startsWith(ah.getPackageName())))
    {
      ab.i("MicroMsg.MMAppMgr", "onTimerExpired, top activity belongs to mm, skip kill tools");
      AppMethodBeat.o(29547);
    }
    while (true)
    {
      return false;
      ab.i("MicroMsg.MMAppMgr", "onTimerExpired, kill tools process");
      c.atD("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
      AppMethodBeat.o(29547);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.1
 * JD-Core Version:    0.6.2
 */