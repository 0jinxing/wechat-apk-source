package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ComposeUI$11$2
  implements b.b
{
  ComposeUI$11$2(ComposeUI.11 param11)
  {
  }

  public final void ccU()
  {
    AppMethodBeat.i(68181);
    ComposeUI.G(this.pxd.pwY).setMessage(this.pxd.pwY.getString(2131301964));
    AppMethodBeat.o(68181);
  }

  public final void onComplete()
  {
    AppMethodBeat.i(68182);
    ComposeUI.a(this.pxd.pwY, ComposeUI.H(this.pxd.pwY));
    AppMethodBeat.o(68182);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.11.2
 * JD-Core Version:    0.6.2
 */