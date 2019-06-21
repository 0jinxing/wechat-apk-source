package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements Runnable
{
  g$1(g paramg, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26091);
    new i().a(this.sLi.ftf, new f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(26090);
        ab.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymousm.getType()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          g.1.this.sLi.ehi.onSceneEnd(paramAnonymousInt1, paramAnonymousInt2, "", g.1.this.sLi);
          AppMethodBeat.o(26090);
        }
        while (true)
        {
          return;
          g.1.this.sLi.a(g.1.this.sLi.ftf, g.1.this.sLi.ehi);
          AppMethodBeat.o(26090);
        }
      }
    });
    AppMethodBeat.o(26091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.g.1
 * JD-Core Version:    0.6.2
 */