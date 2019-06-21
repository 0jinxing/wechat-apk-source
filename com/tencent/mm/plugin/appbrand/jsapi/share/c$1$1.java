package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, SendAppMessageTask paramSendAppMessageTask, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131438);
    ab.i("MicroMsg.JsApiShareAppMessage", "task callback");
    this.hWr.aBW();
    Object localObject = new HashMap();
    JSONArray localJSONArray = new JSONArray();
    try
    {
      if (!bo.ek(this.hWr.hWU))
      {
        Iterator localIterator = this.hWr.hWU.iterator();
        while (localIterator.hasNext())
        {
          ShareInfo localShareInfo = (ShareInfo)localIterator.next();
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("shareKey", localShareInfo.bQi);
          localJSONObject.put("shareName", localShareInfo.bQh);
          localJSONArray.put(localJSONObject);
        }
      }
    }
    catch (JSONException localJSONException)
    {
      ab.e("MicroMsg.JsApiShareAppMessage", Log.getStackTraceString(localJSONException));
      ((Map)localObject).put("shareInfos", localJSONArray);
      this.hWs.hsj.M(this.hWs.eIl, this.hWs.hWq.j("ok", (Map)localObject));
      int i = 16;
      localObject = this.cgl + ":";
      if (this.cgl.toLowerCase().endsWith("@chatroom"))
        i = 15;
      c.a(this.hWs.val$appId, this.hWs.hWe, i, (String)localObject, 1, this.val$resultCode);
      if ("wxfe02ecfe70800f46".equalsIgnoreCase(this.hWs.val$appId))
        h.pYm.e(16979, new Object[] { this.hWs.val$appId, this.hWs.hWe, Integer.valueOf(0), Integer.valueOf(3) });
      AppMethodBeat.o(131438);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.c.1.1
 * JD-Core Version:    0.6.2
 */