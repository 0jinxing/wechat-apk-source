package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.a;
import com.tencent.mm.plugin.wallet_payu.pay.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WalletPayUOrderInfoUI extends WalletOrderInfoOldUI
{
  public final void adb(String paramString)
  {
    AppMethodBeat.i(48479);
    a(new c(paramString, 1), true, true);
    AppMethodBeat.o(48479);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48481);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.pay.a.a))
    {
      bool = true;
      AppMethodBeat.o(48481);
      return bool;
    }
    if ((paramm instanceof c))
    {
      localObject = (c)paramm;
      if ((((c)localObject).pWy.tAq != null) && (((c)localObject).pWy.tAq.size() > 0))
        break label109;
      ab.w("MicroMsg.WalletPayUOrderInfoUI", "hy: no commodity. show alert");
      h.a(this, 2131305219, 2131297061, new WalletPayUOrderInfoUI.1(this));
    }
    label109: Orders.Commodity localCommodity;
    do
    {
      bool = super.c(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(48481);
      break;
      localCommodity = (Orders.Commodity)((c)localObject).pWy.tAq.get(0);
      ab.d("MicroMsg.WalletPayUOrderInfoUI", "Coomdity:".concat(String.valueOf(localCommodity)));
      com.tencent.mm.plugin.wallet_payu.a.d.cTf().tTA = null;
    }
    while (localCommodity == null);
    this.tId = new ArrayList();
    this.tId.add(localCommodity);
    g.RQ();
    Object localObject = ((j)g.K(j.class)).XM().aoO(localCommodity.pcm);
    if ((localObject != null) && ((int)((com.tencent.mm.n.a)localObject).ewQ != 0))
      S((ad)localObject);
    while (true)
    {
      this.tIN.notifyDataSetChanged();
      cRJ();
      break;
      ao.a.flu.a(localCommodity.pcm, "", this.tIU);
    }
  }

  public final void cRI()
  {
    AppMethodBeat.i(48478);
    a(new com.tencent.mm.plugin.wallet_core.c.b.a(), true, true);
    AppMethodBeat.o(48478);
  }

  public final void done()
  {
    AppMethodBeat.i(48482);
    cRq();
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("intent_pay_end_errcode", this.mBundle.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject).putString("intent_pay_app_url", this.mBundle.getString("intent_pay_app_url"));
    ((Bundle)localObject).putBoolean("intent_pay_end", this.mBundle.getBoolean("intent_pay_end"));
    ab.i("MicroMsg.WalletPayUOrderInfoUI", "pay done...feedbackData errCode:" + this.mBundle.getInt("intent_pay_end_errcode"));
    Iterator localIterator = this.tIc.iterator();
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!bo.isNullOrNil(str))
      {
        ab.d("MicroMsg.WalletPayUOrderInfoUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str });
        a(new com.tencent.mm.wallet_core.c.r(str), false, false);
      }
    }
    com.tencent.mm.wallet_core.a.j(this, (Bundle)localObject);
    if ((this.tog != null) && (!bo.isNullOrNil(this.tog.lvz)))
      if (this.tog.tAq.size() <= 0)
        break label324;
    label324: for (String str = ((Orders.Commodity)this.tog.tAq.get(0)).cAa; ; str = "")
    {
      str = String.format("%sreqkey=%s&transid=%s", new Object[] { this.tog.lvz, this.tog.czZ, str });
      ab.d("MicroMsg.WalletPayUOrderInfoUI", "url = ".concat(String.valueOf(str)));
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", str);
      ((Intent)localObject).putExtra("showShare", false);
      ((Intent)localObject).putExtra("geta8key_username", com.tencent.mm.model.r.Yz());
      com.tencent.mm.bp.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject);
      AppMethodBeat.o(48482);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48477);
    super.onCreate(paramBundle);
    nf(1554);
    AppMethodBeat.o(48477);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48480);
    ng(1554);
    super.onDestroy();
    AppMethodBeat.o(48480);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUOrderInfoUI
 * JD-Core Version:    0.6.2
 */