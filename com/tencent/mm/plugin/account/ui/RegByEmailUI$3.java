package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.z;

final class RegByEmailUI$3
  implements DialogInterface.OnCancelListener
{
  RegByEmailUI$3(RegByEmailUI paramRegByEmailUI, z paramz)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125303);
    g.Rg().c(this.gAR);
    AppMethodBeat.o(125303);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByEmailUI.3
 * JD-Core Version:    0.6.2
 */