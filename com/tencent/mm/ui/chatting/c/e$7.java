package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.d.a;
import java.util.Map;

final class e$7
  implements k.a
{
  e$7(e parame)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(31250);
    ab.v("MicroMsg.ChattingUI.ChatroomComponent", "roommember watcher notify ".concat(String.valueOf(paramString)));
    if (((d)this.yOy.cgL.aF(d.class)).dDn())
    {
      e.a(this.yOy, com.tencent.mm.aj.a.e.c(((d)this.yOy.cgL.aF(d.class)).dDk()));
      if (!this.yOy.yOr)
        break label153;
      n.f(this.yOy.cgL.getTalkerUserName(), this.yOy.yOs);
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString))
        this.yOy.cgL.aWv();
      AppMethodBeat.o(31250);
      return;
      e.a(this.yOy, n.ms(this.yOy.cgL.getTalkerUserName()));
      break;
      label153: this.yOy.yOs.clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.e.7
 * JD-Core Version:    0.6.2
 */