package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$2 extends g
{
  b$2(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48602);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.uYn.a(this.hwd, 0, b.e(this.uYn));
      this.hwd.finish();
      bool = true;
      AppMethodBeat.o(48602);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48602);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48603);
    b.f(this.uYn).putString("key_pwd1", (String)paramArrayOfObject[0]);
    this.Agm.a(new r((String)paramArrayOfObject[0], 5, ""), true, 1);
    AppMethodBeat.o(48603);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.b.2
 * JD-Core Version:    0.6.2
 */