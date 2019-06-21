package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BakOperatingUI$9
  implements Runnable
{
  BakOperatingUI$9(BakOperatingUI paramBakOperatingUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17941);
    if (BakOperatingUI.h(this.jAF) != null)
      BakOperatingUI.h(this.jAF).setProgress(this.gyJ);
    if ((BakOperatingUI.i(this.jAF) != null) && (BakOperatingUI.k(this.jAF) != null))
    {
      BakOperatingUI.i(this.jAF).setText(this.jAF.getString(2131297383) + this.gyJ + "%");
      BakOperatingUI.k(this.jAF).setText(this.jAF.getString(2131297393));
    }
    AppMethodBeat.o(17941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.9
 * JD-Core Version:    0.6.2
 */