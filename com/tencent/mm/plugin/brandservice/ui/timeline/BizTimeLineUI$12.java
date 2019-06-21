package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BizTimeLineUI$12
  implements Runnable
{
  BizTimeLineUI$12(BizTimeLineUI paramBizTimeLineUI, ProgressDialog paramProgressDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14195);
    if ((this.eiD != null) && (this.eiD.isShowing()))
      this.eiD.dismiss();
    if (this.jOK.isFinishing())
    {
      ab.w("MicroMsg.BizTimeLineUI", "checkInitListView isFinishing, just return");
      AppMethodBeat.o(14195);
    }
    while (true)
    {
      return;
      BizTimeLineUI.a(this.jOK);
      AppMethodBeat.o(14195);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.12
 * JD-Core Version:    0.6.2
 */