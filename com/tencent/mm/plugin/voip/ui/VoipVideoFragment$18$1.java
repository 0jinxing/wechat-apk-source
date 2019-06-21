package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.q;
import com.tencent.mm.sdk.platformtools.at;

final class VoipVideoFragment$18$1
  implements DialogInterface.OnClickListener
{
  VoipVideoFragment$18$1(VoipVideoFragment.18 param18)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4890);
    if (!at.is2G(this.sYq.sYn.getActivity()))
      q.cJU();
    VoipVideoFragment.e(this.sYq.sYn);
    AppMethodBeat.o(4890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.18.1
 * JD-Core Version:    0.6.2
 */