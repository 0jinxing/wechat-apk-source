package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class SelectConversationUI$20
  implements q.a
{
  SelectConversationUI$20(SelectConversationUI paramSelectConversationUI, Intent paramIntent)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(35143);
    this.zKj.aqX();
    if (paramBoolean)
    {
      this.val$intent.putExtra("custom_send_text", paramString);
      SelectConversationUI.a(this.zKj, -1, this.val$intent);
      this.zKj.finish();
    }
    AppMethodBeat.o(35143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.20
 * JD-Core Version:    0.6.2
 */