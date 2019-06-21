package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class ChatFooter$29
  implements a
{
  ChatFooter$29(ChatFooter paramChatFooter)
  {
  }

  public final void ajv(String paramString)
  {
    AppMethodBeat.i(27820);
    ab.e("MicroMsg.ChatFooter", "hakon onImageReceived, %s", new Object[] { paramString });
    if ((bo.isNullOrNil(ChatFooter.c(this.vnX).getTalkerUserName())) || (bo.isNullOrNil(paramString)))
    {
      ab.e("MicroMsg.ChatFooter", "onImageReceived, error args");
      AppMethodBeat.o(27820);
    }
    while (true)
    {
      return;
      h.a(this.vnX.getContext(), this.vnX.getContext().getString(2131299425), "", new ChatFooter.29.1(this, paramString), new ChatFooter.29.2(this));
      AppMethodBeat.o(27820);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.29
 * JD-Core Version:    0.6.2
 */