package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.plugin.wallet_core.c.a.c;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletIbgOrderInfoUI extends WalletBaseUI
{
  public static Orders tog;
  private String mAppId = null;
  private String mTimeStamp = null;
  private String tMQ = null;
  private String tMR = null;
  private String tMS = null;
  private String tMT = null;
  private final int tMU = 1;
  private final int tMV = 2;
  private String tmv = null;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(47850);
    ab.i("MicroMsg.WalletIbgOrderInfoUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramm instanceof c))
    {
      ng(1565);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = (c)paramm;
        tog = paramm.tux;
        paramString = tog;
        paramInt1 = paramm.tuI;
        ab.i("MicroMsg.WalletIbgOrderInfoUI", "gotoIbgOrderInfoUI, useNewPage: %s, orders: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
        if (paramInt1 == 1)
        {
          paramm = new Intent(this, WalletIbgOrderInfoNewUI.class);
          paramm.putExtra("key_orders", paramString);
          startActivityForResult(paramm, 1);
          AppMethodBeat.o(47850);
        }
      }
    }
    while (true)
    {
      return bool;
      paramm = new Intent(this, WalletIbgOrderInfoOldUI.class);
      paramm.putExtra("key_orders", paramString);
      startActivityForResult(paramm, 2);
      break;
      setResult(0);
      finish();
      setResult(0);
      finish();
      AppMethodBeat.o(47850);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130970969;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47849);
    if (paramInt2 == -1)
    {
      if (paramInt1 == 1)
      {
        paramIntent = new iy();
        paramIntent.cEc.requestCode = 25;
        paramIntent.cEc.bFZ = -1;
        paramIntent.cEc.cEd = new Intent();
        com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
      }
      setResult(-1);
      finish();
    }
    AppMethodBeat.o(47849);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47848);
    super.onCreate(paramBundle);
    nf(1565);
    this.mAppId = getIntent().getStringExtra("appId");
    this.tMQ = getIntent().getStringExtra("nonceStr");
    this.mTimeStamp = getIntent().getStringExtra("timeStamp");
    this.tmv = getIntent().getStringExtra("packageExt");
    this.tMR = getIntent().getStringExtra("paySignature");
    this.tMS = getIntent().getStringExtra("signtype");
    this.tMT = getIntent().getStringExtra("url");
    a(new c(this.mAppId, this.tMQ, this.mTimeStamp, this.tmv, this.tMR, this.tMS, this.tMT), true, false);
    AppMethodBeat.o(47848);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47851);
    super.onDestroy();
    ng(1565);
    AppMethodBeat.o(47851);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI
 * JD-Core Version:    0.6.2
 */