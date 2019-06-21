package com.tencent.mm.plugin.backup.backuppcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.c;
import com.tencent.mm.plugin.backup.backuppcmodel.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupPcUI$3$12
  implements View.OnClickListener
{
  BackupPcUI$3$12(BackupPcUI.3 param3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17605);
    ab.i("MicroMsg.BackupPcUI", "onUpdateUIProgress user click start merge.");
    b.aTD().aTG();
    if (!d.aTe())
    {
      b.aTD().aTG();
      if (!d.aTe())
      {
        b.aTD().aSu().jqW = -22;
        this.jwQ.rj(-22);
        h.pYm.a(400L, 64L, 1L, false);
        AppMethodBeat.o(17605);
      }
    }
    while (true)
    {
      return;
      h.pYm.e(13735, new Object[] { Integer.valueOf(27), Integer.valueOf(b.aTD().aTE().jwg) });
      b.aTD().aTG().aSL();
      AppMethodBeat.o(17605);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.12
 * JD-Core Version:    0.6.2
 */