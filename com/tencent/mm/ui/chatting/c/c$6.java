package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.x;
import com.tencent.mm.model.aw;

final class c$6
  implements DialogInterface.OnCancelListener
{
  c$6(c paramc, x paramx)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(31197);
    aw.Rg().c(this.yFq);
    AppMethodBeat.o(31197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.6
 * JD-Core Version:    0.6.2
 */