package com.tencent.mm.plugin.wallet.pwd;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pwd.a.q;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class a$2 extends g
{
  a$2(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46128);
    if (paramArrayOfObject.length == 3)
    {
      paramArrayOfObject = new q(paramArrayOfObject[0].toString(), ((Integer)paramArrayOfObject[1]).intValue(), (String)paramArrayOfObject[2]);
      this.Agm.a(paramArrayOfObject, true);
    }
    AppMethodBeat.o(46128);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.2
 * JD-Core Version:    0.6.2
 */