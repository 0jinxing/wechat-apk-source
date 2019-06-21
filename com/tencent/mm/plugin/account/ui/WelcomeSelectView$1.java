package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk;

final class WelcomeSelectView$1
  implements Runnable
{
  WelcomeSelectView$1(WelcomeSelectView paramWelcomeSelectView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125660);
    g.Rg().a(new bk(new WelcomeSelectView.1.1(this), "launch normal"), 0);
    AppMethodBeat.o(125660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeSelectView.1
 * JD-Core Version:    0.6.2
 */