package com.tencent.mm.plugin.masssend.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.g;

final class MassSendHistoryUI$5
  implements MMPullDownView.g
{
  MassSendHistoryUI$5(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final boolean bhn()
  {
    int i = 0;
    AppMethodBeat.i(22798);
    if (MassSendHistoryUI.b(this.ooZ).bdn())
    {
      MassSendHistoryUI.d(this.ooZ).setSelectionFromTop(0, MassSendHistoryUI.c(this.ooZ).getTopHeight());
      AppMethodBeat.o(22798);
      return true;
    }
    c localc = MassSendHistoryUI.b(this.ooZ);
    if (localc.bdn());
    while (true)
    {
      ab.v("MicroMsg.MassSendHistoryUI", "onLoadData add count:".concat(String.valueOf(i)));
      MassSendHistoryUI.b(this.ooZ).a(null, null);
      MassSendHistoryUI.d(this.ooZ).setSelectionFromTop(i, MassSendHistoryUI.c(this.ooZ).getTopHeight());
      AppMethodBeat.o(22798);
      break;
      localc.kmW += 10;
      if (localc.kmW <= localc.enb)
      {
        i = 10;
      }
      else
      {
        localc.kmW = localc.enb;
        i = localc.enb % 10;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.5
 * JD-Core Version:    0.6.2
 */