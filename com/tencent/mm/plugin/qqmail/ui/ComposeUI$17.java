package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.a;

final class ComposeUI$17 extends p.a
{
  ComposeUI$17(ComposeUI paramComposeUI)
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(68195);
    MailAddrsViewControl.b localb = new MailAddrsViewControl.b(this.pwY, ComposeUI.d(this.pwY).Vi(null));
    this.pwY.pwf.setAddrsAdapter(localb);
    ComposeUI.e(this.pwY).setAddrsAdapter(localb);
    ComposeUI.f(this.pwY).setAddrsAdapter(localb);
    AppMethodBeat.o(68195);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.17
 * JD-Core Version:    0.6.2
 */