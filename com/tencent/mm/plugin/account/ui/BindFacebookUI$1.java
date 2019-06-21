package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class BindFacebookUI$1
  implements DialogInterface.OnCancelListener
{
  BindFacebookUI$1(BindFacebookUI paramBindFacebookUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124725);
    if (BindFacebookUI.a(this.gAv) != null)
      g.Rg().c(BindFacebookUI.a(this.gAv));
    AppMethodBeat.o(124725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.BindFacebookUI.1
 * JD-Core Version:    0.6.2
 */