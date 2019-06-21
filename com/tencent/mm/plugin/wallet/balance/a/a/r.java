package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.sw;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.c;

public class r
  implements b<q>
{
  protected q tfB;
  public final r.b tfC;
  public final a tfD;
  public final r.d tfE;
  public final r.c tfF;

  public r()
  {
    this(new q());
    AppMethodBeat.i(45275);
    AppMethodBeat.o(45275);
  }

  private r(q paramq)
  {
    AppMethodBeat.i(45276);
    this.tfC = new r.b(this);
    this.tfD = new a();
    this.tfE = new r.d(this);
    this.tfF = new r.c(this);
    this.tfB = paramq;
    AppMethodBeat.o(45276);
  }

  public final class a
    implements e<sw, c<String, Integer>>
  {
    public a()
    {
    }

    public final String HZ()
    {
      return "Vending.LOGIC";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.r
 * JD-Core Version:    0.6.2
 */