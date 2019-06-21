package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.h;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.sdk.platformtools.ab;

final class c$7
  implements Runnable
{
  c$7(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31198);
    long l = System.currentTimeMillis();
    if ((this.yOi.mgP) && (this.yOi.yDI != null) && (this.yOi.cgL.sRl != null))
    {
      c.f(this.yOi);
      z.afe();
      com.tencent.mm.aj.a.c localc = this.yOi.yDI;
      if (com.tencent.mm.kernel.a.jP(g.RN().eIV))
      {
        String str = String.format("%s;%s;%d", new Object[] { localc.field_brandUserName, localc.field_bizChatServId, Long.valueOf(System.currentTimeMillis() / 1000L) });
        y.b(localc.field_brandUserName, 7, "EnterpriseChatStatus", str);
        ab.d("MicroMsg.BizChatStatusNotifyService", "enterChat:arg:%s", new Object[] { str });
      }
      if (this.yOi.yNZ)
      {
        if (this.yOi.yDI.afh())
        {
          z.aeZ();
          h.aH(this.yOi.yDI.field_bizChatServId, this.yOi.cgL.sRl.field_username);
        }
      }
      else
        c.g(this.yOi);
    }
    while (true)
    {
      ab.d("MicroMsg.ChattingUI.BizComponent", "willen test  updateBizChatInfo use time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(31198);
      return;
      e.f(this.yOi.yDI);
      break;
      ab.i("MicroMsg.ChattingUI.BizComponent", "bizChatInfo:%s  talker:%s", new Object[] { this.yOi.yDI, this.yOi.cgL.sRl });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.7
 * JD-Core Version:    0.6.2
 */