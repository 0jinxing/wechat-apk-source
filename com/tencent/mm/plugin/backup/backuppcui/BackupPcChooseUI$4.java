package com.tencent.mm.plugin.backup.backuppcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import java.util.HashSet;

final class BackupPcChooseUI$4
  implements View.OnClickListener
{
  BackupPcChooseUI$4(BackupPcChooseUI paramBackupPcChooseUI)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(17577);
    if (b.aTD().aTH().jsY)
    {
      paramView = BackupPcChooseUI.a(this.jwK);
      if (paramView.jur.size() != paramView.getCount())
        break label75;
      paramView.jur.clear();
    }
    for (a.jwF = false; ; a.jwF = true)
    {
      paramView.notifyDataSetChanged();
      paramView.jwE.a(paramView.jur);
      AppMethodBeat.o(17577);
      return;
      label75: 
      while (i < paramView.getCount())
      {
        paramView.jur.add(Integer.valueOf(i));
        i++;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcChooseUI.4
 * JD-Core Version:    0.6.2
 */