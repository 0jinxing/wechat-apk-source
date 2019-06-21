package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.faceid.auth.a;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class b$6
  implements a
{
  b$6(b paramb)
  {
  }

  public final void bwO()
  {
    AppMethodBeat.i(47769);
    b.D(this.tMC);
    b.A(this.tMC).setVisibility(0);
    AppMethodBeat.o(47769);
  }

  public final void ef(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(47767);
    ab.i("MicroMsg.WcPayCashierDialog", "face id auth success");
    if (b.y(this.tMC))
      AppMethodBeat.o(47767);
    while (true)
    {
      return;
      this.tMC.pVL.tKd = 1;
      this.tMC.pVL.cBU = "";
      this.tMC.pVL.cBV = "";
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(((l)g.K(l.class)).bxi());
        localJSONObject.put("soter_type", r.cPI().cQm());
        this.tMC.pVL.cHI = localJSONObject.toString();
        this.tMC.pVL.cBS = paramInt1;
        this.tMC.pVL.tKe = paramInt2;
        b.a(this.tMC, "", null);
        AppMethodBeat.o(47767);
      }
      catch (JSONException localJSONException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WcPayCashierDialog", localJSONException, "", new Object[0]);
      }
    }
  }

  public final void vJ(int paramInt)
  {
    AppMethodBeat.i(47768);
    ab.i("MicroMsg.WcPayCashierDialog", "face id auth fail: %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.tMC.pVL.tKe) });
    b.D(this.tMC);
    b.A(this.tMC).setVisibility(0);
    b.k(this.tMC);
    b.C(this.tMC).setText(2131304801);
    b.C(this.tMC).setVisibility(0);
    PayInfo localPayInfo = this.tMC.pVL;
    localPayInfo.tKe += 1;
    AppMethodBeat.o(47768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.6
 * JD-Core Version:    0.6.2
 */