package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.b.a.b;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

final class e$5 extends com.tencent.mm.wallet_core.d.g
{
  e$5(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48635);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof b))
      {
        this.Agm.a(new y(), true, 1);
        AppMethodBeat.o(48635);
        bool = true;
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof y))
      {
        paramString = new com.tencent.mm.plugin.wxcredit.a.g(e.aa(this.uYq).getString("key_verify_code"), e.ab(this.uYq).getString("KEY_SESSION_KEY"), e.ac(this.uYq).getString("key_pwd1"), r.cPI().cQL(), e.ad(this.uYq).getString("key_bank_type"));
        this.Agm.a(paramString, true, 1);
        AppMethodBeat.o(48635);
        bool = true;
      }
      else if ((paramm instanceof com.tencent.mm.plugin.wxcredit.a.g))
      {
        paramString = ((com.tencent.mm.plugin.wxcredit.a.g)paramm).cIe;
        if (!bo.isNullOrNil(paramString))
          e.ae(this.uYq).putString("key_bank_username", paramString);
        this.uYq.a(this.hwd, 0, e.af(this.uYq));
        AppMethodBeat.o(48635);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(48635);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48636);
    if (!e.ag(this.uYq).getBoolean("key_is_bank_user", false))
      this.Agm.a(new b((s)paramArrayOfObject[0]), true, 1);
    while (true)
    {
      AppMethodBeat.o(48636);
      return true;
      this.Agm.a(new com.tencent.mm.plugin.wxcredit.a.g(e.ah(this.uYq).getString("key_verify_code"), e.ai(this.uYq).getString("KEY_SESSION_KEY"), e.aj(this.uYq).getString("key_pwd1"), r.cPI().cQL(), e.ak(this.uYq).getString("key_bank_type")), true, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e.5
 * JD-Core Version:    0.6.2
 */