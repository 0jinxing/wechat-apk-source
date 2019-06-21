package com.tencent.mm.plugin.backup.backupmoveui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.d.b;
import java.util.HashSet;

final class BackupMoveChooseUI$4
  implements View.OnClickListener
{
  BackupMoveChooseUI$4(BackupMoveChooseUI paramBackupMoveChooseUI)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(17327);
    if (b.aSZ().aTd().jsY)
    {
      paramView = BackupMoveChooseUI.a(this.juN);
      if (paramView.jur.size() != paramView.getCount())
        break label76;
      paramView.jur.clear();
    }
    for (paramView.jus = false; ; paramView.jus = true)
    {
      paramView.notifyDataSetChanged();
      paramView.juq.a(paramView.jur);
      AppMethodBeat.o(17327);
      return;
      label76: 
      while (i < paramView.getCount())
      {
        paramView.jur.add(Integer.valueOf(i));
        i++;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.4
 * JD-Core Version:    0.6.2
 */