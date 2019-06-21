package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ui.base.h;

final class WalletSelectAddrUI$3
  implements View.OnClickListener
{
  WalletSelectAddrUI$3(WalletSelectAddrUI paramWalletSelectAddrUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(16979);
    h.a(this.gLk, true, this.gLk.getString(2131296489, new Object[] { WalletSelectAddrUI.a(this.gLk).toString() }), "", this.gLk.getString(2131296490), this.gLk.getString(2131296868), new WalletSelectAddrUI.3.1(this), null);
    AppMethodBeat.o(16979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.3
 * JD-Core Version:    0.6.2
 */