package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditOpenNotifyUI extends WalletBaseUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971189;
  }

  public final void initView()
  {
    int i = 0;
    AppMethodBeat.i(48743);
    setMMTitle(2131305498);
    showHomeBtn(false);
    enableBackMenu(false);
    addTextOptionMenu(0, getString(2131296944), new WalletWXCreditOpenNotifyUI.1(this));
    ((TextView)findViewById(2131829079)).setText(com.tencent.mm.wallet_core.ui.e.G(this.mBundle.getDouble("key_total_amount")));
    Button localButton = (Button)findViewById(2131822846);
    localButton.setOnClickListener(new WalletWXCreditOpenNotifyUI.2(this));
    if (this.mBundle.getBoolean("key_can_upgrade_amount", true));
    while (true)
    {
      localButton.setVisibility(i);
      AppMethodBeat.o(48743);
      return;
      i = 8;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48742);
    super.onCreate(paramBundle);
    g.RQ();
    g.RP().Ry().set(196658, Boolean.FALSE);
    initView();
    AppMethodBeat.o(48742);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI
 * JD-Core Version:    0.6.2
 */