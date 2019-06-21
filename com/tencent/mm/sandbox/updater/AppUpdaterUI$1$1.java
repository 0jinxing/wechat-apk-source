package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppUpdaterUI$1$1
  implements DialogInterface.OnClickListener
{
  AppUpdaterUI$1$1(AppUpdaterUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28808);
    ab.d("MicroMsg.AppUpdaterUI", "go to WebView");
    paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("https://weixin.qq.com/m"));
    paramDialogInterface.addFlags(268435456);
    this.xvM.xvL.startActivity(paramDialogInterface);
    AppMethodBeat.o(28808);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.1.1
 * JD-Core Version:    0.6.2
 */