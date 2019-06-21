package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class SnsOnlineVideoActivity$5
  implements n.c
{
  SnsOnlineVideoActivity$5(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final void a(l paraml)
  {
    int i = 1;
    AppMethodBeat.i(39148);
    if (bo.ank(g.Nu().getValue("SIGHTCannotTransmitForFav")) == 0)
    {
      boolean bool1 = com.tencent.mm.vfs.e.ct(SnsOnlineVideoActivity.r(this.rvf));
      boolean bool2 = com.tencent.mm.vfs.e.ct(SnsOnlineVideoActivity.s(this.rvf));
      ab.i("MicroMsg.SnsOnlineVideoActivity", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      paraml.add(0, 3, 0, this.rvf.getString(2131303588));
      if ((!bool1) || (!bool2));
    }
    while (true)
    {
      if (d.afj("favorite"))
        paraml.add(0, 2, 0, this.rvf.getString(2131301955));
      paraml.add(0, 5, 0, this.rvf.getString(2131302712));
      if (i != 0)
      {
        dq localdq = new dq();
        localdq.cxc.cwT = SnsOnlineVideoActivity.t(this.rvf);
        a.xxA.m(localdq);
        if (localdq.cxd.cwB)
          paraml.add(0, 4, 0, this.rvf.getString(2131296995));
      }
      AppMethodBeat.o(39148);
      return;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.5
 * JD-Core Version:    0.6.2
 */