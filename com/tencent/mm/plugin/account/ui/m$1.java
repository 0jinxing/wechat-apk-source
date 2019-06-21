package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class m$1
  implements DialogInterface.OnCancelListener
{
  m$1(m paramm, com.tencent.mm.ai.m paramm1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125234);
    g.Rg().c(this.gEF);
    g.Rg().b(145, this.gEG);
    g.Rg().b(132, this.gEG);
    AppMethodBeat.o(125234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.m.1
 * JD-Core Version:    0.6.2
 */