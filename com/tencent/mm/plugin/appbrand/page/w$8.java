package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.widget.actionbar.g;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.sdk.platformtools.bo;

final class w$8
  implements View.OnLongClickListener
{
  w$8(w paramw)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(132390);
    if (this.itx.getRuntime().ya().bQn.scene == 1086)
      AppMethodBeat.o(132390);
    while (true)
    {
      return true;
      if ((w.d(this.itx) == null) || (w.d(this.itx).getCount() == 0))
      {
        AppMethodBeat.o(132390);
      }
      else
      {
        w.d(this.itx).refresh();
        this.itx.itm.showAsDropDown(paramView);
        c.a(this.itx.getAppId(), this.itx.getURL(), 21, "", bo.anT(), 1, 0);
        AppMethodBeat.o(132390);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.8
 * JD-Core Version:    0.6.2
 */