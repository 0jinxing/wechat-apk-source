package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupPcUI$3$16$1
  implements DialogInterface.OnClickListener
{
  BackupPcUI$3$16$1(BackupPcUI.3.16 param16)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17610);
    ab.i("MicroMsg.BackupPcUI", "user click close. stop backup.");
    b.aTD().aTa().stop();
    b.aTD().aTF().cancel(true);
    b.aTD().aSu().jqW = -100;
    h.pYm.a(400L, 52L, 1L, false);
    b.aTD().aTF().rt(4);
    BackupPcUI.k(this.jwW.jwQ.jwP);
    AppMethodBeat.o(17610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.16.1
 * JD-Core Version:    0.6.2
 */