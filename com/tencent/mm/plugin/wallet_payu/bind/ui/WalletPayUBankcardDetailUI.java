package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;

public class WalletPayUBankcardDetailUI extends WalletBankcardDetailUI
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48353);
    super.onCreate(paramBundle);
    if (1 == this.thJ.field_bankcardState)
    {
      cNs();
      findViewById(2131828674).setVisibility(8);
      findViewById(2131828675).setVisibility(8);
    }
    while (true)
    {
      findViewById(2131828677).setVisibility(8);
      ((TextView)findViewById(2131828678)).setText(2131304593);
      AppMethodBeat.o(48353);
      return;
      mT(false);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardDetailUI
 * JD-Core Version:    0.6.2
 */