package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletECardElementInputUI$1
  implements View.OnClickListener
{
  WalletECardElementInputUI$1(WalletECardElementInputUI paramWalletECardElementInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48138);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_support_bankcard", this.tQH.mBundle.getInt("key_support_bankcard", 3));
    localBundle.putInt("key_bind_scene", this.tQH.mBundle.getInt("key_bind_scene", -1));
    if (!bo.isNullOrNil(WalletECardElementInputUI.a(this.tQH).getText()))
    {
      localBundle.putString("key_bank_type", WalletECardElementInputUI.b(this.tQH).pbn);
      localBundle.putInt("key_bankcard_type", WalletECardElementInputUI.b(this.tQH).tyE);
    }
    paramView = a.aE(this.tQH);
    if (paramView != null)
      paramView.a(this.tQH, WalletCardSelectUI.class, localBundle, 1);
    AppMethodBeat.o(48138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI.1
 * JD-Core Version:    0.6.2
 */