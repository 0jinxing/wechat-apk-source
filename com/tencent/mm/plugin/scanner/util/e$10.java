package com.tencent.mm.plugin.scanner.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$10
  implements DialogInterface.OnClickListener
{
  e$10(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(81402);
    if (this.qhD.qhA != null)
      this.qhD.qhA.o(1, null);
    AppMethodBeat.o(81402);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e.10
 * JD-Core Version:    0.6.2
 */