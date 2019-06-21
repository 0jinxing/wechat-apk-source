package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.b.e;
import com.tencent.mm.plugin.appbrand.canvas.b.e.a;
import java.util.Map;

public final class f extends a<BasePathActionArg>
{
  private static f hdD;

  static
  {
    AppMethodBeat.i(103642);
    hdD = new f();
    AppMethodBeat.o(103642);
  }

  public static f aym()
  {
    return hdD;
  }

  public final <T> T yA(String paramString)
  {
    AppMethodBeat.i(103641);
    paramString = ((com.tencent.mm.plugin.appbrand.canvas.b.a)e.a.hdT.hdS.get(paramString)).ayr();
    AppMethodBeat.o(103641);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.f
 * JD-Core Version:    0.6.2
 */