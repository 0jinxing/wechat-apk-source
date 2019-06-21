package com.tencent.mm.plugin.brandservice.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizSearchResultItemContainer$1
  implements AbsListView.OnScrollListener
{
  boolean jLx = false;

  BizSearchResultItemContainer$1(BizSearchResultItemContainer paramBizSearchResultItemContainer)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt2 == paramInt3);
    for (this.jLx = true; ; this.jLx = false)
      return;
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(13898);
    if ((paramInt == 0) && (this.jLx) && (BizSearchResultItemContainer.a(this.jLy)))
      BizSearchResultItemContainer.a(this.jLy, BizSearchResultItemContainer.b(this.jLy).ctj, BizSearchResultItemContainer.b(this.jLy).offset, BizSearchResultItemContainer.c(this.jLy)[(BizSearchResultItemContainer.c(this.jLy).length - 1)]);
    AppMethodBeat.o(13898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer.1
 * JD-Core Version:    0.6.2
 */