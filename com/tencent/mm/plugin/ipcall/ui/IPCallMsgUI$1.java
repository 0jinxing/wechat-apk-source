package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class IPCallMsgUI$1
  implements MMSlideDelView.c
{
  IPCallMsgUI$1(IPCallMsgUI paramIPCallMsgUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(22186);
    int i = IPCallMsgUI.a(this.nDt).getPositionForView(paramView);
    AppMethodBeat.o(22186);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.1
 * JD-Core Version:    0.6.2
 */