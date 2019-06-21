package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class j$2
  implements bz.a
{
  j$2(j paramj)
  {
  }

  public final void a(final e.a parama)
  {
    AppMethodBeat.i(43119);
    parama = aa.a(parama.eAB.vED);
    ab.d("MicroMsg.SubCoreMall", "receive pay msg: %s", new Object[] { parama });
    j.a(this.ole).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(43118);
        c.cQT();
        c.acG(parama);
        AppMethodBeat.o(43118);
      }
    });
    AppMethodBeat.o(43119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.j.2
 * JD-Core Version:    0.6.2
 */