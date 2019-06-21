package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e.a;

final class AdlandingVideoSightView$1
  implements b.e
{
  AdlandingVideoSightView$1(AdlandingVideoSightView paramAdlandingVideoSightView)
  {
  }

  public final void Ds(int paramInt)
  {
    AppMethodBeat.i(37456);
    if (-1 == paramInt)
    {
      if (this.rcE.llE == null)
        break label66;
      this.rcE.llE.onError(0, 0);
      AppMethodBeat.o(37456);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (this.rcE.llE != null))
        this.rcE.llE.EA();
      label66: AppMethodBeat.o(37456);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.1
 * JD-Core Version:    0.6.2
 */