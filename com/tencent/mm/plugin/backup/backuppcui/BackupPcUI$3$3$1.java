package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupPcUI$3$3$1
  implements DialogInterface.OnClickListener
{
  BackupPcUI$3$3$1(BackupPcUI.3.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17594);
    ab.i("MicroMsg.BackupPcUI", "user click close. stop backup.");
    h.pYm.a(400L, 10L, 1L, false);
    b.aTD().aTF().rt(4);
    b.aTD().aTa().stop();
    b.aTD().aTF().cancel(true);
    b.aTD().aSu().jqW = -100;
    BackupPcUI.l(this.jwT.jwQ.jwP);
    AppMethodBeat.o(17594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.3.1
 * JD-Core Version:    0.6.2
 */