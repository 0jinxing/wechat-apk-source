package com.tencent.mm.ui.base;

import android.os.Handler;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$d
  implements AbsListView.OnScrollListener
{
  private MMListPopupWindow$d(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112516);
    if ((MMListPopupWindow.a(this.yvN) != null) && (MMListPopupWindow.e(this.yvN) != null) && (MMListPopupWindow.f(this.yvN) != null) && (MMListPopupWindow.a(this.yvN) != null))
      if ((MMListPopupWindow.a(this.yvN).getLastVisiblePosition() == MMListPopupWindow.f(this.yvN).getCount() - 1) && (MMListPopupWindow.a(this.yvN).getChildAt(MMListPopupWindow.a(this.yvN).getChildCount() - 1) != null) && (MMListPopupWindow.a(this.yvN).getChildAt(MMListPopupWindow.a(this.yvN).getChildCount() - 1).getBottom() <= MMListPopupWindow.a(this.yvN).getHeight()))
      {
        MMListPopupWindow.e(this.yvN).setVisibility(8);
        AppMethodBeat.o(112516);
      }
    while (true)
    {
      return;
      MMListPopupWindow.e(this.yvN).setVisibility(0);
      AppMethodBeat.o(112516);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(112517);
    if ((paramInt == 1) && (!this.yvN.isInputMethodNotNeeded()) && (MMListPopupWindow.b(this.yvN).getContentView() != null))
    {
      MMListPopupWindow.d(this.yvN).removeCallbacks(MMListPopupWindow.c(this.yvN));
      MMListPopupWindow.c(this.yvN).run();
    }
    AppMethodBeat.o(112517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.d
 * JD-Core Version:    0.6.2
 */