package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class SwitchRealnameVerifyModeUI$8
  implements View.OnClickListener
{
  SwitchRealnameVerifyModeUI$8(SwitchRealnameVerifyModeUI paramSwitchRealnameVerifyModeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46597);
    paramView = new Intent();
    paramView.putExtra("wallet_lock_jsapi_scene", 2);
    d.b(this.tvl, "wallet", ".pwd.ui.WalletSecuritySettingUI", paramView);
    AppMethodBeat.o(46597);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI.8
 * JD-Core Version:    0.6.2
 */