package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxcredit.a.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class d$2 extends g
{
  d$2(d paramd, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48617);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof f))
      {
        this.Agm.a(new y(), true);
        AppMethodBeat.o(48617);
      }
    while (true)
    {
      return bool;
      if (!(paramm instanceof y))
        break;
      this.uYp.b(this.hwd, d.a(this.uYp));
      break;
      bool = false;
      AppMethodBeat.o(48617);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48618);
    Bankcard localBankcard = (Bankcard)d.b(this.uYp).getParcelable("key_bankcard");
    this.Agm.a(new f(localBankcard.field_bankcardType, localBankcard.field_bindSerial, (String)paramArrayOfObject[0]), true, 1);
    AppMethodBeat.o(48618);
    return true;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48619);
    paramArrayOfObject = (Bankcard)paramArrayOfObject[0];
    this.Agm.a(new com.tencent.mm.plugin.wxcredit.a.d(paramArrayOfObject.field_bindSerial, paramArrayOfObject.field_bankcardType), true, 1);
    AppMethodBeat.o(48619);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.d.2
 * JD-Core Version:    0.6.2
 */