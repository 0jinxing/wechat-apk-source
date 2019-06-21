package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMLoadMoreListView$1
  implements AbsListView.OnScrollListener
{
  MMLoadMoreListView$1(MMLoadMoreListView paramMMLoadMoreListView)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(106687);
    if ((paramInt1 == 0) && (this.yvS.getChildAt(0) != null) && (this.yvS.getChildAt(0).getTop() == this.yvS.getPaddingTop()))
      MMLoadMoreListView.a(this.yvS, true);
    while (true)
    {
      ab.d("MMLoadMoreListView", "newpoi scroll2Top %s", new Object[] { MMLoadMoreListView.b(this.yvS) });
      AppMethodBeat.o(106687);
      return;
      MMLoadMoreListView.a(this.yvS, false);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(106686);
    if ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (MMLoadMoreListView.a(this.yvS) != null))
      MMLoadMoreListView.a(this.yvS).KB();
    AppMethodBeat.o(106686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMLoadMoreListView.1
 * JD-Core Version:    0.6.2
 */