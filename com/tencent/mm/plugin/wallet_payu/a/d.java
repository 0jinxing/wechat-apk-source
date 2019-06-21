package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_payu.pwd.a.f;
import com.tencent.mm.wallet_core.a;
import java.util.HashMap;

public class d
  implements at
{
  public String tTA = null;
  private int tTB = -1;

  static
  {
    AppMethodBeat.i(48414);
    a.g("PayUOpenProcess", com.tencent.mm.plugin.wallet_payu.create.a.c.class);
    a.g("PayUBindProcess", com.tencent.mm.plugin.wallet_payu.bind.model.c.class);
    a.g("PayUForgotPwdProcess", f.class);
    a.g("PayUModifyPasswordProcess", com.tencent.mm.plugin.wallet_payu.pwd.a.g.class);
    a.g("PayURemittanceProcess", com.tencent.mm.plugin.wallet_payu.remittance.a.g.class);
    a.g("PayUShowOrderProcess", com.tencent.mm.plugin.wallet_payu.order.a.d.class);
    AppMethodBeat.o(48414);
  }

  public static d cTf()
  {
    AppMethodBeat.i(48413);
    d locald = (d)q.Y(d.class);
    AppMethodBeat.o(48413);
    return locald;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.a.d
 * JD-Core Version:    0.6.2
 */