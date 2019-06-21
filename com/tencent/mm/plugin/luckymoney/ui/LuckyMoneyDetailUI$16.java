package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyDetailUI$16
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyDetailUI$16(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42665);
    if ((LuckyMoneyDetailUI.F(this.oeA) != null) && (LuckyMoneyDetailUI.F(this.oeA).isShowing()))
      LuckyMoneyDetailUI.F(this.oeA).dismiss();
    this.oeA.ocz.bLz();
    if ((LuckyMoneyDetailUI.G(this.oeA).getVisibility() == 8) || (LuckyMoneyDetailUI.H(this.oeA).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyDetailUI", "user cancel & finish");
      this.oeA.finish();
    }
    AppMethodBeat.o(42665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.16
 * JD-Core Version:    0.6.2
 */