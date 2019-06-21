package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatSelectConversationUI$6
  implements DialogInterface.OnCancelListener
{
  BizChatSelectConversationUI$6(BizChatSelectConversationUI paramBizChatSelectConversationUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30179);
    this.yFi.finish();
    AppMethodBeat.o(30179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSelectConversationUI.6
 * JD-Core Version:    0.6.2
 */