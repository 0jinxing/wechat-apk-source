package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.plugin.brandservice.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class MPVideoHeaderView$b
  implements Runnable
{
  MPVideoHeaderView$b(MPVideoHeaderView paramMPVideoHeaderView, ad paramad)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138521);
    if (b.pW(MPVideoHeaderView.c(this.jXL)) == null)
    {
      h localh = o.act().qo(MPVideoHeaderView.c(this.jXL));
      if ((localh != null) && (!bo.isNullOrNil(localh.acl())))
        a.a(MPVideoHeaderView.d(this.jXL), this.jXN, localh.acl(), true);
    }
    AppMethodBeat.o(138521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoHeaderView.b
 * JD-Core Version:    0.6.2
 */