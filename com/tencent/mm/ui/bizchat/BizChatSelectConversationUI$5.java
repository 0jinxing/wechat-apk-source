package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.n;
import com.tencent.mm.model.aw;

final class BizChatSelectConversationUI$5
  implements DialogInterface.OnCancelListener
{
  BizChatSelectConversationUI$5(BizChatSelectConversationUI paramBizChatSelectConversationUI, n paramn)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30178);
    aw.Rg().c(this.yFj);
    AppMethodBeat.o(30178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSelectConversationUI.5
 * JD-Core Version:    0.6.2
 */