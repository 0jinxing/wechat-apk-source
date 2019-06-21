package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class AppUpdaterUI$7$1
  implements DialogInterface.OnClickListener
{
  AppUpdaterUI$7$1(AppUpdaterUI.7 param7)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28820);
    paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse(AppUpdaterUI.e(this.xvN.xvL).xvX[0]));
    paramDialogInterface.addFlags(268435456);
    ah.getContext().startActivity(paramDialogInterface);
    AppUpdaterUI.f(this.xvN.xvL);
    AppMethodBeat.o(28820);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.7.1
 * JD-Core Version:    0.6.2
 */