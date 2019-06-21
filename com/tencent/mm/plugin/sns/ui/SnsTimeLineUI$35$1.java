package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.ui.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class SnsTimeLineUI$35$1
  implements Runnable
{
  SnsTimeLineUI$35$1(SnsTimeLineUI.35 param35)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39507);
    if ((SnsTimeLineUI.a(this.rzH.rzs) == null) || (SnsTimeLineUI.D(this.rzH.rzs) == null))
    {
      ab.i("MicroMsg.SnsTimeLineUI", "onViewDrawed is error");
      AppMethodBeat.o(39507);
    }
    while (true)
    {
      return;
      SnsTimeLineUI.D(this.rzH.rzs).setListener(null);
      SnsTimeLineUI.a(this.rzH.rzs, SnsTimeLineUI.H(this.rzH.rzs));
      if (SnsTimeLineUI.I(this.rzH.rzs))
      {
        ab.w("MicroMsg.SnsTimeLineUI", "too fast that it finish");
        AppMethodBeat.o(39507);
      }
      else
      {
        if (SnsTimeLineUI.z(this.rzH.rzs))
          af.cnv().B(af.cnM().qMB, -1);
        if (!SnsTimeLineUI.z(this.rzH.rzs))
        {
          ab.i("MicroMsg.SnsTimeLineUI", "onViewDrawed doFpList");
          b localb = SnsTimeLineUI.o(this.rzH.rzs);
          SnsTimeLineUI.k(this.rzH.rzs);
          localb.d(SnsTimeLineUI.l(this.rzH.rzs), SnsTimeLineUI.m(this.rzH.rzs), SnsTimeLineUI.n(this.rzH.rzs), SnsTimeLineUI.w(this.rzH.rzs));
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWq, Integer.valueOf(1));
        }
        SnsTimeLineUI.a(this.rzH.rzs, false);
        if (this.rzH.rzs.rqn != null)
          this.rzH.rzs.rqn.kH(false);
        AppMethodBeat.o(39507);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.35.1
 * JD-Core Version:    0.6.2
 */