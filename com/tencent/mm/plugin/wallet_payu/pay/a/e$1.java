package com.tencent.mm.plugin.wallet_payu.pay.a;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$1 extends g
{
  e$1(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    return false;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48446);
    paramArrayOfObject = (PayInfo)this.hwd.getIntent().getParcelableExtra("key_pay_info");
    boolean bool;
    if ((paramArrayOfObject != null) && (!bo.isNullOrNil(paramArrayOfObject.czZ)))
    {
      this.Agm.a(new c(paramArrayOfObject.czZ), paramArrayOfObject.vwf, 1);
      this.Agm.a(new a(), paramArrayOfObject.vwf, 1);
      AppMethodBeat.o(48446);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48446);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.e.1
 * JD-Core Version:    0.6.2
 */