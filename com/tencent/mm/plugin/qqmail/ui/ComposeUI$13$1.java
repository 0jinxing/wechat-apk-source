package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$13$1
  implements DialogInterface.OnCancelListener
{
  ComposeUI$13$1(ComposeUI.13 param13)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(68185);
    ComposeUI.E(this.pxe.pwY).cdb();
    ComposeUI.E(this.pxe.pwY).pxV = null;
    AppMethodBeat.o(68185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.13.1
 * JD-Core Version:    0.6.2
 */