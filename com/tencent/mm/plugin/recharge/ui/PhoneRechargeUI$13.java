package com.tencent.mm.plugin.recharge.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.a;
import com.tencent.mm.plugin.recharge.ui.form.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.a;
import java.util.List;

final class PhoneRechargeUI$13
  implements h.a
{
  PhoneRechargeUI$13(PhoneRechargeUI paramPhoneRechargeUI, List paramList, String paramString)
  {
  }

  public final void BB(int paramInt)
  {
    AppMethodBeat.i(44266);
    ab.d("MicroMsg.PhoneRechargeUI", "choose: %d", new Object[] { Integer.valueOf(paramInt) });
    PhoneRechargeUI.b(this.pHs).setInput(new a((String)this.pHw.get(paramInt), this.pHx, 1));
    PhoneRechargeUI.n(this.pHs);
    AppMethodBeat.o(44266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.13
 * JD-Core Version:    0.6.2
 */