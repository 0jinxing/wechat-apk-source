package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatFooter$2
  implements View.OnLongClickListener
{
  ChatFooter$2(ChatFooter paramChatFooter, Context paramContext)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    boolean bool = true;
    AppMethodBeat.i(27787);
    paramView = com.tencent.mm.pluginsdk.f.a.dhS();
    h.pYm.k(1014L, 0L, 1L);
    com.tencent.mm.plugin.c.a.ask();
    if (com.tencent.mm.plugin.c.a.x(paramView))
    {
      h.pYm.k(1014L, 1L, 1L);
      ab.i("MicroMsg.ChatFooter", "anti paste text %s", new Object[] { paramView });
      AppMethodBeat.o(27787);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(27787);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.2
 * JD-Core Version:    0.6.2
 */