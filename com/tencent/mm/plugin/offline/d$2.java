package com.tencent.mm.plugin.offline;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.offline.a.k;
import com.tencent.mm.plugin.wallet_core.b.a.b;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class d$2 extends g
{
  d$2(d paramd, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43297);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof y))
      {
        if ((((WalletBaseUI)this.hwd).mBundle != null) && (((WalletBaseUI)this.hwd).mBundle.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.bYd()))
          d.i(this.hwd);
        AppMethodBeat.o(43297);
        bool = true;
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof k))
      {
        paramString = ((WalletBaseUI)this.hwd).mBundle;
        paramString.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.j(this.hwd, paramString);
        com.tencent.mm.plugin.offline.c.a.W(this.hwd);
        AppMethodBeat.o(43297);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(43297);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(43296);
    paramArrayOfObject = (s)paramArrayOfObject[0];
    this.Agm.a(new b(paramArrayOfObject), true, 1);
    AppMethodBeat.o(43296);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.d.2
 * JD-Core Version:    0.6.2
 */