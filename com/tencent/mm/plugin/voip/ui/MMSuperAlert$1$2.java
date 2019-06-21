package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSuperAlert$1$2
  implements DialogInterface.OnClickListener
{
  MMSuperAlert$1$2(MMSuperAlert.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4781);
    this.sVW.sVV.finish();
    AppMethodBeat.o(4781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.MMSuperAlert.1.2
 * JD-Core Version:    0.6.2
 */