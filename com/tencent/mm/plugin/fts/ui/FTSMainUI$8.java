package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.o;
import java.util.List;

final class FTSMainUI$8
  implements o
{
  FTSMainUI$8(FTSMainUI paramFTSMainUI)
  {
  }

  public final void m(String paramString, List<WidgetData> paramList)
  {
    AppMethodBeat.i(61873);
    if (FTSMainUI.a(this.mJJ))
      FTSMainUI.b(this.mJJ).setVisibility(0);
    if (!this.mJJ.query.equals(paramString))
      AppMethodBeat.o(61873);
    while (true)
    {
      return;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        AppMethodBeat.o(61873);
      }
      else
      {
        if ((FTSMainUI.a(this.mJJ)) && (FTSMainUI.i(this.mJJ) != null))
        {
          FTSMainUI.i(this.mJJ).c(paramList, e.mCM, this.mJJ.query);
          FTSMainUI.i(this.mJJ).show();
          FTSMainUI.h(this.mJJ).setVisibility(0);
        }
        FTSMainUI.r(this.mJJ);
        AppMethodBeat.o(61873);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.8
 * JD-Core Version:    0.6.2
 */