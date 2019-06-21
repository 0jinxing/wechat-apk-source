package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.v;
import com.tencent.tencentmap.mapsdk.a.w;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class jm extends AsyncTask<Object, Void, Boolean>
{
  private static String a;
  private Context b;
  private WeakReference<jm.a> c;

  public jm(Context paramContext, jm.a parama)
  {
    AppMethodBeat.i(100063);
    this.b = paramContext;
    a = "https://overseactrl.map.qq.com/?" + a(paramContext);
    this.c = new WeakReference(parama);
    AppMethodBeat.o(100063);
  }

  private boolean b(String paramString)
  {
    AppMethodBeat.i(100067);
    boolean bool1;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool1 = false;
      AppMethodBeat.o(100067);
      return bool1;
    }
    JSONObject localJSONObject;
    while (true)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString);
        if (((JSONObject)localObject1).optInt("error", -2147483648) == 0)
          break label117;
        bool1 = lq.d() ^ false | false;
        lq.a(false);
        w.a(this.b).a("worldMapEnabled", false);
        localJSONObject = ((JSONObject)localObject1).optJSONObject("info");
        if (localJSONObject != null)
          break label146;
        AppMethodBeat.o(100067);
      }
      catch (Exception paramString)
      {
        w.a(this.b).a("worldMapProtocolVersion", 0);
        bool1 = false;
        AppMethodBeat.o(100067);
      }
      break;
      label117: bool1 = lq.d() ^ true | false;
      lq.a(true);
      w.a(this.b).a("worldMapEnabled", true);
    }
    label146: int i = localJSONObject.optInt("version");
    if (i != lq.f());
    for (boolean bool2 = true; ; bool2 = false)
    {
      bool1 |= bool2;
      if (bool1)
        break label189;
      AppMethodBeat.o(100067);
      break;
    }
    label189: paramString = localJSONObject.optJSONObject("frontier");
    if (paramString != null)
      a(paramString.optString("path"));
    Object localObject1 = localJSONObject.optJSONObject("tilesrc");
    int k = -1;
    int j = -1;
    int m = -1;
    paramString = null;
    Object localObject2 = new int[0];
    Object localObject3 = "[]";
    String str;
    if (localObject1 != null)
    {
      int n = ((JSONObject)localObject1).optInt("style", 1000);
      m = ((JSONObject)localObject1).optInt("scene", lr.a);
      k = ((JSONObject)localObject1).optInt("version", lr.b);
      str = ((JSONObject)localObject1).optString("url");
      JSONArray localJSONArray = ((JSONObject)localObject1).optJSONArray("range");
      paramString = (String)localObject2;
      localObject1 = localObject3;
      if (!StringUtil.isEmpty(str))
      {
        paramString = (String)localObject2;
        localObject1 = localObject3;
        if (localJSONArray != null)
        {
          localObject1 = localJSONArray.toString();
          paramString = new int[localJSONArray.length()];
          for (j = 0; j < paramString.length; j++)
            paramString[j] = localJSONArray.optInt(j);
        }
      }
      if ((k != lq.c()) || (n != lq.a()))
        ll.a(this.b).a(0);
      j = m;
      localObject2 = paramString;
      paramString = str;
      m = k;
      k = n;
    }
    while (true)
    {
      localObject3 = localJSONObject.optJSONArray("detail");
      str = "";
      if (localObject3 != null)
        str = ((JSONArray)localObject3).toString();
      lq.a(j, k, m, i, paramString, (int[])localObject2, str);
      w.a(this.b).a("worldMapTileUrlRegex", paramString);
      w.a(this.b).a("worldMapTileUrlRangeJson", (String)localObject1);
      w.a(this.b).a("worldMapVersion", m);
      w.a(this.b).a("worldMapStyle", k);
      w.a(this.b).a("worldMapScene", j);
      w.a(this.b).a("worldMapLogoChangeRuleJson", str);
      w.a(this.b).a("worldMapProtocolVersion", i);
      AppMethodBeat.o(100067);
      break;
      localObject1 = "[]";
    }
  }

  protected Boolean a(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(100065);
    try
    {
      paramArrayOfObject = new java/net/URL;
      paramArrayOfObject.<init>(a);
      Object localObject = (HttpURLConnection)paramArrayOfObject.openConnection();
      ((HttpURLConnection)localObject).setRequestProperty("Accept-Encoding", "gzip");
      if (((HttpURLConnection)localObject).getResponseCode() == 200)
      {
        paramArrayOfObject = ((HttpURLConnection)localObject).getHeaderField("Content-Encoding");
        int i;
        if ((paramArrayOfObject != null) && (paramArrayOfObject.length() > 0) && (paramArrayOfObject.toLowerCase().contains("gzip")))
        {
          i = 1;
          if (i == 0)
            break label127;
          paramArrayOfObject = new java/util/zip/GZIPInputStream;
          paramArrayOfObject.<init>(((HttpURLConnection)localObject).getInputStream());
        }
        while (true)
        {
          localObject = new java/lang/String;
          ((String)localObject).<init>(v.a(paramArrayOfObject));
          boolean bool = b((String)localObject);
          paramArrayOfObject = Boolean.valueOf(bool);
          AppMethodBeat.o(100065);
          return paramArrayOfObject;
          i = 0;
          break;
          label127: paramArrayOfObject = ((HttpURLConnection)localObject).getInputStream();
        }
      }
    }
    catch (Throwable paramArrayOfObject)
    {
      while (true)
      {
        paramArrayOfObject = Boolean.FALSE;
        AppMethodBeat.o(100065);
      }
    }
  }

  public String a(Context paramContext)
  {
    AppMethodBeat.i(100064);
    paramContext = String.format("apikey=%s&ver=%s&ctrlver=%s&uk=%s&frontier=%s&ctrlpf=vector&ctrlmb=and", new Object[] { ic.a, "4.2.2", Integer.valueOf(w.a(paramContext).b("worldMapProtocolVersion")), ic.a(), Integer.valueOf(w.a(paramContext).b("worldMapFrontierVersion")) });
    AppMethodBeat.o(100064);
    return paramContext;
  }

  protected void a(Boolean paramBoolean)
  {
    AppMethodBeat.i(100066);
    super.onPostExecute(paramBoolean);
    if ((this.c != null) && (this.c.get() != null))
      ((jm.a)this.c.get()).a(paramBoolean.booleanValue());
    AppMethodBeat.o(100066);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(100068);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(100068);
    while (true)
    {
      return;
      try
      {
        Object localObject = new java/net/URL;
        ((URL)localObject).<init>(paramString);
        paramString = (HttpURLConnection)((URL)localObject).openConnection();
        paramString.setRequestProperty("Accept-Encoding", "gzip");
        if (paramString.getResponseCode() == 200)
        {
          localObject = paramString.getHeaderField("Content-Encoding");
          if ((localObject != null) && (((String)localObject).length() > 0))
            ((String)localObject).toLowerCase().contains("gzip");
          localObject = new java/util/zip/GZIPInputStream;
          ((GZIPInputStream)localObject).<init>(paramString.getInputStream());
          paramString = new java/lang/String;
          paramString.<init>(v.a((InputStream)localObject));
          int i = ln.a().b(paramString);
          w.a(this.b).a("worldMapFrontierVersion", i);
          ln.a().a(paramString);
        }
        AppMethodBeat.o(100068);
      }
      catch (Throwable paramString)
      {
        AppMethodBeat.o(100068);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jm
 * JD-Core Version:    0.6.2
 */