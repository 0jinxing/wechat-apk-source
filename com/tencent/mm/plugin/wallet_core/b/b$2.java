package com.tencent.mm.plugin.wallet_core.b;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.b.a.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$2 extends g
{
  b$2(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46469);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof a))
      {
        paramString = (a)paramm;
        b.a(this.ttJ).putString("kreq_token", paramString.token);
        if (this.ttJ.c(this.hwd, b.b(this.ttJ)))
        {
          ab.i("MicroMsg.BindCardProcess", "need update bankcardlist");
          this.Agm.a(new y(null, 12), false);
          AppMethodBeat.o(46469);
        }
      }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.BindCardProcess", "not need update bankcardlist");
      this.ttJ.a(this.hwd, 0, b.c(this.ttJ));
      break;
      if ((paramm instanceof y))
      {
        ab.i("MicroMsg.BindCardProcess", "update bankcardlist success!");
        this.ttJ.a(this.hwd, 0, b.d(this.ttJ));
        AppMethodBeat.o(46469);
      }
      else
      {
        AppMethodBeat.o(46469);
        bool = false;
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46470);
    this.ttJ.F(new Object[] { "onNext", paramArrayOfObject });
    ab.i("MicroMsg.BindCardProcess", "onNext, do bind bank card!");
    paramArrayOfObject = (Authen)paramArrayOfObject[0];
    paramArrayOfObject.bJt = b.e(this.ttJ);
    this.Agm.a(new a(paramArrayOfObject), true, 1);
    AppMethodBeat.o(46470);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.b.2
 * JD-Core Version:    0.6.2
 */