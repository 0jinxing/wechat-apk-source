package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyPrepareUI$1
  implements DialogInterface.OnClickListener
{
  WxaLuckyMoneyPrepareUI$1(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42053);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(42053);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.1
 * JD-Core Version:    0.6.2
 */