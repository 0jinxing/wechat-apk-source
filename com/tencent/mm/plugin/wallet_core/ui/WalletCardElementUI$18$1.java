package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.a;
import com.tencent.mm.ui.widget.picker.a.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletCardElementUI$18$1
  implements a.a
{
  WalletCardElementUI$18$1(WalletCardElementUI.18 param18, a parama)
  {
  }

  public final void b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(47235);
    if (paramBoolean)
    {
      WalletCardElementUI.p(this.tGm.tGf).setText(String.format("%04d%02d%02d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
      WalletCardElementUI.f(this.tGm.tGf, paramInt1);
      WalletCardElementUI.g(this.tGm.tGf, paramInt2);
      WalletCardElementUI.h(this.tGm.tGf, paramInt3);
      WalletCardElementUI.b(this.tGm.tGf);
    }
    this.tGk.hide();
    AppMethodBeat.o(47235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.18.1
 * JD-Core Version:    0.6.2
 */