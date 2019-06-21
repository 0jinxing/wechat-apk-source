package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupMoveRecoverUI$1$8$1
  implements DialogInterface.OnClickListener
{
  BackupMoveRecoverUI$1$8$1(BackupMoveRecoverUI.1.8 param8)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17367);
    ab.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", new Object[] { Integer.valueOf(this.jvf.jtO) });
    h.pYm.a(485L, 44L, 1L, false);
    b.aSZ().aTc().rn(6);
    b.aSZ().aTa().stop();
    b.aSZ().aTc().c(true, true, -100);
    AppMethodBeat.o(17367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.8.1
 * JD-Core Version:    0.6.2
 */