package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMWizardActivity;

final class BakOperatingUI$10
  implements Runnable
{
  BakOperatingUI$10(BakOperatingUI paramBakOperatingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17943);
    if (6 == BakOperatingUI.j(this.jAF))
    {
      BakOperatingUI.m(this.jAF).post(new BakOperatingUI.10.1(this));
      AppMethodBeat.o(17943);
    }
    while (true)
    {
      return;
      if (1 == BakOperatingUI.j(this.jAF))
      {
        Intent localIntent = new Intent(this.jAF, BakFinishUI.class);
        localIntent.putExtra("cmd", BakOperatingUI.j(this.jAF));
        MMWizardActivity.J(this.jAF, localIntent);
      }
      AppMethodBeat.o(17943);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.10
 * JD-Core Version:    0.6.2
 */