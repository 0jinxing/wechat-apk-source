package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class n$1 extends g
{
  n$1(n paramn, MMActivity paramMMActivity1, i parami1, i parami2, MMActivity paramMMActivity2)
  {
    super(paramMMActivity1, parami1);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(47405);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof ac))
      {
        ab.i("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms succ");
        paramm = (ac)paramm;
        paramString = this.tHT.mqu;
        paramString.putString("key_jsapi_token", paramm.tuu);
        this.tHT.b(this.cgq, paramString);
        AppMethodBeat.o(47405);
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.s))
      {
        AppMethodBeat.o(47405);
      }
      else
      {
        AppMethodBeat.o(47405);
        bool = false;
        continue;
        if ((paramm instanceof ac))
          ab.e("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms fail,errType=" + paramInt1 + ",errCode=" + paramInt2 + ",errMsg=" + paramString);
        AppMethodBeat.o(47405);
        bool = false;
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(47403);
    boolean bool;
    if (paramArrayOfObject.length == 2)
    {
      paramArrayOfObject = (com.tencent.mm.plugin.wallet_core.model.s)paramArrayOfObject[1];
      paramArrayOfObject.token = n.a(this.tHT);
      ab.i("MicroMsg.WalletJSApiVerifyCodeProcess", "do NetSceneTenpayVerifySmsByPasswd");
      paramArrayOfObject = new ac(paramArrayOfObject, n.b(this.tHT));
      this.tHS.a(paramArrayOfObject, true, 1);
      AppMethodBeat.o(47403);
      bool = true;
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.WalletJSApiVerifyCodeProcess", "arguments is error");
      bool = false;
      AppMethodBeat.o(47403);
    }
  }

  public final boolean x(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(47404);
    ab.i("MicroMsg.WalletJSApiVerifyCodeProcess", "resend sms");
    paramArrayOfObject = new com.tencent.mm.plugin.wallet_core.c.s(n.c(this.tHT), n.a(this.tHT), '\000');
    this.tHS.a(paramArrayOfObject, true, 1);
    AppMethodBeat.o(47404);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.n.1
 * JD-Core Version:    0.6.2
 */