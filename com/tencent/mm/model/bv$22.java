package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class bv$22 extends bv.a
{
  bv$22(bv parambv)
  {
    super(parambv, (byte)0);
  }

  public final boolean a(bt parambt)
  {
    boolean bool = false;
    AppMethodBeat.i(72640);
    if ((System.currentTimeMillis() - parambt.eRt > 1800000L) && (bo.getInt(parambt.fns, 0) > 0))
    {
      bv.s(parambt.key, parambt.fns);
      parambt.fns = "0";
      parambt.eRt = System.currentTimeMillis();
      bool = true;
      AppMethodBeat.o(72640);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(72640);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bv.22
 * JD-Core Version:    0.6.2
 */