package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wallet_core.c.z;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoUI extends WalletBaseUI
{
  private String oXY;
  protected ao.b.a tIU;
  private Orders tog;

  public WalletOrderInfoUI()
  {
    AppMethodBeat.i(47525);
    this.tIU = new WalletOrderInfoUI.1(this);
    AppMethodBeat.o(47525);
  }

  protected static String d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(47533);
    try
    {
      String str = URLEncoder.encode(URLEncoder.encode(paramString5, "utf-8"), "utf-8");
      if ((paramString1.indexOf("%7Breqkey%7D") > 0) || (paramString1.indexOf("%7Btransid%7D") > 0) || (paramString1.indexOf("%7Bphone%7D") > 0) || (paramString1.indexOf("%7Bremark%7D") > 0))
      {
        ab.i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
        paramString2 = paramString1.replace("%7Breqkey%7D", paramString2).replace("%7Btransid%7D", paramString3).replace("%7Bphone%7D", paramString4).replace("%7Bremark%7D", str);
        paramString1 = paramString2;
      }
      while (true)
      {
        AppMethodBeat.o(47533);
        return paramString1;
        if ((paramString1.indexOf("{reqkey}") > 0) || (paramString1.indexOf("{transid}") > 0) || (paramString1.indexOf("{phone}") > 0) || (paramString1.indexOf("{remark}") > 0))
        {
          ab.i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
          paramString2 = paramString1.replace("{reqkey}", paramString2).replace("{transid}", paramString3).replace("{phone}", paramString4).replace("{remark}", str);
          paramString1 = paramString2;
        }
        else
        {
          ab.i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
          paramString5 = new java/lang/StringBuilder;
          paramString5.<init>();
          paramString2 = paramString1 + String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", new Object[] { paramString2, paramString3, paramString4, str });
          paramString1 = paramString2;
        }
      }
    }
    catch (Exception paramString2)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletOrderInfoUI", paramString2, "", new Object[0]);
    }
  }

  private void e(Orders paramOrders)
  {
    AppMethodBeat.i(47531);
    ab.c("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", new Object[] { Integer.valueOf(paramOrders.tAA) });
    if (paramOrders.tAA == 1)
      dOD().b(this, WalletOrderInfoNewUI.class, this.mBundle);
    while (true)
    {
      finish();
      AppMethodBeat.o(47531);
      return;
      dOD().b(this, WalletOrderInfoOldUI.class, this.mBundle);
    }
  }

  protected void S(ad paramad)
  {
    AppMethodBeat.i(47532);
    if ((paramad != null) && ((int)paramad.ewQ != 0))
    {
      String str = paramad.Oi();
      ab.d("MicroMsg.WalletOrderInfoUI", "call back from contactServer nickName " + str + " username: " + paramad.field_username);
      if ((this.tog.tAq != null) && (this.tog.tAq.size() > 0))
      {
        paramad = this.tog.tAq.iterator();
        while (paramad.hasNext())
          ((Orders.Commodity)paramad.next()).pcm = str;
      }
    }
    AppMethodBeat.o(47532);
  }

  protected void adb(String paramString)
  {
    AppMethodBeat.i(47529);
    a(new z(paramString), true, true);
    AppMethodBeat.o(47529);
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(47534);
    if (((paramm instanceof z)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.tog = ((z)paramm).tux;
      if (this.tog != null)
        if ((this.tog.tAq != null) && (this.tog.tAq.size() != 0))
        {
          paramString = (Orders.Commodity)this.tog.tAq.get(0);
          this.oXY = paramString.cAa;
          ab.d("MicroMsg.WalletOrderInfoUI", "Coomdity:" + paramString.toString());
          g.RQ();
          paramm = ((j)g.K(j.class)).XM().aoO(paramString.pcm);
          if ((paramm != null) && ((int)paramm.ewQ != 0))
            S(paramm);
        }
        else
        {
          e(this.tog);
          label173: bool = true;
          AppMethodBeat.o(47534);
        }
    }
    while (true)
    {
      return bool;
      ao.a.flu.a(paramString.pcm, "", this.tIU);
      break;
      ab.e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
      h.a(this.mController.ylL, 2131305049, 0, new WalletOrderInfoUI.2(this));
      break label173;
      AppMethodBeat.o(47534);
    }
  }

  protected Orders cRD()
  {
    AppMethodBeat.i(47528);
    Orders localOrders = (Orders)this.mBundle.getParcelable("key_orders");
    AppMethodBeat.o(47528);
    return localOrders;
  }

  protected boolean cgg()
  {
    return true;
  }

  protected void dt(String paramString, int paramInt)
  {
    AppMethodBeat.i(47530);
    a(new z(paramString, paramInt), true, true);
    AppMethodBeat.o(47530);
  }

  public int getLayoutId()
  {
    return 2130970969;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47526);
    super.onCreate(paramBundle);
    int i;
    if (cgg())
    {
      this.tog = cRD();
      this.oXY = this.mBundle.getString("key_trans_id");
      i = this.mBundle.getInt("key_pay_type", -1);
      ab.i("MicroMsg.WalletOrderInfoUI", "mTransId %s", new Object[] { this.oXY });
      if (this.oXY != null)
        if (i == -1)
        {
          adb(this.oXY);
          AppMethodBeat.o(47526);
        }
    }
    while (true)
    {
      return;
      dt(this.oXY, i);
      AppMethodBeat.o(47526);
      continue;
      if (this.tog != null)
        e(this.tog);
      AppMethodBeat.o(47526);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47527);
    super.onDestroy();
    if ((this.tog != null) && (!bo.isNullOrNil(this.tog.username)))
      ao.a.flu.or(this.tog.username);
    AppMethodBeat.o(47527);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
 * JD-Core Version:    0.6.2
 */