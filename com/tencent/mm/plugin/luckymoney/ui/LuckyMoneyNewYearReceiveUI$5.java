package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class LuckyMoneyNewYearReceiveUI$5
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyNewYearReceiveUI$5(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42788);
    if ((LuckyMoneyNewYearReceiveUI.f(this.ofE) != null) && (LuckyMoneyNewYearReceiveUI.f(this.ofE).isShowing()))
      LuckyMoneyNewYearReceiveUI.f(this.ofE).dismiss();
    this.ofE.ocz.bLz();
    if ((LuckyMoneyNewYearReceiveUI.g(this.ofE).getVisibility() == 8) || (LuckyMoneyNewYearReceiveUI.h(this.ofE).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "usr cancel, & visibility not visiable, so finish");
      this.ofE.finish();
    }
    AppMethodBeat.o(42788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.5
 * JD-Core Version:    0.6.2
 */