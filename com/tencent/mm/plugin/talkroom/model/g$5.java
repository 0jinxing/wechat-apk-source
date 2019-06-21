package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.talkroom.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bo;

final class g$5
  implements af.a
{
  g$5(g paramg)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(25809);
    if ((g.e(this.syS) == 0) || (bo.isNullOrNil(g.g(this.syS))))
    {
      ab.w("MicroMsg.TalkRoomServer", "talkNoopTimer error: roomId %d, talkUsername %s", new Object[] { Integer.valueOf(g.e(this.syS)), g.g(this.syS) });
      g.h(this.syS);
      AppMethodBeat.o(25809);
      bool = false;
    }
    while (true)
    {
      return bool;
      String str = g.g(this.syS);
      int i = g.e(this.syS);
      long l = g.f(this.syS);
      Object localObject = this.syS;
      g.g(this.syS);
      localObject = new e(str, i, l, ((g)localObject).cEt());
      aw.Rg().a((m)localObject, 0);
      AppMethodBeat.o(25809);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.g.5
 * JD-Core Version:    0.6.2
 */