package com.tencent.mm.plugin.websearch.widget;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsoluteLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.p;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Style;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$6
  implements Runnable
{
  a$6(a parama, String paramString, WidgetData paramWidgetData)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91397);
    View localView1 = (View)a.i(this.ucJ).get(this.ucL);
    View localView2 = (View)a.j(this.ucJ).get(this.ucL);
    Object localObject;
    if (localView1 != null)
    {
      localObject = (AbsoluteLayout.LayoutParams)localView1.getLayoutParams();
      int i = ((AbsoluteLayout.LayoutParams)localObject).height;
      int j = p.qd(this.ucK.ubt.height);
      int k = ((AbsoluteLayout.LayoutParams)localObject).width;
      int m = p.qd(this.ucK.ubt.width);
      a.a(this.ucJ, localView1, (View)a.k(this.ucJ).get(this.ucL), i, j, k, m, this.ucL);
      localObject = localView2.getLayoutParams();
      if ((localObject instanceof AbsoluteLayout.LayoutParams))
      {
        localObject = (AbsoluteLayout.LayoutParams)localObject;
        ((AbsoluteLayout.LayoutParams)localObject).x = p.qd(this.ucK.ubt.offsetX);
        ((AbsoluteLayout.LayoutParams)localObject).y = p.qd(this.ucK.ubt.offsetY);
        localView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    while (true)
    {
      try
      {
        if (!TextUtils.isEmpty(this.ucK.ubt.hfo))
          localView1.setBackgroundColor(Color.parseColor(this.ucK.ubt.hfo));
        if (this.ucK.ubt.cNN)
        {
          localView1.setVisibility(0);
          localView2.setVisibility(0);
          AppMethodBeat.o(91397);
          return;
          if (!(localObject instanceof ViewGroup.MarginLayoutParams))
            continue;
          localObject = (ViewGroup.MarginLayoutParams)localObject;
          ((ViewGroup.MarginLayoutParams)localObject).leftMargin = p.qd(this.ucK.ubt.offsetX);
          ((ViewGroup.MarginLayoutParams)localObject).topMargin = p.qd(this.ucK.ubt.offsetY);
          localView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("FTSSearchWidgetMgr", bo.l(localException));
        continue;
        localView1.setVisibility(8);
        localView2.setVisibility(8);
      }
      AppMethodBeat.o(91397);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.6
 * JD-Core Version:    0.6.2
 */