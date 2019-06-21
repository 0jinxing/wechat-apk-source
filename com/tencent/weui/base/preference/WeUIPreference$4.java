package com.tencent.weui.base.preference;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WeUIPreference$4
  implements AbsListView.OnScrollListener
{
  WeUIPreference$4(WeUIPreference paramWeUIPreference)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(113263);
    if (1 == paramInt)
    {
      paramAbsListView = this.ALv.getCurrentFocus();
      if (paramAbsListView != null)
        paramAbsListView.clearFocus();
    }
    AppMethodBeat.o(113263);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.WeUIPreference.4
 * JD-Core Version:    0.6.2
 */