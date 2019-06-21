package com.tencent.mm.plugin.backup.backuppcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.LinkedList;

final class BackupPcChooseUI$2
  implements View.OnClickListener
{
  BackupPcChooseUI$2(BackupPcChooseUI paramBackupPcChooseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17575);
    a locala = BackupPcChooseUI.a(this.jwK);
    paramView = new LinkedList();
    if (locala.jur.size() <= 0);
    LinkedList localLinkedList;
    while (true)
    {
      localLinkedList = g.A(paramView);
      aw.ZK();
      boolean bool = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xPH, Boolean.FALSE)).booleanValue();
      ab.i("MicroMsg.BackupPcChooseUI", "initView OnMenuItemClickListener startbackup choose records finish, selectedConversation size[%d], hasMove[%b], timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramView.size()), Boolean.valueOf(bool), Integer.valueOf(BackupPcChooseUI.access$100()), Long.valueOf(BackupPcChooseUI.access$200()), Long.valueOf(BackupPcChooseUI.aTu()), Integer.valueOf(BackupPcChooseUI.access$400()) });
      if (!bool)
        break;
      com.tencent.mm.ui.base.h.a(this.jwK, 2131297311, 0, 2131297363, 0, false, new BackupPcChooseUI.2.1(this, paramView, localLinkedList), null, 2131689744);
      AppMethodBeat.o(17575);
      return;
      localLinkedList = b.aTD().aTH().aSV();
      if (localLinkedList != null)
        for (int i = 0; i < locala.getCount(); i++)
          if (locala.jur.contains(Integer.valueOf(i)))
            paramView.add(localLinkedList.get(i));
      ab.i("MicroMsg.BackupPcChooseAdapter", "finishSelected usernameSize:%d", new Object[] { Integer.valueOf(paramView.size()) });
    }
    b.aTD().aTH().F(paramView);
    b.aTD().aTE().rs(2);
    b.aTD().aSu().jqW = 12;
    b.aTD().aTF().G(localLinkedList);
    b.aTD().aTF().gx(paramView.size());
    com.tencent.mm.plugin.report.service.h.pYm.a(400L, 8L, 1L, false);
    com.tencent.mm.plugin.report.service.h.pYm.e(13735, new Object[] { Integer.valueOf(10), Integer.valueOf(b.aTD().aTE().jwg) });
    if ((BackupPcChooseUI.access$100() == 1) && (BackupPcChooseUI.access$400() == 1))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(400L, 32L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(400L, 35L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(13735, new Object[] { Integer.valueOf(13), Integer.valueOf(b.aTD().aTE().jwg) });
    }
    while (true)
    {
      this.jwK.finish();
      AppMethodBeat.o(17575);
      break;
      if (BackupPcChooseUI.access$100() == 1)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(400L, 32L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(13735, new Object[] { Integer.valueOf(11), Integer.valueOf(b.aTD().aTE().jwg) });
      }
      else if (BackupPcChooseUI.access$400() == 1)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(400L, 35L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(13735, new Object[] { Integer.valueOf(12), Integer.valueOf(b.aTD().aTE().jwg) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcChooseUI.2
 * JD-Core Version:    0.6.2
 */