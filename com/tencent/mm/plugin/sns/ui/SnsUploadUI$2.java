package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.m.b;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.tools.b.c;

final class SnsUploadUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SnsUploadUI$2(SnsUploadUI paramSnsUploadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39740);
    if (this.rCO.isFinishing())
      AppMethodBeat.o(39740);
    while (true)
    {
      return false;
      if (System.currentTimeMillis() - SnsUploadUI.n(this.rCO) >= 500L)
        break;
      AppMethodBeat.o(39740);
    }
    if (SnsUploadUI.g(this.rCO) == 9)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLh, "");
    }
    while (true)
    {
      SnsUploadUI.h(this.rCO);
      SnsUploadUI.a(this.rCO, System.currentTimeMillis());
      com.tencent.mm.plugin.report.service.g.BN(22);
      paramMenuItem = c.d(SnsUploadUI.f(this.rCO)).PM(b.MW());
      paramMenuItem.zIx = true;
      paramMenuItem.a(new SnsUploadUI.2.1(this));
      AppMethodBeat.o(39740);
      break;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLg, "");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.2
 * JD-Core Version:    0.6.2
 */