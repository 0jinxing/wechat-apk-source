package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallContactUI$4
  implements DialogInterface.OnClickListener
{
  IPCallContactUI$4(IPCallContactUI paramIPCallContactUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22074);
    paramDialogInterface.dismiss();
    this.nBH.finish();
    AppMethodBeat.o(22074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.4
 * JD-Core Version:    0.6.2
 */