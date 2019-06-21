package com.tencent.mm.plugin.websearch.widget;

import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.Map;

final class a$5$1
  implements Runnable
{
  a$5$1(a.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91395);
    if (this.ucV.ucK != a.b(this.ucV.ucJ))
      AppMethodBeat.o(91395);
    while (true)
    {
      return;
      if ((a.o(this.ucV.ucJ) != 4) && (a.o(this.ucV.ucJ) != 2) && (a.o(this.ucV.ucJ) != 3))
      {
        ab.e("FTSSearchWidgetMgr", "widget load timeout, unbind now");
        h.pYm.a(867L, 5L, 1L, false);
        u.i("FTSSearchWidgetMgr", "widget load timeout, unbind now", new Object[0]);
        a.cVO();
        u.B(this.ucV.ucK.ubs.csB, false);
        ((a.d)a.e(this.ucV.ucJ).get(this.ucV.ucL)).isLoading = false;
        this.ucV.ucO.dKT();
        this.ucV.ucO.setVisibility(4);
        a.c(this.ucV.ucJ).dw(this.ucV.ucL, 3);
        a.h(this.ucV.ucJ).cg(this.ucV.val$view);
        a.h(this.ucV.ucJ).a(this.ucV.hno, this.ucV.val$view);
        this.ucV.ucU.removeView(this.ucV.val$view);
        h.pYm.a(646L, 0L, 1L, false);
      }
      AppMethodBeat.o(91395);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.5.1
 * JD-Core Version:    0.6.2
 */