package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ma;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class x$3$2
  implements Runnable
{
  x$3$2(x.3 param3, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37276);
    ab.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "play time " + this.qAp + " video time " + x.g(this.rbN.rbM));
    if ((x.b(this.rbN.rbM).qWM != null) && (this.qAp * 1000 >= x.b(this.rbN.rbM).qWM.qXt) && (!x.h(this.rbN.rbM)))
    {
      x.i(this.rbN.rbM);
      ma localma = new ma();
      localma.cHQ.cHR = x.b(this.rbN.rbM).qWM.cHR;
      a.xxA.m(localma);
    }
    AppMethodBeat.o(37276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.3.2
 * JD-Core Version:    0.6.2
 */