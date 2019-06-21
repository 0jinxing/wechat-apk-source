package com.tencent.mm.plugin.messenger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class PluginMessenger$11
  implements e.a
{
  PluginMessenger$11(PluginMessenger paramPluginMessenger)
  {
  }

  public final String g(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(136888);
    if (paramMap == null)
    {
      paramMap = null;
      AppMethodBeat.o(136888);
    }
    while (true)
    {
      return paramMap;
      paramMap = bo.nullAsNil((String)paramMap.get(paramString + ".title"));
      AppMethodBeat.o(136888);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger.11
 * JD-Core Version:    0.6.2
 */