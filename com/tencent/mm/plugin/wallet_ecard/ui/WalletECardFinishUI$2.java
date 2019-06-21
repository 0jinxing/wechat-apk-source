package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;

final class WalletECardFinishUI$2
  implements View.OnClickListener
{
  WalletECardFinishUI$2(WalletECardFinishUI paramWalletECardFinishUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48145);
    ab.i("MicroMsg.WalletECardFinishUI", "click finish");
    paramView = new lu();
    a.xxA.m(paramView);
    paramView = this.tQI.dOD();
    if (paramView != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("key_process_result_code", -1);
      paramView.b(this.tQI.mController.ylL, localBundle);
      AppMethodBeat.o(48145);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.WalletECardFinishUI", "process is null");
      this.tQI.finish();
      AppMethodBeat.o(48145);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI.2
 * JD-Core Version:    0.6.2
 */