package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallTalkUI$3
  implements DialogInterface.OnClickListener
{
  IPCallTalkUI$3(IPCallTalkUI paramIPCallTalkUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22362);
    paramDialogInterface.dismiss();
    this.nFY.finish();
    AppMethodBeat.o(22362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.3
 * JD-Core Version:    0.6.2
 */