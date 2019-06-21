package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatFooter$14
  implements n.a
{
  ChatFooter$14(ChatFooter paramChatFooter)
  {
  }

  public final void ajt(String paramString)
  {
    AppMethodBeat.i(27802);
    if (ChatFooter.i(this.vnX) != null)
      ChatFooter.i(this.vnX).Qu(paramString);
    while (true)
    {
      ChatFooter.F(this.vnX).reset();
      AppMethodBeat.o(27802);
      return;
      ab.e("MicroMsg.ChatFooter", "onSendMsg listener is null !!!");
    }
  }

  public final void djr()
  {
    AppMethodBeat.i(27801);
    ChatFooter.E(this.vnX);
    AppMethodBeat.o(27801);
  }

  public final void oz(boolean paramBoolean)
  {
    AppMethodBeat.i(27803);
    if (paramBoolean)
    {
      if (this.vnX.vnm == null)
        break label81;
      ab.d("MicroMsg.ChatFooter", "onVoiceStart start");
      this.vnX.vnm.i(Boolean.TRUE);
      AppMethodBeat.o(27803);
    }
    while (true)
    {
      return;
      if (this.vnX.vnm != null)
      {
        ab.d("MicroMsg.ChatFooter", "onVoiceStart end");
        this.vnX.vnm.i(Boolean.FALSE);
      }
      label81: AppMethodBeat.o(27803);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.14
 * JD-Core Version:    0.6.2
 */