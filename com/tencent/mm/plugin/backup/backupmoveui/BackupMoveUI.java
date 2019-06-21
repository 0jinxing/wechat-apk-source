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
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.d;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;
import java.lang.reflect.Method;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveUI extends MMWizardActivity
{
  private b.d jsv;
  public TextView juU;
  public TextView juV;
  public TextView juW;
  public TextView juX;
  public TextView juY;
  public ImageView juZ;

  public BackupMoveUI()
  {
    AppMethodBeat.i(17412);
    this.jsv = new BackupMoveUI.1(this);
    AppMethodBeat.o(17412);
  }

  private void aTw()
  {
    AppMethodBeat.i(17418);
    int i = b.aSZ().aSu().jqW;
    ab.i("MicroMsg.BackupMoveUI", "close btn, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
      Ni(1);
      AppMethodBeat.o(17418);
    case 15:
    case -23:
    case -21:
    case -11:
    case -4:
    case 1:
    case 4:
    case 12:
    case 13:
    case 14:
    case 51:
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupMoveUI", "backup move finish, user click close.");
      aTy();
      AppMethodBeat.o(17418);
      continue;
      com.tencent.mm.ui.base.h.a(this, 2131297244, 2131297243, 2131297267, 2131297189, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(17410);
          ab.i("MicroMsg.BackupMoveUI", "user click close. stop move.");
          com.tencent.mm.plugin.report.service.h.pYm.a(485L, 25L, 1L, false);
          b.aSZ().aTa().stop();
          b.aSZ().aTb().cancel(false);
          b.aSZ().aSu().jqW = -100;
          BackupMoveUI.f(BackupMoveUI.this);
          AppMethodBeat.o(17410);
        }
      }
      , null, 2131689745);
      AppMethodBeat.o(17418);
    }
  }

  private void aTy()
  {
    AppMethodBeat.i(17419);
    b.aSZ().aTd().cancel();
    b.aSZ().aTb().cancel(true);
    b.aSZ().aTa().stop();
    b.aSZ().aSu().jqW = -100;
    Ni(1);
    AppMethodBeat.o(17419);
  }

  public final int getLayoutId()
  {
    return 2130968797;
  }

  public final void initView()
  {
    AppMethodBeat.i(17414);
    this.juY = ((TextView)findViewById(2131821585));
    this.juZ = ((ImageView)findViewById(2131821586));
    this.juW = ((TextView)findViewById(2131821587));
    this.juX = ((TextView)findViewById(2131821588));
    this.juU = ((TextView)findViewById(2131821590));
    this.juV = ((TextView)findViewById(2131821589));
    AppMethodBeat.o(17414);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17413);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17413);
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupMoveUI", "onCreate.");
      getSupportActionBar().hide();
      com.tencent.mm.plugin.backup.a.gkE.BV();
      initView();
      try
      {
        paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
        WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
        b.aSZ().aTb().jtw = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
        ab.d("MicroMsg.BackupMoveUI", "old isWifiAp:%s", new Object[] { Boolean.valueOf(b.aSZ().aTb().jtw) });
        AppMethodBeat.o(17413);
      }
      catch (Exception paramBundle)
      {
        ab.e("MicroMsg.BackupMoveUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { bo.dpG() });
        AppMethodBeat.o(17413);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17416);
    ab.d("MicroMsg.BackupMoveUI", "BackupMoveUI onDestroy.");
    if (b.aSZ().aTb().jub != null)
      b.aSZ().aTb().jub.stop();
    super.onDestroy();
    AppMethodBeat.o(17416);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(17417);
    boolean bool;
    if (paramInt == 4)
    {
      aTw();
      bool = true;
      AppMethodBeat.o(17417);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17417);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(17415);
    super.onResume();
    b.aSZ().aTb().jsv = this.jsv;
    this.jsv.rj(b.aSZ().aSu().jqW);
    AppMethodBeat.o(17415);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveUI
 * JD-Core Version:    0.6.2
 */