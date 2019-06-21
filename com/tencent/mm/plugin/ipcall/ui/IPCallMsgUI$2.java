package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class IPCallMsgUI$2
  implements MMSlideDelView.g
{
  IPCallMsgUI$2(IPCallMsgUI paramIPCallMsgUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22187);
    IPCallMsgUI.a(this.nDt).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(22187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.2
 * JD-Core Version:    0.6.2
 */