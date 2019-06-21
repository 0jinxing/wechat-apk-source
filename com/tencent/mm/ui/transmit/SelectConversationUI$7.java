package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$7
  implements c.a.b
{
  SelectConversationUI$7(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35131);
    Intent localIntent = new Intent(this.zKj.mController.ylL, RetransmitPreviewUI.class);
    localIntent.putExtra("Retr_Msg_content", SelectConversationUI.h(this.zKj));
    this.zKj.startActivity(localIntent);
    b.hL(this.zKj.mController.ylL);
    AppMethodBeat.o(35131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.7
 * JD-Core Version:    0.6.2
 */