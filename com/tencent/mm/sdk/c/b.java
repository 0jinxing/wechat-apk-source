package com.tencent.mm.sdk.c;

import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;
import java.util.Map;

public abstract class b
{
  protected final String userAgent = "weixin/android";

  public static Map<String, String> Vh(String paramString)
  {
    HashMap localHashMap = new HashMap();
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return localHashMap;
      paramString = paramString.split(";");
      int i = paramString.length;
      for (int j = 0; j < i; j++)
      {
        String[] arrayOfString = paramString[j].split("=");
        if (arrayOfString.length == 2)
          localHashMap.put(arrayOfString[0], arrayOfString[1]);
      }
    }
  }

  public abstract void a(b.b paramb, b.c paramc);

  public final void a(b.b paramb, b.c paramc, ak paramak)
  {
    d.post(new b.1(this, paramb, paramc, paramak), getClass().getName());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.c.b
 * JD-Core Version:    0.6.2
 */