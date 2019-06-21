package com.tencent.mm.plugin.game.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements DialogInterface.OnClickListener
{
  c$2(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(111699);
    h.pYm.e(14217, new Object[] { this.neo.mVZ.field_appId, Integer.valueOf(6), "", this.neo.mVZ.dna, Integer.valueOf(2) });
    paramDialogInterface.dismiss();
    ab.i("MicroMsg.CommonGameClickLinstener", "addDownloadTask not wifi, user cancel");
    AppMethodBeat.o(111699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.c.2
 * JD-Core Version:    0.6.2
 */