package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.b;

final class MenuDelegate_SendToDesktop$4
  implements e.b
{
  MenuDelegate_SendToDesktop$4(MenuDelegate_SendToDesktop paramMenuDelegate_SendToDesktop, Context paramContext, String paramString, e.a parama)
  {
  }

  public final void s(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(132224);
    if (paramBoolean1)
      MenuDelegate_SendToDesktop.a(this.val$context, false, this.imC, this.val$appId);
    while (true)
    {
      MenuDelegate_SendToDesktop.d(paramBoolean2, this.val$appId, this.imC);
      AppMethodBeat.o(132224);
      return;
      MenuDelegate_SendToDesktop.a(this.imH, this.imC, this.val$appId);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop.4
 * JD-Core Version:    0.6.2
 */