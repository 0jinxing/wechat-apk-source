package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.bg;
import com.tencent.tencentmap.mapsdk.maps.a.bh;
import com.tencent.tencentmap.mapsdk.maps.a.bk;
import com.tencent.tencentmap.mapsdk.maps.a.bl;
import com.tencent.tencentmap.mapsdk.maps.a.bm;
import com.tencent.tencentmap.mapsdk.maps.a.hs;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.lu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class dv
  implements dr
{
  private static final String[] a;
  private static bh b;
  private static bk c;

  static
  {
    AppMethodBeat.i(101127);
    a = new String[] { hs.a(), "https://vectorsdk.map.qq.com", "https://tafrtt.map.qq.com/rttserverex/", "diditaf.map.qq.com" };
    AppMethodBeat.o(101127);
  }

  private static String b(String paramString)
  {
    AppMethodBeat.i(101126);
    String str1 = "GBK";
    String str2 = str1;
    int i;
    if (paramString != null)
    {
      paramString = paramString.split(";");
      i = paramString.length;
    }
    for (int j = 0; ; j++)
    {
      str2 = str1;
      if (j < i)
      {
        str2 = paramString[j];
        if (!str2.contains("charset"))
          continue;
        paramString = str2.split("=");
        str2 = str1;
        if (paramString.length > 1)
          str2 = paramString[1].trim();
      }
      AppMethodBeat.o(101126);
      return str2;
    }
  }

  public dt a(String paramString)
  {
    AppMethodBeat.i(101116);
    paramString = a(paramString, "QQ Map Mobile");
    AppMethodBeat.o(101116);
    return paramString;
  }

  public dt a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(101117);
    paramString1 = a(paramString1, paramString2, 1);
    AppMethodBeat.o(101117);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(101118);
    paramString1 = a(paramString1, paramString2, paramInt, null);
    AppMethodBeat.o(101118);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, int paramInt, lu paramlu)
  {
    AppMethodBeat.i(101119);
    paramString1 = a(paramString1, paramString2, paramInt, null, paramlu);
    AppMethodBeat.o(101119);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, int paramInt, HashMap<String, String> paramHashMap, lu paramlu)
  {
    AppMethodBeat.i(101120);
    if (c == null)
    {
      paramString1 = new IOException("HttpClient Init Failed and is Null");
      AppMethodBeat.o(101120);
      throw paramString1;
    }
    paramString1 = c.a(paramString1, null);
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      paramString1.b(bool);
      paramString1.a(3000);
      paramString1.b(3000);
      paramString1.a(true);
      if (!StringUtil.isEmpty(paramString2))
        paramString1.a("User-Agent", paramString2);
      if ((paramHashMap == null) || (paramHashMap.isEmpty()))
        break;
      paramHashMap = paramHashMap.entrySet().iterator();
      while (paramHashMap.hasNext())
      {
        paramString2 = (Map.Entry)paramHashMap.next();
        if (paramString2 != null)
          paramString1.a((String)paramString2.getKey(), (String)paramString2.getValue());
      }
    }
    if (paramlu != null)
      paramlu.a(paramString1);
    paramString1 = c.a(paramString1);
    if (paramString1 != null)
    {
      paramInt = paramString1.c();
      int i = paramString1.a();
      if ((i == 0) && (paramInt == 200))
      {
        paramString2 = new dt();
        paramString2.a = paramString1.d();
        paramString2.b = b(paramString1.a("Content-Type"));
        AppMethodBeat.o(101120);
        return paramString2;
      }
      paramString1 = "errorCode" + i + ", statusCode:" + paramInt + ", detailErrorInfo:" + paramString1.b();
      if (i == -4)
      {
        paramString1 = new dw(paramString1);
        AppMethodBeat.o(101120);
        throw paramString1;
      }
      paramString1 = new IOException(paramString1);
      AppMethodBeat.o(101120);
      throw paramString1;
    }
    paramString1 = new IOException("response is null");
    AppMethodBeat.o(101120);
    throw paramString1;
  }

  public dt a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(101121);
    paramString1 = a(paramString1, paramString2, paramArrayOfByte, 1);
    AppMethodBeat.o(101121);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(101122);
    paramString1 = a(paramString1, paramString2, paramArrayOfByte, paramInt, null);
    AppMethodBeat.o(101122);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt, lu paramlu)
  {
    AppMethodBeat.i(101123);
    paramString1 = a(paramString1, paramString2, paramArrayOfByte, paramInt, null, paramlu);
    AppMethodBeat.o(101123);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt, HashMap<String, String> paramHashMap, lu paramlu)
  {
    AppMethodBeat.i(101124);
    paramString1 = a(paramString1, paramString2, paramArrayOfByte, paramInt, paramHashMap, paramlu, 0);
    AppMethodBeat.o(101124);
    return paramString1;
  }

  public dt a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, HashMap<String, String> paramHashMap, lu paramlu, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(101125);
    if (c == null)
    {
      paramString1 = new IOException("HttpClient Init Failed and is Null");
      AppMethodBeat.o(101125);
      throw paramString1;
    }
    paramString1 = c.a(paramString1, paramArrayOfByte);
    paramString1.a(false);
    if (paramInt1 > 0)
      bool = true;
    paramString1.b(bool);
    if (!StringUtil.isEmpty(paramString2))
      paramString1.a("User-Agent", paramString2);
    if ((paramHashMap != null) && (!paramHashMap.isEmpty()))
    {
      paramArrayOfByte = paramHashMap.entrySet().iterator();
      while (paramArrayOfByte.hasNext())
      {
        paramString2 = (Map.Entry)paramArrayOfByte.next();
        if (paramString2 != null)
          paramString1.a((String)paramString2.getKey(), (String)paramString2.getValue());
      }
    }
    if (paramlu != null)
      paramlu.a(paramString1);
    if (paramInt2 > 0)
    {
      paramString1.a(paramInt2);
      paramString1.b(paramInt2);
    }
    while (true)
    {
      paramString2 = c.a(paramString1);
      if (paramString2 == null)
        break label372;
      paramInt2 = paramString2.c();
      paramInt1 = paramString2.a();
      if ((paramInt1 != 0) || (paramInt2 != 200))
        break;
      paramString1 = new dt();
      paramString1.a = paramString2.d();
      paramString1.b = b(paramString2.a("Content-Type"));
      AppMethodBeat.o(101125);
      return paramString1;
      paramString1.a(3000);
      paramString1.b(3000);
    }
    paramString1 = "errorCode" + paramInt1 + ", statusCode:" + paramInt2 + ", detailErrorInfo:" + paramString2.b();
    if (paramInt1 == -4)
    {
      paramString1 = new dw(paramString1);
      AppMethodBeat.o(101125);
      throw paramString1;
    }
    paramString1 = new IOException(paramString1);
    AppMethodBeat.o(101125);
    throw paramString1;
    label372: paramString1 = new IOException("response is null");
    AppMethodBeat.o(101125);
    throw paramString1;
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(101115);
    try
    {
      bh localbh = new com/tencent/tencentmap/mapsdk/maps/a/bh;
      localbh.<init>(paramContext, 3203, ic.a, "android_vector_sdk_4.2.2.1");
      b = localbh;
      c = bg.b(localbh);
      AppMethodBeat.o(101115);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        new StringBuilder("initNet error:").append(paramContext.toString());
        AppMethodBeat.o(101115);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dv
 * JD-Core Version:    0.6.2
 */