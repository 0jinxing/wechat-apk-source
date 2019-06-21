package com.tencent.mm.plugin.topstory.ui.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.topstory.a.c.i;
import com.tencent.mm.plugin.topstory.ui.home.a;
import com.tencent.mm.protocal.protobuf.chs;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class c$2
  implements f
{
  c$2(c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(2149);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("retCode", paramInt2);
      localJSONObject.put("errMsg", paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        ab.w("MicroMsg.TopStory.TopStoryWebData", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      while (true)
      {
        label70: if (this.sHB.sHt != null)
          this.sHB.sHt.abG(localJSONObject.toString());
        AppMethodBeat.o(2149);
        return;
        if (this.sHB.sHt != null)
          localJSONObject.put("requestId", ((i)paramm).cFw().xgs);
      }
    }
    catch (JSONException paramString)
    {
      break label70;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.c.2
 * JD-Core Version:    0.6.2
 */