package com.tencent.mm.plugin.backup.backupmoveui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.b.c;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;

public class BackupMoveQRCodeUI extends MMWizardActivity
{
  private b.d jsv;
  private ImageView juO;
  private TextView juP;
  private TextView juQ;
  private boolean juR;

  public BackupMoveQRCodeUI()
  {
    AppMethodBeat.i(17348);
    this.juR = false;
    this.jsv = new BackupMoveQRCodeUI.1(this);
    AppMethodBeat.o(17348);
  }

  private void aTv()
  {
    AppMethodBeat.i(17354);
    if (aw.QT())
    {
      h.a(this, 2131297244, 2131297243, 2131297267, 2131297189, false, new BackupMoveQRCodeUI.3(this), null, 2131689745);
      AppMethodBeat.o(17354);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
      com.tencent.mm.plugin.backup.d.b.aSZ().aTa().stop();
      com.tencent.mm.plugin.backup.d.b.aSZ().aTb().cancel(true);
      com.tencent.mm.plugin.backup.d.b.aSZ().aSu().jqW = -100;
      Ni(1);
      AppMethodBeat.o(17354);
    }
  }

  public final int getLayoutId()
  {
    return 2130968796;
  }

  public final void initView()
  {
    AppMethodBeat.i(17352);
    setMMTitle(2131297197);
    this.juO = ((ImageView)findViewById(2131821581));
    this.juP = ((TextView)findViewById(2131821582));
    this.juQ = ((TextView)findViewById(2131821583));
    setBackBtn(new BackupMoveQRCodeUI.2(this));
    AppMethodBeat.o(17352);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17349);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17349);
    while (true)
    {
      return;
      if (!aw.RK())
      {
        finish();
        AppMethodBeat.o(17349);
      }
      else
      {
        initView();
        com.tencent.mm.plugin.backup.g.b.clear();
        paramBundle = com.tencent.mm.plugin.backup.d.b.aSZ().aTb();
        com.tencent.mm.plugin.backup.g.b.a(paramBundle.jtM);
        com.tencent.mm.plugin.backup.b.d.rk(21);
        com.tencent.mm.plugin.backup.g.b.a(paramBundle.jtL);
        com.tencent.mm.plugin.backup.d.b.aSZ().aSv();
        com.tencent.mm.plugin.backup.g.b.a(paramBundle);
        com.tencent.mm.plugin.backup.g.b.a(com.tencent.mm.plugin.backup.d.b.aSZ().aTa());
        com.tencent.mm.plugin.backup.g.b.rk(2);
        com.tencent.mm.plugin.backup.d.b.aSZ().jqR = null;
        paramBundle.jtV = false;
        com.tencent.mm.plugin.backup.d.b.aSZ().aTb().jtW = c.jqH;
        com.tencent.mm.plugin.backup.b.d.aSA();
        AppMethodBeat.o(17349);
      }
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(17353);
    boolean bool;
    if (paramInt == 4)
    {
      aTv();
      bool = true;
      AppMethodBeat.o(17353);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17353);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(17351);
    super.onResume();
    this.jsv.rj(com.tencent.mm.plugin.backup.d.b.aSZ().aSu().jqW);
    AppMethodBeat.o(17351);
  }

  public void onStart()
  {
    AppMethodBeat.i(17350);
    super.onStart();
    com.tencent.mm.plugin.backup.g.b.a(com.tencent.mm.plugin.backup.d.b.aSZ().aTb());
    com.tencent.mm.plugin.backup.d.b.aSZ().aTb().jsv = this.jsv;
    com.tencent.mm.plugin.backup.d.b.aSZ().aTb().jub.start();
    AppMethodBeat.o(17350);
  }

  public void onStop()
  {
    AppMethodBeat.i(17355);
    ab.i("MicroMsg.BackupMoveQRCodeUI", "BackupMoveQRCodeUI onStop.");
    if (com.tencent.mm.plugin.backup.d.b.aSZ().aTb().jub != null)
      com.tencent.mm.plugin.backup.d.b.aSZ().aTb().jub.stop();
    super.onStop();
    AppMethodBeat.o(17355);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI
 * JD-Core Version:    0.6.2
 */