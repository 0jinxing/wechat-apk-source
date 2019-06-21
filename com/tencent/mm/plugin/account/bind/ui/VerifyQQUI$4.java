package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VerifyQQUI$4
  implements DialogInterface.OnDismissListener
{
  VerifyQQUI$4(VerifyQQUI paramVerifyQQUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13781);
    VerifyQQUI.h(this.guy);
    AppMethodBeat.o(13781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.4
 * JD-Core Version:    0.6.2
 */