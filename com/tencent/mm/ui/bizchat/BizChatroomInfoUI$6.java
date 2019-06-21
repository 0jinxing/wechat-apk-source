package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.x;
import com.tencent.mm.model.aw;

final class BizChatroomInfoUI$6
  implements DialogInterface.OnCancelListener
{
  BizChatroomInfoUI$6(BizChatroomInfoUI paramBizChatroomInfoUI, x paramx)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30202);
    aw.Rg().c(this.yFq);
    AppMethodBeat.o(30202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.6
 * JD-Core Version:    0.6.2
 */