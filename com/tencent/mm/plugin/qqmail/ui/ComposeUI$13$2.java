package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.ui.base.p;

final class ComposeUI$13$2
  implements b.b
{
  ComposeUI$13$2(ComposeUI.13 param13)
  {
  }

  public final void ccU()
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(68186);
    ComposeUI.G(this.pxe.pwY).dismiss();
    u.a(ComposeUI.s(this.pxe.pwY), ComposeUI.n(this.pxe.pwY), ComposeUI.x(this.pxe.pwY));
    ComposeUI.I(this.pxe.pwY);
    AppMethodBeat.o(68186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.13.2
 * JD-Core Version:    0.6.2
 */