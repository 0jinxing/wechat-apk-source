package com.tencent.mm.pluginsdk.ui.chat;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatFooter$32
  implements View.OnTouchListener
{
  ChatFooter$32(ChatFooter paramChatFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(27823);
    this.vnX.setToSendTextColor(true);
    ChatFooter.a(this.vnX, 3);
    if (ChatFooter.i(this.vnX) != null)
      ChatFooter.i(this.vnX).I(paramMotionEvent);
    ChatFooter.j(this.vnX);
    AppMethodBeat.o(27823);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.32
 * JD-Core Version:    0.6.2
 */