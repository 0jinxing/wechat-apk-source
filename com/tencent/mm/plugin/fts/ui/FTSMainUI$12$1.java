package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.c;
import com.tencent.mm.plugin.fts.ui.widget.d;
import com.tencent.mm.sdk.platformtools.bo;

final class FTSMainUI$12$1
  implements Runnable
{
  FTSMainUI$12$1(FTSMainUI.12 param12)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61879);
    FTSMainUI.a(this.mJK.mJJ, true);
    if ((bo.isNullOrNil(this.mJK.mJJ.mIu.getSearchContent())) && (FTSMainUI.c(this.mJK.mJJ) != null))
      FTSMainUI.c(this.mJK.mJJ).show();
    AppMethodBeat.o(61879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.12.1
 * JD-Core Version:    0.6.2
 */