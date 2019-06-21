package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallDialUI$4
  implements DialogInterface.OnClickListener
{
  IPCallDialUI$4(IPCallDialUI paramIPCallDialUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22128);
    paramDialogInterface.dismiss();
    this.nCs.finish();
    AppMethodBeat.o(22128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.4
 * JD-Core Version:    0.6.2
 */