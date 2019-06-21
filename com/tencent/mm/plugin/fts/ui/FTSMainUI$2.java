package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSMainUI$2
  implements View.OnClickListener
{
  FTSMainUI$2(FTSMainUI paramFTSMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61867);
    FTSMainUI.d(this.mJJ).mIO = true;
    if (!FTSMainUI.d(this.mJJ).mIF)
    {
      FTSMainUI.d(this.mJJ).mIF = true;
      k.a(this.mJJ.query, true, FTSMainUI.d(this.mJJ).getCount(), 0, FTSMainUI.k(this.mJJ));
    }
    FTSMainUI.l(this.mJJ);
    AppMethodBeat.o(61867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.2
 * JD-Core Version:    0.6.2
 */