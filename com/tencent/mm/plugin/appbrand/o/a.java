package com.tencent.mm.plugin.appbrand.o;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class a
{
  public static boolean aLC()
  {
    boolean bool = true;
    AppMethodBeat.i(132712);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100159");
    int i;
    if ((localc.isValid()) && ("1".equals(localc.dru().get("isCloseWeappSearch"))))
    {
      i = 1;
      if (i != 0)
        break label60;
      AppMethodBeat.o(132712);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label60: AppMethodBeat.o(132712);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.a
 * JD-Core Version:    0.6.2
 */