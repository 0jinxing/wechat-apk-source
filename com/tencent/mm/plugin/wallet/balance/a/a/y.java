package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bmo;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.f;

public class y
  implements b<x>
{
  protected x tfV;
  public final d tfW;
  public final y.b tfX;
  public final y.c tfY;
  public final y.a tfZ;

  public y()
  {
    this(new x());
    AppMethodBeat.i(45304);
    AppMethodBeat.o(45304);
  }

  private y(x paramx)
  {
    AppMethodBeat.i(45305);
    this.tfW = new d();
    this.tfX = new y.b(this);
    this.tfY = new y.c(this);
    this.tfZ = new y.a(this);
    this.tfV = paramx;
    AppMethodBeat.o(45305);
  }

  public final class d
    implements e<bmo, f<String, String, Integer, Integer, String>>
  {
    public d()
    {
    }

    public final String HZ()
    {
      return "Vending.UI";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.y
 * JD-Core Version:    0.6.2
 */