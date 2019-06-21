package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.g.a.vc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;

final class a$1
  implements Runnable
{
  a$1(a parama, uq paramuq, Intent paramIntent, Activity paramActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(46575);
    this.tuP.callback = null;
    a.a(this.tuQ);
    vc localvc;
    if ((!bo.isNullOrNil(a.b(this.tuQ))) && (!bo.isNullOrNil(a.c(this.tuQ))))
    {
      ab.i("MicroMsg.RealNameVerifyProcess", "real name verify process end,jump to " + a.b(this.tuQ) + a.c(this.tuQ));
      boolean bool = this.tuQ.mqu.getBoolean("process_finish_stay_orgpage", true);
      this.evM.putExtra("key_process_is_end", true);
      this.evM.putExtra("key_process_is_stay", bool);
      a.a(this.tuQ, this.ghG, a.b(this.tuQ), a.c(this.tuQ), a.d(this.tuQ), this.evM, bool);
      if (a.d(this.tuQ) == -1)
      {
        localvc = new vc();
        localvc.cRZ.result = a.d(this.tuQ);
        com.tencent.mm.sdk.b.a.xxA.m(localvc);
      }
      AppMethodBeat.o(46575);
    }
    while (true)
    {
      return;
      this.tuQ.aG(this.ghG);
      if (a.d(this.tuQ) == -1)
      {
        localvc = new vc();
        localvc.cRZ.result = a.d(this.tuQ);
        com.tencent.mm.sdk.b.a.xxA.m(localvc);
      }
      AppMethodBeat.o(46575);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.a.1
 * JD-Core Version:    0.6.2
 */