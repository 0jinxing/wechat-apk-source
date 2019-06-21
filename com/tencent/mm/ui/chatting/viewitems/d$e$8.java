package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;

final class d$e$8
  implements DialogInterface.OnClickListener
{
  d$e$8(d.e parame, bi parambi, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32851);
    if (this.fku.bAA())
    {
      l.al(this.fku);
      this.zbG.qp(true);
      AppMethodBeat.o(32851);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(32851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.e.8
 * JD-Core Version:    0.6.2
 */