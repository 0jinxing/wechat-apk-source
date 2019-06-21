package com.tencent.mm.plugin.wallet.pwd;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.e;

final class a$1 extends g
{
  a$1(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46127);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof y)))
    {
      paramString = r.cPE().cRh();
      ab.i("MicroMsg.ProcessManager", "hy: reset_pwd_flag: %s, find_pwd_url: %s", new Object[] { paramString.field_reset_passwd_flag, paramString.field_find_passwd_url });
      paramString = r.cPI().cQu();
      if (!bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.ProcessManager", "jump to forget url: %s", new Object[] { paramString });
        e.n(this.hwd, paramString, false);
        AppMethodBeat.o(46127);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(46127);
      bool = false;
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.1
 * JD-Core Version:    0.6.2
 */