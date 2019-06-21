package com.tencent.mm.plugin.game.luggage.d;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONObject;

final class e$4$1 extends c
{
  e$4$1(e.4 param4)
  {
  }

  public final String name()
  {
    return "onGetA8KeyUrl";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(135966);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", this.mVe.mTQ);
      if ((this.mVe.mTP != null) && (this.mVe.mTP.size() != 0));
      for (int i = 1; ; i = 0)
      {
        localJSONObject.put("set_cookie", i);
        AppMethodBeat.o(135966);
        return localJSONObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.GameWebPage", "onGetA8Key, e:" + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.e.4.1
 * JD-Core Version:    0.6.2
 */