package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

final class BakOperatingUI$11
  implements Runnable
{
  BakOperatingUI$11(BakOperatingUI paramBakOperatingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17944);
    Intent localIntent = new Intent(this.jAF, BakFinishUI.class);
    localIntent.putExtra("cmd", BakOperatingUI.j(this.jAF));
    MMWizardActivity.J(this.jAF, localIntent);
    AppMethodBeat.o(17944);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.11
 * JD-Core Version:    0.6.2
 */