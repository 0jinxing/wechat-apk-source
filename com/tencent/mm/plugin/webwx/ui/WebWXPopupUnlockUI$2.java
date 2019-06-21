package com.tencent.mm.plugin.webwx.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebWXPopupUnlockUI$2
  implements DialogInterface.OnDismissListener
{
  WebWXPopupUnlockUI$2(WebWXPopupUnlockUI paramWebWXPopupUnlockUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(26569);
    this.uLJ.finish();
    AppMethodBeat.o(26569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI.2
 * JD-Core Version:    0.6.2
 */