package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wxcredit.a.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$2 extends g
{
  e$2(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48627);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof a))
      {
        paramString = (a)paramm;
        e.h(this.uYq).putString("KEY_SESSION_KEY", paramString.token);
        e.i(this.uYq).putString("key_mobile", paramString.cFl);
        e.j(this.uYq).putBoolean("key_need_bind_deposit", paramString.cQU);
        e.k(this.uYq).putBoolean("key_is_bank_user", paramString.uYs);
      }
      this.uYq.a(this.hwd, 0, e.l(this.uYq));
      bool = true;
      AppMethodBeat.o(48627);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48627);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48628);
    String str = (String)paramArrayOfObject[0];
    paramArrayOfObject = (String)paramArrayOfObject[1];
    e.m(this.uYq).putString("key_name", str);
    e.n(this.uYq).putString("key_indentity", paramArrayOfObject);
    this.Agm.a(new a(str, paramArrayOfObject, e.o(this.uYq).getString("KEY_SESSION_KEY"), e.p(this.uYq).getString("key_bank_type")), true, 1);
    AppMethodBeat.o(48628);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e.2
 * JD-Core Version:    0.6.2
 */