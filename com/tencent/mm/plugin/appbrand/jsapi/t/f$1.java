package com.tencent.mm.plugin.appbrand.jsapi.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.page.y;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b;

final class f$1
  implements Runnable
{
  f$1(f paramf, w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131669);
    y localy = this.hIw.isK;
    localy.setPullDownEnabled(true);
    localy.dO(false);
    localy.bq("light", a.i(this.hIw.mContext, 2131690677));
    this.hIw.aJE();
    this.hIw.getActionBar().a(new f.1.1(this));
    AppMethodBeat.o(131669);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.f.1
 * JD-Core Version:    0.6.2
 */