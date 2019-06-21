package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.q;

final class VoipVideoFragment$17$1
  implements DialogInterface.OnClickListener
{
  VoipVideoFragment$17$1(VoipVideoFragment.17 param17)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4887);
    q.cJU();
    VoipVideoFragment.c(this.sYp.sYn);
    AppMethodBeat.o(4887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.17.1
 * JD-Core Version:    0.6.2
 */