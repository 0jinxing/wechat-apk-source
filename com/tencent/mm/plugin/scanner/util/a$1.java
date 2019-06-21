package com.tencent.mm.plugin.scanner.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;

public final class a$1
  implements DialogInterface.OnCancelListener
{
  public a$1(a parama, com.tencent.mm.plugin.scanner.a.g paramg)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(81367);
    this.qhi.chO();
    com.tencent.mm.kernel.g.Rg().c(this.qfq);
    AppMethodBeat.o(81367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.a.1
 * JD-Core Version:    0.6.2
 */