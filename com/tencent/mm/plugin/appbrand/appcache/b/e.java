package com.tencent.mm.plugin.appbrand.appcache.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public enum e
  implements n
{
  static
  {
    AppMethodBeat.i(129453);
    gVO = new e("INSTANCE");
    gVP = new e[] { gVO };
    AppMethodBeat.o(129453);
  }

  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(129451);
    paramString = (String)paramMap.get(".sysmsg.WeAppSyncCommand.Base64JsonContent");
    if (!bo.isNullOrNil(paramString))
      g.da(paramString).j(new e.1(this));
    AppMethodBeat.o(129451);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.e
 * JD-Core Version:    0.6.2
 */