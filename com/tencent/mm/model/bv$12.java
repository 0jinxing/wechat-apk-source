package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class bv$12 extends bv.a
{
  bv$12(bv parambv)
  {
    super(parambv, (byte)0);
  }

  public final boolean a(bt parambt)
  {
    boolean bool = false;
    AppMethodBeat.i(72628);
    if ((System.currentTimeMillis() - parambt.eRt > 3600000L) && (bo.getInt(parambt.fns, 0) > 0))
    {
      bv.s(23, parambt.fns + "_43");
      parambt.fns = "0";
      parambt.eRt = System.currentTimeMillis();
      bool = true;
      AppMethodBeat.o(72628);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(72628);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bv.12
 * JD-Core Version:    0.6.2
 */