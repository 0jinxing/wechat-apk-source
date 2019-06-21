package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMWizardActivity;

public class BakFinishUI extends MMWizardActivity
  implements e.e
{
  private ak handler;
  private int jAt;
  private TextView jAv;

  public BakFinishUI()
  {
    AppMethodBeat.i(17924);
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(17924);
  }

  public final void aUR()
  {
    AppMethodBeat.i(17929);
    this.handler.post(new BakFinishUI.2(this));
    AppMethodBeat.o(17929);
  }

  public final int getLayoutId()
  {
    return 2130968808;
  }

  public final void initView()
  {
    AppMethodBeat.i(17926);
    setMMTitle(2131297401);
    this.jAv = ((TextView)findViewById(2131821623));
    if (6 == this.jAt)
      this.jAv.setText(getString(2131297397));
    while (true)
    {
      setBackBtn(new BakFinishUI.1(this));
      AppMethodBeat.o(17926);
      return;
      if (1 == this.jAt)
        this.jAv.setText(getString(2131297388));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17925);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17925);
    while (true)
    {
      return;
      this.jAt = getIntent().getIntExtra("cmd", -1);
      ab.i("MicroMsg.BakFinishUI", "BakFinishUI onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
      initView();
      a.aUB().aUC().jzC = this;
      AppMethodBeat.o(17925);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17927);
    super.onDestroy();
    a.aUB().aUC().jzC = null;
    ab.i("MicroMsg.BakFinishUI", "BakFinishUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
    AppMethodBeat.o(17927);
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(17930);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(17923);
        ab.d("MicroMsg.BakFinishUI", "BakFinishUI onCloseSocket");
        Intent localIntent = new Intent(BakFinishUI.this, BakConnErrorUI.class);
        MMWizardActivity.J(BakFinishUI.this, localIntent);
        AppMethodBeat.o(17923);
      }
    });
    AppMethodBeat.o(17930);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(17928);
    if (paramInt == 4)
    {
      a.aUB().aUC().jzK = -1;
      Ni(1);
      AppMethodBeat.o(17928);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17928);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI
 * JD-Core Version:    0.6.2
 */