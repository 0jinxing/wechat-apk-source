package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.a;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.c;
import com.tencent.mm.plugin.report.service.h;

final class BackupPcUI$3$1$1
  implements DialogInterface.OnClickListener
{
  BackupPcUI$3$1$1(BackupPcUI.3.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17590);
    b.aTD().aTE().rs(2);
    b.aTD().aSu().jqW = 12;
    this.jwR.jwQ.rj(12);
    b.aTD().aTH().aTC();
    b.aTD().aTH().fn(true);
    h.pYm.a(400L, 7L, 1L, false);
    h.pYm.e(13735, new Object[] { Integer.valueOf(9), Integer.valueOf(b.aTD().aTE().jwg) });
    AppMethodBeat.o(17590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.1.1
 * JD-Core Version:    0.6.2
 */