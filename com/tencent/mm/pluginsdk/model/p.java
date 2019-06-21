package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.x5.sdk.d;
import java.util.HashMap;
import org.json.JSONObject;

public final class p
{
  public static int a(Context paramContext, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(79225);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("local", "true");
    localHashMap.put("style", "1");
    String str = "";
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("path", paramString1);
      localJSONObject.put("ext", paramString2);
      localJSONObject.put("token", paramString3);
      paramString1 = localJSONObject.toString();
      int i = d.startMiniQBToLoadUrl(paramContext, paramString1, localHashMap, paramValueCallback);
      AppMethodBeat.o(79225);
      return i;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.QbReaderLogic", paramString1, "openReadFile", new Object[0]);
        paramString1 = str;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.p
 * JD-Core Version:    0.6.2
 */