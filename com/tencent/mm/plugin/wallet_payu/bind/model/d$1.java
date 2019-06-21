package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.pwd.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class d$1 extends g
{
  d$1(d paramd, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(48346);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = this.hwd.getString(2131304748);
      AppMethodBeat.o(48346);
    }
    while (true)
    {
      return localObject;
      localObject = super.Au(paramInt);
      AppMethodBeat.o(48346);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48347);
    if ((paramm instanceof c))
    {
      if ((paramInt2 == 0) && (paramInt1 == 0))
      {
        paramString = (c)paramm;
        d.a(this.tSK).putString("payu_reference", paramString.token);
        if (bo.isNullOrNil(paramString.token))
          break label118;
        ab.d("MicroMsg.PayUUnbindProcess", "hy: check pwd pass");
        paramString = (Bankcard)d.b(this.tSK).getParcelable("key_bankcard");
        if (paramString != null)
          this.Agm.a(new b(paramString.field_bindSerial, d.c(this.tSK).getString("payu_reference")), true);
      }
      AppMethodBeat.o(48347);
    }
    while (true)
    {
      return false;
      label118: ab.w("MicroMsg.PayUUnbindProcess", "hy: check pwd failed");
      break;
      if (!(paramm instanceof b))
        break;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        d.d(this.tSK).putInt("key_errcode_payu", 0);
        this.tSK.b(this.hwd, d.e(this.tSK));
      }
      AppMethodBeat.o(48347);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48348);
    d.f(this.tSK).putString("key_pwd1", (String)paramArrayOfObject[0]);
    this.Agm.a(new c(d.g(this.tSK).getString("key_pwd1")), true);
    AppMethodBeat.o(48348);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.d.1
 * JD-Core Version:    0.6.2
 */