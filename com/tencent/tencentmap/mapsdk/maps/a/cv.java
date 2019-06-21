package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class cv
{
  public int a;
  public String b;
  public int c;
  public byte[] d;
  private Map<String, String> e;

  public cv(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = 0;
  }

  public final String a(String paramString)
  {
    AppMethodBeat.i(98672);
    if ((this.e != null) && (!TextUtils.isEmpty(paramString)))
    {
      paramString = (String)this.e.get(paramString.toLowerCase());
      if (!TextUtils.isEmpty(paramString))
        AppMethodBeat.o(98672);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(98672);
    }
  }

  public final void a(Map<String, String> paramMap)
  {
    AppMethodBeat.i(98671);
    this.e = new HashMap();
    if (paramMap.size() > 0)
    {
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.e.put(str.toLowerCase(), paramMap.get(str));
      }
    }
    AppMethodBeat.o(98671);
  }

  public final String toString()
  {
    AppMethodBeat.i(98673);
    StringBuilder localStringBuilder = new StringBuilder("errorCode:").append(this.a).append(",errorInfo:").append(this.b).append(",httpStatus:").append(this.c).append(",headers:").append(this.e).append(",body:");
    if (this.d != null);
    for (Object localObject = Integer.valueOf(this.d.length); ; localObject = "null")
    {
      localObject = localObject;
      AppMethodBeat.o(98673);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cv
 * JD-Core Version:    0.6.2
 */