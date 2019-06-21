package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.aa;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.webview.ui.tools.widget.d;

final class g$1
  implements d
{
  g$1(g paramg)
  {
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(37061);
    switch (paramInt)
    {
    default:
    case 150:
    }
    while (true)
    {
      AppMethodBeat.o(37061);
      return false;
      aa localaa = (aa)this.qZn.cpB();
      paramInt = paramBundle.getInt("sns_landing_pages_ad_vote_index");
      AdLandingPagesProxy.getInstance().saveAdVoteInfo(localaa.url, this.qZn.cpC().qPj, this.qZn.cpC().uin, paramInt, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g.1
 * JD-Core Version:    0.6.2
 */