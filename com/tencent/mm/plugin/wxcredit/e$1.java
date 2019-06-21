package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wxcredit.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$1 extends g
{
  e$1(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48625);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof b))
      {
        paramString = (b)paramm;
        e.a(this.uYq).putString("KEY_SESSION_KEY", paramString.token);
        e.b(this.uYq).putString("key_pre_name", paramString.name);
        e.c(this.uYq).putString("key_pre_indentity", paramString.uYt);
        e.d(this.uYq).putBoolean("key_has_indentity_info", paramString.uYu);
      }
      this.uYq.a(this.hwd, 0, e.e(this.uYq));
      bool = true;
      AppMethodBeat.o(48625);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48625);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48626);
    e.f(this.uYq).putString("key_pwd1", (String)paramArrayOfObject[0]);
    i locali = this.Agm;
    String str = (String)paramArrayOfObject[0];
    if (paramArrayOfObject[1] == null);
    while (true)
    {
      locali.a(new b(str, i, e.g(this.uYq).getString("key_bank_type")), true, 1);
      AppMethodBeat.o(48626);
      return true;
      i = bo.ank((String)paramArrayOfObject[1]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e.1
 * JD-Core Version:    0.6.2
 */