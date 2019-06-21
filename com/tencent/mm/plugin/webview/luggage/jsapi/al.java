package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class al extends bc<n>
{
  private static void a(JSONObject paramJSONObject, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(6356);
    if (bo.ek(paramLinkedList))
      AppMethodBeat.o(6356);
    while (true)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("download_id", -1);
          localJSONObject.put("state", "default");
          paramJSONObject.put(str, localJSONObject);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.JsApiQueryDownloadTask", localException.getMessage());
        }
      }
      AppMethodBeat.o(6356);
    }
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6355);
    ab.i("MicroMsg.JsApiQueryDownloadTask", "invokeInMM");
    try
    {
      paramContext = new org/json/JSONObject;
      paramContext.<init>(paramString);
      com.tencent.mm.ce.a.post(new al.1(this, paramContext, parama));
      AppMethodBeat.o(6355);
      return;
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiQueryDownloadTask", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(6355);
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<n>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "queryDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.al
 * JD-Core Version:    0.6.2
 */