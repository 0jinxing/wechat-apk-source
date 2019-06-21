package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WxaLuckyMoneyReceiveUI$4
  implements DialogInterface.OnCancelListener
{
  WxaLuckyMoneyReceiveUI$4(WxaLuckyMoneyReceiveUI paramWxaLuckyMoneyReceiveUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42102);
    this.nTJ.bKV();
    if ((WxaLuckyMoneyReceiveUI.e(this.nTJ).getVisibility() == 8) || (WxaLuckyMoneyReceiveUI.f(this.nTJ).getVisibility() == 4))
    {
      ab.i("MicroMsg.WxaLuckyMoneyReceiveUI", "user cancel & finish");
      WxaLuckyMoneyReceiveUI.d(this.nTJ);
      this.nTJ.finish();
    }
    AppMethodBeat.o(42102);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI.4
 * JD-Core Version:    0.6.2
 */