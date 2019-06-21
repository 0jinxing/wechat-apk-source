package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.d.a;

final class ar$2
  implements q.a
{
  ar$2(ar paramar, WXMediaMessage paramWXMediaMessage, f paramf)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(31075);
    if (paramBoolean)
    {
      paramString = null;
      if (this.rBJ.getType() == 8)
        if (this.rBJ.thumbData == null)
        {
          ab.e("MicroMsg.WXAppMessageReceiver", "code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
          AppMethodBeat.o(31075);
        }
    }
    while (true)
    {
      return;
      String str = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(ar.c(this.yMR).getContext(), this.rBJ, this.yMQ.field_appId);
      paramString = str;
      if (str == null)
      {
        ab.v("MicroMsg.WXAppMessageReceiver", "sendEmoji Fail cause emojiconmd5 is null");
        AppMethodBeat.o(31075);
      }
      else
      {
        bv.aaq().c(27, new Object[] { Integer.valueOf(1) });
        ab.v("MicroMsg.WXAppMessageReceiver", "onDialogClick, messageAction = %s, messageExt = %s", new Object[] { this.rBJ.messageAction, this.rBJ.messageExt });
        l.a(this.rBJ, this.yMQ.field_appId, this.yMQ.field_appName, ar.d(this.yMR).getTalkerUserName(), 1, paramString);
        AppMethodBeat.o(31075);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ar.2
 * JD-Core Version:    0.6.2
 */