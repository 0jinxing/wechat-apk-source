package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$11
  implements c.a.b
{
  SelectConversationUI$11(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35135);
    Intent localIntent = new Intent();
    localIntent.setClassName(this.zKj.mController.ylL, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
    localIntent.putExtra("app_msg_id", SelectConversationUI.i(this.zKj));
    localIntent.putExtra("app_show_share", false);
    this.zKj.startActivity(localIntent);
    AppMethodBeat.o(35135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.11
 * JD-Core Version:    0.6.2
 */