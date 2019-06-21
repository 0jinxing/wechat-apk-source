package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;

final class m$a$c$2
  implements Runnable
{
  m$a$c$2(m.a.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37112);
    m.c(this.rad.raa.qZO).setProgress(AdLandingPagesProxy.getInstance().getTaskProgress(m.b(this.rad.raa.qZO).csB));
    AppMethodBeat.o(37112);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.c.2
 * JD-Core Version:    0.6.2
 */