package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class WalletPhoneInputView$1
  implements View.OnClickListener
{
  WalletPhoneInputView$1(WalletPhoneInputView paramWalletPhoneInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47908);
    ab.d("MicroMsg.WalletPhoneInputView", "click area");
    paramView = new Intent();
    paramView.setClassName(this.tNV.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
    ((MMActivity)this.tNV.getContext()).startActivityForResult(paramView, 65521);
    AppMethodBeat.o(47908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView.1
 * JD-Core Version:    0.6.2
 */