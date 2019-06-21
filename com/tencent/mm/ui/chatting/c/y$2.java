package com.tencent.mm.ui.chatting.c;

import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;

final class y$2
  implements Runnable
{
  y$2(y paramy)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31552);
    if (this.yQS.cgL != null)
    {
      o localo = (o)this.yQS.cgL.aF(o.class);
      localo.dDX().setLbsMode(false);
      localo.dDX().vni = false;
      localo.dDX().dke();
      ChatFooter localChatFooter = localo.dDX();
      if (localChatFooter.vmS != null)
        localChatFooter.vmS.setVisibility(0);
      localChatFooter = localo.dDX();
      if (localChatFooter.vmP != null)
        localChatFooter.vmP.setVisibility(0);
    }
    AppMethodBeat.o(31552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.y.2
 * JD-Core Version:    0.6.2
 */