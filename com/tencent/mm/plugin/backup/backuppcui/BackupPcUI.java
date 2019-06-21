package com.tencent.mm.plugin.backup.backuppcui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.c;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.c;
import com.tencent.mm.plugin.backup.backuppcmodel.d;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class BackupPcUI extends MMWizardActivity
{
  private static boolean gqB = false;
  private TextView juU;
  private TextView juV;
  private TextView juW;
  private TextView juX;
  private TextView juY;
  private ImageView juZ;
  public b.c jwO;

  public BackupPcUI()
  {
    AppMethodBeat.i(17617);
    this.jwO = new BackupPcUI.3(this);
    AppMethodBeat.o(17617);
  }

  private void aTP()
  {
    AppMethodBeat.i(17626);
    ab.i("MicroMsg.BackupPcUI", "exitBackupPc.");
    if ((1 == b.aTD().aTE().jwa) || (3 == b.aTD().aTE().jwa))
    {
      b.aTD().aTH().cancel();
      b.aTD().aTH().aTC();
      b.aTD().aTF().cancel(true);
      b.aTD().aTa().stop();
      b.aTD().aSu().jqW = -100;
      Ni(1);
      AppMethodBeat.o(17626);
    }
    while (true)
    {
      return;
      if ((2 == b.aTD().aTE().jwa) || (4 == b.aTD().aTE().jwa))
      {
        b.aTD().aTG().c(true, true, -100);
        b.aTD().aTa().stop();
      }
      AppMethodBeat.o(17626);
    }
  }

  private void aTw()
  {
    AppMethodBeat.i(17625);
    int i = b.aTD().aSu().jqW;
    int j = b.aTD().aTE().jwa;
    ab.i("MicroMsg.BackupPcUI", "closeImpl, backupPcState:%d, commandMode:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    switch (i)
    {
    default:
      Ni(1);
      AppMethodBeat.o(17625);
    case 15:
    case -22:
    case -21:
    case -13:
    case -5:
    case -3:
    case -2:
    case -1:
    case 1:
    case 11:
    case 21:
    case 27:
    case 24:
    case 26:
    case 30:
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupPcUI", "closeImpl backup finish, user click close.");
      aTP();
      AppMethodBeat.o(17625);
      continue;
      if ((1 == j) || (3 == j))
      {
        b.aTD().aTF().cancel(false);
        b.aTD().aSu().jqW = -100;
        break;
      }
      if ((2 == j) || (4 == j))
      {
        b.aTD().aTG().c(false, false, -100);
        AppMethodBeat.o(17625);
      }
      else
      {
        b.aTD().aSu().jqW = -100;
        break;
        ab.i("MicroMsg.BackupPcUI", "closeImpl recover finish, user click close.");
        aTP();
        AppMethodBeat.o(17625);
        continue;
        b.aTD().aSu().jqW = 25;
        break;
        com.tencent.mm.ui.base.h.a(this, 2131297290, 2131297289, 2131297340, 2131297189, false, new BackupPcUI.2(this), null, 2131689745);
        AppMethodBeat.o(17625);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968797;
  }

  public final void initView()
  {
    AppMethodBeat.i(17622);
    this.juY = ((TextView)findViewById(2131821585));
    this.juZ = ((ImageView)findViewById(2131821586));
    this.juW = ((TextView)findViewById(2131821587));
    this.juX = ((TextView)findViewById(2131821588));
    this.juU = ((TextView)findViewById(2131821590));
    this.juV = ((TextView)findViewById(2131821589));
    AppMethodBeat.o(17622);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17618);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17618);
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupPcUI", "onCreate.");
      getSupportActionBar().hide();
      com.tencent.mm.plugin.backup.a.gkE.BV();
      initView();
      if (b.aTD().aTE().jwh)
      {
        b.aTD().aTE().jwh = false;
        int i = g.aSG();
        if (i < 50)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(400L, 4L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(13736, new Object[] { Integer.valueOf(4), b.aTD().aTE().jwb, g.ds(this), Integer.valueOf(0), Integer.valueOf(b.aTD().aTE().jwg) });
          com.tencent.mm.ui.base.h.a(this, 2131297297, 2131297296, 2131297363, 0, false, new BackupPcUI.1(this, i), null, 2131689744);
        }
      }
      AppMethodBeat.o(17618);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17623);
    ab.i("MicroMsg.BackupPcUI", "onDestroy. stack:%s", new Object[] { bo.dpG() });
    super.onDestroy();
    AppMethodBeat.o(17623);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(17624);
    boolean bool;
    if (paramInt == 4)
    {
      aTw();
      bool = true;
      AppMethodBeat.o(17624);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17624);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(17620);
    super.onPause();
    ab.i("MicroMsg.BackupPcUI", "onPause.");
    Object localObject1 = b.aTD().aTF();
    Object localObject4 = this.jwO;
    synchronized (((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).jwm)
    {
      ((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).jwm.remove(localObject4);
      localObject4 = b.aTD().aTG();
      localObject1 = this.jwO;
    }
    synchronized (((d)localObject4).jwm)
    {
      ((d)localObject4).jwm.remove(localObject1);
      AppMethodBeat.o(17620);
      return;
      localObject2 = finally;
      AppMethodBeat.o(17620);
      throw localObject2;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(17621);
    super.onResume();
    ab.i("MicroMsg.BackupPcUI", "onResume.");
    Object localObject1 = b.aTD().aTF();
    Object localObject2 = this.jwO;
    synchronized (((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).jwm)
    {
      ((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).jwm.add(localObject2);
      localObject2 = b.aTD().aTG();
      localObject1 = this.jwO;
    }
    synchronized (((d)localObject2).jwm)
    {
      ((d)localObject2).jwm.add(localObject1);
      int i = b.aTD().aSu().jqW;
      this.jwO.rj(i);
      AppMethodBeat.o(17621);
      return;
      localObject3 = finally;
      AppMethodBeat.o(17621);
      throw localObject3;
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(17619);
    super.onStart();
    ab.i("MicroMsg.BackupPcUI", "onStart.");
    gqB = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    AppMethodBeat.o(17619);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI
 * JD-Core Version:    0.6.2
 */