package com.tencent.mm.plugin.backup.backuppcui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.a;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.ui.MMWizardActivity;

final class BackupPcUI$3$9
  implements View.OnClickListener
{
  BackupPcUI$3$9(BackupPcUI.3 param3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17602);
    paramView = new Intent(this.jwQ.jwP, BackupPcChooseUI.class);
    MMWizardActivity.J(this.jwQ.jwP, paramView);
    b.aTD().aTH().cancel();
    b.aTD().aTH().aTC();
    b.aTD().aTH().fn(false);
    AppMethodBeat.o(17602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.9
 * JD-Core Version:    0.6.2
 */