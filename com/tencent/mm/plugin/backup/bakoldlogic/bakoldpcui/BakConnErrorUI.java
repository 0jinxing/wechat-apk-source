package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMWizardActivity;

public class BakConnErrorUI extends MMWizardActivity
{
  private int jAt;

  public final int getLayoutId()
  {
    return 2130968807;
  }

  public final void initView()
  {
    AppMethodBeat.i(17917);
    setMMTitle(2131297401);
    setBackBtn(new BakConnErrorUI.1(this));
    AppMethodBeat.o(17917);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17916);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17916);
    while (true)
    {
      return;
      this.jAt = getIntent().getIntExtra("cmd", -1);
      ab.i("MicroMsg.BakFinishUI", "BakConnErrorUI onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
      initView();
      a.aUB().aUC().jzK = -1;
      AppMethodBeat.o(17916);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17918);
    super.onDestroy();
    a.aUB().aUC().jzC = null;
    ab.i("MicroMsg.BakFinishUI", "BakConnErrorUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.jAt) });
    AppMethodBeat.o(17918);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(17919);
    if (paramInt == 4)
    {
      Ni(1);
      AppMethodBeat.o(17919);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17919);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakConnErrorUI
 * JD-Core Version:    0.6.2
 */