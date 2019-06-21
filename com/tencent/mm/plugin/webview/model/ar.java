package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class ar
{
  private static Map<String, String> unw;

  static
  {
    AppMethodBeat.i(6799);
    unw = new HashMap();
    AppMethodBeat.o(6799);
  }

  public static String aek(String paramString)
  {
    AppMethodBeat.i(6797);
    ab.i("MicroMsg.WebviewSharedUrlCache", "rawUrl:[%s]", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebviewSharedUrlCache", "rawUrl is null");
      paramString = null;
      AppMethodBeat.o(6797);
    }
    while (true)
    {
      return paramString;
      String str1 = (String)unw.get(paramString);
      String str2 = str1;
      int i;
      if (bo.isNullOrNil(str1))
      {
        i = paramString.indexOf("#");
        if (i >= 0)
          break label109;
      }
      label109: for (str2 = paramString; ; str2 = paramString.substring(0, i))
      {
        str2 = (String)unw.get(str2);
        if (!bo.isNullOrNil(str2))
          break label119;
        AppMethodBeat.o(6797);
        break;
      }
      label119: AppMethodBeat.o(6797);
      paramString = str2;
    }
  }

  public static void clear()
  {
    AppMethodBeat.i(6798);
    unw.clear();
    AppMethodBeat.o(6798);
  }

  public static void hb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6796);
    ab.i("MicroMsg.WebviewSharedUrlCache", "rawurl:[%s], shareUrl:[%s]", new Object[] { paramString1, paramString2 });
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.WebviewSharedUrlCache", "rawurl is null or share url is null");
      AppMethodBeat.o(6796);
    }
    while (true)
    {
      return;
      if (unw.containsKey(paramString1))
      {
        ab.i("MicroMsg.WebviewSharedUrlCache", "has add this rawurl");
        AppMethodBeat.o(6796);
      }
      else
      {
        unw.put(paramString1, paramString2);
        AppMethodBeat.o(6796);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ar
 * JD-Core Version:    0.6.2
 */