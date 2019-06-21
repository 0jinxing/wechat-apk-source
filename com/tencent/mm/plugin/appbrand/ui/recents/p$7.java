package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v7.widget.RecyclerView.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

final class p$7
  implements Runnable
{
  p$7(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133515);
    Iterator localIterator = this.iPg.iPd.iterator();
    while (localIterator.hasNext())
    {
      AppBrandLauncherRecentsList.e locale = (AppBrandLauncherRecentsList.e)localIterator.next();
      p localp = this.iPg;
      w localw = s.ab(locale.apJ);
      localp.iPe.add(locale);
      localw.u(0.0F).l(localp.aov).a(new p.8(localp, locale, localw)).start();
    }
    this.iPg.iPd.clear();
    AppMethodBeat.o(133515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.p.7
 * JD-Core Version:    0.6.2
 */