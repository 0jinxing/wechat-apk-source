package com.tencent.mm.plugin.webwx.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.ab;

final class WebWXLogoutUI$8$1
  implements DialogInterface.OnCancelListener
{
  WebWXLogoutUI$8$1(WebWXLogoutUI.8 param8, ab paramab)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(26545);
    aw.Rg().c(this.qme);
    if (WebWXLogoutUI.i(this.uLI.uLG) != null)
      WebWXLogoutUI.i(this.uLI.uLG).cancel();
    AppMethodBeat.o(26545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.8.1
 * JD-Core Version:    0.6.2
 */