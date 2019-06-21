package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;

final class ComposeUI$19
  implements MailAddrsViewControl.a
{
  ComposeUI$19(ComposeUI paramComposeUI)
  {
  }

  public final void b(MailAddrsViewControl paramMailAddrsViewControl)
  {
    AppMethodBeat.i(68201);
    h.a(this.pwY.mController.ylL, this.pwY.getString(2131301994), "", new ComposeUI.19.1(this, paramMailAddrsViewControl), new ComposeUI.19.2(this, paramMailAddrsViewControl));
    AppMethodBeat.o(68201);
  }

  public final void ccV()
  {
    AppMethodBeat.i(68202);
    t.a(this.pwY, this.pwY.getString(2131301994), 1500L);
    AppMethodBeat.o(68202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.19
 * JD-Core Version:    0.6.2
 */