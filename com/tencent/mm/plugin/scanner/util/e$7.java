package com.tencent.mm.plugin.scanner.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.f;

final class e$7
  implements DialogInterface.OnCancelListener
{
  e$7(e parame, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(81399);
    g.Rg().c(this.mIc);
    if (this.qhD.qhA != null)
      this.qhD.qhA.o(1, null);
    AppMethodBeat.o(81399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e.7
 * JD-Core Version:    0.6.2
 */