package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$8
  implements bf.a
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$8(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(34425);
    boolean bool = EnterpriseConversationUI.EnterpriseConversationFmUI.k(this.zut);
    AppMethodBeat.o(34425);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(34426);
    if (this.eiD != null)
      this.eiD.dismiss();
    AppMethodBeat.o(34426);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.8
 * JD-Core Version:    0.6.2
 */