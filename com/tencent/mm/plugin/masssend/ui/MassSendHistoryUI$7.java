package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.d;

final class MassSendHistoryUI$7
  implements MMPullDownView.d
{
  MassSendHistoryUI$7(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(22800);
    View localView = MassSendHistoryUI.d(this.ooZ).getChildAt(MassSendHistoryUI.d(this.ooZ).getFirstVisiblePosition());
    boolean bool;
    if ((localView != null) && (localView.getTop() == 0))
    {
      bool = true;
      AppMethodBeat.o(22800);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22800);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.7
 * JD-Core Version:    0.6.2
 */