package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class AutoFillListPopupWindowBase$d
  implements AbsListView.OnScrollListener
{
  private AutoFillListPopupWindowBase$d(AutoFillListPopupWindowBase paramAutoFillListPopupWindowBase)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(123918);
    if ((AutoFillListPopupWindowBase.a(this.jib) != null) && (AutoFillListPopupWindowBase.e(this.jib) != null) && (AutoFillListPopupWindowBase.f(this.jib) != null) && (AutoFillListPopupWindowBase.a(this.jib) != null))
      if ((AutoFillListPopupWindowBase.a(this.jib).getLastVisiblePosition() == AutoFillListPopupWindowBase.f(this.jib).getCount() - 1) && (AutoFillListPopupWindowBase.a(this.jib).getChildAt(AutoFillListPopupWindowBase.a(this.jib).getChildCount() - 1) != null) && (AutoFillListPopupWindowBase.a(this.jib).getChildAt(AutoFillListPopupWindowBase.a(this.jib).getChildCount() - 1).getBottom() <= AutoFillListPopupWindowBase.a(this.jib).getHeight()))
      {
        AutoFillListPopupWindowBase.e(this.jib).setVisibility(8);
        AppMethodBeat.o(123918);
      }
    while (true)
    {
      return;
      AutoFillListPopupWindowBase.e(this.jib).setVisibility(0);
      AppMethodBeat.o(123918);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(123919);
    if ((paramInt == 1) && (!this.jib.isInputMethodNotNeeded()) && (AutoFillListPopupWindowBase.b(this.jib).getContentView() != null))
    {
      AutoFillListPopupWindowBase.d(this.jib).removeCallbacks(AutoFillListPopupWindowBase.c(this.jib));
      AutoFillListPopupWindowBase.c(this.jib).run();
    }
    AppMethodBeat.o(123919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase.d
 * JD-Core Version:    0.6.2
 */