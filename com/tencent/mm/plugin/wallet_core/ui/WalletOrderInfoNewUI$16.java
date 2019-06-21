package com.tencent.mm.plugin.wallet_core.ui;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletOrderInfoNewUI$16
  implements Runnable
{
  WalletOrderInfoNewUI$16(WalletOrderInfoNewUI paramWalletOrderInfoNewUI, ImageView paramImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47442);
    ViewGroup localViewGroup = (ViewGroup)this.tIz.findViewById(2131825792);
    ViewGroup.LayoutParams localLayoutParams = this.pSV.getLayoutParams();
    localLayoutParams.width = localViewGroup.getWidth();
    localLayoutParams.height = localViewGroup.getHeight();
    this.pSV.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(47442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.16
 * JD-Core Version:    0.6.2
 */