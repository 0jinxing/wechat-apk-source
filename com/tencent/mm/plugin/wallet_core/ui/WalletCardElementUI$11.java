package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletCardElementUI$11
  implements View.OnClickListener
{
  WalletCardElementUI$11(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47225);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_support_bankcard", this.tGf.mBundle.getInt("key_support_bankcard", 3));
    localBundle.putInt("key_bind_scene", this.tGf.mBundle.getInt("key_bind_scene", -1));
    bo.isNullOrNil(WalletCardElementUI.c(this.tGf).getText());
    this.tGf.aoB();
    paramView = a.aE(this.tGf);
    if (paramView != null)
      paramView.a(this.tGf, WalletBankCardSelectUI.class, localBundle, 1);
    AppMethodBeat.o(47225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.11
 * JD-Core Version:    0.6.2
 */