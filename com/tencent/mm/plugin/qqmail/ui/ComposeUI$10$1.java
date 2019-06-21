package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$10$1
  implements DialogInterface.OnClickListener
{
  ComposeUI$10$1(ComposeUI.10 param10)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(68178);
    this.pxc.pwY.setResult(0);
    this.pxc.pwY.finish();
    AppMethodBeat.o(68178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.10.1
 * JD-Core Version:    0.6.2
 */