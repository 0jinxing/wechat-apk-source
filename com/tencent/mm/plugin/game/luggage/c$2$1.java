package com.tencent.mm.plugin.game.luggage;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class c$2$1 extends c
{
  c$2$1(c.2 param2)
  {
  }

  public final String name()
  {
    return "onGetA8KeyUrl";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(135826);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", this.mTS.mTQ);
      localJSONObject.put("set_cookie", 1);
      AppMethodBeat.o(135826);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.LuggageGetA8KeyUtil", "onGetA8Key, e:" + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.2.1
 * JD-Core Version:    0.6.2
 */