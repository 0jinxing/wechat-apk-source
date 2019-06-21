package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.protobuf.bfi;
import com.tencent.mm.sdk.platformtools.ab;

public final class s
{
  private static s tfH;
  public bfi tfI;

  public static s cMK()
  {
    AppMethodBeat.i(45277);
    if (tfH == null)
      tfH = new s();
    s locals = tfH;
    AppMethodBeat.o(45277);
    return locals;
  }

  public final void a(bfi parambfi)
  {
    AppMethodBeat.i(45278);
    ab.i("MicroMsg.LqtOnClickRedeemCache", "setCache OnClickRedeemRes balance %s, bank_balance %s, lq_balance %s", new Object[] { Integer.valueOf(parambfi.wJb), Integer.valueOf(parambfi.wJd), Integer.valueOf(parambfi.wJc) });
    this.tfI = parambfi;
    if (ae.gjw)
    {
      this.tfI.wJb = 100000000;
      this.tfI.wJd = 50000000;
      this.tfI.wJc = 50000000;
    }
    AppMethodBeat.o(45278);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.s
 * JD-Core Version:    0.6.2
 */