package com.tencent.mm.pluginsdk.ui.chat;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatFooter$31
  implements TextView.OnEditorActionListener
{
  ChatFooter$31(ChatFooter paramChatFooter)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(27822);
    boolean bool;
    if ((paramInt == 4) || ((paramInt == 0) && (ChatFooter.g(this.vnX))))
    {
      ChatFooter.h(this.vnX).performClick();
      bool = true;
      AppMethodBeat.o(27822);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27822);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.31
 * JD-Core Version:    0.6.2
 */