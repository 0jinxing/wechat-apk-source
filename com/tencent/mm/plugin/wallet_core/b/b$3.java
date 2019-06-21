package com.tencent.mm.plugin.wallet_core.b;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.b.a.a;
import com.tencent.mm.plugin.wallet_core.c.q;
import com.tencent.mm.plugin.wallet_core.id_verify.model.h;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$3 extends g
{
  b$3(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(46473);
    String str = this.hwd.getString(2131305391);
    AppMethodBeat.o(46473);
    return str;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46471);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof a))
      {
        ab.i("MicroMsg.BindCardProcess", "verify code success!");
        paramString = (a)paramm;
        b.f(this.ttJ).putString("kreq_token", paramString.token);
        AppMethodBeat.o(46471);
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof q))
      {
        this.ttJ.a(this.Agm);
        if (((q)paramm).ttK != null)
          b.g(this.ttJ).putParcelable("key_bindcard_value_result", ((q)paramm).ttK);
      }
      while (!(paramm instanceof h))
      {
        bool = false;
        AppMethodBeat.o(46471);
        break;
      }
      AppMethodBeat.o(46471);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46472);
    this.ttJ.F(new Object[] { "WalletVerifyCodeUI onNext", paramArrayOfObject });
    ab.i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
    paramArrayOfObject = (s)paramArrayOfObject[1];
    if (r.cPI().cQg())
    {
      paramArrayOfObject.flag = "2";
      if (!"realname_verify_process".equals(this.ttJ.bxP()))
        break label115;
      this.Agm.a(new q(paramArrayOfObject, this.ttJ.mqu.getInt("entry_scene", -1)), true, 1);
    }
    while (true)
    {
      AppMethodBeat.o(46472);
      return true;
      paramArrayOfObject.flag = "1";
      break;
      label115: this.Agm.a(new q(paramArrayOfObject), true, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.b.3
 * JD-Core Version:    0.6.2
 */