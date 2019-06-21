package com.tencent.mm.plugin.wallet.pwd;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;

final class b$2 extends g
{
  b$2(b paramb, MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46145);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.i))
      {
        this.tqu.a(this.hwd, 0, b.a(this.tqu));
        h.bQ(this.hwd, this.hwd.getString(2131305123));
      }
      AppMethodBeat.o(46145);
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.i))
      {
        h.a(this.hwd, paramString, "", false, new b.2.1(this));
        AppMethodBeat.o(46145);
      }
      else
      {
        AppMethodBeat.o(46145);
        bool = false;
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46146);
    paramArrayOfObject = (s)paramArrayOfObject[0];
    String str = b.b(this.tqu).getString("key_pwd1");
    this.Agm.a(new com.tencent.mm.plugin.wallet.pwd.a.i(str, paramArrayOfObject.guu), true, 1);
    AppMethodBeat.o(46146);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.b.2
 * JD-Core Version:    0.6.2
 */