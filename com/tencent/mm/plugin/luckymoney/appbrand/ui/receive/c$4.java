package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$4
  implements DialogInterface.OnClickListener
{
  c$4(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42128);
    ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "RealnameGuideHelper dialog click cancel");
    this.nTO.af(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel realname}}"));
    AppMethodBeat.o(42128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.c.4
 * JD-Core Version:    0.6.2
 */