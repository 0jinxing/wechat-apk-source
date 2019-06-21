package com.tencent.mm.plugin.backup.backuppcui;

import android.content.res.Resources;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.c.b.a;
import java.util.LinkedList;

final class BackupPcChooseUI$5
  implements b.a
{
  BackupPcChooseUI$5(BackupPcChooseUI paramBackupPcChooseUI)
  {
  }

  public final void B(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17578);
    if (paramLinkedList == null)
      AppMethodBeat.o(17578);
    while (true)
    {
      return;
      if (paramLinkedList.size() == 0)
      {
        BackupPcChooseUI.b(this.jwK).setVisibility(8);
        BackupPcChooseUI.c(this.jwK).setVisibility(0);
        switch (BackupPcChooseUI.access$100())
        {
        default:
        case 0:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(17578);
          break;
          BackupPcChooseUI.c(this.jwK).setText(2131297278);
          AppMethodBeat.o(17578);
          break;
          BackupPcChooseUI.c(this.jwK).setText(2131297348);
        }
      }
      BackupPcChooseUI.d(this.jwK).setClickable(true);
      BackupPcChooseUI.d(this.jwK).setTextColor(this.jwK.getResources().getColor(2131689744));
      BackupPcChooseUI.b(this.jwK).setVisibility(8);
      BackupPcChooseUI.a(this.jwK).notifyDataSetChanged();
      AppMethodBeat.o(17578);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcChooseUI.5
 * JD-Core Version:    0.6.2
 */