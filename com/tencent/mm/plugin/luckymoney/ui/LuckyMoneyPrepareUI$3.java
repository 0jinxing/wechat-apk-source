package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyPrepareUI$3
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyPrepareUI$3(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42943);
    if ((LuckyMoneyPrepareUI.r(this.ohI) != null) && (LuckyMoneyPrepareUI.r(this.ohI).isShowing()))
      LuckyMoneyPrepareUI.r(this.ohI).dismiss();
    if ((LuckyMoneyPrepareUI.s(this.ohI).getVisibility() == 8) || (LuckyMoneyPrepareUI.t(this.ohI).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
      this.ohI.finish();
    }
    this.ohI.ocz.bLz();
    AppMethodBeat.o(42943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.3
 * JD-Core Version:    0.6.2
 */