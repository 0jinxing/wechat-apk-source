package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.talkroom.b.c;
import com.tencent.mm.plugin.talkroom.component.c.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ay;

final class g$6 extends c.a
{
  g$6(g paramg)
  {
  }

  public final void p(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(25810);
    if (paramBoolean)
    {
      g.b(this.syS, 0);
      g.a(this.syS).tO("");
      AppMethodBeat.o(25810);
    }
    while (true)
    {
      return;
      g.c(this.syS, paramInt2);
      if (g.i(this.syS) == paramInt1)
      {
        AppMethodBeat.o(25810);
      }
      else
      {
        g.b(this.syS, paramInt1);
        String str = this.syS.cEu();
        if ((!g.j(this.syS)) && (str == null))
        {
          g.k(this.syS);
          paramInt1 = g.e(this.syS);
          long l = g.f(this.syS);
          Object localObject = g.g(this.syS);
          g localg = this.syS;
          g.g(this.syS);
          localObject = new c(paramInt1, l, (String)localObject, localg.cEt());
          aw.Rg().a((m)localObject, 0);
          localObject = b.cEk();
          ((f)localObject).syf += 1;
          localObject = b.cEk();
          ((f)localObject).syg += 1;
        }
        g.a(this.syS).tO(str);
        ay.au(ah.getContext(), 2131304020);
        AppMethodBeat.o(25810);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.g.6
 * JD-Core Version:    0.6.2
 */