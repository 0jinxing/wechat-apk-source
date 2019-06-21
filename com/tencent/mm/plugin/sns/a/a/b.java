package com.tencent.mm.plugin.sns.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements a
{
  public final int cez()
  {
    return 11855;
  }

  public final void e(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35693);
    switch (paramInt)
    {
    default:
      ab.e("Kv_11855", "unknown type %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(35693);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      h.pYm.e(11855, paramArrayOfObject);
      AppMethodBeat.o(35693);
      continue;
      h.pYm.e(14646, paramArrayOfObject);
      AppMethodBeat.o(35693);
    }
  }

  public final void t(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35692);
    e(0, paramArrayOfObject);
    AppMethodBeat.o(35692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.a.b
 * JD-Core Version:    0.6.2
 */