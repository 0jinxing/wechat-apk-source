package com.tencent.mm.plugin.qmessage.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$6
  implements DialogInterface.OnClickListener
{
  b$6(b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24107);
    b.u(this.pta.context, false);
    AppMethodBeat.o(24107);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.b.6
 * JD-Core Version:    0.6.2
 */