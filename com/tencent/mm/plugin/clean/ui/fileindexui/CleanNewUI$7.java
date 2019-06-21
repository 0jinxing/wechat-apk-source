package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanNewUI$7
  implements Runnable
{
  CleanNewUI$7(CleanNewUI paramCleanNewUI, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18819);
    CleanNewUI.k(this.kyC).setText(this.kyC.getString(2131296518, new Object[] { this.gOm * 100 / this.fFn + "%" }));
    AppMethodBeat.o(18819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.7
 * JD-Core Version:    0.6.2
 */