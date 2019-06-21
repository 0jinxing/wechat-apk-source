package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class r$1$1
  implements DialogInterface.OnCancelListener
{
  r$1$1(r.1 param1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(81362);
    g.Rg().c(this.qhh.qhg.qhf);
    this.qhh.qhg.mzU = null;
    AppMethodBeat.o(81362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.r.1.1
 * JD-Core Version:    0.6.2
 */