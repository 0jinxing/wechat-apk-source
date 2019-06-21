package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;

final class WalletLqtPlanAddUI$7
  implements b.a
{
  WalletLqtPlanAddUI$7(WalletLqtPlanAddUI paramWalletLqtPlanAddUI, b paramb)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(45564);
    this.jqm.hide();
    if (paramBoolean)
    {
      WalletLqtPlanAddUI.j(this.tjp).ehf = (this.jqm.dLl() + 1);
      WalletLqtPlanAddUI.m(this.tjp);
      WalletLqtPlanAddUI.a(this.tjp);
    }
    AppMethodBeat.o(45564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.7
 * JD-Core Version:    0.6.2
 */