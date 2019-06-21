package com.tencent.mm.plugin.wxcredit.ui;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditOpenUI$1
  implements CompoundButton.OnCheckedChangeListener
{
  WalletWXCreditOpenUI$1(WalletWXCreditOpenUI paramWalletWXCreditOpenUI)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(48750);
    WalletWXCreditOpenUI.a(this.uZG).setEnabled(paramBoolean);
    AppMethodBeat.o(48750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI.1
 * JD-Core Version:    0.6.2
 */