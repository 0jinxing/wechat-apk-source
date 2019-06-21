package com.tencent.mm.plugin.offline.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class OfflineAlertView$7
  implements View.OnClickListener
{
  OfflineAlertView$7(OfflineAlertView paramOfflineAlertView, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43449);
    paramView = new Intent();
    paramView.putExtra("wallet_lock_jsapi_scene", 2);
    d.b(this.oZi.getContext(), "wallet", ".pwd.ui.WalletSecuritySettingUI", paramView);
    AppMethodBeat.o(43449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.OfflineAlertView.7
 * JD-Core Version:    0.6.2
 */