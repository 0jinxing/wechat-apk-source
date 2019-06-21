package com.tencent.mm.ui.bizchat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.l;
import com.tencent.mm.model.aw;

final class BizChatSearchUI$a$1
  implements Runnable
{
  BizChatSearchUI$a$1(BizChatSearchUI.a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30137);
    if (!this.yEW.equals(BizChatSearchUI.a.d(this.yEX)))
      AppMethodBeat.o(30137);
    while (true)
    {
      return;
      l locall = new l(BizChatSearchUI.a.f(this.yEX), this.yEW, 0);
      aw.Rg().a(locall, 0);
      AppMethodBeat.o(30137);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchUI.a.1
 * JD-Core Version:    0.6.2
 */