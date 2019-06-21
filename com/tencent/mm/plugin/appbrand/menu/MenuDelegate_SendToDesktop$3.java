package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.c.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.b;

final class MenuDelegate_SendToDesktop$3
  implements e.b
{
  MenuDelegate_SendToDesktop$3(MenuDelegate_SendToDesktop paramMenuDelegate_SendToDesktop, a.a parama, Context paramContext, String paramString, e.a parama1)
  {
  }

  public final void s(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(132223);
    if (paramBoolean1)
    {
      this.imG.dc(this.val$context);
      h.pYm.e(15783, new Object[] { Integer.valueOf(this.imC), Integer.valueOf(0), this.val$appId });
    }
    while (true)
    {
      MenuDelegate_SendToDesktop.d(paramBoolean2, this.val$appId, this.imC);
      AppMethodBeat.o(132223);
      return;
      MenuDelegate_SendToDesktop.a(this.imH, this.imC, this.val$appId);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop.3
 * JD-Core Version:    0.6.2
 */