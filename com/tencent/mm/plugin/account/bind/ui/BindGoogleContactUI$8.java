package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class BindGoogleContactUI$8
  implements DialogInterface.OnCancelListener
{
  BindGoogleContactUI$8(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13355);
    BindGoogleContactUI.f(this.gqC);
    if (BindGoogleContactUI.g(this.gqC) != null)
      g.Rg().c(BindGoogleContactUI.g(this.gqC));
    AppMethodBeat.o(13355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.8
 * JD-Core Version:    0.6.2
 */