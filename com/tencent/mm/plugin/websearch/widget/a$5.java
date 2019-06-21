package com.tencent.mm.plugin.websearch.widget;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b;
import com.tencent.mm.ipcinvoker.b.a;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.Map;

final class a$5
  implements Runnable
{
  a$5(a parama, WidgetData paramWidgetData, String paramString1, ThreeDotsLoadingView paramThreeDotsLoadingView, String paramString2, View paramView, AbsoluteLayout paramAbsoluteLayout)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91396);
    int j;
    if (!e.lg(a.a(this.ucJ)))
    {
      localObject = a.a(this.ucJ);
      b localb = b.PL();
      if (localb.le((String)localObject))
      {
        localObject = (b.a)localb.eFL.get(localObject);
        if ((localObject == null) || (((b.a)localObject).eFT));
      }
      for (i = 1; i == 0; i = 0)
      {
        u.i("FTSSearchWidgetMgr", "do not has connected ipc service for %s, set timeout %d", new Object[] { a.a(this.ucJ), Integer.valueOf(30000) });
        j = 30000;
        u.i("FTSSearchWidgetMgr", "widget loading timeout is %d ms", new Object[] { Integer.valueOf(j) });
        if (j > 0)
        {
          if (a.n(this.ucJ) != null)
            al.af(a.n(this.ucJ));
          a.a(this.ucJ, new a.5.1(this));
          al.n(a.n(this.ucJ), j);
        }
        AppMethodBeat.o(91396);
        return;
      }
    }
    Object localObject = (Bundle)f.a("com.tencent.mm", new Bundle(), a.a.class);
    if (localObject != null);
    for (int i = ((Bundle)localObject).getInt("search_wa_widget_init_out_time"); ; i = 0)
    {
      j = i;
      if (i != 0)
        break;
      j = 30000;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.5
 * JD-Core Version:    0.6.2
 */