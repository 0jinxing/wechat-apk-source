package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.v;

final class ComposeUI$11$1
  implements DialogInterface.OnCancelListener
{
  ComposeUI$11$1(ComposeUI.11 param11)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(68180);
    ComposeUI.E(this.pxd.pwY).cdb();
    ComposeUI.E(this.pxd.pwY).pxV = null;
    ac.ccC().cancel(ComposeUI.F(this.pxd.pwY));
    AppMethodBeat.o(68180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.11.1
 * JD-Core Version:    0.6.2
 */