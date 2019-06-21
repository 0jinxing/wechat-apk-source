package com.tencent.mm.plugin.offline;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;

final class h$1$2
  implements DialogInterface.OnClickListener
{
  h$1$2(h.1 param1, MMActivity paramMMActivity, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43325);
    com.tencent.mm.pluginsdk.wallet.h.aj(this.icV, this.oXq);
    this.oXp.oXo.a(this.icV, 0, h.m(this.oXp.oXo));
    AppMethodBeat.o(43325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.h.1.2
 * JD-Core Version:    0.6.2
 */