package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.vending.app.a;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class WalletLqtBasePresenterUI extends WalletBaseUI
{
  private c eMI = new c();

  public final <T extends b<? extends a>> T V(Class<? extends b<? extends a>> paramClass)
  {
    return this.eMI.a(this, paramClass);
  }

  public final <T extends a> T Z(Class<? extends a> paramClass)
  {
    return this.eMI.b(this, paramClass);
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public int getLayoutId()
  {
    return 0;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eMI.A(getIntent(), this);
    this.Ahz = true;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.eMI.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.eMI.a(3);
  }

  public void onResume()
  {
    super.onResume();
    this.eMI.a(2);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI
 * JD-Core Version:    0.6.2
 */