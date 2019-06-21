package com.tencent.mm.plugin.game.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.commlib.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class b
{
  public static long JQ;
  public static Map<String, String> mHeaders;
  public static String mTH;
  public static boolean mTI;

  public static boolean bDp()
  {
    boolean bool = false;
    AppMethodBeat.i(135808);
    if (bo.isNullOrNil(mTH))
    {
      ab.i("MicroMsg.LuggageGameUinKeyHolder", "fullUrl is null");
      AppMethodBeat.o(135808);
    }
    while (true)
    {
      return bool;
      if (a.bDl() <= 0)
      {
        AppMethodBeat.o(135808);
      }
      else if (System.currentTimeMillis() / 1000L - JQ > a.bDl())
      {
        ab.i("MicroMsg.LuggageGameUinKeyHolder", "updateTime bigger that one hour");
        AppMethodBeat.o(135808);
      }
      else
      {
        ab.d("MicroMsg.LuggageGameUinKeyHolder", "hasValidCache");
        bool = true;
        AppMethodBeat.o(135808);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b
 * JD-Core Version:    0.6.2
 */