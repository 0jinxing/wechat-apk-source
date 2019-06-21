package com.tencent.mm.ui.chatting.c;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;

final class n$1
  implements Runnable
{
  n$1(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31387);
    n.1.1 local1 = new n.1.1(this);
    if (this.yPy.cgL.getListView() != null)
      this.yPy.cgL.getListView().setOnDragListener(local1);
    ChatFooter localChatFooter = ((o)this.yPy.cgL.aF(o.class)).dDX();
    if (localChatFooter != null)
    {
      localChatFooter.setOnDragListener(local1);
      localChatFooter.setEditTextOnDragListener(local1);
    }
    AppMethodBeat.o(31387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.n.1
 * JD-Core Version:    0.6.2
 */