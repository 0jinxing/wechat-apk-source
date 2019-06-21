package com.tencent.mm.plugin.wallet.balance;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.tenpay.model.n;
import org.json.JSONArray;

final class b$2 extends g
{
  b$2(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(45201);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b)))
    {
      paramString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
      b.b(this.teV).putString("kreq_token", paramString.token);
      b.c(this.teV).putParcelable("key_authen", paramString.toh);
      paramm = b.d(this.teV);
      if (!paramString.tof)
        bool2 = true;
      paramm.putBoolean("key_need_verify_sms", bool2);
      paramm = paramString.oYc;
      if (paramm != null)
        b.e(this.teV).putParcelable("key_realname_guide_helper", paramm);
      if (paramString.too != null)
        b.f(this.teV).putString("key_fetch_result_show_info", paramString.too.toString());
      a.j(this.hwd, b.g(this.teV));
      this.hwd.finish();
      AppMethodBeat.o(45201);
    }
    for (bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      AppMethodBeat.o(45201);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45202);
    Bankcard localBankcard = (Bankcard)b.h(this.teV).getParcelable("key_bankcard");
    Object localObject = (String)paramArrayOfObject[0];
    b.i(this.teV).putString("key_pwd1", (String)localObject);
    b.j(this.teV).putString("key_mobile", localBankcard.field_mobile);
    localObject = new Authen();
    ((Authen)localObject).bJt = 3;
    ((Authen)localObject).twc = ((String)paramArrayOfObject[0]);
    ((Authen)localObject).pbo = localBankcard.field_bindSerial;
    ((Authen)localObject).pbn = localBankcard.field_bankcardType;
    ((Authen)localObject).pGr = ((PayInfo)b.k(this.teV).getParcelable("key_pay_info"));
    ((Authen)localObject).twk = localBankcard.field_arrive_type;
    this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.a.b((Authen)localObject, (Orders)b.l(this.teV).getParcelable("key_orders")), true, 1);
    AppMethodBeat.o(45202);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.b.2
 * JD-Core Version:    0.6.2
 */