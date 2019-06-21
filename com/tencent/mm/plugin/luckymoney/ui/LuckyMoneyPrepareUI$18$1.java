package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyPrepareUI$18$1
  implements DialogInterface.OnClickListener
{
  LuckyMoneyPrepareUI$18$1(LuckyMoneyPrepareUI.18 param18, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42958);
    ab.i("MicroMsg.LuckyMoneyPrepareUI", "goto h5: %s", new Object[] { this.ohK.kCs });
    e.n(this.ohL.ohI.mController.ylL, this.ohK.kCs, false);
    LuckyMoneyPrepareUI.a(this.ohL.ohI, false);
    AppMethodBeat.o(42958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.18.1
 * JD-Core Version:    0.6.2
 */