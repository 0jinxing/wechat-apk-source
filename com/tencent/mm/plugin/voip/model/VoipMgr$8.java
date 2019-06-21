package com.tencent.mm.plugin.voip.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipMgr$8
  implements DialogInterface.OnClickListener
{
  VoipMgr$8(VoipMgr paramVoipMgr)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4467);
    this.sSn.cJN();
    AppMethodBeat.o(4467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.8
 * JD-Core Version:    0.6.2
 */