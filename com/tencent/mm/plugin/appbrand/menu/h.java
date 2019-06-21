package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.debugger.t;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.ui.base.l;

public final class h extends a
{
  public h()
  {
    super(o.imT.ordinal());
    AppMethodBeat.i(132214);
    AppMethodBeat.o(132214);
  }

  public final void a(Context paramContext, u paramu, l paraml, String paramString)
  {
    AppMethodBeat.i(132215);
    if ((paramu.getRuntime() instanceof com.tencent.mm.plugin.appbrand.o))
    {
      paramContext = (com.tencent.mm.plugin.appbrand.o)paramu.getRuntime();
      if ((paramContext.xy()) && (paramContext.yd()))
        if (t.azr())
        {
          paraml.e(this.inj, "Disable Preload");
          AppMethodBeat.o(132215);
        }
    }
    while (true)
    {
      return;
      paraml.e(this.inj, "Enable Preload");
      AppMethodBeat.o(132215);
    }
  }

  public final void a(Context paramContext, u paramu, String paramString, n paramn)
  {
    AppMethodBeat.i(132216);
    if (t.azr())
    {
      t.dL(false);
      Toast.makeText(paramContext, "Disable success, please restart WeChat to take effect.", 1).show();
      AppMethodBeat.o(132216);
    }
    while (true)
    {
      return;
      t.dL(true);
      Toast.makeText(paramContext, "Enable success, please restart WeChat to take effect.", 1).show();
      AppMethodBeat.o(132216);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.h
 * JD-Core Version:    0.6.2
 */