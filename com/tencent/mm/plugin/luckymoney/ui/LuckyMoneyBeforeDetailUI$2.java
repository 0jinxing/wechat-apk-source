package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyBeforeDetailUI$2
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyBeforeDetailUI$2(LuckyMoneyBeforeDetailUI paramLuckyMoneyBeforeDetailUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42577);
    if ((LuckyMoneyBeforeDetailUI.a(this.ocB) != null) && (LuckyMoneyBeforeDetailUI.a(this.ocB).isShowing()))
      LuckyMoneyBeforeDetailUI.a(this.ocB).dismiss();
    this.ocB.ocz.bLz();
    if ((LuckyMoneyBeforeDetailUI.b(this.ocB).getVisibility() == 8) || (LuckyMoneyBeforeDetailUI.c(this.ocB).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyBeforeDetailUI", "user cancel & finish");
      this.ocB.finish();
    }
    AppMethodBeat.o(42577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.2
 * JD-Core Version:    0.6.2
 */