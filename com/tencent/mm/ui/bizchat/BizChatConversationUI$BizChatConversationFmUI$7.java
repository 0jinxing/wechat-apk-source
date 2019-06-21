package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatConversationUI$BizChatConversationFmUI$7
  implements DialogInterface.OnCancelListener
{
  BizChatConversationUI$BizChatConversationFmUI$7(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30063);
    BizChatConversationUI.BizChatConversationFmUI.n(this.yEp);
    AppMethodBeat.o(30063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.7
 * JD-Core Version:    0.6.2
 */