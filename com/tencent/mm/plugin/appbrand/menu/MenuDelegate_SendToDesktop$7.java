package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.c.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.widget.a.e.c;

final class MenuDelegate_SendToDesktop$7
  implements e.c
{
  MenuDelegate_SendToDesktop$7(MenuDelegate_SendToDesktop paramMenuDelegate_SendToDesktop, a.a parama, Context paramContext, String paramString)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(132227);
    this.imG.dc(this.val$context);
    h.pYm.e(15783, new Object[] { Integer.valueOf(this.imC), Integer.valueOf(0), this.val$appId });
    AppMethodBeat.o(132227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop.7
 * JD-Core Version:    0.6.2
 */