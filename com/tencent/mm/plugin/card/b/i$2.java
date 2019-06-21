package com.tencent.mm.plugin.card.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$2
  implements DialogInterface.OnClickListener
{
  i$2(i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(87702);
    this.kbq.kbg = true;
    i.a(this.kbq.kaE, new byte[0], -85.0F, -1000.0F, 0, false, true);
    AppMethodBeat.o(87702);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.i.2
 * JD-Core Version:    0.6.2
 */