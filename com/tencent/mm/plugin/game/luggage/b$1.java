package com.tencent.mm.plugin.game.luggage;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class b$1 extends c
{
  public final String name()
  {
    return "onGetA8KeyUrl";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(135807);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", b.mTH);
      if (b.mTI);
      for (int i = 1; ; i = 0)
      {
        localJSONObject.put("set_cookie", i);
        AppMethodBeat.o(135807);
        return localJSONObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.LuggageGameUinKeyHolder", "onGetA8Key, e:" + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.1
 * JD-Core Version:    0.6.2
 */