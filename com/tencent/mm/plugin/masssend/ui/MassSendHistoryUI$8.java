package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.p.a;

final class MassSendHistoryUI$8
  implements p.a
{
  MassSendHistoryUI$8(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(22801);
    MassSendHistoryUI.c(this.ooZ).setIsTopShowAll(MassSendHistoryUI.b(this.ooZ).bdn());
    if (MassSendHistoryUI.b(this.ooZ).getCount() == 0)
    {
      MassSendHistoryUI.c(this.ooZ).setVisibility(8);
      MassSendHistoryUI.e(this.ooZ).setVisibility(0);
      MassSendHistoryUI.f(this.ooZ).setVisibility(8);
      AppMethodBeat.o(22801);
    }
    while (true)
    {
      return;
      MassSendHistoryUI.c(this.ooZ).setVisibility(0);
      MassSendHistoryUI.e(this.ooZ).setVisibility(8);
      MassSendHistoryUI.f(this.ooZ).setVisibility(0);
      AppMethodBeat.o(22801);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.8
 * JD-Core Version:    0.6.2
 */