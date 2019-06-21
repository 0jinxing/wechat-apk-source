package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatFooter$19
  implements View.OnClickListener
{
  ChatFooter$19(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27810);
    if (ChatFooter.L(this.vnX) != null)
      ChatFooter.L(this.vnX).oS(false);
    AppMethodBeat.o(27810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.19
 * JD-Core Version:    0.6.2
 */