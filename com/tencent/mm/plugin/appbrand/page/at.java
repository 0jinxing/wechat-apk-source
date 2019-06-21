package com.tencent.mm.plugin.appbrand.page;

import a.f.b.j;
import a.l;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import me.imid.swipebacklayout.lib.SwipeBackLayout;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/page/SwipeBackLayoutSettingsAlignmentWC;", "", "()V", "alignSettings", "", "maybeSwipeLayout", "Landroid/view/View;", "plugin-appbrand-integration_release"})
public final class at
{
  public static final at ivg;

  static
  {
    AppMethodBeat.i(134776);
    ivg = new at();
    AppMethodBeat.o(134776);
  }

  public static final void cr(View paramView)
  {
    AppMethodBeat.i(134775);
    if (!(paramView instanceof SwipeBackLayout))
      paramView = null;
    while (true)
    {
      paramView = (SwipeBackLayout)paramView;
      if (paramView != null)
      {
        Resources localResources = paramView.getResources();
        j.o(localResources, "page.resources");
        float f = localResources.getDisplayMetrics().density;
        paramView.setMinVelocity(100.0F * f);
        paramView.setMaxVelocity(300.0F * f);
        paramView.setEdgeTrackingEnabled(1);
        paramView.setEdgeSize((int)(f * 20.0F + 0.5F));
        paramView.setEdgeTrackingEnabled(1);
        paramView.setScrimColor(0);
        AppMethodBeat.o(134775);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134775);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.at
 * JD-Core Version:    0.6.2
 */