package com.tencent.mm.plugin.offline.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.a.s.g;
import com.tencent.mm.sdk.platformtools.ab;

final class c$11
  implements DialogInterface.OnClickListener
{
  c$11(c paramc, s.g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43481);
    paramDialogInterface.dismiss();
    if (this.oZs.oZn != null)
      this.oZs.oZn.e(1, this.oZt.id, "", this.oZt.cBT);
    ab.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    AppMethodBeat.o(43481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.c.11
 * JD-Core Version:    0.6.2
 */