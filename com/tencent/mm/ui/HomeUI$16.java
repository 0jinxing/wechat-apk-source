package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.r.a;

final class HomeUI$16
  implements Runnable
{
  HomeUI$16(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29362);
    if ((a.bI(HomeUI.b(this.yjm))) && (!a.bH(HomeUI.b(this.yjm))))
      AppMethodBeat.o(29362);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("BaseScanUI_select_scan_mode", 1);
      localIntent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      localIntent.setFlags(65536);
      h.pYm.e(11409, new Object[0]);
      d.b(HomeUI.b(this.yjm), "scanner", ".ui.BaseScanUI", localIntent);
      AppMethodBeat.o(29362);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.16
 * JD-Core Version:    0.6.2
 */