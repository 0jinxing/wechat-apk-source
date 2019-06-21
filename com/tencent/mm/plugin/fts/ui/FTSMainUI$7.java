package com.tencent.mm.plugin.fts.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSMainUI$7
  implements Runnable
{
  FTSMainUI$7(FTSMainUI paramFTSMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61872);
    if (FTSMainUI.q(this.mJJ) != null)
    {
      FTSMainUI.q(this.mJJ).dismiss();
      FTSMainUI.p(this.mJJ);
    }
    AppMethodBeat.o(61872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.7
 * JD-Core Version:    0.6.2
 */