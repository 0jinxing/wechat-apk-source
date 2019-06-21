package com.tencent.mm.plugin.appbrand.page;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewParent;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$3$1
  implements Runnable
{
  u$3$1(u.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87160);
    if (!s.as(this.itb.ita.getContentView()))
    {
      d.d("MicroMsg.AppBrandPageView", "loadURL[page], PageView(%s) not laid out, forceLayout", new Object[] { this.itb.ita.getURL() });
      this.itb.ita.getContentView().forceLayout();
      Object localObject = this.itb.ita.getContentView().getParent();
      ViewParent localViewParent;
      do
      {
        ((View)localObject).forceLayout();
        localViewParent = ((ViewParent)localObject).getParent();
        localObject = localViewParent;
      }
      while ((localViewParent instanceof View));
      if (localViewParent != null)
        localViewParent.requestLayout();
    }
    AppMethodBeat.o(87160);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.3.1
 * JD-Core Version:    0.6.2
 */