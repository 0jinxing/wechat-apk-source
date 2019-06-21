package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WxaLuckyMoneyDetailUI$3
  implements DialogInterface.OnCancelListener
{
  WxaLuckyMoneyDetailUI$3(WxaLuckyMoneyDetailUI paramWxaLuckyMoneyDetailUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42026);
    this.nSV.bKV();
    if ((WxaLuckyMoneyDetailUI.d(this.nSV).getVisibility() == 8) || (WxaLuckyMoneyDetailUI.e(this.nSV).getVisibility() == 4))
    {
      ab.i("MicroMsg.WxaLuckyMoneyDetailUI", "user cancel & finish");
      this.nSV.c(-1, null);
    }
    AppMethodBeat.o(42026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI.3
 * JD-Core Version:    0.6.2
 */