package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

final class ChatFooter$13
  implements AppPanel.b
{
  ChatFooter$13(ChatFooter paramChatFooter)
  {
  }

  public final void djW()
  {
    AppMethodBeat.i(27800);
    boolean bool = b.a(ChatFooter.b(this.vnX), "android.permission.RECORD_AUDIO", 80, "", "");
    ab.i("MicroMsg.ChatFooter", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), ChatFooter.b(this.vnX) });
    if (!bool)
      AppMethodBeat.o(27800);
    while (true)
    {
      return;
      int i = aw.Rg().acS();
      if ((i == 4) || (i == 6))
      {
        ChatFooter.D(this.vnX);
        AppMethodBeat.o(27800);
      }
      else
      {
        if ((ChatFooter.k(this.vnX) == null) || (!ChatFooter.k(this.vnX).isShowing()))
          ChatFooter.a(this.vnX, h.g(this.vnX.getContext(), 2131304445, 2131297061));
        AppMethodBeat.o(27800);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.13
 * JD-Core Version:    0.6.2
 */