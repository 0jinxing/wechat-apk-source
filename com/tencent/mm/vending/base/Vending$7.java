package com.tencent.mm.vending.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.f.a;

final class Vending$7
  implements Vending.c.a<_Index>
{
  Vending$7(Vending paramVending)
  {
  }

  public final void cQ(_Index param_Index)
  {
    AppMethodBeat.i(126168);
    Vending.i locali = this.zXo.getLock(param_Index);
    boolean bool = Vending.a(this.zXo, locali, param_Index);
    if (locali.g)
    {
      a.d("Vending", "This lock is defer to return %s %s", new Object[] { locali, param_Index });
      AppMethodBeat.o(126168);
    }
    while (true)
    {
      return;
      if (bool)
      {
        AppMethodBeat.o(126168);
      }
      else
      {
        Vending.a(this.zXo, locali);
        AppMethodBeat.o(126168);
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(126169);
    this.zXo.loaderClear();
    Vending.a(this.zXo);
    AppMethodBeat.o(126169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.Vending.7
 * JD-Core Version:    0.6.2
 */