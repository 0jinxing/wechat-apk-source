package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyPrepareUI$2
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyPrepareUI$2(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42942);
    ab.i("MicroMsg.LuckyMoneyPrepareUI", "coperationTipDialogNoTransparent onCancel()");
    LuckyMoneyPrepareUI.m(this.ohI);
    LuckyMoneyPrepareUI.n(this.ohI);
    if ((LuckyMoneyPrepareUI.o(this.ohI) != null) && (LuckyMoneyPrepareUI.o(this.ohI).isShowing()))
      LuckyMoneyPrepareUI.o(this.ohI).dismiss();
    if ((LuckyMoneyPrepareUI.p(this.ohI).getVisibility() == 8) || (LuckyMoneyPrepareUI.q(this.ohI).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
      this.ohI.finish();
    }
    this.ohI.ocz.bLz();
    AppMethodBeat.o(42942);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.2
 * JD-Core Version:    0.6.2
 */