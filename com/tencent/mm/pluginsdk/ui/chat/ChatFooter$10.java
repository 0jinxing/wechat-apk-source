package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class ChatFooter$10
  implements View.OnKeyListener
{
  ChatFooter$10(ChatFooter paramChatFooter)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(27794);
    switch (paramKeyEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(27794);
      return false;
      if (((paramInt == 23) || (paramInt == 66)) && (!ChatFooter.v(this.vnX)) && (!ChatFooter.u(this.vnX)))
      {
        ChatFooter.d(this.vnX, true);
        ChatFooter.s(this.vnX).setBackgroundDrawable(a.g(this.vnX.getContext(), 2130840009));
        ChatFooter.s(this.vnX).setText(2131298058);
        if (ChatFooter.i(this.vnX) != null)
          ChatFooter.i(this.vnX).bNJ();
        ChatFooter.s(this.vnX).setContentDescription(this.vnX.getContext().getString(2131298033));
        continue;
        if ((paramInt == 23) || (paramInt == 66))
        {
          ChatFooter.s(this.vnX).setBackgroundDrawable(a.g(this.vnX.getContext(), 2130840820));
          ChatFooter.s(this.vnX).setText(2131298057);
          if (ChatFooter.i(this.vnX) != null)
            ChatFooter.i(this.vnX).bNG();
          ChatFooter.d(this.vnX, false);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.10
 * JD-Core Version:    0.6.2
 */