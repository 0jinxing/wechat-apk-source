package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;

final class q$9
  implements Runnable
{
  q$9(q paramq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87085);
    if ((this.irR.getRuntime() == null) || (!this.irR.getRuntime().eMP) || (this.irR.getRuntime().mFinished))
      AppMethodBeat.o(87085);
    while (true)
    {
      return;
      if (q.c(this.irR) != null)
      {
        AppMethodBeat.o(87085);
      }
      else
      {
        long l = System.currentTimeMillis();
        Object localObject1 = this.irR.aHV();
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new u();
        ((u)localObject2).irO = this.irR.getDecorWidgetFactory();
        ((u)localObject2).a(this.irR.getContext(), q.a(this.irR));
        localObject1 = ((b)localObject2).getContentView();
        if (localObject1 != null)
          ((View)localObject1).setVisibility(4);
        this.irR.addView(((u)localObject2).getContentView(), 0);
        q.a(this.irR, (u)localObject2);
        ab.i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(87085);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.9
 * JD-Core Version:    0.6.2
 */