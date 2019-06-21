package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e.a;
import com.tencent.mm.aj.e.a.a;
import com.tencent.mm.aj.e.a.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.c.b.o;

final class c$10
  implements e.a
{
  c$10(c paramc)
  {
  }

  public final void a(final e.a.b paramb)
  {
    AppMethodBeat.i(31202);
    final ad localad;
    if ((paramb != null) && (paramb.fwk == e.a.a.fwi) && (paramb.fuO != null) && (paramb.fuO.equals(this.yOi.cgL.getTalkerUserName())))
    {
      aw.ZK();
      localad = com.tencent.mm.model.c.XM().aoO(paramb.fuO);
      if ((localad == null) || ((int)localad.ewQ == 0))
      {
        ab.i("MicroMsg.ChattingUI.BizComponent", "Get contact from db return null.(username : %s)", new Object[] { paramb.fuO });
        AppMethodBeat.o(31202);
      }
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(31201);
          if ((c.d(c.10.this.yOi)) && (paramb.fuO.equals(c.10.this.yOi.cgL.getTalkerUserName())))
          {
            ab.i("MicroMsg.ChattingUI.BizComponent", "try to refresh footer.");
            c.a(c.10.this.yOi, f.qX(paramb.fuO));
            if ((c.10.this.yOi.cgL != null) && (c.e(c.10.this.yOi)))
              ((o)c.10.this.yOi.cgL.aF(o.class)).ae(localad);
          }
          AppMethodBeat.o(31201);
        }
      });
      AppMethodBeat.o(31202);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.10
 * JD-Core Version:    0.6.2
 */