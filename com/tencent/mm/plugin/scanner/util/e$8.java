package com.tencent.mm.plugin.scanner.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.b.n;

final class e$8
  implements DialogInterface.OnCancelListener
{
  e$8(e parame, n paramn)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(81400);
    g.Rg().c(this.mIh);
    if (this.qhD.qhA != null)
      this.qhD.qhA.o(1, null);
    AppMethodBeat.o(81400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e.8
 * JD-Core Version:    0.6.2
 */