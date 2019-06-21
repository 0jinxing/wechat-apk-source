package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BackupMoveRecoverUI$1$16
  implements View.OnClickListener
{
  BackupMoveRecoverUI$1$16(BackupMoveRecoverUI.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17378);
    ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click scan qrcode.");
    paramView = new Intent();
    paramView.putExtra("BaseScanUI_select_scan_mode", 1);
    paramView.setFlags(268435456);
    d.b(this.jvd.jvc.mController.ylL, "scanner", ".ui.BaseScanUI", paramView);
    AppMethodBeat.o(17378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.16
 * JD-Core Version:    0.6.2
 */