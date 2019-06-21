package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BakOperatingUI$10$1
  implements Runnable
{
  BakOperatingUI$10$1(BakOperatingUI.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17942);
    this.jAG.jAF.showOptionMenu(false);
    if (BakOperatingUI.h(this.jAG.jAF) != null)
      BakOperatingUI.h(this.jAG.jAF).setProgress(0);
    if (BakOperatingUI.k(this.jAG.jAF) != null)
      BakOperatingUI.k(this.jAG.jAF).setText(this.jAG.jAF.getString(2131297393));
    if (BakOperatingUI.l(this.jAG.jAF) != null)
      BakOperatingUI.l(this.jAG.jAF).setText(this.jAG.jAF.getString(2131297392));
    if (BakOperatingUI.i(this.jAG.jAF) != null)
      BakOperatingUI.i(this.jAG.jAF).setText(this.jAG.jAF.getString(2131297383) + "0%");
    AppMethodBeat.o(17942);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.10.1
 * JD-Core Version:    0.6.2
 */