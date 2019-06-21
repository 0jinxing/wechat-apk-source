package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.chatting.d.a;

final class d$1
  implements q.a
{
  d$1(d paramd, String paramString1, String paramString2, boolean paramBoolean)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(31237);
    this.yOq.cgL.aqX();
    if (paramBoolean)
    {
      g.bOk().q(this.fwC, this.yOo, this.yOp);
      g.bOk().eZ(paramString, this.yOo);
    }
    AppMethodBeat.o(31237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.d.1
 * JD-Core Version:    0.6.2
 */