package com.tencent.mm.plugin.wallet_ecard.b;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;

final class b$d$1
  implements o.a
{
  b$d$1(b.d paramd)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(48087);
    ab.d("MicroMsg.OpenECardProcess", "click span");
    this.tQs.gLj.dismiss();
    if ((this.tQs.hwd instanceof WalletECardBindCardListUI))
      ((WalletECardBindCardListUI)this.tQs.hwd).cST();
    AppMethodBeat.o(48087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.d.1
 * JD-Core Version:    0.6.2
 */