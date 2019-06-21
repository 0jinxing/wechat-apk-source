package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.ui.base.l;
import org.json.JSONObject;

public final class g extends a
{
  g()
  {
    super(o.imU.ordinal());
    AppMethodBeat.i(132211);
    AppMethodBeat.o(132211);
  }

  public final void a(Context paramContext, u paramu, l paraml, String paramString)
  {
    AppMethodBeat.i(132212);
    if (bp.dpL())
      paraml.a(this.inj, paramContext.getResources().getColor(2131690386), paramContext.getString(2131296569));
    AppMethodBeat.o(132212);
  }

  public final void a(Context paramContext, u paramu, String paramString, n paramn)
  {
    AppMethodBeat.i(132213);
    paramn = new d();
    paramContext = paramu.xT();
    new JSONObject();
    paramn.c(paramContext);
    c.a(paramString, paramu.getURL(), 10, "", bo.anT(), 1, 0);
    AppMethodBeat.o(132213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.g
 * JD-Core Version:    0.6.2
 */