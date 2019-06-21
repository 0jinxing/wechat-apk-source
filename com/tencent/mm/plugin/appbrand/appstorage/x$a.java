package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;

public enum x$a
  implements com.tencent.mm.plugin.appbrand.appstorage.a.a
{
  static
  {
    AppMethodBeat.i(129526);
    gYE = new a("INSTANCE");
    gYF = new a[] { gYE };
    AppMethodBeat.o(129526);
  }

  public final int ys(String paramString)
  {
    AppMethodBeat.i(129525);
    paramString = com.tencent.mm.plugin.appbrand.a.wI(paramString);
    int i;
    if ((paramString == null) || (paramString.atI() == null))
    {
      i = 0;
      AppMethodBeat.o(129525);
    }
    while (true)
    {
      return i;
      i = paramString.atI().uin;
      AppMethodBeat.o(129525);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.x.a
 * JD-Core Version:    0.6.2
 */