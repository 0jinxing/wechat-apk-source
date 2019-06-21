package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxcredit.a.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$1 extends g
{
  b$1(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48600);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof e))
      {
        b.a(this.uYn).putString("kreq_token", ((e)paramm).token);
        AppMethodBeat.o(48600);
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.wxcredit.a.c))
      {
        b.b(this.uYn).putDouble("key_credit_amount", ((com.tencent.mm.plugin.wxcredit.a.c)paramm).uYv);
        this.uYn.a(this.hwd, 0, b.c(this.uYn));
        bool = true;
        AppMethodBeat.o(48600);
      }
      else
      {
        AppMethodBeat.o(48600);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48601);
    paramArrayOfObject = (Bankcard)b.d(this.uYn).getParcelable("key_bankcard");
    this.Agm.a(new e(paramArrayOfObject.field_bindSerial), true, 1);
    AppMethodBeat.o(48601);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.b.1
 * JD-Core Version:    0.6.2
 */