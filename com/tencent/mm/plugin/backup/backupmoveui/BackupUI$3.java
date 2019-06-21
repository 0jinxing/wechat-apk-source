package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class BackupUI$3
  implements ap.a
{
  BackupUI$3(BackupUI paramBackupUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(17430);
    if (bo.isNullOrNil(g.ds(this.jvo)))
      if (BackupUI.access$000())
      {
        BackupUI.a(this.jvo).setText(2131297360);
        BackupUI.a(this.jvo).setTextColor(this.jvo.getResources().getColor(2131689745));
        BackupUI.b(this.jvo).setEnabled(false);
        BackupUI.access$002(false);
        h.pYm.e(11788, new Object[] { Integer.valueOf(2) });
      }
    while (true)
    {
      AppMethodBeat.o(17430);
      return true;
      if (!BackupUI.access$000())
      {
        BackupUI.a(this.jvo).setText(2131297361);
        BackupUI.a(this.jvo).setTextColor(this.jvo.getResources().getColor(2131689746));
        BackupUI.b(this.jvo).setEnabled(true);
        BackupUI.access$002(true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupUI.3
 * JD-Core Version:    0.6.2
 */