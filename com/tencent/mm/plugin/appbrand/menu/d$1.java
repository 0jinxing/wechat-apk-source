package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class d$1
  implements n.c
{
  d$1(d paramd, w paramw, String paramString, Context paramContext)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(132202);
    paraml.hi(1, 2131305808);
    paraml.hi(2, 2131305805);
    paraml.hi(7, 2131305807);
    paraml.e(3, "appID: " + this.hIw.getAppId());
    paraml.e(8, "username: " + this.hIw.getRuntime().atI().username);
    paraml.e(4, "TRIM PAGE");
    if (bo.isNullOrNil(this.eFP));
    for (String str = "UNKNOWN PROCESS NAME"; ; str = this.eFP)
    {
      paraml.e(5, str);
      paraml.e(6, this.val$context.getString(2131305803) + String.format("(cur:%b)", new Object[] { Boolean.valueOf(b.aLG()) }));
      AppMethodBeat.o(132202);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.d.1
 * JD-Core Version:    0.6.2
 */