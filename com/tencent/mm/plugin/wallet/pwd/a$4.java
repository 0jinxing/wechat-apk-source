package com.tencent.mm.plugin.wallet.pwd;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pwd.a.o;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class a$4 extends g
{
  a$4(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(46133);
    String str = this.hwd.getString(2131306064);
    AppMethodBeat.o(46133);
    return str;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(46131);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.m)))
    {
      paramString = (com.tencent.mm.plugin.wallet.pwd.a.m)paramm;
      a.e(this.tqt).putString("kreq_token", paramString.token);
      bool = true;
      AppMethodBeat.o(46131);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46131);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46132);
    paramArrayOfObject = (s)paramArrayOfObject[1];
    paramArrayOfObject.flag = "3";
    this.Agm.a(new o(paramArrayOfObject), true, 1);
    AppMethodBeat.o(46132);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.4
 * JD-Core Version:    0.6.2
 */