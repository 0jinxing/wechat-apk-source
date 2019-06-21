package com.tencent.mm.plugin.brandservice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.k;

final class ReceiveTemplateMsgMgrUI$3
  implements Runnable
{
  ReceiveTemplateMsgMgrUI$3(ReceiveTemplateMsgMgrUI paramReceiveTemplateMsgMgrUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14023);
    if (ReceiveTemplateMsgMgrUI.a(this.jMv))
    {
      ReceiveTemplateMsgMgrUI.b(this.jMv);
      k localk = new k(ReceiveTemplateMsgMgrUI.c(this.jMv), ReceiveTemplateMsgMgrUI.aWj());
      g.Rg().a(localk, 0);
    }
    AppMethodBeat.o(14023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI.3
 * JD-Core Version:    0.6.2
 */