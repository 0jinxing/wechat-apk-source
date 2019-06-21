package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;

final class m$a$c$4
  implements Runnable
{
  m$a$c$4(m.a.c paramc, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37114);
    if (this.gOm >= 0)
      m.c(this.rad.raa.qZO).setProgress(this.gOm);
    AppMethodBeat.o(37114);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.c.4
 * JD-Core Version:    0.6.2
 */