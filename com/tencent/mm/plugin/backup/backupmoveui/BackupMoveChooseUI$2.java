package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.d.a.2;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.HashSet;
import java.util.LinkedList;

final class BackupMoveChooseUI$2
  implements View.OnClickListener
{
  BackupMoveChooseUI$2(BackupMoveChooseUI paramBackupMoveChooseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17325);
    Object localObject1 = new PLong();
    Object localObject2 = new PInt();
    a locala = BackupMoveChooseUI.a(this.juN);
    paramView = new LinkedList();
    if (locala.jur.size() <= 0)
    {
      localObject2 = g.A(paramView);
      localObject1 = com.tencent.mm.plugin.backup.d.b.aSZ().aTd();
      if (paramView.size() != 0)
        break label615;
      ((com.tencent.mm.plugin.backup.d.a)localObject1).jsX = new LinkedList();
      label80: paramView = com.tencent.mm.plugin.backup.d.b.aSZ().aTb();
      paramView.jtQ = ((LinkedList)localObject2);
      com.tencent.mm.plugin.backup.d.b.aSZ();
      if (com.tencent.mm.plugin.backup.d.b.aSz().getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0) != 1)
        break label666;
      com.tencent.mm.plugin.backup.d.d.jtX = true;
      label115: com.tencent.mm.plugin.backup.d.b.aSZ();
      paramView.jtT = com.tencent.mm.plugin.backup.d.b.aSz().getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
      com.tencent.mm.plugin.backup.d.b.aSZ();
      paramView.jtU = com.tencent.mm.plugin.backup.d.b.aSz().getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
      com.tencent.mm.plugin.backup.d.b.aSZ();
      if (com.tencent.mm.plugin.backup.d.b.aSz().getInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0) != 1)
        break label673;
      com.tencent.mm.plugin.backup.d.d.jsA = true;
      label176: ab.i("MicroMsg.BackupMoveServer", "setBakupChooseData users size[%d], selectStartTime[%d], selectEndTime[%d], isQuickBackup[%b]", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()), Long.valueOf(paramView.jtT), Long.valueOf(paramView.jtU), Boolean.valueOf(com.tencent.mm.plugin.backup.d.d.jsA) });
      aw.ZK();
      c.Ry().set(ac.a.xPE, Boolean.TRUE);
      paramView = com.tencent.mm.plugin.backup.d.b.aSZ().aTd();
      if (paramView.jsS != null)
        paramView.jsS.cancel();
      com.tencent.mm.sdk.g.d.post(new a.2(paramView), "BakMoveChooseServer.calculateChooseConvSize");
      if (BackupMoveChooseUI.a(this.juN).jus)
      {
        h.pYm.a(485L, 22L, 1L, false);
        h.pYm.e(11788, new Object[] { Integer.valueOf(4) });
      }
      if ((BackupMoveChooseUI.access$100() != 1) || (BackupMoveChooseUI.access$200() != 1))
        break label680;
      h.pYm.a(485L, 26L, 1L, false);
      h.pYm.a(485L, 27L, 1L, false);
      h.pYm.e(11788, new Object[] { Integer.valueOf(7) });
    }
    while (true)
    {
      h.pYm.e(11788, new Object[] { Integer.valueOf(8) });
      paramView = new Intent(this.juN, BackupMoveQRCodeUI.class);
      MMWizardActivity.J(this.juN, paramView);
      h.pYm.a(485L, 23L, 1L, false);
      AppMethodBeat.o(17325);
      return;
      ((PLong)localObject1).value = 0L;
      ((PInt)localObject2).value = 0;
      LinkedList localLinkedList = com.tencent.mm.plugin.backup.d.b.aSZ().aTd().aSV();
      if (localLinkedList != null)
        for (int i = 0; i < locala.getCount(); i++)
          if (locala.jur.contains(Integer.valueOf(i)))
          {
            paramView.add(localLinkedList.get(i));
            ((PLong)localObject1).value += ((f.b)localLinkedList.get(i)).jri;
            ((PInt)localObject2).value = ((int)(((PInt)localObject2).value + ((f.b)localLinkedList.get(i)).jrj));
          }
      ab.i("MicroMsg.BackupMoveChooseAdapter", "finishSelected usernameSize:%d, convSize:%d, convMsgCount:%d", new Object[] { Integer.valueOf(paramView.size()), Long.valueOf(((PLong)localObject1).value), Integer.valueOf(((PInt)localObject2).value) });
      break;
      label615: ((com.tencent.mm.plugin.backup.d.a)localObject1).jsX = new LinkedList(paramView.subList(paramView.size() * 3 / 4, paramView.size()));
      ((com.tencent.mm.plugin.backup.d.a)localObject1).jsX.addAll(paramView.subList(0, paramView.size() * 3 / 4));
      break label80;
      label666: com.tencent.mm.plugin.backup.d.d.jtX = false;
      break label115;
      label673: com.tencent.mm.plugin.backup.d.d.jsA = false;
      break label176;
      label680: if (BackupMoveChooseUI.access$100() == 1)
      {
        h.pYm.a(485L, 26L, 1L, false);
        h.pYm.e(11788, new Object[] { Integer.valueOf(5) });
      }
      else if (BackupMoveChooseUI.access$200() == 1)
      {
        h.pYm.a(485L, 27L, 1L, false);
        h.pYm.e(11788, new Object[] { Integer.valueOf(6) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.2
 * JD-Core Version:    0.6.2
 */