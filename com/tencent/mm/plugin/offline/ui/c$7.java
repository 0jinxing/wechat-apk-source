package com.tencent.mm.plugin.offline.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.walletlock.a.b;

final class c$7
  implements DialogInterface.OnClickListener
{
  c$7(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43477);
    paramDialogInterface = new Intent();
    ((b)g.K(b.class)).b(this.oZs.mActivity, paramDialogInterface);
    AppMethodBeat.o(43477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.c.7
 * JD-Core Version:    0.6.2
 */