package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyNewYearSendUI$10
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyNewYearSendUI$10(LuckyMoneyNewYearSendUI paramLuckyMoneyNewYearSendUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42818);
    if ((LuckyMoneyNewYearSendUI.o(this.ogn) != null) && (LuckyMoneyNewYearSendUI.o(this.ogn).isShowing()))
      LuckyMoneyNewYearSendUI.o(this.ogn).dismiss();
    if ((LuckyMoneyNewYearSendUI.p(this.ogn).getVisibility() == 8) || (LuckyMoneyNewYearSendUI.q(this.ogn).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "usr cancel, & visibility not visiable, so finish");
      this.ogn.finish();
    }
    this.ogn.ocz.bLz();
    AppMethodBeat.o(42818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.10
 * JD-Core Version:    0.6.2
 */