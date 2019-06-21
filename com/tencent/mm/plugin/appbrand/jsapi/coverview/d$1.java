package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.HashMap;
import java.util.Map;

final class d$1
  implements m
{
  d$1(d paramd, e parame, int paramInt)
  {
  }

  public final void p(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126298);
    if (!(paramView instanceof WxaScrollView))
      AppMethodBeat.o(126298);
    while (true)
    {
      return;
      Object localObject = this.hCK.aBf().J(this.hCN, false);
      if (localObject == null)
      {
        AppMethodBeat.o(126298);
      }
      else
      {
        localObject = ((v.b)localObject).getString("data", null);
        if (localObject == null)
        {
          AppMethodBeat.o(126298);
        }
        else
        {
          ViewGroup localViewGroup = ((WxaScrollView)paramView).getTargetView();
          paramView = new HashMap();
          paramView.put("data", localObject);
          paramView.put("scrollLeft", Integer.valueOf(g.qa(paramInt1)));
          paramView.put("scrollTop", Integer.valueOf(g.qa(paramInt2)));
          paramView.put("scrollWidth", Integer.valueOf(g.qa(localViewGroup.getWidth())));
          paramView.put("scrollHeight", Integer.valueOf(g.qa(localViewGroup.getHeight())));
          paramView = new l().t(paramView);
          this.hCK.b(paramView);
          AppMethodBeat.o(126298);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.d.1
 * JD-Core Version:    0.6.2
 */