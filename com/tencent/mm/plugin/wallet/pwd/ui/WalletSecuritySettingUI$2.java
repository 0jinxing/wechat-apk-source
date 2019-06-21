package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletSecuritySettingUI$2
  implements View.OnClickListener
{
  WalletSecuritySettingUI$2(WalletSecuritySettingUI paramWalletSecuritySettingUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46394);
    if ((WalletSecuritySettingUI.a(this.tsT) != null) && (bo.isNullOrNil(WalletSecuritySettingUI.a(this.tsT).tsX)))
    {
      ab.e("MicroMsg.WalletSecuritySettingUI", "alivnluo jump h5 url is null");
      AppMethodBeat.o(46394);
    }
    while (true)
    {
      return;
      if ((WalletSecuritySettingUI.a(this.tsT) != null) && (WalletSecuritySettingUI.a(this.tsT).jumpType == 1) && (!bo.isNullOrNil(WalletSecuritySettingUI.a(this.tsT).tsX)))
      {
        paramView = new Intent();
        ab.i("MicroMsg.WalletSecuritySettingUI", "alvinluo jump url: %s", new Object[] { WalletSecuritySettingUI.a(this.tsT).tsX });
        paramView.putExtra("rawUrl", WalletSecuritySettingUI.a(this.tsT).tsX);
        d.b(this.tsT, "webview", ".ui.tools.WebViewUI", paramView);
        AppMethodBeat.o(46394);
      }
      else
      {
        if ((WalletSecuritySettingUI.a(this.tsT) != null) && (WalletSecuritySettingUI.a(this.tsT).jumpType == 2))
          bo.isNullOrNil(WalletSecuritySettingUI.a(this.tsT).tsY);
        AppMethodBeat.o(46394);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI.2
 * JD-Core Version:    0.6.2
 */