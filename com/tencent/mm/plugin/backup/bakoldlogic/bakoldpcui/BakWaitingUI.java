package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.c;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMWizardActivity;

public class BakWaitingUI extends MMWizardActivity
  implements e.c
{
  private int Cn;
  private ak handler;
  private boolean jAL;

  public BakWaitingUI()
  {
    AppMethodBeat.i(17988);
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(17988);
  }

  final void aUX()
  {
    AppMethodBeat.i(17994);
    if ((6 == this.Cn) || (1 == this.Cn))
    {
      Intent localIntent = new Intent(this, BakOperatingUI.class);
      localIntent.putExtra("cmd", this.Cn);
      MMWizardActivity.J(this, localIntent);
    }
    AppMethodBeat.o(17994);
  }

  public final int getLayoutId()
  {
    return 2130968810;
  }

  public final void initView()
  {
    AppMethodBeat.i(17990);
    setMMTitle(2131297401);
    if (this.jAL)
      findViewById(2131821622).setVisibility(8);
    while (true)
    {
      setBackBtn(new BakWaitingUI.1(this));
      AppMethodBeat.o(17990);
      return;
      findViewById(2131821622).setVisibility(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17989);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17989);
    while (true)
    {
      return;
      a.aUB().aUC().jzA = this;
      this.Cn = a.aUB().aUC().jzH;
      this.jAL = getIntent().getBooleanExtra("from_back_finish", false);
      ab.i("MicroMsg.BakWaitingUI", "BakWaitingUI onCreate nowCmd:%d isFromFinish:%b", new Object[] { Integer.valueOf(this.Cn), Boolean.valueOf(this.jAL) });
      initView();
      aUX();
      AppMethodBeat.o(17989);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17992);
    super.onDestroy();
    a.aUB().aUC().jzA = null;
    ab.i("MicroMsg.BakWaitingUI", "BakWaitingUI onDestroy nowCmd:%d isFromFinish:%b", new Object[] { Integer.valueOf(this.Cn), Boolean.valueOf(this.jAL) });
    AppMethodBeat.o(17992);
  }

  public final void onError(final int paramInt)
  {
    AppMethodBeat.i(17996);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(17987);
        ab.d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        Intent localIntent;
        if (paramInt == -1)
        {
          ab.d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
          localIntent = new Intent();
          localIntent.putExtra("title", BakWaitingUI.this.getString(2131297313));
          localIntent.putExtra("rawUrl", BakWaitingUI.this.getString(2131305823, new Object[] { aa.dor() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          AppMethodBeat.o(17987);
        }
        while (true)
        {
          return;
          localIntent = new Intent(BakWaitingUI.this, BakConnErrorUI.class);
          MMWizardActivity.J(BakWaitingUI.this, localIntent);
          AppMethodBeat.o(17987);
        }
      }
    });
    AppMethodBeat.o(17996);
  }

  public final void onEvent(int paramInt)
  {
    AppMethodBeat.i(17991);
    this.Cn = paramInt;
    this.handler.post(new BakWaitingUI.2(this));
    AppMethodBeat.o(17991);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(17995);
    if (paramInt == 4)
    {
      Ni(1);
      AppMethodBeat.o(17995);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17995);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void rH(final int paramInt)
  {
    AppMethodBeat.i(17993);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(17986);
        ab.d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == -1)
        {
          ab.d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
          Intent localIntent = new Intent();
          localIntent.putExtra("title", BakWaitingUI.this.getString(2131297313));
          localIntent.putExtra("rawUrl", BakWaitingUI.this.getString(2131305823, new Object[] { aa.dor() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
        }
        AppMethodBeat.o(17986);
      }
    });
    AppMethodBeat.o(17993);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI
 * JD-Core Version:    0.6.2
 */