package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BackupMoveRecoverUI$1$7
  implements View.OnClickListener
{
  BackupMoveRecoverUI$1$7(BackupMoveRecoverUI.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17366);
    h.pYm.e(11789, new Object[] { Integer.valueOf(7) });
    paramView = new Intent();
    paramView.putExtra("BaseScanUI_select_scan_mode", 1);
    paramView.setFlags(268435456);
    d.b(this.jvd.jvc.mController.ylL, "scanner", ".ui.BaseScanUI", paramView);
    AppMethodBeat.o(17366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.7
 * JD-Core Version:    0.6.2
 */