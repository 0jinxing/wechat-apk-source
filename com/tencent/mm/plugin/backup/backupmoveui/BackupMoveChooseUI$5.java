package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.res.Resources;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.c.b.b;
import java.util.LinkedList;

final class BackupMoveChooseUI$5
  implements b.b
{
  BackupMoveChooseUI$5(BackupMoveChooseUI paramBackupMoveChooseUI)
  {
  }

  public final void B(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17328);
    if (paramLinkedList == null)
      AppMethodBeat.o(17328);
    while (true)
    {
      return;
      if (paramLinkedList.size() == 0)
      {
        BackupMoveChooseUI.b(this.juN).setVisibility(8);
        BackupMoveChooseUI.c(this.juN).setVisibility(0);
        switch (BackupMoveChooseUI.access$100())
        {
        default:
        case 0:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(17328);
          break;
          BackupMoveChooseUI.c(this.juN).setText(2131297200);
          AppMethodBeat.o(17328);
          break;
          BackupMoveChooseUI.c(this.juN).setText(2131297348);
        }
      }
      BackupMoveChooseUI.d(this.juN).setClickable(true);
      BackupMoveChooseUI.d(this.juN).setTextColor(this.juN.getResources().getColor(2131689744));
      BackupMoveChooseUI.b(this.juN).setVisibility(8);
      BackupMoveChooseUI.a(this.juN).notifyDataSetChanged();
      AppMethodBeat.o(17328);
    }
  }

  public final void C(LinkedList<f.b> paramLinkedList)
  {
  }

  public final void a(LinkedList<f.b> paramLinkedList, f.b paramb, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.5
 * JD-Core Version:    0.6.2
 */