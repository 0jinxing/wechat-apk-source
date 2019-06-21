package com.tencent.mm.pluginsdk.ui.chat;

import android.os.Message;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.o;

final class ChatFooter$15 extends ak
{
  ChatFooter$15(ChatFooter paramChatFooter)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27804);
    super.handleMessage(paramMessage);
    if (ChatFooter.G(this.vnX) != null)
    {
      ChatFooter.G(this.vnX).dismiss();
      ChatFooter.s(this.vnX).setBackgroundDrawable(a.g(this.vnX.getContext(), 2130840820));
      ChatFooter.s(this.vnX).setEnabled(true);
    }
    AppMethodBeat.o(27804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.15
 * JD-Core Version:    0.6.2
 */