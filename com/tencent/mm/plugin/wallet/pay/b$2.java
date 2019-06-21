package com.tencent.mm.plugin.wallet.pay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.a;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$2 extends g
{
  b$2(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  private void cNI()
  {
    AppMethodBeat.i(45865);
    ab.i("MicroMsg.PayProcess", "directToNext()");
    boolean bool = this.tnW.mqu.getBoolean("key_balance_change_phone_need_confirm_phone", false);
    Authen localAuthen = (Authen)this.tnW.mqu.getParcelable("key_authen");
    Orders localOrders = (Orders)this.tnW.mqu.getParcelable("key_orders");
    Object localObject = (Bankcard)this.tnW.mqu.getParcelable("key_bankcard");
    ElementQuery localElementQuery = r.cPQ().acy(((Bankcard)localObject).field_bankcardType);
    this.tnW.mqu.putParcelable("elemt_query", localElementQuery);
    if (!bool)
    {
      localAuthen.tuk = "";
      localAuthen.pbn = ((Bankcard)localObject).field_bankcardType;
      localAuthen.pbo = ((Bankcard)localObject).field_bindSerial;
      localObject = ((Bankcard)localObject).field_mobile;
      this.tnW.mqu.putString("key_mobile", (String)localObject);
      if ((localElementQuery == null) || (localElementQuery.tyy) || (localElementQuery.tyz))
      {
        ab.i("MicroMsg.PayProcess", "hy: need rewrite cvv or validThru");
        this.tnW.a(this.hwd, 0, this.tnW.mqu);
        AppMethodBeat.o(45865);
      }
    }
    while (true)
    {
      return;
      this.Agm.a(a.b(localAuthen, localOrders, this.tnW.mqu.getBoolean("key_isbalance", false)), true);
      AppMethodBeat.o(45865);
      continue;
      localAuthen.pbn = ((Bankcard)localObject).field_bankcardType;
      localAuthen.pbo = ((Bankcard)localObject).field_bindSerial;
      this.tnW.a(this.hwd, 0, this.tnW.mqu);
      AppMethodBeat.o(45865);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(45863);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.c)))
    {
      ab.i("MicroMsg.PayProcess", "onSceneEnd for select bank card, forward");
      this.tnW.a(this.hwd, 0, this.tnW.mqu);
      bool = true;
      AppMethodBeat.o(45863);
    }
    while (true)
    {
      return bool;
      if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.t)))
      {
        ab.i("MicroMsg.PayProcess", "onSceneEnd for select bank card, directToNext");
        cNI();
      }
      AppMethodBeat.o(45863);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45864);
    ab.i("MicroMsg.PayProcess", "onNext for select bank card");
    this.tnW.mqu.putInt("key_err_code", 0);
    paramArrayOfObject = (Bankcard)this.tnW.mqu.getParcelable("key_bankcard");
    if (paramArrayOfObject != null)
      if (r.cPQ().acy(paramArrayOfObject.field_bankcardType) != null)
        cNI();
    while (true)
    {
      AppMethodBeat.o(45864);
      return false;
      this.Agm.a(new com.tencent.mm.plugin.wallet_core.c.t("", "", null), true, 1);
      continue;
      ab.i("MicroMsg.PayProcess", "directToBindNew()");
      this.tnW.mqu.putInt("key_pay_flag", 2);
      this.tnW.a(this.hwd, 0, this.tnW.mqu);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.2
 * JD-Core Version:    0.6.2
 */