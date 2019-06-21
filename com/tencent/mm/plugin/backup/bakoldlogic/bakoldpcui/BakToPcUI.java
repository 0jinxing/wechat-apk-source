package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMWizardActivity;

public class BakToPcUI extends MMWizardActivity
  implements e.a
{
  private int Cn;
  private Button grC;
  private ak handler;
  private Button jAH;
  private TextView jAI;
  private TextView jAJ;

  public BakToPcUI()
  {
    AppMethodBeat.i(17972);
    this.Cn = -1;
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(17972);
  }

  private void aUW()
  {
    AppMethodBeat.i(17977);
    if (this.Cn == 0)
    {
      this.grC.setEnabled(true);
      this.jAH.setEnabled(true);
      AppMethodBeat.o(17977);
    }
    while (true)
    {
      return;
      this.grC.setEnabled(false);
      this.jAH.setEnabled(false);
      AppMethodBeat.o(17977);
    }
  }

  public final void aUO()
  {
    AppMethodBeat.i(17976);
    this.Cn = 0;
    this.grC.setVisibility(0);
    this.jAH.setVisibility(0);
    new ak(Looper.getMainLooper()).post(new BakToPcUI.4(this));
    AppMethodBeat.o(17976);
  }

  public final int getLayoutId()
  {
    return 2130968806;
  }

  public final void initView()
  {
    AppMethodBeat.i(17974);
    setMMTitle(2131297401);
    setBackBtn(new BakToPcUI.1(this));
    this.grC = ((Button)findViewById(2131821620));
    this.grC.setOnClickListener(new BakToPcUI.2(this));
    this.jAH = ((Button)findViewById(2131821621));
    this.jAH.setOnClickListener(new BakToPcUI.3(this));
    this.jAI = ((TextView)findViewById(2131821618));
    this.jAI.setText(a.aUB().aUC().jzI);
    this.jAJ = ((TextView)findViewById(2131821619));
    this.jAJ.setText(a.aUB().aUC().jzJ);
    AppMethodBeat.o(17974);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17973);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17973);
    while (true)
    {
      return;
      initView();
      this.Cn = a.aUB().aUC().jzH;
      ab.i("MicroMsg.BakToPcUI", "BakToPcUI auth onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.Cn) });
      a.aUB().aUC().jzB = this;
      aUW();
      AppMethodBeat.o(17973);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17975);
    super.onDestroy();
    ab.i("MicroMsg.BakToPcUI", "BakToPcUI auth onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.Cn) });
    a.aUB().aUC().jzB = null;
    AppMethodBeat.o(17975);
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(17978);
    this.handler.post(new BakToPcUI.5(this, paramInt));
    AppMethodBeat.o(17978);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(17979);
    if (paramInt == 4)
    {
      a.aUB().aUD().flQ = 3;
      a.aUB().aUD().aar();
      a.aUB().aUC().rE(1);
      Ni(1);
      AppMethodBeat.o(17979);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(17979);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI
 * JD-Core Version:    0.6.2
 */