package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.websearch.api.d;
import com.tencent.mm.protocal.protobuf.brd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class FTSMainUI$9
  implements d
{
  FTSMainUI$9(FTSMainUI paramFTSMainUI)
  {
  }

  public final void a(boolean paramBoolean, brd parambrd, String paramString1, String paramString2)
  {
    AppMethodBeat.i(61874);
    if (!this.mJJ.query.equals(paramString2))
    {
      ab.i("MicroMsg.FTS.FTSMainUI", "IRelevantSearchCallback callback with query %s, current query is %s ", new Object[] { paramString2, this.mJJ.query });
      AppMethodBeat.o(61874);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        if (FTSMainUI.b(this.mJJ).getVisibility() == 0)
        {
          FTSLocalPageRelevantView localFTSLocalPageRelevantView = FTSMainUI.f(this.mJJ);
          int i;
          if ((parambrd == null) || (parambrd.vHk == null))
          {
            ab.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configRelevantDatas param nil!");
            i = 0;
          }
          while (true)
          {
            if (i == 0)
              break label277;
            FTSMainUI.f(this.mJJ).setVisibility(0);
            AppMethodBeat.o(61874);
            break;
            List localList = FTSLocalPageRelevantView.ca(parambrd.vHk);
            if (localList.size() <= 0)
            {
              ab.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configRelevantDatas size 0 items!");
              i = 0;
            }
            else
            {
              localFTSLocalPageRelevantView.query = paramString2;
              localFTSLocalPageRelevantView.hlm = paramString1;
              localFTSLocalPageRelevantView.mMc = parambrd.vHk;
              if (localFTSLocalPageRelevantView.jbJ == null)
              {
                localFTSLocalPageRelevantView.jbJ = new LinearLayout(localFTSLocalPageRelevantView.getContext());
                localFTSLocalPageRelevantView.jbJ.setOrientation(1);
                parambrd = (LinearLayout.LayoutParams)localFTSLocalPageRelevantView.getLayoutParams();
                parambrd.width = -1;
                parambrd.height = -2;
                localFTSLocalPageRelevantView.addView(localFTSLocalPageRelevantView.jbJ, parambrd);
              }
              localFTSLocalPageRelevantView.b(localList, localFTSLocalPageRelevantView.jbJ);
              localFTSLocalPageRelevantView.requestLayout();
              i = 1;
            }
          }
        }
      }
      else
        FTSMainUI.f(this.mJJ).setVisibility(8);
      label277: AppMethodBeat.o(61874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.9
 * JD-Core Version:    0.6.2
 */