package com.tencent.mm.plugin.game.luggage.c.a;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbb;
import org.json.JSONObject;

final class e$1 extends c
{
  e$1(e parame, bbb parambbb)
  {
  }

  public final String name()
  {
    return "onCustomGameMenuClicked";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(135902);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("itemId", this.mUu.wFQ);
      AppMethodBeat.o(135902);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(135902);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.e.1
 * JD-Core Version:    0.6.2
 */