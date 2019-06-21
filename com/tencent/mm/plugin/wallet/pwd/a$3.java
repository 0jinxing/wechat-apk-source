package com.tencent.mm.plugin.wallet.pwd;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class a$3 extends g
{
  a$3(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(46129);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.m)))
    {
      paramString = (com.tencent.mm.plugin.wallet.pwd.a.m)paramm;
      a.a(this.tqt).putString("kreq_token", paramString.token);
      this.tqt.a(this.hwd, 0, a.b(this.tqt));
      bool = true;
      AppMethodBeat.o(46129);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(46129);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46130);
    paramArrayOfObject = (Authen)paramArrayOfObject[0];
    if (!this.tqt.cRY())
    {
      paramArrayOfObject.bJt = 1;
      if (!a.c(this.tqt).getBoolean("key_is_paymanager"))
        break label90;
    }
    label90: for (int i = 1; ; i = 0)
    {
      this.Agm.a(new com.tencent.mm.plugin.wallet.pwd.a.m(paramArrayOfObject, a.d(this.tqt).getBoolean("key_is_reset_with_new_card", false), i), true, 1);
      AppMethodBeat.o(46130);
      return true;
      paramArrayOfObject.bJt = 4;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.3
 * JD-Core Version:    0.6.2
 */