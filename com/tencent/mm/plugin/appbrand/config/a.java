package com.tencent.mm.plugin.appbrand.config;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
  implements j
{
  public a.b heS;
  private Map<String, a.d> heT;
  private Map<String, a.e> heU;
  public a.f heV;
  public a.c heW;
  public a heX;
  public boolean heY = true;
  public boolean heZ = true;
  public boolean hfa = false;
  public Set<String> hfb;
  public JSONArray hfc;
  public ArrayList<String> hfd;
  public boolean hfe = false;
  public JSONObject hff;
  public String hfg;

  private static <T extends a.h> T a(JSONObject paramJSONObject, T paramT, a.h paramh)
  {
    AppMethodBeat.i(86884);
    Object localObject = paramJSONObject;
    if (paramJSONObject == null)
      localObject = a.h.hfE;
    localObject = ((JSONObject)localObject).optJSONObject("window");
    paramJSONObject = (JSONObject)localObject;
    if (localObject == null)
      paramJSONObject = a.h.hfE;
    paramT.hfs = paramJSONObject.optString("navigationBarTitleText", paramh.hfs);
    paramT.hft = paramJSONObject.optString("navigationBarTextStyle", paramh.hft);
    paramT.hfv = paramJSONObject.optString("navigationStyle", paramh.hfv);
    paramT.hfw = paramJSONObject.optString("navigationBarBackgroundColor", paramh.hfw);
    paramT.hfo = paramJSONObject.optString("backgroundColor", paramh.hfo);
    paramT.hfA = paramJSONObject.optBoolean("enablePullDownRefresh", paramh.hfA);
    paramT.hfC = paramJSONObject.optString("backgroundTextStyle", paramh.hfC);
    paramT.hfz = paramJSONObject.optBoolean("enableFullScreen", paramh.hfz);
    JSONObject localJSONObject = paramJSONObject.optJSONObject("navigationBarRightButton");
    localObject = localJSONObject;
    if (localJSONObject == null)
      localObject = a.h.hfE;
    paramT.hfB = paramJSONObject.optBoolean("disableSwipeBack", paramh.hfB);
    paramT.hfy = ((JSONObject)localObject).optBoolean("hide", paramh.hfy);
    paramT.hfx = ((JSONObject)localObject).optString("customButtonIconData", paramh.hfx);
    paramT.hfD = paramJSONObject.optString("pageOrientation", paramh.hfD);
    AppMethodBeat.o(86884);
    return paramT;
  }

  private static Map<String, a.d> a(JSONObject paramJSONObject, a.b paramb)
  {
    AppMethodBeat.i(86885);
    HashMap localHashMap = new HashMap();
    if (paramJSONObject == null)
      AppMethodBeat.o(86885);
    while (true)
    {
      return localHashMap;
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localHashMap.put(str, b(paramJSONObject.optJSONObject(str), paramb));
      }
      AppMethodBeat.o(86885);
    }
  }

  private static a.d b(JSONObject paramJSONObject, a.b paramb)
  {
    AppMethodBeat.i(86887);
    paramJSONObject = (a.d)a(paramJSONObject, new a.d(), paramb);
    AppMethodBeat.o(86887);
    return paramJSONObject;
  }

  private static Set<String> i(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(86889);
    HashSet localHashSet = new HashSet();
    if (paramJSONArray == null)
      AppMethodBeat.o(86889);
    while (true)
    {
      return localHashSet;
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        String str = paramJSONArray.optString(i);
        if (!bo.isNullOrNil(str))
          localHashSet.add(str);
      }
      AppMethodBeat.o(86889);
    }
  }

  private static ArrayList<String> j(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(86890);
    ArrayList localArrayList = new ArrayList();
    if (paramJSONArray == null)
      AppMethodBeat.o(86890);
    while (true)
    {
      return localArrayList;
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        Object localObject1 = paramJSONArray.optJSONObject(i);
        if (localObject1 != null)
        {
          Object localObject2 = ((JSONObject)localObject1).optString("root");
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject1 = localObject2;
            if (!((String)localObject2).startsWith("/"))
              localObject1 = "/".concat(String.valueOf(localObject2));
            localObject2 = localObject1;
            if (!((String)localObject1).endsWith(".js"))
            {
              localObject2 = localObject1;
              if (!((String)localObject1).endsWith("/"))
                localObject2 = (String)localObject1 + "/";
            }
            localArrayList.add(localObject2);
          }
        }
      }
      AppMethodBeat.o(86890);
    }
  }

  private static Map<String, a.e> k(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(86886);
    HashMap localHashMap = new HashMap();
    if (paramJSONObject == null)
      AppMethodBeat.o(86886);
    while (true)
    {
      return localHashMap;
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        JSONObject localJSONObject = paramJSONObject.optJSONObject(str);
        if (localJSONObject != null)
          try
          {
            a.e locale = new com/tencent/mm/plugin/appbrand/config/a$e;
            locale.<init>(str, localJSONObject);
            localHashMap.put(str, locale);
          }
          catch (JSONException localJSONException)
          {
            ab.e("MicroMsg.AppBrandAppConfig", localJSONException.getMessage());
          }
      }
      AppMethodBeat.o(86886);
    }
  }

  private static a.f l(JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(86888);
    Object localObject = paramJSONObject;
    if (paramJSONObject == null)
      localObject = new JSONObject();
    paramJSONObject = new a.f();
    paramJSONObject.hfm = ((JSONObject)localObject).optString("position");
    paramJSONObject.color = ((JSONObject)localObject).optString("color");
    paramJSONObject.hfn = ((JSONObject)localObject).optString("selectedColor");
    paramJSONObject.hfo = ((JSONObject)localObject).optString("backgroundColor");
    paramJSONObject.hfp = ((JSONObject)localObject).optString("borderStyle");
    paramJSONObject.hfq = ((JSONObject)localObject).optBoolean("custom", false);
    try
    {
      JSONArray localJSONArray = ((JSONObject)localObject).getJSONArray("list");
      while (i < localJSONArray.length())
      {
        ArrayList localArrayList = paramJSONObject.cHb;
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        localObject = new com/tencent/mm/plugin/appbrand/config/a$g;
        ((a.g)localObject).<init>();
        ((a.g)localObject).url = localJSONObject.optString("pagePath");
        ((a.g)localObject).text = localJSONObject.optString("text");
        ((a.g)localObject).cIY = localJSONObject.optString("iconData");
        ((a.g)localObject).hfr = localJSONObject.optString("selectedIconData");
        localArrayList.add(localObject);
        i++;
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.AppBrandAppConfig", localException.getMessage());
      AppMethodBeat.o(86888);
    }
    return paramJSONObject;
  }

  public static a yT(String paramString)
  {
    AppMethodBeat.i(86883);
    a locala = new a();
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = (String)localObject;
      locala.hfg = paramString.optString("entryPagePath");
      locala.hff = paramString;
      JSONObject localJSONObject = paramString.optJSONObject("global");
      localObject = new a.b();
      a(localJSONObject, (a.h)localObject, (a.h)localObject);
      locala.heS = ((a.b)localObject);
      locala.heT = a(paramString.optJSONObject("page"), locala.heS);
      locala.heU = k(paramString.optJSONObject("permission"));
      locala.heV = l(paramString.optJSONObject("tabBar"));
      localJSONObject = paramString.optJSONObject("networkTimeout");
      a.c localc = new a.c();
      localObject = localJSONObject;
      if (localJSONObject == null)
        localObject = new JSONObject();
      localc.cRx = ((JSONObject)localObject).optInt("request");
      localc.hfj = ((JSONObject)localObject).optInt("connectSocket");
      localc.hfl = ((JSONObject)localObject).optInt("downloadFile");
      localc.hfk = ((JSONObject)localObject).optInt("uploadFile");
      locala.heW = localc;
      localObject = new a();
      ((a)localObject).hfh = paramString.optString("deviceOrientation", "portrait");
      ((a)localObject).hfi = paramString.optBoolean("showStatusBar", false);
      locala.heX = ((a)localObject);
      locala.heY = paramString.optBoolean("preloadEnabled", true);
      locala.hfa = paramString.has("useCommandBuffer");
      locala.heZ = paramString.optBoolean("useCommandBuffer", false);
      locala.hfb = i(paramString.optJSONArray("requiredBackgroundModes"));
      locala.hfc = paramString.optJSONArray("preloadResources");
      locala.hfd = j(paramString.optJSONArray("preloadSubpackages"));
      locala.hfe = paramString.optBoolean("manualHideSplashScreen", false);
      AppMethodBeat.o(86883);
      return locala;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandAppConfig", paramString.getMessage());
        paramString = new JSONObject();
      }
    }
  }

  public final String ayw()
  {
    AppMethodBeat.i(86882);
    String str;
    if (!bo.isNullOrNil(this.hfg))
    {
      str = this.hfg;
      AppMethodBeat.o(86882);
    }
    while (true)
    {
      return str;
      str = "index.html";
      AppMethodBeat.o(86882);
    }
  }

  public final a.d yR(String paramString)
  {
    AppMethodBeat.i(86880);
    if ((!TextUtils.isEmpty(paramString)) && (this.heT.containsKey(paramString)))
    {
      paramString = (a.d)this.heT.get(paramString);
      AppMethodBeat.o(86880);
    }
    while (true)
    {
      return paramString;
      paramString = b(null, this.heS);
      AppMethodBeat.o(86880);
    }
  }

  public final a.e yS(String paramString)
  {
    AppMethodBeat.i(86881);
    paramString = (a.e)this.heU.get(paramString);
    AppMethodBeat.o(86881);
    return paramString;
  }

  public static final class a
  {
    public String hfh = "portrait";
    public boolean hfi = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a
 * JD-Core Version:    0.6.2
 */