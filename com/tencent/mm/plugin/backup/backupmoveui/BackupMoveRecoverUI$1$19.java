package com.tencent.mm.plugin.backup.backupmoveui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class BackupMoveRecoverUI$1$19
  implements View.OnClickListener
{
  BackupMoveRecoverUI$1$19(BackupMoveRecoverUI.1 param1, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17382);
    ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click stop merge button.");
    h.a(this.jvd.jvc, 2131297208, 2131297207, 2131297254, 2131297189, false, new BackupMoveRecoverUI.1.19.1(this), null, 2131689745);
    AppMethodBeat.o(17382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.19
 * JD-Core Version:    0.6.2
 */