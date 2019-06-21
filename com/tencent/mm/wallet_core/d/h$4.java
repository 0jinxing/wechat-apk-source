package com.tencent.mm.wallet_core.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.b.a.bi;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class h$4
  implements DialogInterface.OnClickListener
{
  h$4(m paramm, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49128);
    paramDialogInterface = "";
    if ((this.crb instanceof n))
      paramDialogInterface = ((n)this.crb).tqG;
    if (!bo.isNullOrNil(paramDialogInterface))
    {
      Object localObject = new bi();
      ((bi)localObject).dck = 1L;
      ((bi)localObject).dcl = 2L;
      ((bi)localObject).ajK();
      ab.i("MicroMsg.WalletErrMgr", "jump to forget_url %s", new Object[] { paramDialogInterface });
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", paramDialogInterface);
      ((Intent)localObject).putExtra("showShare", false);
      d.b(this.tnX, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
      AppMethodBeat.o(49128);
      return;
    }
    paramDialogInterface = new bi();
    paramDialogInterface.dck = 1L;
    paramDialogInterface.dcl = 1L;
    paramDialogInterface.ajK();
    if (r.YM())
      a.b(this.tnX, "PayUForgotPwdProcess", null);
    while (true)
    {
      if (this.tnX.bwP())
        this.tnX.finish();
      AppMethodBeat.o(49128);
      break;
      a.b(this.tnX, "ForgotPwdProcess", null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.h.4
 * JD-Core Version:    0.6.2
 */