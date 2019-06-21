package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

final class WalletLqtPlanAddUI$8$1
  implements Runnable
{
  WalletLqtPlanAddUI$8$1(WalletLqtPlanAddUI.8 param8, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45565);
    if ((this.tjs.tjr != null) && (WalletLqtPlanAddUI.n(this.tjs.tjp).getTag() != null) && (WalletLqtPlanAddUI.n(this.tjs.tjp).getTag().equals(this.tjs.tjr.field_bindSerial)))
      WalletLqtPlanAddUI.n(this.tjs.tjp).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(45565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.8.1
 * JD-Core Version:    0.6.2
 */