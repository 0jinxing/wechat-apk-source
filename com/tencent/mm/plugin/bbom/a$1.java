package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dk;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.lk;
import com.tencent.mm.g.a.su;
import com.tencent.mm.model.bh;
import com.tencent.mm.modelmulti.n;
import com.tencent.mm.modelmulti.o;
import com.tencent.mm.modelsimple.c;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18227);
    bh.oG("ver" + d.vxo);
    am.bYL().addAll(com.tencent.mm.plugin.s.a.bYJ().dhD());
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.xxA;
    if (locala == null)
    {
      ab.e("MicroMsg.BigBallAuthHandle", "EventPool is null.");
      AppMethodBeat.o(18227);
    }
    while (true)
    {
      return;
      Object localObject = new hi();
      ((hi)localObject).cCe.cCf = true;
      locala.m((b)localObject);
      localObject = new su();
      ((su)localObject).cOT.cOU = true;
      locala.m((b)localObject);
      locala.m(new dk());
      locala.m(new lk());
      c.cQ(true);
      n.ahW().lN(3);
      ab.i("MicroMsg.BigBallAuthHandle", "summerbadcr triggerSync bgfg after manual auth");
      AppMethodBeat.o(18227);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(18228);
    String str = super.toString() + "|onGYNetEnd2";
    AppMethodBeat.o(18228);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.a.1
 * JD-Core Version:    0.6.2
 */