package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.e.c;

final class MenuDelegate_SendToDesktop$9
  implements e.c
{
  MenuDelegate_SendToDesktop$9(MenuDelegate_SendToDesktop paramMenuDelegate_SendToDesktop, Context paramContext, String paramString)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(132229);
    MenuDelegate_SendToDesktop.a(this.val$context, false, this.imC, this.val$appId);
    AppMethodBeat.o(132229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop.9
 * JD-Core Version:    0.6.2
 */