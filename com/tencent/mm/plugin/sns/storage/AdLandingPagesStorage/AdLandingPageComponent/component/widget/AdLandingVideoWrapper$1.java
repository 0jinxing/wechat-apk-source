package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.h;
import com.tencent.mm.sdk.platformtools.ap.a;

final class AdLandingVideoWrapper$1
  implements ap.a
{
  AdLandingVideoWrapper$1(AdLandingVideoWrapper paramAdLandingVideoWrapper)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(37369);
    boolean bool;
    if ((AdLandingVideoWrapper.a(this.rch) == null) || (AdLandingVideoWrapper.b(this.rch) == null))
    {
      bool = false;
      AppMethodBeat.o(37369);
    }
    while (true)
    {
      return bool;
      if ((AdLandingVideoWrapper.b(this.rch) != null) && (AdLandingVideoWrapper.a(this.rch).isPlaying()))
        AdLandingVideoWrapper.b(this.rch).Dq(AdLandingVideoWrapper.a(this.rch).getCurrPosSec());
      bool = true;
      AppMethodBeat.o(37369);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper.1
 * JD-Core Version:    0.6.2
 */