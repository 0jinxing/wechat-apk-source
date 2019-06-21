package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletCardImportUI$2
  implements View.OnClickListener
{
  WalletCardImportUI$2(WalletCardImportUI paramWalletCardImportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47266);
    paramView = new Bundle();
    paramView.putInt("key_support_bankcard", this.tGt.mBundle.getInt("key_support_bankcard", 3));
    paramView.putString("key_bank_type", WalletCardImportUI.c(this.tGt).pbn);
    paramView.putInt("key_bankcard_type", WalletCardImportUI.c(this.tGt).tyE);
    a.aE(this.tGt).a(this.tGt, WalletCardSelectUI.class, paramView, 1);
    AppMethodBeat.o(47266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.2
 * JD-Core Version:    0.6.2
 */