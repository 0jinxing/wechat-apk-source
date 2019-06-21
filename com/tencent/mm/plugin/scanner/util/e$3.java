package com.tencent.mm.plugin.scanner.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;

final class e$3
  implements DialogInterface.OnCancelListener
{
  e$3(e parame, h paramh)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(81395);
    g.Rg().c(this.qhE);
    if (this.qhD.qhA != null)
      this.qhD.qhA.o(1, null);
    AppMethodBeat.o(81395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e.3
 * JD-Core Version:    0.6.2
 */