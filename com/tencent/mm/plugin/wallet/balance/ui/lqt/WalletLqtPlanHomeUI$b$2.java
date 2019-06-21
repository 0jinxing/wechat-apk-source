package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbk;
import com.tencent.mm.protocal.protobuf.bkm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class WalletLqtPlanHomeUI$b$2
  implements View.OnClickListener
{
  WalletLqtPlanHomeUI$b$2(WalletLqtPlanHomeUI.b paramb, bkm parambkm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45620);
    if (this.tjN.wNG != null)
      if ((this.tjN.wNG.wFY) && (!bo.isNullOrNil(this.tjN.wNG.wFZ)))
      {
        h.a(this.tjY.tjK.mController.ylL, this.tjN.wNG.wFZ, "", this.tjY.tjK.getString(2131296955), new WalletLqtPlanHomeUI.b.2.1(this));
        AppMethodBeat.o(45620);
      }
    while (true)
    {
      return;
      WalletLqtPlanHomeUI.a(this.tjY.tjK, this.tjN.wNG.wGa, this.tjN);
      AppMethodBeat.o(45620);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.b.2
 * JD-Core Version:    0.6.2
 */