package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class SimpleLoginUI$6$1
  implements DialogInterface.OnCancelListener
{
  SimpleLoginUI$6$1(SimpleLoginUI.6 param6, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125601);
    g.Rg().c(this.gBH);
    AppMethodBeat.o(125601);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.6.1
 * JD-Core Version:    0.6.2
 */