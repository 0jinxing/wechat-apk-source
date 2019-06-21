package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.websearch.api.e;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class FTSMainUI$19
  implements j.b
{
  FTSMainUI$19(FTSMainUI paramFTSMainUI)
  {
  }

  public final void bAY()
  {
    AppMethodBeat.i(61892);
    String str = FTSMainUI.f(this.mJJ).getQuery();
    if ((FTSMainUI.f(this.mJJ).getVisibility() == 0) && (!bo.isNullOrNil(str)) && (!FTSMainUI.g(this.mJJ).containsKey(str)))
    {
      FTSMainUI.g(this.mJJ).put(str, Integer.valueOf(1));
      ((e)g.K(e.class)).ar(str, FTSMainUI.f(this.mJJ).getSearchId(), FTSMainUI.f(this.mJJ).getWordList());
    }
    FTSMainUI.d(this.mJJ).mIS.mLH = 1;
    AppMethodBeat.o(61892);
  }

  public final void bAZ()
  {
    AppMethodBeat.i(61893);
    if (FTSMainUI.h(this.mJJ).getVisibility() == 0)
      FTSMainUI.i(this.mJJ).onResume();
    AppMethodBeat.o(61893);
  }

  public final void bBa()
  {
    AppMethodBeat.i(61894);
    if (FTSMainUI.h(this.mJJ).getVisibility() == 0)
      FTSMainUI.i(this.mJJ).onPause();
    AppMethodBeat.o(61894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.19
 * JD-Core Version:    0.6.2
 */