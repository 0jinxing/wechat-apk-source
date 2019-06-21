package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.mars.comm.NetStatusUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class m$a$g$3
  implements Runnable
{
  m$a$g$3(m.a.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37132);
    if (!NetStatusUtil.isWifi(this.rag.raa.qZO.context))
    {
      ab.i("LogStateTransitionState", "download not in wifi!");
      h.a(this.rag.raa.qZO.context, 2131305542, 2131305543, new m.a.g.3.1(this), null);
      AppMethodBeat.o(37132);
    }
    while (true)
    {
      return;
      m.a(this.rag.raa.qZO).sendMessage(12);
      AppMethodBeat.o(37132);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.g.3
 * JD-Core Version:    0.6.2
 */