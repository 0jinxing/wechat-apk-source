package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.b.a.a;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$4 extends g
{
  e$4(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48632);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof a)))
    {
      paramString = (a)paramm;
      new StringBuilder("reqKey  ").append(paramString.tos);
      e.P(this.uYq).putString("kreq_token", paramString.token);
      this.uYq.a(this.hwd, 0, e.Q(this.uYq));
      bool = true;
      AppMethodBeat.o(48632);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48632);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48633);
    d.cSP();
    Authen localAuthen = new Authen();
    localAuthen.twg = ((String)paramArrayOfObject[0]);
    localAuthen.pbn = ((String)paramArrayOfObject[1]);
    localAuthen.tuk = ((String)paramArrayOfObject[2]);
    e.R(this.uYq).putString("key_bank_phone", (String)paramArrayOfObject[3]);
    if (r.cPI().cQg());
    for (int i = 2; ; i = 1)
    {
      localAuthen.bJt = i;
      localAuthen.twf = 1;
      localAuthen.pGr = ((PayInfo)e.S(this.uYq).getParcelable("key_pay_info"));
      localAuthen.twc = e.T(this.uYq).getString("key_pwd1");
      if (!e.U(this.uYq).getBoolean("key_has_indentity_info", false))
      {
        localAuthen.twd = e.V(this.uYq).getString("key_name");
        localAuthen.twe = e.W(this.uYq).getString("key_indentity");
      }
      paramArrayOfObject = com.tencent.mm.wallet_core.ui.e.atu(localAuthen.tuk);
      e.X(this.uYq).putString("key_mobile", paramArrayOfObject);
      e.Y(this.uYq).putBoolean("key_is_oversea", false);
      this.Agm.a(new a(localAuthen), true, 1);
      AppMethodBeat.o(48633);
      return true;
    }
  }

  public final boolean x(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48634);
    this.Agm.a(new t("", (String)paramArrayOfObject[0], (PayInfo)e.Z(this.uYq).getParcelable("key_pay_info")), true, 1);
    AppMethodBeat.o(48634);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e.4
 * JD-Core Version:    0.6.2
 */