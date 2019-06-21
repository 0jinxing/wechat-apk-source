package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.ad;

final class b$2 extends s
{
  b$2(b paramb)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(138092);
    int i;
    String str;
    if (this.tMC.pVL == null)
    {
      i = 0;
      if (this.tMC.pVL != null)
        break label95;
      str = "";
      label30: ad.e(i, str, 12, "");
      this.tMC.hide();
      if (b.n(this.tMC) == null)
        break label109;
      b.n(this.tMC).dismiss();
      b.a(this.tMC, null);
      AppMethodBeat.o(138092);
    }
    while (true)
    {
      return;
      i = this.tMC.pVL.cIf;
      break;
      label95: str = this.tMC.pVL.czZ;
      break label30;
      label109: b.a(this.tMC, l.a(this.tMC.getContext(), this.tMC.pWy, this.tMC.toH.tzb, new b.2.1(this), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(47759);
          ab.i("MicroMsg.WcPayCashierDialog", "on cancel");
          b.a(b.2.this.tMC, null);
          b.2.this.tMC.show();
          AppMethodBeat.o(47759);
        }
      }));
      AppMethodBeat.o(138092);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.2
 * JD-Core Version:    0.6.2
 */