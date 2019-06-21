package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyNewYearSendUI$3
  implements DialogInterface.OnClickListener
{
  LuckyMoneyNewYearSendUI$3(LuckyMoneyNewYearSendUI paramLuckyMoneyNewYearSendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42810);
    this.ogn.finish();
    AppMethodBeat.o(42810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.3
 * JD-Core Version:    0.6.2
 */