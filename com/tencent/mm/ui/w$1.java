package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;

final class w$1
  implements Runnable
{
  w$1(w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29653);
    if (!g.RN().QY())
    {
      ab.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "Account not Ready!!!");
      AppMethodBeat.o(29653);
    }
    while (true)
    {
      return;
      if (this.yoa.ynT == null)
      {
        ab.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "set tag job, but tab view is null");
        AppMethodBeat.o(29653);
      }
      else
      {
        f.dMn().d(new w.1.2(this)).f(new w.1.1(this)).a(this.yoa.yhZ);
        AppMethodBeat.o(29653);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(29654);
    String str = super.toString() + "|setTagRunnable";
    AppMethodBeat.o(29654);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w.1
 * JD-Core Version:    0.6.2
 */