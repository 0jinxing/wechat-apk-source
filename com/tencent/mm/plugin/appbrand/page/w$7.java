package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.launching.precondition.f;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.b;
import com.tencent.mm.sdk.platformtools.al;

final class w$7
  implements AppBrandRecentView.b
{
  w$7(w paramw)
  {
  }

  public final boolean a(View paramView, com.tencent.mm.plugin.appbrand.widget.recentview.a parama, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(132389);
    al.n(new w.7.1(this), 100L);
    boolean bool;
    if (parama.type == 1)
    {
      paramView = parama.iXW;
      parama = new AppBrandStatObject();
      parama.scene = 1090;
      parama.cst = this.itx.getAppId();
      f.ijT.a(this.itx.mContext, paramView.username, null, null, paramView.har, -1, parama, null, null);
      bool = true;
      AppMethodBeat.o(132389);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132389);
    }
  }

  public final boolean b(View paramView, com.tencent.mm.plugin.appbrand.widget.recentview.a parama, float paramFloat1, float paramFloat2)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.7
 * JD-Core Version:    0.6.2
 */