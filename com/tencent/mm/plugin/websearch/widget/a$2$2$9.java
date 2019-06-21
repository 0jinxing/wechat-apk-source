package com.tencent.mm.plugin.websearch.widget;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cp;
import com.tencent.mm.g.b.a.cr;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.Map;

final class a$2$2$9
  implements f
{
  a$2$2$9(a.2.2 param2, String paramString, ThreeDotsLoadingView paramThreeDotsLoadingView, ImageView paramImageView, long paramLong, boolean paramBoolean)
  {
  }

  public final void F(View paramView, int paramInt)
  {
    AppMethodBeat.i(91385);
    u.i("FTSSearchWidgetMgr", "onWidgetStateChanged sessionId %s, state %d", new Object[] { this.hno, Integer.valueOf(paramInt) });
    a.a(this.ucN.ucM.ucJ, paramInt);
    switch (paramInt)
    {
    case 2:
    case 3:
    default:
      h.pYm.a(867L, 4L, 1L, false);
      a.cVO();
      u.B(this.ucN.ucM.ucK.ubs.csB, false);
      this.ucO.dKT();
      this.ucO.setVisibility(4);
      ((a.d)a.e(this.ucN.ucM.ucJ).get(this.ucN.ucM.ucL)).isLoading = false;
      if (paramInt == 2)
      {
        a.c(this.ucN.ucM.ucJ).dw(this.ucN.ucM.ucL, 4);
        AppMethodBeat.o(91385);
      }
      break;
    case 0:
    case 1:
    case 4:
    }
    while (true)
    {
      return;
      h.pYm.a(867L, 1L, 1L, false);
      if (a.e(this.ucN.ucM.ucJ).get(this.ucN.ucM.ucL) != null)
      {
        if (!((a.d)a.e(this.ucN.ucM.ucJ).get(this.ucN.ucM.ucL)).udi)
          break label342;
        this.ucO.setVisibility(8);
      }
      while (true)
      {
        this.ucP.setVisibility(4);
        a.c(this.ucN.ucM.ucJ).dw(this.ucN.ucM.ucL, 1);
        AppMethodBeat.o(91385);
        break;
        label342: this.ucO.setVisibility(0);
      }
      h.pYm.a(867L, 3L, 1L, false);
      this.ucO.dKT();
      this.ucO.setVisibility(4);
      a.c(this.ucN.ucM.ucJ).dw(this.ucN.ucM.ucL, 3);
      a.cVO();
      u.B(this.ucN.ucM.ucK.ubs.csB, false);
      ((a.d)a.e(this.ucN.ucM.ucJ).get(this.ucN.ucM.ucL)).isLoading = false;
      AppMethodBeat.o(91385);
      continue;
      h.pYm.a(867L, 2L, 1L, false);
      this.ucO.setVisibility(4);
      this.ucP.setVisibility(4);
      this.ucO.dKT();
      a.cVO();
      u.B(this.ucN.ucM.ucK.ubs.csB, true);
      ((a.d)a.e(this.ucN.ucM.ucJ).get(this.ucN.ucM.ucL)).isLoading = false;
      a.c(this.ucN.ucM.ucJ).dw(this.ucN.ucM.ucL, 2);
      u.i("FTSSearchWidgetMgr", "widget display timecost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.ucQ) });
      paramView = new cp().hw(this.ucN.ucM.ucK.ubs.fpS);
      paramView.dhm = (System.currentTimeMillis() - this.ucQ);
      if (this.ucR)
      {
        l = 1L;
        label676: paramView.cYx = l;
        paramView.ajK();
        paramView = new cr();
        paramView.cTl = 4L;
        paramView = paramView.hD(this.ucN.ucM.ucK.ubs.fpS);
        paramView.dhm = (System.currentTimeMillis() - this.ucQ);
        if (!this.ucR)
          break label800;
      }
      label800: for (long l = 1L; ; l = 2L)
      {
        paramView.cYx = l;
        paramView.dhw = this.ucN.ucM.hnH;
        paramView.ajK();
        d.cVP();
        d.d(this.ucN.ucM.ucK);
        AppMethodBeat.o(91385);
        break;
        l = 2L;
        break label676;
      }
      a.c(this.ucN.ucM.ucJ).dw(this.ucN.ucM.ucL, 3);
      AppMethodBeat.o(91385);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2.9
 * JD-Core Version:    0.6.2
 */