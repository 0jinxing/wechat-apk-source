package com.tencent.mm.plugin.appbrand.jsapi;

import android.webkit.JavascriptInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

public final class l
{
  private final d hwa;
  private int hwb;
  ConcurrentHashMap<Integer, String> hwc;

  public l(d paramd)
  {
    AppMethodBeat.i(91027);
    this.hwb = 0;
    this.hwc = new ConcurrentHashMap();
    this.hwa = paramd;
    AppMethodBeat.o(91027);
  }

  private static int[] zL(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(91032);
    Object localObject1 = new int[0];
    Object localObject2 = localObject1;
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localObject2 = localObject1;
      localJSONArray.<init>(paramString);
      localObject2 = localObject1;
      paramString = new int[localJSONArray.length()];
      while (true)
      {
        localObject2 = paramString;
        localObject1 = paramString;
        if (i >= localJSONArray.length())
          break;
        localObject2 = paramString;
        paramString[i] = localJSONArray.getInt(i);
        i++;
      }
    }
    catch (Exception paramString)
    {
      ab.e("MicroMsg.AppBrandJSInterface", paramString.getMessage());
      localObject1 = localObject2;
      AppMethodBeat.o(91032);
    }
    return localObject1;
  }

  @JavascriptInterface
  public final String invokeHandler(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(91029);
    try
    {
      paramString1 = this.hwa.n(paramString1, paramString2, paramInt);
      AppMethodBeat.o(91029);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      ab.printErrStackTrace("MicroMsg.AppBrandJSInterface", paramString1, "invokeHandler", new Object[0]);
      AppMethodBeat.o(91029);
    }
    throw paramString1;
  }

  @JavascriptInterface
  public final boolean isDebugPackage()
  {
    AppMethodBeat.i(91031);
    boolean bool = b.dnO();
    AppMethodBeat.o(91031);
    return bool;
  }

  @JavascriptInterface
  public final void publishHandler(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(91028);
    try
    {
      this.hwa.a(paramString1, paramString2, zL(paramString3));
      AppMethodBeat.o(91028);
      return;
    }
    catch (Exception paramString1)
    {
      ab.printErrStackTrace("MicroMsg.AppBrandJSInterface", paramString1, "publishHandler", new Object[0]);
      AppMethodBeat.o(91028);
    }
    throw paramString1;
  }

  @JavascriptInterface
  public final String retrieveEvent(int paramInt)
  {
    AppMethodBeat.i(91030);
    String str = (String)this.hwc.get(Integer.valueOf(paramInt));
    this.hwc.remove(Integer.valueOf(paramInt));
    if (str == null)
    {
      str = "";
      AppMethodBeat.o(91030);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(91030);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l
 * JD-Core Version:    0.6.2
 */