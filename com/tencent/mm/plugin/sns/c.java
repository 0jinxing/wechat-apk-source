package com.tencent.mm.plugin.sns;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.a.fo.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends com.tencent.mm.sdk.b.c<fo>
{
  public c()
  {
    AppMethodBeat.i(35600);
    this.xxI = fo.class.getName().hashCode();
    AppMethodBeat.o(35600);
  }

  private boolean a(fo paramfo)
  {
    boolean bool = true;
    AppMethodBeat.i(35601);
    if (!(paramfo instanceof fo))
    {
      ab.f("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "mismatched event");
      bool = false;
      AppMethodBeat.o(35601);
    }
    while (true)
    {
      return bool;
      am.a locala = af.cnv();
      locala.a(paramfo.czp.type, paramfo.czp.username, new c.1(this, paramfo));
      locala.a(1, paramfo.czp.username, paramfo.czp.czr, paramfo.czp.czs);
      AppMethodBeat.o(35601);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.c
 * JD-Core Version:    0.6.2
 */