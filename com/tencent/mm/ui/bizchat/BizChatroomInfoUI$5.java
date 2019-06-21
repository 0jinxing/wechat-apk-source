package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.n;
import com.tencent.mm.model.aw;

final class BizChatroomInfoUI$5
  implements DialogInterface.OnCancelListener
{
  BizChatroomInfoUI$5(BizChatroomInfoUI paramBizChatroomInfoUI, n paramn)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30201);
    aw.Rg().c(this.yFj);
    AppMethodBeat.o(30201);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.5
 * JD-Core Version:    0.6.2
 */