package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsLuckyMoneyPrepareUI$16$1
  implements DialogInterface.OnCancelListener
{
  SnsLuckyMoneyPrepareUI$16$1(SnsLuckyMoneyPrepareUI.16 param16)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42525);
    if ((this.obR.obN.gII != null) && (this.obR.obN.gII.isShowing()))
      this.obR.obN.gII.hide();
    if ((SnsLuckyMoneyPrepareUI.g(this.obR.obN).getVisibility() == 8) || (SnsLuckyMoneyPrepareUI.h(this.obR.obN).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
      this.obR.obN.finish();
    }
    this.obR.obN.ocz.bLz();
    AppMethodBeat.o(42525);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.16.1
 * JD-Core Version:    0.6.2
 */