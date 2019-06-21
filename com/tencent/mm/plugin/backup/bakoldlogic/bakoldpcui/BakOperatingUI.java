package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public class BakOperatingUI extends MMWizardActivity
  implements e.d
{
  private ak handler;
  private TextView jAA;
  private TextView jAB;
  private boolean jAC;
  private int jAD;
  private boolean jAE;
  private int jAt;
  private boolean jAx;
  private ProgressBar jAy;
  private TextView jAz;

  public BakOperatingUI()
  {
    AppMethodBeat.i(17945);
    this.jAt = -1;
    this.jAx = false;
    this.jAy = null;
    this.jAz = null;
    this.jAA = null;
    this.jAB = null;
    this.handler = new ak(Looper.getMainLooper());
    this.jAC = false;
    this.jAD = 0;
    this.jAE = false;
    AppMethodBeat.o(17945);
  }

  private void aUV()
  {
    AppMethodBeat.i(17948);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().pause();
    c localc = h.a(this, 2131297387, 0, 2131297088, 2131296990, new BakOperatingUI.6(this), new BakOperatingUI.7(this));
    localc.setCanceledOnTouchOutside(false);
    localc.setCancelable(false);
    AppMethodBeat.o(17948);
  }

  public final void aSt()
  {
    try
    {
      AppMethodBeat.i(17956);
      if (this.jAE)
        AppMethodBeat.o(17956);
      while (true)
      {
        return;
        this.jAx = false;
        ab.d("MicroMsg.BakOperatingUI", "onMergeFinish now cmd:%d", new Object[] { Integer.valueOf(this.jAt) });
        ak localak = this.handler;
        BakOperatingUI.11 local11 = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$11;
        local11.<init>(this);
        localak.post(local11);
        AppMethodBeat.o(17956);
      }
    }
    finally
    {
    }
  }

  public final void aUP()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(17955);
        ab.d("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", new Object[] { Integer.valueOf(this.jAt) });
        if (this.jAE)
        {
          AppMethodBeat.o(17955);
          return;
        }
        if ((6 == this.jAt) || (5 == com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzL))
        {
          this.jAt = 6;
          this.jAx = true;
          com.tencent.mm.plugin.backup.a.gkE.BV();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aSL();
          ak localak = this.handler;
          BakOperatingUI.10 local10 = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$10;
          local10.<init>(this);
          localak.post(local10);
          AppMethodBeat.o(17955);
          continue;
        }
      }
      finally
      {
      }
      ab.e("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", new Object[] { Integer.valueOf(this.jAt) });
    }
  }

  public final void aUQ()
  {
    AppMethodBeat.i(17959);
    this.handler.post(new BakOperatingUI.3(this));
    AppMethodBeat.o(17959);
  }

  public final int getLayoutId()
  {
    return 2130968809;
  }

  public final void initView()
  {
    AppMethodBeat.i(17947);
    setMMTitle(2131297401);
    if (!this.jAx)
    {
      if (6 != this.jAt)
        break label129;
      addTextOptionMenu(0, getString(2131297386), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(17933);
          if (BakOperatingUI.a(BakOperatingUI.this))
            AppMethodBeat.o(17933);
          while (true)
          {
            return true;
            BakOperatingUI.b(BakOperatingUI.this);
            BakOperatingUI.c(BakOperatingUI.this);
            AppMethodBeat.o(17933);
          }
        }
      });
    }
    while (true)
    {
      setBackBtn(new BakOperatingUI.5(this));
      this.jAy = ((ProgressBar)findViewById(2131821624));
      this.jAy.setProgress(this.jAD);
      this.jAA = ((TextView)findViewById(2131821626));
      this.jAB = ((TextView)findViewById(2131821627));
      this.jAz = ((TextView)findViewById(2131821625));
      AppMethodBeat.o(17947);
      return;
      label129: if (1 == this.jAt)
        addTextOptionMenu(0, getString(2131297368), new BakOperatingUI.4(this));
      else
        ab.e("MicroMsg.BakOperatingUI", "BakOperatingUI operate type is invalid");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17946);
    ab.i("MicroMsg.BakOperatingUI", "onCreate");
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      ab.i("MicroMsg.BakOperatingUI", "onCreate WizardRootKillSelf cmd:%d", new Object[] { Integer.valueOf(this.jAt) });
      AppMethodBeat.o(17946);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().a(this);
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().fr(true);
      this.jAC = getIntent().getBooleanExtra("from_bak_banner", false);
      int i;
      if (this.jAC)
      {
        i = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzL;
        if ((2 == i) || (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK == 2))
        {
          this.jAt = 1;
          this.jAD = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aUM();
        }
      }
      while (true)
      {
        if ((this.jAt == 6) && (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzE.jzV))
        {
          this.jAx = true;
          com.tencent.mm.plugin.backup.a.gkE.BV();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aSL();
        }
        ab.i("MicroMsg.BakOperatingUI", "before initView onCreate BakOperatingUI  nowCmd:%d fromBanner:%b status:%d opePercent:%d", new Object[] { Integer.valueOf(this.jAt), Boolean.valueOf(this.jAC), Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzL), Integer.valueOf(this.jAD) });
        initView();
        if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK != 2)
          break label431;
        this.jAA.setText(getString(2131297395));
        this.jAz.setText(getString(2131297384) + this.jAD + "%");
        this.jAB.setText(getString(2131297394));
        AppMethodBeat.o(17946);
        break;
        if (4 == i)
        {
          this.jAt = 6;
          this.jAD = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aUM();
        }
        else if (5 == i)
        {
          this.jAt = 6;
          this.jAx = true;
          com.tencent.mm.plugin.backup.a.gkE.BV();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aSL();
          continue;
          this.jAt = getIntent().getIntExtra("cmd", 6);
        }
      }
      label431: if (6 == this.jAt)
      {
        if (this.jAx)
        {
          this.jAA.setText(getString(2131297393));
          this.jAB.setText(getString(2131297392));
          this.jAz.setText(getString(2131297383) + this.jAD + "%");
          AppMethodBeat.o(17946);
        }
        else
        {
          this.jAA.setText(getString(2131297396));
          this.jAz.setText(getString(2131297385) + this.jAD + "%");
          this.jAB.setText(getString(2131297394));
          AppMethodBeat.o(17946);
        }
      }
      else
      {
        if (1 == this.jAt)
        {
          this.jAA.setText(getString(2131297389));
          this.jAz.setText(getString(2131297378) + this.jAD + "%");
          this.jAB.setText(getString(2131297394));
        }
        AppMethodBeat.o(17946);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17949);
    super.onDestroy();
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().a(null);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().fr(false);
    ab.i("MicroMsg.BakOperatingUI", "BakOperatingUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
    AppMethodBeat.o(17949);
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(17958);
    this.handler.post(new BakOperatingUI.2(this, paramInt));
    AppMethodBeat.o(17958);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(17957);
        if (paramInt == 4)
        {
          if (this.jAx)
          {
            aUV();
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().pause();
            AppMethodBeat.o(17957);
            return bool;
          }
          ab.d("MicroMsg.BakOperatingUI", "onKeyDown keyCode == KeyEvent.KEYCODE_BACK  finishWizard cmd:%d", new Object[] { Integer.valueOf(this.jAt) });
          this.jAE = true;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().fr(false);
          Ni(1);
          AppMethodBeat.o(17957);
          continue;
        }
      }
      finally
      {
      }
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17957);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(17952);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().fr(false);
    super.onPause();
    ab.i("MicroMsg.BakOperatingUI", "onPause nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
    AppMethodBeat.o(17952);
  }

  public void onResume()
  {
    AppMethodBeat.i(17951);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().fr(true);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().a(this);
    ab.i("MicroMsg.BakOperatingUI", "onResume nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
    super.onResume();
    AppMethodBeat.o(17951);
  }

  public void onStart()
  {
    AppMethodBeat.i(17950);
    super.onStart();
    AppMethodBeat.o(17950);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void rI(int paramInt)
  {
    try
    {
      AppMethodBeat.i(17953);
      ab.d("MicroMsg.BakOperatingUI", "BakOperatingUI onNetProgress percent:%d, isFinishingWizard:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.jAE) });
      if (this.jAE)
        AppMethodBeat.o(17953);
      while (true)
      {
        return;
        ak localak = this.handler;
        Runnable local8 = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$8;
        local8.<init>(this, paramInt);
        localak.post(local8);
        AppMethodBeat.o(17953);
      }
    }
    finally
    {
    }
  }

  public final void rJ(int paramInt)
  {
    try
    {
      AppMethodBeat.i(17954);
      if (this.jAE)
        AppMethodBeat.o(17954);
      while (true)
      {
        return;
        ab.d("MicroMsg.BakOperatingUI", "BakOperatingUI onMergeProgress percent:%d", new Object[] { Integer.valueOf(paramInt) });
        ak localak = this.handler;
        BakOperatingUI.9 local9 = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$9;
        local9.<init>(this, paramInt);
        localak.post(local9);
        AppMethodBeat.o(17954);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI
 * JD-Core Version:    0.6.2
 */