package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;

public final class b extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  b()
  {
    super(o.imN.ordinal());
    AppMethodBeat.i(132193);
    AppMethodBeat.o(132193);
  }

  public final void a(Context paramContext, u paramu, l paraml, String paramString)
  {
    AppMethodBeat.i(132194);
    paramu = paramu.getRuntime().asV();
    if (((paramu instanceof r)) && (((r)paramu).aAW()))
      paraml.e(this.inj, paramContext.getString(2131296570));
    AppMethodBeat.o(132194);
  }

  public final void a(Context paramContext, u paramu, String paramString, n paramn)
  {
    AppMethodBeat.i(132195);
    paramu.getRuntime().asV().af(paramu.getRuntime().getAppConfig().ayw(), true);
    if (paramu.aJz() != null)
      c.a(paramString, paramu.getURL(), 20, "", bo.anT(), 1, 0);
    AppMethodBeat.o(132195);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.b
 * JD-Core Version:    0.6.2
 */