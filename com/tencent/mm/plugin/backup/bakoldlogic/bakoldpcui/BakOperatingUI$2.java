package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMWizardActivity;

final class BakOperatingUI$2
  implements Runnable
{
  BakOperatingUI$2(BakOperatingUI paramBakOperatingUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17934);
    ab.i("MicroMsg.BakOperatingUI", "BakOperatingUI onCloseSocket, %d", new Object[] { Integer.valueOf(this.crc) });
    if (this.crc == 15)
    {
      BakOperatingUI.n(this.jAF);
      AppMethodBeat.o(17934);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent(this.jAF, BakConnErrorUI.class);
      MMWizardActivity.J(this.jAF, localIntent);
      AppMethodBeat.o(17934);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.2
 * JD-Core Version:    0.6.2
 */