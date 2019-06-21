package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSMainUI$4
  implements View.OnClickListener
{
  FTSMainUI$4(FTSMainUI paramFTSMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61869);
    FTSMainUI.c(this.mJJ, this.mJJ.query);
    AppMethodBeat.o(61869);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.4
 * JD-Core Version:    0.6.2
 */