package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class RegByMobileRegAIOUI$16
  implements DialogInterface.OnCancelListener
{
  RegByMobileRegAIOUI$16(RegByMobileRegAIOUI paramRegByMobileRegAIOUI, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125358);
    g.Rg().c(this.gGf);
    AppMethodBeat.o(125358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.16
 * JD-Core Version:    0.6.2
 */