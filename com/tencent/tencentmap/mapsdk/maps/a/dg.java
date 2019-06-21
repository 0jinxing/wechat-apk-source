package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dg extends cx
{
  private static dg b;

  static
  {
    AppMethodBeat.i(98705);
    b = new dg();
    AppMethodBeat.o(98705);
  }

  private static String a(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    AppMethodBeat.i(98703);
    Object localObject = ce.d();
    paramMap.put("A23", bt.d);
    di localdi = new di();
    localdi.c(String.valueOf(paramString));
    localdi.a(System.currentTimeMillis());
    localdi.b(df.a);
    localdi.a((String)localObject);
    paramMap.put("A1", bt.c);
    paramMap.put("A2", eu.a());
    paramMap.put("A4", eu.b());
    paramMap.put("A6", eu.c());
    paramMap.put("A7", eu.e());
    paramMap.put("A23", bt.d);
    paramMap.put("A33", ce.f());
    paramMap.put("A10", df.d);
    paramMap.put("A9", df.c);
    paramMap.put("A19", localObject);
    localdi.a(paramMap);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(eu.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss.SSS") + "|");
    ((StringBuilder)localObject).append("INFO|");
    ((StringBuilder)localObject).append(ce.a.a() + "|");
    ((StringBuilder)localObject).append(df.b + "|");
    ((StringBuilder)localObject).append("beacon|");
    ((StringBuilder)localObject).append("1.8.1|");
    paramString = localdi.b();
    try
    {
      paramMap = URLEncoder.encode(localdi.b(), "utf-8");
      paramString = paramMap;
      label316: ((StringBuilder)localObject).append(paramString + "|");
      ((StringBuilder)localObject).append("|");
      ((StringBuilder)localObject).append("upload_ip|");
      ((StringBuilder)localObject).append("|");
      ((StringBuilder)localObject).append(localdi.a() + "|");
      ((StringBuilder)localObject).append(localdi.d() + "|");
      ((StringBuilder)localObject).append(paramBoolean + "|");
      ((StringBuilder)localObject).append("0|");
      ((StringBuilder)localObject).append("0|");
      paramString = a(localdi.e());
      ((StringBuilder)localObject).append(paramString + "|");
      ((StringBuilder)localObject).append(eu.a(localdi.c(), "yyyy-MM-dd HH:mm:ss") + "|");
      ((StringBuilder)localObject).append("upload_time");
      paramString = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(98703);
      return paramString;
    }
    catch (UnsupportedEncodingException paramMap)
    {
      break label316;
    }
  }

  private static String a(Map<String, String> paramMap)
  {
    AppMethodBeat.i(98704);
    if (paramMap == null)
    {
      paramMap = "";
      AppMethodBeat.o(98704);
    }
    while (true)
    {
      return paramMap;
      Object localObject = paramMap.keySet();
      if (localObject == null)
      {
        paramMap = "";
        AppMethodBeat.o(98704);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        Iterator localIterator = ((Set)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          localStringBuilder.append("&");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append("=");
          localStringBuilder.append((String)paramMap.get(localObject));
        }
        paramMap = localStringBuilder.substring(1);
        localStringBuilder.setLength(0);
        AppMethodBeat.o(98704);
      }
    }
  }

  public static dg d()
  {
    return b;
  }

  public final int a()
  {
    AppMethodBeat.i(98701);
    int i = ce.a.a("report_insert_new_record_num_limit", 5, 100, 100);
    AppMethodBeat.o(98701);
    return i;
  }

  public final void a(String paramString, boolean paramBoolean1, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(98702);
    super.a(a(paramString, paramBoolean1, paramMap), paramBoolean2, paramBoolean3);
    AppMethodBeat.o(98702);
  }

  public final String b()
  {
    return "beacon";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dg
 * JD-Core Version:    0.6.2
 */