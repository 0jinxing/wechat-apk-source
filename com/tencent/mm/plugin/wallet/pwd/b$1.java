package com.tencent.mm.plugin.wallet.pwd;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$1 extends g
{
  b$1(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(46143);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.Au(paramInt);
      AppMethodBeat.o(46143);
    case 0:
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = this.hwd.getString(2131304740);
      AppMethodBeat.o(46143);
      continue;
      localObject = this.hwd.getString(2131305141);
      AppMethodBeat.o(46143);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46142);
    String str = (String)paramArrayOfObject[0];
    paramArrayOfObject = (String)paramArrayOfObject[1];
    this.Agm.a(new r(str, 3, paramArrayOfObject), true, 1);
    AppMethodBeat.o(46142);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.b.1
 * JD-Core Version:    0.6.2
 */