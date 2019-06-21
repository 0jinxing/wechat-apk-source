package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.c;

final class SnsUIAction$11
  implements MMPullDownView.c
{
  SnsUIAction$11(SnsUIAction paramSnsUIAction)
  {
  }

  public final boolean bhm()
  {
    AppMethodBeat.i(39650);
    View localView = this.rCe.nDp.getChildAt(this.rCe.nDp.getChildCount() - 1);
    boolean bool;
    if ((localView != null) && (localView.getBottom() <= this.rCe.nDp.getHeight()) && (this.rCe.nDp.getLastVisiblePosition() == this.rCe.nDp.getAdapter().getCount() - 1))
    {
      bool = true;
      AppMethodBeat.o(39650);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39650);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.11
 * JD-Core Version:    0.6.2
 */