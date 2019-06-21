package com.tencent.mm.plugin.wallet_index.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mf;

final class m$4
  implements DialogInterface.OnClickListener
{
  m$4(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48202);
    if (this.tRn.tRj.callback != null)
    {
      this.tRn.tRj.cIa.ret = 1;
      this.tRn.tRj.callback.run();
    }
    AppMethodBeat.o(48202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.m.4
 * JD-Core Version:    0.6.2
 */