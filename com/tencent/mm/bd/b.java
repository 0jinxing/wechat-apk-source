package com.tencent.mm.bd;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.b.a;

public final class b
{
  private static final b fNg;
  public long fNf;

  static
  {
    AppMethodBeat.i(1007);
    fNg = new b();
    AppMethodBeat.o(1007);
  }

  public b()
  {
    AppMethodBeat.i(1006);
    if (g.RK())
    {
      this.fNf = r.YE();
      AppMethodBeat.o(1006);
    }
    while (true)
    {
      return;
      a.xxA.b(new b.1(this));
      AppMethodBeat.o(1006);
    }
  }

  public static b aiC()
  {
    return fNg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bd.b
 * JD-Core Version:    0.6.2
 */