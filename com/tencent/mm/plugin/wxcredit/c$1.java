package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class c$1 extends g
{
  c$1(c paramc, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48609);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.uYo.a(this.hwd, 0, c.a(this.uYo));
      this.hwd.finish();
      bool = true;
      AppMethodBeat.o(48609);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48609);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48610);
    c.b(this.uYo).putString("key_pwd1", (String)paramArrayOfObject[0]);
    this.Agm.a(new r((String)paramArrayOfObject[0], 5, ""), true, 1);
    AppMethodBeat.o(48610);
    return true;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.c.1
 * JD-Core Version:    0.6.2
 */