package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ad;

final class RegSetInfoUI$15$1
  implements DialogInterface.OnCancelListener
{
  RegSetInfoUI$15$1(RegSetInfoUI.15 param15, ad paramad)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125521);
    g.Rg().c(this.gHP);
    g.Rg().b(429, this.gHQ.gHM);
    AppMethodBeat.o(125521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.15.1
 * JD-Core Version:    0.6.2
 */