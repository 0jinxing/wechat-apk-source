package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.a;
import com.tencent.mm.ui.widget.picker.a.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletCardElementUI$15$1
  implements a.a
{
  WalletCardElementUI$15$1(WalletCardElementUI.15 param15, a parama)
  {
  }

  public final void b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(47231);
    if (paramBoolean)
    {
      WalletCardElementUI.j(this.tGl.tGf).setText(String.format("%04d%02d%02d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
      WalletCardElementUI.c(this.tGl.tGf, paramInt1);
      WalletCardElementUI.d(this.tGl.tGf, paramInt2);
      WalletCardElementUI.e(this.tGl.tGf, paramInt3);
      WalletCardElementUI.b(this.tGl.tGf);
    }
    this.tGk.hide();
    AppMethodBeat.o(47231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.15.1
 * JD-Core Version:    0.6.2
 */