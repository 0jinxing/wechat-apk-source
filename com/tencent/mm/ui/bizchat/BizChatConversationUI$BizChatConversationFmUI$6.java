package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.h;
import com.tencent.mm.aj.a.n;
import com.tencent.mm.aj.z;

final class BizChatConversationUI$BizChatConversationFmUI$6
  implements DialogInterface.OnCancelListener
{
  BizChatConversationUI$BizChatConversationFmUI$6(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI, n paramn)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(30062);
    z.aeZ();
    h.f(this.yEr);
    AppMethodBeat.o(30062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.6
 * JD-Core Version:    0.6.2
 */