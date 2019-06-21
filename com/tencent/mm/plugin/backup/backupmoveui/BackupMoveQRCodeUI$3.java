package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.d;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupMoveQRCodeUI$3
  implements DialogInterface.OnClickListener
{
  BackupMoveQRCodeUI$3(BackupMoveQRCodeUI paramBackupMoveQRCodeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17347);
    ab.i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
    b.aSZ().aTa().stop();
    b.aSZ().aTb().cancel(true);
    b.aSZ().aSu().jqW = -100;
    BackupMoveQRCodeUI.g(this.juS);
    AppMethodBeat.o(17347);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI.3
 * JD-Core Version:    0.6.2
 */