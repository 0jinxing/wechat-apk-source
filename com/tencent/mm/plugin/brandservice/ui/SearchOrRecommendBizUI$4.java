package com.tencent.mm.plugin.brandservice.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper;

final class SearchOrRecommendBizUI$4
  implements View.OnTouchListener
{
  SearchOrRecommendBizUI$4(SearchOrRecommendBizUI paramSearchOrRecommendBizUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(14044);
    SearchOrRecommendBizUI.b(this.jME).clearFocus();
    this.jME.aqX();
    AppMethodBeat.o(14044);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI.4
 * JD-Core Version:    0.6.2
 */