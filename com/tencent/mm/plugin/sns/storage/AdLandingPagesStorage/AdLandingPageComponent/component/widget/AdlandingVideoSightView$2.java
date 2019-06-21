package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;

final class AdlandingVideoSightView$2
  implements b.f
{
  AdlandingVideoSightView$2(AdlandingVideoSightView paramAdlandingVideoSightView)
  {
  }

  public final void ks(long paramLong)
  {
    AppMethodBeat.i(37457);
    if (this.rcE.duration == 0)
      this.rcE.duration = this.rcE.getDuration();
    if (this.rcE.llE != null)
    {
      ab.v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.rcE.duration) });
      this.rcE.llE.dG((int)paramLong, this.rcE.duration);
    }
    AppMethodBeat.o(37457);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.2
 * JD-Core Version:    0.6.2
 */