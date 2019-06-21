package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class BizChatSelectConversationUI$2
  implements q.a
{
  BizChatSelectConversationUI$2(BizChatSelectConversationUI paramBizChatSelectConversationUI, String paramString, long paramLong)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(30175);
    if (paramBoolean)
    {
      paramString = new Intent();
      paramString.putExtra("enterprise_biz_name", this.fwC);
      paramString.putExtra("key_biz_chat_id", this.fkE);
      paramString.putExtra("key_is_biz_chat", true);
      this.yFi.setResult(-1, paramString);
      this.yFi.finish();
    }
    AppMethodBeat.o(30175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSelectConversationUI.2
 * JD-Core Version:    0.6.2
 */