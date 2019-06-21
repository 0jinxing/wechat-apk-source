package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2
  implements DialogInterface.OnClickListener
{
  c$2(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35212);
    paramDialogInterface = this.zKv;
    if (paramDialogInterface.gud != null)
    {
      paramDialogInterface.gud.dismiss();
      paramDialogInterface.gud = null;
    }
    paramDialogInterface.zKu.dKi();
    AppMethodBeat.o(35212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.c.2
 * JD-Core Version:    0.6.2
 */