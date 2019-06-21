package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class ChatFooter$7
  implements View.OnClickListener
{
  ChatFooter$7(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27791);
    if (ChatFooter.i(this.vnX) != null)
      ChatFooter.i(this.vnX).bNK();
    if ((!ChatFooter.m(this.vnX).dkH()) && (ChatFooter.n(this.vnX) != null) && (ChatFooter.n(this.vnX).getVisibility() == 0))
    {
      this.vnX.showVKB();
      AppMethodBeat.o(27791);
    }
    while (true)
    {
      return;
      if (ChatFooter.o(this.vnX))
        this.vnX.AD();
      this.vnX.dkh();
      if (!g.RP().Ry().getBoolean(ac.a.xVy, false))
      {
        g.RP().Ry().set(ac.a.xVy, Boolean.TRUE);
        ChatFooter.p(this.vnX).findViewById(2131822417).setVisibility(8);
      }
      AppMethodBeat.o(27791);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.7
 * JD-Core Version:    0.6.2
 */