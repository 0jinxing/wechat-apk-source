package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.c;

final class FTSMainUI$12$2
  implements Runnable
{
  FTSMainUI$12$2(FTSMainUI.12 param12)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61880);
    FTSMainUI.a(this.mJK.mJJ, false);
    if (FTSMainUI.c(this.mJK.mJJ) != null)
      FTSMainUI.c(this.mJK.mJJ).bBy();
    AppMethodBeat.o(61880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.12.2
 * JD-Core Version:    0.6.2
 */