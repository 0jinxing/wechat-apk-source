package com.tencent.mm.plugin.wallet_ecard.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.protobuf.bks;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$1
  implements DialogInterface.OnClickListener
{
  b$1(bks parambks, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48048);
    WalletBaseUI localWalletBaseUI;
    String str;
    Object localObject;
    if (!bo.isNullOrNil(this.tQe.wdd))
    {
      localWalletBaseUI = this.tQf;
      str = this.tQe.wdd;
      localObject = this.tQg;
      ab.i("MicroMsg.ECardUtil", "url: %s", new Object[] { str });
      if (!bo.isNullOrNil(str))
      {
        if (!str.startsWith("native."))
          break label146;
        ab.i("MicroMsg.ECardUtil", "goto native");
        if (((localObject != null) && (((b.a)localObject).cSR())) || (str.equals("native.qryacctdesc")) || (str.equals("native.openecardauth")) || (str.equals("native.cancloseecard")) || (!str.equals("native.withdraw")));
      }
    }
    while (true)
    {
      paramDialogInterface.dismiss();
      AppMethodBeat.o(48048);
      return;
      label146: ab.d("MicroMsg.ECardUtil", "url: %s", new Object[] { str });
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", str);
      ((Intent)localObject).putExtra("showShare", false);
      d.b(localWalletBaseUI, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.b.1
 * JD-Core Version:    0.6.2
 */