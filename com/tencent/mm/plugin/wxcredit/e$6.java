package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$6 extends g
{
  e$6(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48637);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.uYq.a(this.hwd, 0, e.al(this.uYq));
      bool = true;
      AppMethodBeat.o(48637);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48637);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48638);
    e.am(this.uYq).putBoolean("key_is_follow_bank_username", ((Boolean)paramArrayOfObject[0]).booleanValue());
    e.an(this.uYq);
    this.Agm.a(new y(), true, 1);
    AppMethodBeat.o(48638);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e.6
 * JD-Core Version:    0.6.2
 */