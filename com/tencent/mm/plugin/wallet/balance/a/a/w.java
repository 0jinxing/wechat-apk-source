package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bkl;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;

public class w
  implements b<v>
{
  protected v tfQ;
  public final b tfR;
  public final w.a tfS;

  public w()
  {
    this(new v());
    AppMethodBeat.i(45293);
    AppMethodBeat.o(45293);
  }

  private w(v paramv)
  {
    AppMethodBeat.i(45294);
    this.tfR = new b();
    this.tfS = new w.a(this);
    this.tfQ = paramv;
    AppMethodBeat.o(45294);
  }

  public final class b
    implements e<bkl, Void>
  {
    public b()
    {
    }

    public final String HZ()
    {
      return "Vending.UI";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.w
 * JD-Core Version:    0.6.2
 */