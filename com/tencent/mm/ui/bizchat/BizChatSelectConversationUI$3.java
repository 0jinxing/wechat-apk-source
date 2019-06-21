package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class BizChatSelectConversationUI$3
  implements q.a
{
  BizChatSelectConversationUI$3(BizChatSelectConversationUI paramBizChatSelectConversationUI, String paramString, long paramLong)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(30176);
    if (paramBoolean)
    {
      paramString = new Intent();
      paramString.putExtra("enterprise_biz_name", this.fwC);
      paramString.putExtra("key_biz_chat_id", this.fkE);
      paramString.putExtra("key_is_biz_chat", true);
      this.yFi.setResult(-1, paramString);
      this.yFi.finish();
    }
    AppMethodBeat.o(30176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSelectConversationUI.3
 * JD-Core Version:    0.6.2
 */