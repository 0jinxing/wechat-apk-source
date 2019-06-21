package com.tencent.mm.plugin.collect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbj;
import com.tencent.mm.sdk.platformtools.ab;

final class CollectMainUI$15$1
  implements DialogInterface.OnClickListener
{
  CollectMainUI$15$1(CollectMainUI.15 param15)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41269);
    ab.i("MicroMsg.CollectMainUI", "save code from click");
    if (CollectMainUI.d(this.kHs.kHl) != null)
    {
      CollectMainUI.dB(CollectMainUI.d(this.kHs.kHl).username, CollectMainUI.d(this.kHs.kHl).iAb);
      h.pYm.e(15387, new Object[] { Integer.valueOf(2) });
    }
    AppMethodBeat.o(41269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.15.1
 * JD-Core Version:    0.6.2
 */