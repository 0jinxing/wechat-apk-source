package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.q;

final class WalletCardImportUI$5$1
  implements h.d
{
  WalletCardImportUI$5$1(WalletCardImportUI.5 param5)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(47269);
    Intent localIntent = new Intent();
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      localIntent.putExtra("showShare", false);
      d.b(this.tGw.tGt.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(47269);
      return;
      localIntent.putExtra("rawUrl", this.tGw.tGt.getString(2131304510, new Object[] { aa.dor() }));
      continue;
      if (WalletCardImportUI.c(this.tGw.tGt) != null)
        localIntent.putExtra("rawUrl", this.tGw.tGt.getString(2131304508, new Object[] { aa.dor(), WalletCardImportUI.c(this.tGw.tGt).pbn }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.5.1
 * JD-Core Version:    0.6.2
 */