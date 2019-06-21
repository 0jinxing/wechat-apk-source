package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.r;
import java.util.Iterator;
import java.util.Set;

public class WalletMixOrderInfoProxyUI extends WalletOrderInfoNewUI
{
  private String prepayId = null;
  private Orders tog;

  protected final Orders cRD()
  {
    return this.tog;
  }

  protected final void cRq()
  {
  }

  public final void done()
  {
    AppMethodBeat.i(47410);
    Object localObject1 = this.tIc.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if (!bo.isNullOrNil((String)localObject2))
      {
        ab.d("MicroMsg.WalletMixOrderInfoProxyUI", "hy: doing netscene subscribe...appName: %s", new Object[] { localObject2 });
        g.RQ();
        g.RO().eJo.a(new r((String)localObject2), 0);
      }
    }
    if (!bo.isNullOrNil(this.prepayId))
    {
      localObject1 = new uv();
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("intent_pay_end", true);
      ((uv)localObject1).cRF.intent = ((Intent)localObject2);
      ((uv)localObject1).cRF.czZ = this.prepayId;
      ((uv)localObject1).cRF.result = -1;
      ((uv)localObject1).cRF.cRH = 1;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    setResult(-1);
    finish();
    AppMethodBeat.o(47410);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47409);
    this.tog = ((Orders)getIntent().getParcelableExtra("key_orders"));
    this.prepayId = getIntent().getStringExtra("prepayId");
    super.onCreate(paramBundle);
    AppMethodBeat.o(47409);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoProxyUI
 * JD-Core Version:    0.6.2
 */