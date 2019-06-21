package com.tencent.mm.plugin.backup.backuppcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.backup.c.a;

final class BackupPcUI$3$10
  implements View.OnClickListener
{
  BackupPcUI$3$10(BackupPcUI.3 param3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17603);
    b.aTD().aTa().stop();
    b.aTD().aTF().cancel(true);
    b.aTD().aSu().jqW = -100;
    BackupPcUI.g(this.jwQ.jwP);
    AppMethodBeat.o(17603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.10
 * JD-Core Version:    0.6.2
 */