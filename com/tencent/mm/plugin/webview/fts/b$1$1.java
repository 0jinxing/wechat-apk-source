package com.tencent.mm.plugin.webview.fts;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class b$1$1
  implements Runnable
{
  b$1$1(b.1 param1, b.f paramf, j paramj, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5672);
    Object localObject1;
    JSONObject localJSONObject1;
    JSONArray localJSONArray;
    Object localObject2;
    if (this.ufr.ufG != 0)
    {
      ab.i("MicroMsg.FTS.FTSWebViewLogic", "historySearchResultListener callback， id %d", new Object[] { Integer.valueOf(this.ufr.ufG) });
      g localg = h.JR(this.ufr.ufG);
      localObject1 = this.ufs;
      try
      {
        ab.i("MicroMsg.MsgHandler", "onGetSearchHistory %s", new Object[] { ((ArrayList)localObject1).toString() });
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localJSONObject1.put("ret", 0);
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>();
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject3 = (String)((Iterator)localObject1).next();
          JSONObject localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
          localJSONObject2.put("word", localObject3);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localJSONObject2.put("id", System.currentTimeMillis());
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localJSONObject2.put("timeStamp", System.currentTimeMillis());
          ((JSONArray)localObject2).put(localJSONObject2);
        }
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.MsgHandler", localJSONException, "", new Object[0]);
      }
    }
    else
    {
      AppMethodBeat.o(5672);
    }
    while (true)
    {
      return;
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      ((JSONObject)localObject1).put("items", localObject2);
      localJSONArray.put(localObject1);
      localJSONObject1.put("data", localJSONArray);
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      ((Bundle)localObject2).putString("data", localJSONObject1.toString());
      try
      {
        if (localJSONException.umI == null)
          break label365;
        localJSONException.umI.c(143, (Bundle)localObject2);
        AppMethodBeat.o(5672);
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("onGetSearchHistory exception");
        ab.w("MicroMsg.MsgHandler", localRemoteException.getMessage());
        AppMethodBeat.o(5672);
      }
      continue;
      label365: ab.i("MicroMsg.MsgHandler", "callbacker is null");
      AppMethodBeat.o(5672);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.1.1
 * JD-Core Version:    0.6.2
 */