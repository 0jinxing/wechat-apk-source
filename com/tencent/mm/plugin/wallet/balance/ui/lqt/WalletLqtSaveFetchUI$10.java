package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletLqtSaveFetchUI$10
  implements TextView.OnEditorActionListener
{
  WalletLqtSaveFetchUI$10(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI, View.OnClickListener paramOnClickListener)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45661);
    if ((paramKeyEvent.getAction() == 1) && (paramKeyEvent.getKeyCode() == 66))
    {
      ab.i("MicroMsg.WalletLqtSaveFetchUI", "click enter");
      this.tkV.onClick(null);
      AppMethodBeat.o(45661);
    }
    while (true)
    {
      return true;
      AppMethodBeat.o(45661);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.10
 * JD-Core Version:    0.6.2
 */