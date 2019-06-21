package com.tencent.mm.plugin.brandservice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.d;

final class ReceiveTemplateMsgMgrUI$2
  implements DialogInterface.OnCancelListener
{
  ReceiveTemplateMsgMgrUI$2(ReceiveTemplateMsgMgrUI paramReceiveTemplateMsgMgrUI, d paramd)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(14022);
    g.Rg().c(this.jMw);
    AppMethodBeat.o(14022);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI.2
 * JD-Core Version:    0.6.2
 */