package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class HoneyPayBaseUI extends WalletBaseUI
{
  protected final String TAG = "MicroMsg." + getClass().getSimpleName();
  protected int nqT = 2131690691;

  protected void bFY()
  {
    xE(getResources().getColor(this.nqT));
    dyb();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bFY();
    setBackBtn(new HoneyPayBaseUI.1(this));
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI
 * JD-Core Version:    0.6.2
 */