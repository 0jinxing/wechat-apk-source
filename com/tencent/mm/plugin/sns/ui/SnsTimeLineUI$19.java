package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsTimeLineUI$19
  implements Runnable
{
  SnsTimeLineUI$19(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39471);
    q localq = this.rzs.mController;
    if (localq.mContext != null)
      localq.ap(localq.ylL);
    SnsTimeLineUI.t(this.rzs);
    SnsTimeLineUI.u(this.rzs);
    this.rzs.setMMTitle(this.rzs.getString(2131303831));
    SnsTimeLineUI.v(this.rzs);
    SnsTimeLineUI.c(this.rzs, SnsTimeLineUI.j(this.rzs).nDp.getFirstVisiblePosition());
    AppMethodBeat.o(39471);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.19
 * JD-Core Version:    0.6.2
 */