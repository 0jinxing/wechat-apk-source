package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$3
  implements r.a<WxaAttributes>
{
  r$3(String paramString)
  {
  }

  public final String getUsername()
  {
    AppMethodBeat.i(129907);
    String str = p.zo(this.val$appId);
    AppMethodBeat.o(129907);
    return str;
  }

  public final k zv(String paramString)
  {
    AppMethodBeat.i(129908);
    paramString = new k(null, paramString);
    AppMethodBeat.o(129908);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.r.3
 * JD-Core Version:    0.6.2
 */