package com.tencent.mm.plugin.readerapp.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class b$2
  implements DialogInterface.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(76786);
    h.pYm.e(15413, new Object[] { Integer.valueOf(4), "", "" });
    b.u(this.pES.context, false);
    AppMethodBeat.o(76786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.b.2
 * JD-Core Version:    0.6.2
 */