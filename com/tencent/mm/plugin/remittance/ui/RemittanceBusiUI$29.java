package com.tencent.mm.plugin.remittance.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class RemittanceBusiUI$29
  implements a
{
  RemittanceBusiUI$29(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(44928);
    RemittanceBusiUI.a(this.pUd, paramBoolean);
    if (paramBoolean)
    {
      RemittanceBusiUI.a(this.pUd, RemittanceBusiUI.r(this.pUd), RemittanceBusiUI.s(this.pUd));
      AppMethodBeat.o(44928);
    }
    while (true)
    {
      return;
      RemittanceBusiUI.r(this.pUd).scrollTo(0, 0);
      if ((RemittanceBusiUI.d(this.pUd) != null) && (RemittanceBusiUI.d(this.pUd).getVisibility() == 0))
      {
        RemittanceBusiUI.d(this.pUd).setFocusable(false);
        RemittanceBusiUI.d(this.pUd).setFocusable(true);
      }
      AppMethodBeat.o(44928);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.29
 * JD-Core Version:    0.6.2
 */