package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.c;

final class MassSendHistoryUI$6
  implements MMPullDownView.c
{
  MassSendHistoryUI$6(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final boolean bhm()
  {
    AppMethodBeat.i(22799);
    boolean bool;
    if ((MassSendHistoryUI.d(this.ooZ).getChildAt(MassSendHistoryUI.d(this.ooZ).getChildCount() - 1).getBottom() <= MassSendHistoryUI.d(this.ooZ).getHeight()) && (MassSendHistoryUI.d(this.ooZ).getLastVisiblePosition() == MassSendHistoryUI.d(this.ooZ).getAdapter().getCount() - 1))
    {
      bool = true;
      AppMethodBeat.o(22799);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22799);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.6
 * JD-Core Version:    0.6.2
 */