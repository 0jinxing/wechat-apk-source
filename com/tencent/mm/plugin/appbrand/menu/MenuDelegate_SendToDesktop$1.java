package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.u;
import com.tencent.mm.plugin.appbrand.u.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.mm.ui.widget.snackbar.b;
import java.util.concurrent.atomic.AtomicBoolean;

final class MenuDelegate_SendToDesktop$1
  implements Runnable
{
  MenuDelegate_SendToDesktop$1(MenuDelegate_SendToDesktop paramMenuDelegate_SendToDesktop, AtomicBoolean paramAtomicBoolean, Context paramContext, u.a parama, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132221);
    this.imz.set(u.a(this.val$context, this.imA, this.gQG, false));
    if (this.imz.get())
      h.pYm.a(443L, 1L, 1L, false);
    if ((this.val$context == null) || (!this.imz.get()))
      AppMethodBeat.o(132221);
    while (true)
    {
      return;
      Resources localResources = this.val$context.getResources();
      if (this.imB == 0)
      {
        b.i((Activity)this.val$context, localResources.getString(2131297168));
        h.pYm.e(15787, new Object[] { Integer.valueOf(this.imC), Integer.valueOf(0), this.imA.appId });
        AppMethodBeat.o(132221);
      }
      else
      {
        if ((this.imD) && ((this.imC == 2) || (this.imC == 4)))
        {
          localResources = this.val$context.getResources();
          b.a((Activity)this.val$context, localResources.getString(2131297168), localResources.getString(2131297161), new a.b()
          {
            public final void aIu()
            {
              AppMethodBeat.i(132220);
              MenuDelegate_SendToDesktop.a(MenuDelegate_SendToDesktop.1.this.val$context, true, MenuDelegate_SendToDesktop.1.this.imC, MenuDelegate_SendToDesktop.1.this.imA.appId);
              AppMethodBeat.o(132220);
            }
          });
          h.pYm.e(15787, new Object[] { Integer.valueOf(this.imC), Integer.valueOf(0), this.imA.appId });
        }
        AppMethodBeat.o(132221);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop.1
 * JD-Core Version:    0.6.2
 */