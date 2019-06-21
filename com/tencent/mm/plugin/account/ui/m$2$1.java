package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class m$2$1
  implements DialogInterface.OnCancelListener
{
  m$2$1(m.2 param2, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125235);
    g.Rg().c(this.gBH);
    g.Rg().b(701, this.gEH.gEG);
    g.Rg().b(252, this.gEH.gEG);
    AppMethodBeat.o(125235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.m.2.1
 * JD-Core Version:    0.6.2
 */