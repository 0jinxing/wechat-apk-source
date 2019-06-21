package com.tencent.mm.plugin.wallet_core.id_verify;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.plugin.wallet_core.id_verify.model.h;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
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
    boolean bool = true;
    AppMethodBeat.i(46578);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.c))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label140;
      a.f(this.tuQ).putInt("realname_verify_process_ret", -1);
      ab.i("MicroMsg.RealNameVerifyProcess", "real name reg succ ,update user info");
      r.cPI().Km();
      paramString = new uq();
      paramString.cQP.scene = 16;
      paramString.callback = new a.2.1(this);
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      a.a(this.tuQ, this.Agm);
      this.tuQ.b(this.hwd, a.g(this.tuQ));
      AppMethodBeat.o(46578);
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof h))
      {
        AppMethodBeat.o(46578);
      }
      else
      {
        label140: bool = false;
        AppMethodBeat.o(46578);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46577);
    s locals = (s)paramArrayOfObject[0];
    paramArrayOfObject = a.e(this.tuQ).getString("key_real_name_token");
    if ((locals == null) || (bo.isNullOrNil(locals.guu)))
      ab.e("MicroMsg.RealNameVerifyProcess", "get pwd error");
    while (true)
    {
      AppMethodBeat.o(46577);
      return true;
      if (bo.isNullOrNil(paramArrayOfObject))
      {
        ab.e("MicroMsg.RealNameVerifyProcess", "get token error");
      }
      else
      {
        paramArrayOfObject = new com.tencent.mm.plugin.wallet_core.id_verify.model.c(locals.guu, paramArrayOfObject, this.tuQ.mqu.getInt("entry_scene", -1));
        this.Agm.a(paramArrayOfObject, true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.a.2
 * JD-Core Version:    0.6.2
 */