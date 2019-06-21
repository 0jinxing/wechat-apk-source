package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.plugin.voip.video.i;

final class f$5
  implements Runnable
{
  f$5(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53947);
    f.n(this.oGB).stop();
    f.o(this.oGB);
    f.p(this.oGB).Mm();
    g.KK().setSpeakerphoneOn(f.q(this.oGB));
    AppMethodBeat.o(53947);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.5
 * JD-Core Version:    0.6.2
 */