package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;

final class ChatFooter$6
  implements View.OnClickListener
{
  ChatFooter$6(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27790);
    this.vnX.dkc();
    if ((r.Zf().booleanValue()) && (this.vnX.vnl != null))
    {
      ChatFooter.c localc = this.vnX.vnl;
      paramView = Boolean.TRUE;
      localc.a(paramView, paramView);
    }
    AppMethodBeat.o(27790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.6
 * JD-Core Version:    0.6.2
 */