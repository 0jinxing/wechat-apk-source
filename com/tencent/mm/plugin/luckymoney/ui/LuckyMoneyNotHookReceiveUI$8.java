package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class LuckyMoneyNotHookReceiveUI$8
  implements DialogInterface.OnCancelListener
{
  LuckyMoneyNotHookReceiveUI$8(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42855);
    if ((LuckyMoneyNotHookReceiveUI.e(this.ogx) != null) && (LuckyMoneyNotHookReceiveUI.e(this.ogx).isShowing()))
      LuckyMoneyNotHookReceiveUI.e(this.ogx).dismiss();
    this.ogx.ocz.bLz();
    if ((LuckyMoneyNotHookReceiveUI.f(this.ogx).getVisibility() == 8) || (LuckyMoneyNotHookReceiveUI.g(this.ogx).getVisibility() == 4))
    {
      ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "user cancel & finish");
      this.ogx.finish();
    }
    AppMethodBeat.o(42855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.8
 * JD-Core Version:    0.6.2
 */