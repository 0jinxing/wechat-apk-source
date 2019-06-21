package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;

final class BackupUI$1
  implements View.OnClickListener
{
  BackupUI$1(BackupUI paramBackupUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17428);
    aw.ZK();
    if (((Boolean)c.Ry().get(ac.a.xPF, Boolean.FALSE)).booleanValue())
    {
      if (com.tencent.mm.plugin.backup.d.b.aSZ().aSu().jqW == -100)
      {
        aw.ZK();
        c.Ry().set(ac.a.xPF, Boolean.FALSE);
      }
    }
    else
    {
      aw.ZK();
      if (!((Boolean)c.Ry().get(ac.a.xPB, Boolean.FALSE)).booleanValue())
      {
        aw.ZK();
        if (!((Boolean)c.Ry().get(ac.a.xPC, Boolean.FALSE)).booleanValue());
      }
      else
      {
        if (com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW != -100)
          break label285;
        aw.ZK();
        c.Ry().set(ac.a.xPB, Boolean.FALSE);
        aw.ZK();
        c.Ry().set(ac.a.xPC, Boolean.FALSE);
      }
      final int i = g.aSG();
      if (i >= 50)
        break label333;
      com.tencent.mm.plugin.report.service.h.pYm.a(485L, 7L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(11787, new Object[] { Integer.valueOf(4) });
      com.tencent.mm.ui.base.h.a(this.jvo, 2131297218, 2131297217, 2131297363, 2131297189, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(17427);
          ab.i("MicroMsg.BackupUI", "low battery, user click sure. battery:%d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.plugin.report.service.h.pYm.a(485L, 21L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(11788, new Object[] { Integer.valueOf(3) });
          paramAnonymousDialogInterface = new Intent(BackupUI.1.this.jvo, BackupMoveChooseUI.class);
          MMWizardActivity.J(BackupUI.1.this.jvo, paramAnonymousDialogInterface);
          AppMethodBeat.o(17427);
        }
      }
      , null, 2131689744);
      AppMethodBeat.o(17428);
    }
    while (true)
    {
      return;
      paramView = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
      paramView.addFlags(335544320);
      paramView.putExtra("nofification_type", "backup_move_notification");
      ah.getContext().startActivity(paramView);
      AppMethodBeat.o(17428);
      continue;
      label285: paramView = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
      paramView.addFlags(335544320);
      paramView.putExtra("nofification_type", "back_to_pcmgr_notification");
      ah.getContext().startActivity(paramView);
      AppMethodBeat.o(17428);
      continue;
      label333: com.tencent.mm.plugin.report.service.h.pYm.a(485L, 21L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(11788, new Object[] { Integer.valueOf(3) });
      paramView = new Intent(this.jvo, BackupMoveChooseUI.class);
      MMWizardActivity.J(this.jvo, paramView);
      AppMethodBeat.o(17428);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupUI.1
 * JD-Core Version:    0.6.2
 */