package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecentAppBrandViewContainer$2
  implements View.OnClickListener
{
  RecentAppBrandViewContainer$2(RecentAppBrandViewContainer paramRecentAppBrandViewContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133951);
    if (RecentAppBrandViewContainer.b(this.iYU) != null)
      RecentAppBrandViewContainer.b(this.iYU).onClick(paramView);
    AppMethodBeat.o(133951);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.RecentAppBrandViewContainer.2
 * JD-Core Version:    0.6.2
 */