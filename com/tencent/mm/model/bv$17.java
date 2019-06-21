package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class bv$17 extends bv.a
{
  bv$17(bv parambv)
  {
    super(parambv, (byte)0);
  }

  public final void a(bt parambt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72634);
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
      parambt.fns = paramArrayOfObject[0];
    AppMethodBeat.o(72634);
  }

  public final boolean a(bt parambt)
  {
    AppMethodBeat.i(72635);
    boolean bool;
    if ((System.currentTimeMillis() - parambt.eRt > 3600000L) && (parambt.fns.length() > 0))
    {
      bv.s(parambt.key, parambt.fns);
      parambt.fns = "";
      parambt.eRt = System.currentTimeMillis();
      bool = true;
      AppMethodBeat.o(72635);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72635);
    }
  }

  public final bt d(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72633);
    bt localbt = new bt();
    localbt.key = paramInt;
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
      localbt.fns = paramArrayOfObject[0];
    localbt.eRt = 0L;
    AppMethodBeat.o(72633);
    return localbt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bv.17
 * JD-Core Version:    0.6.2
 */