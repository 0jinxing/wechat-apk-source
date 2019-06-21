package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.a;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.c;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.report.service.h;
import java.util.LinkedList;

final class BackupPcChooseUI$2$1
  implements DialogInterface.OnClickListener
{
  BackupPcChooseUI$2$1(BackupPcChooseUI.2 param2, LinkedList paramLinkedList1, LinkedList paramLinkedList2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17574);
    b.aTD().aTH().F(this.jwL);
    b.aTD().aTE().rs(2);
    b.aTD().aSu().jqW = 12;
    b.aTD().aTF().G(this.jwM);
    b.aTD().aTF().gx(this.jwL.size());
    h.pYm.a(400L, 8L, 1L, false);
    h.pYm.e(13735, new Object[] { Integer.valueOf(10), Integer.valueOf(b.aTD().aTE().jwg) });
    if ((BackupPcChooseUI.access$100() == 1) && (BackupPcChooseUI.access$400() == 1))
    {
      h.pYm.a(400L, 32L, 1L, false);
      h.pYm.a(400L, 35L, 1L, false);
      h.pYm.e(13735, new Object[] { Integer.valueOf(13), Integer.valueOf(b.aTD().aTE().jwg) });
    }
    while (true)
    {
      this.jwN.jwK.finish();
      AppMethodBeat.o(17574);
      return;
      if (BackupPcChooseUI.access$100() == 1)
      {
        h.pYm.a(400L, 32L, 1L, false);
        h.pYm.e(13735, new Object[] { Integer.valueOf(11), Integer.valueOf(b.aTD().aTE().jwg) });
      }
      else if (BackupPcChooseUI.access$400() == 1)
      {
        h.pYm.a(400L, 35L, 1L, false);
        h.pYm.e(13735, new Object[] { Integer.valueOf(12), Integer.valueOf(b.aTD().aTE().jwg) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcChooseUI.2.1
 * JD-Core Version:    0.6.2
 */