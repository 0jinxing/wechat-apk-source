package com.tencent.mm.plugin.masssend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MassSendMsgUI$2
  implements DialogInterface.OnClickListener
{
  MassSendMsgUI$2(MassSendMsgUI paramMassSendMsgUI, Intent paramIntent)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22825);
    MassSendMsgUI.b(this.opf, this.val$data);
    AppMethodBeat.o(22825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.2
 * JD-Core Version:    0.6.2
 */