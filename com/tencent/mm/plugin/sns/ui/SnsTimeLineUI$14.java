package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vending.c.a;

final class SnsTimeLineUI$14
  implements a<Void, Void>
{
  SnsTimeLineUI$14(SnsTimeLineUI paramSnsTimeLineUI, boolean paramBoolean1, boolean paramBoolean2, int paramInt, String paramString, long paramLong, boolean paramBoolean3)
  {
  }

  private Void a(Void paramVoid)
  {
    AppMethodBeat.i(39465);
    if (SnsTimeLineUI.h(this.rzs) != null)
    {
      SnsTimeLineUI.i(this.rzs);
      SnsTimeLineUI.h(this.rzs).cus();
    }
    SnsTimeLineUI.j(this.rzs).koC = this.rzt;
    if (this.rzs.rzl == 0)
    {
      ab.d("MicroMsg.SnsTimeLineUI", "onNpSize %s", new Object[] { Boolean.valueOf(this.rzt) });
      if (this.rzt)
        SnsTimeLineUI.j(this.rzs).lc(false);
      AppMethodBeat.o(39465);
      return paramVoid;
    }
    if ((this.rzy) && (!SnsTimeLineUI.p(this.rzs).equals(SnsTimeLineUI.l(this.rzs))))
    {
      SnsTimeLineUI.j(this.rzs).koC = true;
      SnsTimeLineUI.j(this.rzs).bf(this.rzu, this.rzv);
    }
    while (true)
    {
      AppMethodBeat.o(39465);
      break;
      if ((SnsTimeLineUI.p(this.rzs).equals(SnsTimeLineUI.l(this.rzs))) && (this.rzz != 0L))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xQk, Long.valueOf(this.rzz));
      }
      if (this.rzt)
        SnsTimeLineUI.j(this.rzs).lc(this.rzA);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.14
 * JD-Core Version:    0.6.2
 */