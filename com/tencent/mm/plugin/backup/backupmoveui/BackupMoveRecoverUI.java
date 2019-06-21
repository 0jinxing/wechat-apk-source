package com.tencent.mm.plugin.backup.backupmoveui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.widget.progress.RoundProgressBtn;
import java.lang.reflect.Method;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveRecoverUI extends MMWizardActivity
{
  private static boolean gqB = false;
  private static boolean jvb = false;
  private b.d jsv;
  public TextView juU;
  public TextView juV;
  public TextView juW;
  public TextView juX;
  public TextView juY;
  public ImageView juZ;
  private RoundProgressBtn jva;

  public BackupMoveRecoverUI()
  {
    AppMethodBeat.i(17390);
    this.jsv = new BackupMoveRecoverUI.1(this);
    AppMethodBeat.o(17390);
  }

  private void aTw()
  {
    AppMethodBeat.i(17397);
    final int i = b.aSZ().aSu().jqW;
    ab.i("MicroMsg.BackupMoveRecoverUI", "close btn, backupPcState:%d, backupPcState:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
    switch (i)
    {
    default:
      Ni(1);
      AppMethodBeat.o(17397);
    case -22:
    case -21:
    case -13:
    case -5:
    case -3:
    case -2:
    case -1:
    case 1:
    case 27:
    case 24:
    case 52:
    case 26:
    case 30:
    }
    while (true)
    {
      return;
      b.aSZ().aTc().c(false, false, -100);
      AppMethodBeat.o(17397);
      continue;
      ab.i("MicroMsg.BackupMoveRecoverUI", "recover finish, user click close, backupState[%d].", new Object[] { Integer.valueOf(i) });
      b.aSZ().aTc().c(true, false, -100);
      b.aSZ().aTa().stop();
      AppMethodBeat.o(17397);
      continue;
      b.aSZ().aSu().jqW = 25;
      break;
      com.tencent.mm.ui.base.h.a(this, 2131297210, 2131297209, 2131297255, 2131297189, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(17387);
          ab.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover move, backupState[%d].", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.plugin.report.service.h.pYm.a(485L, 44L, 1L, false);
          b.aSZ().aTc().rn(5);
          b.aSZ().aTa().stop();
          b.aSZ().aTc().c(true, true, -100);
          AppMethodBeat.o(17387);
        }
      }
      , null, 2131689745);
      AppMethodBeat.o(17397);
      continue;
      com.tencent.mm.ui.base.h.a(this, 2131297290, 2131297289, 2131297340, 2131297189, false, new BackupMoveRecoverUI.4(this, i), null, 2131689745);
      AppMethodBeat.o(17397);
    }
  }

  public final int getLayoutId()
  {
    return 2130968797;
  }

  public final void initView()
  {
    AppMethodBeat.i(17392);
    this.juY = ((TextView)findViewById(2131821585));
    this.juZ = ((ImageView)findViewById(2131821586));
    this.juW = ((TextView)findViewById(2131821587));
    this.juX = ((TextView)findViewById(2131821588));
    this.juU = ((TextView)findViewById(2131821590));
    this.juV = ((TextView)findViewById(2131821589));
    this.jva = ((RoundProgressBtn)findViewById(2131821591));
    AppMethodBeat.o(17392);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17391);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17391);
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupMoveRecoverUI", "onCreate.");
      getSupportActionBar().hide();
      com.tencent.mm.plugin.backup.a.gkE.BV();
      initView();
      try
      {
        Method localMethod = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
        paramBundle = (WifiManager)getSystemService("wifi");
        b.aSZ().aTc().jtw = ((Boolean)localMethod.invoke(paramBundle, new Object[0])).booleanValue();
        ab.d("MicroMsg.BackupMoveRecoverUI", "new isWifiAp:%s", new Object[] { Boolean.valueOf(b.aSZ().aTc().jtw) });
        AppMethodBeat.o(17391);
      }
      catch (Exception paramBundle)
      {
        ab.e("MicroMsg.BackupMoveRecoverUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { bo.dpG() });
        AppMethodBeat.o(17391);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17395);
    ab.i("MicroMsg.BackupMoveRecoverUI", "BackupMoveRecoverUI onDestroy.");
    super.onDestroy();
    AppMethodBeat.o(17395);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(17396);
    boolean bool;
    if (paramInt == 4)
    {
      aTw();
      bool = true;
      AppMethodBeat.o(17396);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17396);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(17394);
    super.onPause();
    ab.i("MicroMsg.BackupMoveRecoverUI", "onPause.");
    jvb = false;
    AppMethodBeat.o(17394);
  }

  public void onResume()
  {
    AppMethodBeat.i(17393);
    super.onResume();
    ab.i("MicroMsg.BackupMoveRecoverUI", "onResume.");
    jvb = true;
    b.aSZ().aTc().jsv = this.jsv;
    gqB = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    this.jsv.rj(b.aSZ().aSu().jqW);
    AppMethodBeat.o(17393);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI
 * JD-Core Version:    0.6.2
 */