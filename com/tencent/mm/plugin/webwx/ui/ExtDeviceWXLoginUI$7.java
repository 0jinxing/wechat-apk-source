package com.tencent.mm.plugin.webwx.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.webwx.a.c;

final class ExtDeviceWXLoginUI$7
  implements DialogInterface.OnCancelListener
{
  ExtDeviceWXLoginUI$7(ExtDeviceWXLoginUI paramExtDeviceWXLoginUI, c paramc)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(26527);
    aw.Rg().c(this.uLw);
    if (ExtDeviceWXLoginUI.e(this.uLu) != null)
      ExtDeviceWXLoginUI.e(this.uLu).cancel();
    AppMethodBeat.o(26527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.7
 * JD-Core Version:    0.6.2
 */