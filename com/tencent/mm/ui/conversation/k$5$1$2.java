package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class k$5$1$2
  implements DialogInterface.OnClickListener
{
  k$5$1$2(k.5.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34467);
    h.pYm.a(614L, 57L, 1L, false);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(34467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.5.1.2
 * JD-Core Version:    0.6.2
 */