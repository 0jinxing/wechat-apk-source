package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p$5
  implements DialogInterface.OnCancelListener
{
  p$5(p paramp, com.tencent.mm.plugin.scanner.a.g paramg)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(81204);
    com.tencent.mm.kernel.g.Rg().c(this.qfq);
    this.qfp.qet.kj(false);
    this.qfp.qff = false;
    AppMethodBeat.o(81204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.5
 * JD-Core Version:    0.6.2
 */