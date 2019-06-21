package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class q$7
  implements com.tencent.mm.plugin.fingerprint.faceid.auth.a
{
  q$7(q paramq)
  {
  }

  public final void bwO()
  {
    AppMethodBeat.i(47595);
    this.tKq.jcl.setVisibility(0);
    AppMethodBeat.o(47595);
  }

  public final void ef(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(47593);
    ab.i("MicroMsg.WalletPwdDialog", "face id auth success");
    this.tKq.pGr.tKd = 1;
    this.tKq.pGr.cBU = "";
    this.tKq.pGr.cBV = "";
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(((l)g.K(l.class)).bxi());
      localJSONObject.put("soter_type", r.cPI().cQm());
      this.tKq.pGr.cHI = localJSONObject.toString();
      this.tKq.pGr.cBS = paramInt1;
      this.tKq.pGr.tKe = paramInt2;
      this.tKq.cRO();
      com.tencent.mm.plugin.soter.d.a.ED(0);
      AppMethodBeat.o(47593);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletPwdDialog", localJSONException, "", new Object[0]);
    }
  }

  public final void vJ(int paramInt)
  {
    AppMethodBeat.i(47594);
    ab.i("MicroMsg.WalletPwdDialog", "face id auth fail: %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.tKq.pGr.tKe) });
    this.tKq.jcl.setVisibility(0);
    this.tKq.tJU.setVisibility(8);
    q.d(this.tKq);
    PayInfo localPayInfo = this.tKq.pGr;
    localPayInfo.tKe += 1;
    com.tencent.mm.plugin.soter.d.a.ED(1);
    AppMethodBeat.o(47594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.7
 * JD-Core Version:    0.6.2
 */