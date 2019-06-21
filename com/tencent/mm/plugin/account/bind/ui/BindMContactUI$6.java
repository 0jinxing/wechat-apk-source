package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.base.b;

final class BindMContactUI$6
  implements Runnable
{
  BindMContactUI$6(BindMContactUI paramBindMContactUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13466);
    String str = this.grK.getString(2131305901, new Object[] { aa.dor() });
    a.b(this.grK, str, 30765, true);
    b.hN(this.grK);
    AppMethodBeat.o(13466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactUI.6
 * JD-Core Version:    0.6.2
 */