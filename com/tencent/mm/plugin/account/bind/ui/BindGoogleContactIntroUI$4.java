package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class BindGoogleContactIntroUI$4
  implements DialogInterface.OnCancelListener
{
  BindGoogleContactIntroUI$4(BindGoogleContactIntroUI paramBindGoogleContactIntroUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13336);
    g.Rg().c(BindGoogleContactIntroUI.c(this.gqt));
    AppMethodBeat.o(13336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI.4
 * JD-Core Version:    0.6.2
 */