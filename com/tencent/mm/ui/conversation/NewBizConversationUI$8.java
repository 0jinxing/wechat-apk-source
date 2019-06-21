package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class NewBizConversationUI$8
  implements bf.a
{
  NewBizConversationUI$8(NewBizConversationUI paramNewBizConversationUI, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(34539);
    boolean bool = NewBizConversationUI.m(this.zvm);
    AppMethodBeat.o(34539);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(34540);
    if (this.eiD != null)
      this.eiD.dismiss();
    AppMethodBeat.o(34540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.8
 * JD-Core Version:    0.6.2
 */