package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;
import org.json.JSONException;
import org.json.JSONObject;

final class b$5
  implements c.b
{
  b$5(b paramb)
  {
  }

  public final void a(lv.b paramb)
  {
    AppMethodBeat.i(47763);
    ab.i("MicroMsg.WcPayCashierDialog", "verify succeeded: %s", new Object[] { Boolean.valueOf(b.y(this.tMC)) });
    if (b.y(this.tMC))
      AppMethodBeat.o(47763);
    while (true)
    {
      return;
      int i;
      label57: Object localObject;
      if (this.tMC.pVL == null)
      {
        i = 0;
        if (this.tMC.pVL != null)
          break label257;
        localObject = "";
        ad.e(i, (String)localObject, 22, "");
        this.tMC.pVL.tKd = 1;
        this.tMC.pVL.cBU = paramb.cBU;
        this.tMC.pVL.cBV = paramb.cBV;
      }
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(((l)g.K(l.class)).bxi());
        ((JSONObject)localObject).put("soter_type", r.cPI().cQm());
        this.tMC.pVL.cHI = ((JSONObject)localObject).toString();
        this.tMC.pVL.cBS = paramb.cBS;
        this.tMC.pVL.tKe = b.z(this.tMC).cSu();
        b.A(this.tMC).setVisibility(0);
        b.B(this.tMC);
        b.a(this.tMC, "", this.tMC.toH);
        AppMethodBeat.o(47763);
        continue;
        i = this.tMC.pVL.cIf;
        break label57;
        label257: localObject = this.tMC.pVL.czZ;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WcPayCashierDialog", localJSONException, "", new Object[0]);
      }
    }
  }

  public final void cSr()
  {
    int i = 0;
    AppMethodBeat.i(47764);
    ab.i("MicroMsg.WcPayCashierDialog", "verify failed");
    b.k(this.tMC);
    b.C(this.tMC).setText(2131304801);
    b.C(this.tMC).setVisibility(0);
    this.tMC.pVL.tKd = 0;
    this.tMC.pVL.tKe = b.z(this.tMC).cSu();
    b.A(this.tMC).setVisibility(0);
    b.B(this.tMC);
    int j;
    if (this.tMC.pVL == null)
    {
      j = 0;
      if (this.tMC.pVL != null)
        break label182;
      str = "";
      label119: ad.e(j, str, 23, "");
      if (this.tMC.pVL != null)
        break label196;
      j = i;
      label140: if (this.tMC.pVL != null)
        break label210;
    }
    label182: label196: label210: for (String str = ""; ; str = this.tMC.pVL.czZ)
    {
      ad.e(j, str, 25, "");
      AppMethodBeat.o(47764);
      return;
      j = this.tMC.pVL.cIf;
      break;
      str = this.tMC.pVL.czZ;
      break label119;
      j = this.tMC.pVL.cIf;
      break label140;
    }
  }

  public final void cSs()
  {
    int i = 0;
    AppMethodBeat.i(47765);
    ab.i("MicroMsg.WcPayCashierDialog", "verify canceled");
    b.D(this.tMC);
    b.A(this.tMC).setVisibility(0);
    b.B(this.tMC);
    if (this.tMC.pVL == null)
      if (this.tMC.pVL != null)
        break label93;
    label93: for (String str = ""; ; str = this.tMC.pVL.czZ)
    {
      ad.e(i, str, 24, "");
      AppMethodBeat.o(47765);
      return;
      i = this.tMC.pVL.cIf;
      break;
    }
  }

  public final void cSt()
  {
    AppMethodBeat.i(47766);
    ab.i("MicroMsg.WcPayCashierDialog", "switch pay way");
    b.D(this.tMC);
    b.A(this.tMC).setVisibility(0);
    b.B(this.tMC);
    b.l(this.tMC);
    AppMethodBeat.o(47766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.5
 * JD-Core Version:    0.6.2
 */