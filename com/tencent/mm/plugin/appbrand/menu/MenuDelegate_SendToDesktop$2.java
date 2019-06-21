package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MenuDelegate_SendToDesktop$2
  implements View.OnClickListener
{
  MenuDelegate_SendToDesktop$2(MenuDelegate_SendToDesktop paramMenuDelegate_SendToDesktop, Context paramContext, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(132222);
    MenuDelegate_SendToDesktop.a(this.val$context, false, this.imC, this.val$appId);
    AppMethodBeat.o(132222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop.2
 * JD-Core Version:    0.6.2
 */