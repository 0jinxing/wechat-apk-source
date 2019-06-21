package com.tencent.mm.plugin.wxcredit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class d$1 extends g
{
  d$1(d paramd, MMActivity paramMMActivity, i parami)
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
    AppMethodBeat.i(48616);
    paramArrayOfObject = (Bankcard)paramArrayOfObject[0];
    this.Agm.a(new com.tencent.mm.plugin.wxcredit.a.d(paramArrayOfObject.field_bindSerial, paramArrayOfObject.field_bankcardType), true, 1);
    AppMethodBeat.o(48616);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.d.1
 * JD-Core Version:    0.6.2
 */