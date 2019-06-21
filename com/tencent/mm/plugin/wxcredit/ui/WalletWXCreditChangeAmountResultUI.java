package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletWXCreditChangeAmountResultUI extends WalletBaseUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971183;
  }

  public final void initView()
  {
    AppMethodBeat.i(48687);
    ((TextView)findViewById(2131829079)).setText(e.G(this.mBundle.getDouble("key_credit_amount")));
    showHomeBtn(false);
    enableBackMenu(false);
    addTextOptionMenu(0, getString(2131296944), new WalletWXCreditChangeAmountResultUI.1(this));
    AppMethodBeat.o(48687);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48686);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(48686);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI
 * JD-Core Version:    0.6.2
 */