package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.aa.a.a;
import com.tencent.mm.plugin.report.service.h;

final class LaunchAAUI$15
  implements a.a
{
  LaunchAAUI$15(LaunchAAUI paramLaunchAAUI)
  {
  }

  public final void aos()
  {
    AppMethodBeat.i(40836);
    Intent localIntent = new Intent(this.gpj, AAQueryListUI.class);
    this.gpj.startActivity(localIntent);
    if (LaunchAAUI.b(this.gpj) == a.gkU)
    {
      h.pYm.e(13721, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
      AppMethodBeat.o(40836);
    }
    while (true)
    {
      return;
      h.pYm.e(13721, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
      AppMethodBeat.o(40836);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.15
 * JD-Core Version:    0.6.2
 */