package com.tencent.mm.plugin.backup.backuppcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.c;
import com.tencent.mm.plugin.report.service.h;

final class BackupPcUI$3$11
  implements View.OnClickListener
{
  BackupPcUI$3$11(BackupPcUI.3 param3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17604);
    h.pYm.e(13735, new Object[] { Integer.valueOf(23), Integer.valueOf(b.aTD().aTE().jwg) });
    b.aTD().aTE().rs(4);
    b.aTD().aSu().jqW = 22;
    this.jwQ.rj(22);
    h.pYm.a(400L, 16L, 1L, false);
    AppMethodBeat.o(17604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.11
 * JD-Core Version:    0.6.2
 */