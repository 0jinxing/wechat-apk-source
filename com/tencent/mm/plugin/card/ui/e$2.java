package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2
  implements DialogInterface.OnClickListener
{
  e$2(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88336);
    paramDialogInterface.dismiss();
    if (this.kjI.kjE != null)
      this.kjI.kjE.bcs();
    AppMethodBeat.o(88336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.2
 * JD-Core Version:    0.6.2
 */