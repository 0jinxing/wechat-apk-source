package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;

final class z$11
  implements Runnable
{
  z$11(z paramz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37313);
    if (!this.rbO.raL.isPlaying())
    {
      if (this.rbO.raL.getCurrPosSec() != this.rbO.raL.getVideoDurationSec())
        break label65;
      this.rbO.Dp(0);
    }
    while (true)
    {
      this.rbO.raL.cpT();
      AppMethodBeat.o(37313);
      return;
      label65: this.rbO.Dp(this.rbO.raL.getCurrPosSec());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z.11
 * JD-Core Version:    0.6.2
 */