package com.tencent.liteav.network;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.ArrayList<Lcom.tencent.liteav.network.a;>;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class c
{
  public b a = null;
  public int b = 5;
  private final String c = "http://tcdns.myqcloud.com/queryip";
  private final String d = "forward_stream";
  private final String e = "forward_num";
  private final String f = "request_type";
  private final String g = "sdk_version";
  private final String h = "51451748-d8f2-4629-9071-db2983aa7251";
  private Thread i = null;

  private a a(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(67453);
    a locala = new a();
    try
    {
      locala.a = paramJSONObject.getString("ip");
      locala.b = paramJSONObject.getString("port");
      locala.e = 0;
      locala.c = false;
      locala.d = b(locala.a);
      if ((paramJSONObject.has("type")) && (paramJSONObject.getInt("type") == 2))
        locala.c = true;
      AppMethodBeat.o(67453);
      paramJSONObject = locala;
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        paramJSONObject = null;
        AppMethodBeat.o(67453);
      }
    }
  }

  private ArrayList<a> a(String paramString)
  {
    a locala = null;
    int j = 0;
    AppMethodBeat.i(67452);
    Object localObject = new ArrayList();
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      int k = localJSONObject.getInt("state");
      if (k != 0)
        AppMethodBeat.o(67452);
      for (localObject = locala; ; localObject = locala)
      {
        return localObject;
        paramString = localJSONObject.getJSONObject("content").getJSONArray("list");
        if (paramString != null)
          break;
        AppMethodBeat.o(67452);
      }
      int m;
      for (k = 0; ; k++)
      {
        m = j;
        if (k >= paramString.length())
          break;
        locala = a((JSONObject)paramString.opt(k));
        if ((locala != null) && (locala.c))
          ((ArrayList)localObject).add(locala);
      }
      while (m < paramString.length())
      {
        locala = a((JSONObject)paramString.opt(m));
        if ((locala != null) && (!locala.c))
          ((ArrayList)localObject).add(locala);
        m++;
      }
      if ((com.tencent.liteav.basic.f.b.a().a("Network", "EnableRouteOptimize") == 1L) && (i.a().c()))
      {
        paramString = a((ArrayList)localObject, true);
        localObject = paramString;
        paramString = (String)localObject;
      }
    }
    catch (JSONException paramString)
    {
      try
      {
        while (true)
        {
          a((ArrayList)localObject);
          AppMethodBeat.o(67452);
          continue;
          long l1 = com.tencent.liteav.basic.f.b.a().a("Network", "RouteSamplingMaxCount");
          if (l1 < 1L)
            break;
          long l2 = i.a().a("51451748-d8f2-4629-9071-db2983aa7251");
          if (l2 > l1)
            break;
          paramString = a((ArrayList)localObject, false);
          localObject = paramString;
          paramString = (String)localObject;
          i.a().a("51451748-d8f2-4629-9071-db2983aa7251", l2 + 1L);
          paramString = (String)localObject;
          a((ArrayList)localObject);
          AppMethodBeat.o(67452);
        }
        paramString = paramString;
        paramString = (String)localObject;
        AppMethodBeat.o(67452);
        localObject = paramString;
      }
      catch (JSONException localJSONException)
      {
        while (true);
      }
    }
  }

  private ArrayList<a> a(ArrayList<a> paramArrayList, boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(67456);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
      AppMethodBeat.o(67456);
    for (paramArrayList = (ArrayList<a>)localObject1; ; paramArrayList = (ArrayList<a>)localObject1)
    {
      return paramArrayList;
      ArrayList localArrayList = new ArrayList();
      Object localObject2 = new ArrayList();
      Iterator localIterator = paramArrayList.iterator();
      paramArrayList = null;
      while (localIterator.hasNext())
      {
        localObject1 = (a)localIterator.next();
        if (((a)localObject1).c)
          localArrayList.add(localObject1);
        else if (((a)localObject1).d)
          paramArrayList = (ArrayList<a>)localObject1;
        else
          ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = new ArrayList();
      label243: 
      while ((localArrayList.size() > 0) || (((ArrayList)localObject2).size() > 0))
      {
        if (paramBoolean)
        {
          if (paramArrayList != null)
            ((ArrayList)localObject1).add(paramArrayList);
          if (localArrayList.size() > 0)
          {
            ((ArrayList)localObject1).add(localArrayList.get(0));
            localArrayList.remove(0);
          }
        }
        while (true)
        {
          if (((ArrayList)localObject2).size() <= 0)
            break label243;
          ((ArrayList)localObject1).add(((ArrayList)localObject2).get(0));
          ((ArrayList)localObject2).remove(0);
          break;
          if (localArrayList.size() > 0)
          {
            ((ArrayList)localObject1).add(localArrayList.get(0));
            localArrayList.remove(0);
          }
          if (paramArrayList != null)
            ((ArrayList)localObject1).add(paramArrayList);
        }
      }
      int j = ((ArrayList)localObject1).size();
      if (j > 0)
      {
        localObject2 = (a)((ArrayList)localObject1).get(j - 1);
        if ((localObject2 != null) && (!b(((a)localObject2).a)) && (paramArrayList != null))
          ((ArrayList)localObject1).add(paramArrayList);
      }
      AppMethodBeat.o(67456);
    }
  }

  private void a(ArrayList<a> paramArrayList)
  {
    AppMethodBeat.i(67457);
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      Iterator localIterator = paramArrayList.iterator();
      a locala;
      for (paramArrayList = ""; localIterator.hasNext(); paramArrayList = paramArrayList + " \n Nearest IP: " + locala.a + " Port: " + locala.b + " Q Channel: " + locala.c)
        locala = (a)localIterator.next();
      TXCLog.e("TXCIntelligentRoute", paramArrayList);
    }
    AppMethodBeat.o(67457);
  }

  private String b(String paramString, int paramInt)
  {
    AppMethodBeat.i(67450);
    StringBuffer localStringBuffer = new StringBuffer("");
    try
    {
      InputStream localInputStream = c(paramString, paramInt);
      if (localInputStream == null)
      {
        paramString = "";
        AppMethodBeat.o(67450);
        return paramString;
      }
      paramString = new java/io/BufferedReader;
      Object localObject = new java/io/InputStreamReader;
      ((InputStreamReader)localObject).<init>(localInputStream);
      paramString.<init>((Reader)localObject);
      while (true)
      {
        localObject = paramString.readLine();
        if (localObject == null)
          break;
        localStringBuffer.append((String)localObject);
      }
    }
    catch (IOException paramString)
    {
      while (true)
      {
        paramString = localStringBuffer.toString();
        AppMethodBeat.o(67450);
      }
    }
  }

  private boolean b(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(67454);
    int k;
    if (paramString != null)
    {
      paramString = paramString.split("[.]");
      int j = paramString.length;
      k = 0;
      if (k < j)
        if (!c(paramString[k]))
        {
          bool = true;
          AppMethodBeat.o(67454);
        }
    }
    while (true)
    {
      return bool;
      k++;
      break;
      AppMethodBeat.o(67454);
    }
  }

  private InputStream c(String paramString, int paramInt)
  {
    AppMethodBeat.i(67451);
    Object localObject = new URL("http://tcdns.myqcloud.com/queryip").openConnection();
    try
    {
      localObject = (HttpURLConnection)localObject;
      ((HttpURLConnection)localObject).setRequestMethod("GET");
      ((HttpURLConnection)localObject).setRequestProperty("forward_stream", paramString);
      ((HttpURLConnection)localObject).setRequestProperty("forward_num", "2");
      ((HttpURLConnection)localObject).setRequestProperty("sdk_version", TXCCommonUtil.getSDKVersionStr());
      if (paramInt == 1)
        ((HttpURLConnection)localObject).setRequestProperty("request_type", "1");
      while (true)
      {
        if (this.b > 0)
        {
          ((HttpURLConnection)localObject).setConnectTimeout(this.b * 1000);
          ((HttpURLConnection)localObject).setReadTimeout(this.b * 1000);
        }
        ((HttpURLConnection)localObject).connect();
        if (((HttpURLConnection)localObject).getResponseCode() != 200)
          break;
        paramString = ((HttpURLConnection)localObject).getInputStream();
        AppMethodBeat.o(67451);
        return paramString;
        if (paramInt != 2)
          break label151;
        ((HttpURLConnection)localObject).setRequestProperty("request_type", "2");
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        continue;
        label151: ((HttpURLConnection)localObject).setRequestProperty("request_type", "3");
      }
    }
  }

  private boolean c(String paramString)
  {
    AppMethodBeat.i(67455);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    AppMethodBeat.o(67455);
    return bool;
  }

  public void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(67449);
    this.i = new c.1(this, "TXCPushRoute", paramString, paramInt);
    this.i.start();
    AppMethodBeat.o(67449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.c
 * JD-Core Version:    0.6.2
 */