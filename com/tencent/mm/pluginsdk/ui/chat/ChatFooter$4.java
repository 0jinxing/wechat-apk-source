package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.a.c;

final class ChatFooter$4
  implements View.OnClickListener
{
  ChatFooter$4(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    try
    {
      AppMethodBeat.i(27789);
      paramView = ChatFooter.a(this.vnX).getText().toString();
      ab.i("MicroMsg.ChatFooter", "send msg onClick");
      if ((paramView.trim().length() == 0) && (paramView.length() != 0))
      {
        ab.d("MicroMsg.ChatFooter", "empty message cant be sent");
        if ((ChatFooter.k(this.vnX) != null) && (ChatFooter.k(this.vnX).isShowing()))
          break label173;
        ChatFooter.a(this.vnX, h.g(this.vnX.getContext(), 2131298089, 2131297061));
        AppMethodBeat.o(27789);
      }
      while (true)
      {
        return;
        ChatFooter.b(this.vnX, paramView.length());
        if ((ChatFooter.i(this.vnX) != null) && (ChatFooter.i(this.vnX).Qu(paramView)))
        {
          ChatFooter.a(this.vnX).clearComposingText();
          ChatFooter.a(this.vnX).setText("");
          ChatFooter.l(this.vnX);
        }
        label173: AppMethodBeat.o(27789);
      }
    }
    finally
    {
    }
    throw paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.4
 * JD-Core Version:    0.6.2
 */