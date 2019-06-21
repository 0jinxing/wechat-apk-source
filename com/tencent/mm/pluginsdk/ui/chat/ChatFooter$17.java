package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.o;

final class ChatFooter$17
  implements Runnable
{
  ChatFooter$17(ChatFooter paramChatFooter)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27806);
    if (ChatFooter.G(this.vnX) != null)
    {
      ChatFooter.G(this.vnX).dismiss();
      ChatFooter.H(this.vnX).setVisibility(0);
      ChatFooter.I(this.vnX).setVisibility(8);
      ChatFooter.J(this.vnX).setVisibility(8);
      ChatFooter.x(this.vnX).setVisibility(8);
      ChatFooter.w(this.vnX).setVisibility(0);
    }
    ChatFooter.s(this.vnX).setBackgroundDrawable(a.g(this.vnX.getContext(), 2130840820));
    ChatFooter.s(this.vnX).setText(2131298057);
    ChatFooter.d(this.vnX, false);
    ChatFooter.c(this.vnX, false);
    AppMethodBeat.o(27806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.17
 * JD-Core Version:    0.6.2
 */