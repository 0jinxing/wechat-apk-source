package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreference$4
  implements AbsListView.OnScrollListener
{
  MMPreference$4(MMPreference paramMMPreference)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(107213);
    if (1 == paramInt)
    {
      paramAbsListView = this.yCA.getCurrentFocus();
      if (paramAbsListView != null)
        paramAbsListView.clearFocus();
    }
    AppMethodBeat.o(107213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference.4
 * JD-Core Version:    0.6.2
 */