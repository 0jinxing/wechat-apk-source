package com.tencent.mm.plugin.appbrand.game.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aq;
import com.tencent.mm.plugin.appbrand.report.model.g;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements Runnable
{
  e$1(e parame, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130228);
    e.a(this.hsJ, new d(this.hsJ.getContext(), this.hsJ));
    this.hsJ.addView(e.a(this.hsJ), 0);
    e.a(this.hsJ).getCurrentPageView().a(new e.1.1(this));
    e.a(this.hsJ).loadUrl(this.val$url);
    e.a(this.hsJ).a(aq.iuY);
    e.a(this.hsJ).aAS();
    e.a(this.hsJ).aJl();
    try
    {
      this.hsJ.getReporter().a(this.hsJ.getCurrentPageView(), null, aq.iuY);
      AppMethodBeat.o(130228);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WAGamePageContainer", "report APP_LAUNCH, e = %s", new Object[] { localException });
        AppMethodBeat.o(130228);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.e.1
 * JD-Core Version:    0.6.2
 */