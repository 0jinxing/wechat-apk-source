package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.q;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wxcredit.a.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

final class e$3 extends com.tencent.mm.wallet_core.d.g
{
  e$3(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48629);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wxcredit.a.g))
      {
        paramString = ((com.tencent.mm.plugin.wxcredit.a.g)paramm).cIe;
        if (!bo.isNullOrNil(paramString))
          e.q(this.uYq).putString("key_bank_username", paramString);
        this.uYq.a(this.hwd, 0, e.r(this.uYq));
        AppMethodBeat.o(48629);
        bool = true;
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof h))
      {
        this.uYq.a(this.hwd, 0, e.s(this.uYq));
        AppMethodBeat.o(48629);
        bool = true;
      }
      else if ((paramm instanceof q))
      {
        if (r.cPI().cQg())
        {
          this.Agm.a(new y(), true, 1);
          AppMethodBeat.o(48629);
          bool = true;
        }
        else
        {
          this.uYq.a(this.hwd, 0, e.t(this.uYq));
          AppMethodBeat.o(48629);
          bool = true;
        }
      }
      else if ((paramm instanceof y))
      {
        paramString = r.cPI().cQL();
        paramString = new com.tencent.mm.plugin.wxcredit.a.g(e.u(this.uYq).getString("key_verify_code"), e.v(this.uYq).getString("KEY_SESSION_KEY"), e.w(this.uYq).getString("key_pwd1"), paramString, e.x(this.uYq).getString("key_bank_type"));
        this.Agm.a(paramString, true, 1);
        AppMethodBeat.o(48629);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(48629);
        continue;
        AppMethodBeat.o(48629);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48630);
    String str = (String)paramArrayOfObject[0];
    e.y(this.uYq).putString("key_verify_code", str);
    if (r.cPI().cQg())
      if ((e.z(this.uYq).getBoolean("key_need_bind_deposit", true)) && (!e.A(this.uYq).getBoolean("key_is_bank_user")))
      {
        paramArrayOfObject = (s)paramArrayOfObject[1];
        paramArrayOfObject.flag = "2";
        this.Agm.a(new q(paramArrayOfObject), true, 1);
      }
    while (true)
    {
      AppMethodBeat.o(48630);
      return true;
      this.Agm.a(new com.tencent.mm.plugin.wxcredit.a.g(str, e.B(this.uYq).getString("KEY_SESSION_KEY"), e.C(this.uYq).getString("key_pwd1"), e.D(this.uYq).getString("key_bind_serial"), e.E(this.uYq).getString("key_bank_type")), true, 1);
      continue;
      if (e.F(this.uYq).getBoolean("key_is_bank_user", false))
      {
        e.G(this.uYq).putString("key_verify_code", str);
        this.Agm.a(new h(str, e.H(this.uYq).getString("KEY_SESSION_KEY"), e.I(this.uYq).getString("key_pwd1"), e.J(this.uYq).getString("key_bind_serial"), e.K(this.uYq).getString("key_bank_type")), true, 1);
      }
      else
      {
        paramArrayOfObject = (s)paramArrayOfObject[1];
        paramArrayOfObject.flag = "1";
        this.Agm.a(new q(paramArrayOfObject), true, 1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e.3
 * JD-Core Version:    0.6.2
 */