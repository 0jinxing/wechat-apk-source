package com.tencent.mm.plugin.wallet_index.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.he;

final class m$3
  implements DialogInterface.OnClickListener
{
  m$3(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48201);
    if (this.tRn.tRi.callback != null)
    {
      this.tRn.tRi.cBX.ret = 1;
      this.tRn.tRi.callback.run();
    }
    AppMethodBeat.o(48201);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.m.3
 * JD-Core Version:    0.6.2
 */