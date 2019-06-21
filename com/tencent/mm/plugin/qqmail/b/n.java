package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class n
{
  protected static int azs = 0;
  protected static String host = "";
  protected static String pua;
  protected static String userAgent = "weixin/android";

  static
  {
    pua = "";
  }

  public static void Vg(String paramString)
  {
    pua = paramString;
  }

  protected static Map<String, String> Vh(String paramString)
  {
    HashMap localHashMap = new HashMap();
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return localHashMap;
      String[] arrayOfString = paramString.split(";");
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        paramString = arrayOfString[j].split("=");
        if (paramString.length == 2)
          localHashMap.put(paramString[0], paramString[1]);
      }
    }
  }

  protected static String W(Map<String, String> paramMap)
  {
    if ((paramMap == null) || (paramMap.size() == 0));
    StringBuilder localStringBuilder;
    for (paramMap = ""; ; paramMap = localStringBuilder.toString())
    {
      return paramMap;
      localStringBuilder = new StringBuilder();
      Iterator localIterator = paramMap.keySet().iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append(URLEncoder.encode(str, "utf-8")).append('=').append(URLEncoder.encode((String)paramMap.get(str), "utf-8"));
        i++;
        if (paramMap.size() > i)
          localStringBuilder.append("; ");
      }
    }
  }

  protected static String f(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((!paramString2.startsWith("http://")) && (!paramString2.startsWith("https://")))
      localStringBuilder.append(paramString1 + host);
    localStringBuilder.append(paramString2);
    if (paramMap == null);
    for (paramString1 = localStringBuilder.toString(); ; paramString1 = localStringBuilder.toString())
    {
      return paramString1;
      localStringBuilder.append('?');
      Iterator localIterator = paramMap.keySet().iterator();
      int i = 1;
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramString2 = (String)paramMap.get(str);
        if (i != 0);
        for (paramString1 = ""; ; paramString1 = "&")
        {
          localStringBuilder.append(paramString1).append(URLEncoder.encode(str, "utf-8")).append('=').append(URLEncoder.encode(bo.nullAsNil(paramString2), "utf-8"));
          i = 0;
          break;
        }
      }
    }
  }

  public static void setHost(String paramString)
  {
    af.host = paramString;
  }

  public static void setUserAgent(String paramString)
  {
    af.userAgent = paramString;
  }

  public abstract c a(String paramString1, String paramString2, n.b paramb, n.a parama);

  public abstract void cancel();

  public static final class c
  {
    String content;
    Map<String, String> pud;
    int status = 0;

    public c(int paramInt, Map<String, String> paramMap, String paramString)
    {
      this.status = paramInt;
      this.pud = paramMap;
      this.content = paramString;
    }

    public final String toString()
    {
      AppMethodBeat.i(67959);
      StringBuilder localStringBuilder = new StringBuilder("Response status:").append(this.status).append(", cookie:");
      Object localObject;
      if (this.pud != null)
      {
        localObject = this.pud;
        localObject = localStringBuilder.append(localObject).append(", content length :");
        if (this.content == null)
          break label87;
      }
      label87: for (int i = this.content.length(); ; i = 0)
      {
        localObject = i;
        AppMethodBeat.o(67959);
        return localObject;
        localObject = "";
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.n
 * JD-Core Version:    0.6.2
 */