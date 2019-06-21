package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;

final class r$11
  implements Runnable
{
  r$11(r paramr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37215);
    if (!this.rbn.raL.isPlaying())
    {
      if (this.rbn.raL.getCurrPosSec() != this.rbn.raL.getVideoDurationSec())
        break label65;
      this.rbn.Dp(0);
    }
    while (true)
    {
      this.rbn.raL.cpT();
      AppMethodBeat.o(37215);
      return;
      label65: this.rbn.Dp(this.rbn.raL.getCurrPosSec());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.11
 * JD-Core Version:    0.6.2
 */