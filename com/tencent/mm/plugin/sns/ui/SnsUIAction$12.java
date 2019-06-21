package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.d;

final class SnsUIAction$12
  implements MMPullDownView.d
{
  SnsUIAction$12(SnsUIAction paramSnsUIAction)
  {
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(39651);
    View localView = this.rCe.nDp.getChildAt(this.rCe.nDp.getFirstVisiblePosition());
    boolean bool;
    if ((localView != null) && (localView.getTop() == 0))
    {
      bool = true;
      AppMethodBeat.o(39651);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39651);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.12
 * JD-Core Version:    0.6.2
 */