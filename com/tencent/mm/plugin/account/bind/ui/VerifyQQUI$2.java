package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VerifyQQUI$2
  implements DialogInterface.OnClickListener
{
  VerifyQQUI$2(VerifyQQUI paramVerifyQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13778);
    VerifyQQUI.b(this.guy);
    AppMethodBeat.o(13778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.2
 * JD-Core Version:    0.6.2
 */