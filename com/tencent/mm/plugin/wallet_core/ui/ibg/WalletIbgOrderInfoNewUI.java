package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.r;
import java.util.Iterator;
import java.util.Set;

public class WalletIbgOrderInfoNewUI extends WalletOrderInfoNewUI
{
  private Orders tog;

  public final Orders cRD()
  {
    return this.tog;
  }

  public final void cRq()
  {
  }

  public final void done()
  {
    AppMethodBeat.i(47845);
    ab.i("MicroMsg.WalletIbgOrderInfoNewUI", "hy: result is not set manly. set to OK");
    Iterator localIterator = this.tIc.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bo.isNullOrNil(str))
      {
        ab.d("MicroMsg.WalletIbgOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str });
        g.RQ();
        g.RO().eJo.a(new r(str), 0);
      }
    }
    setResult(-1);
    finish();
    AppMethodBeat.o(47845);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47844);
    this.tog = WalletIbgOrderInfoUI.tog;
    super.onCreate(paramBundle);
    paramBundle = new iy();
    paramBundle.cEc.requestCode = 25;
    paramBundle.cEc.bFZ = -1;
    paramBundle.cEc.cEd = new Intent();
    a.xxA.m(paramBundle);
    AppMethodBeat.o(47844);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoNewUI
 * JD-Core Version:    0.6.2
 */