package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ds
{
  private static ds a;
  private Map<String, String> b;

  static
  {
    AppMethodBeat.i(98744);
    a = new ds();
    AppMethodBeat.o(98744);
  }

  private ds()
  {
    AppMethodBeat.i(98739);
    this.b = new dt(this, 8, 1.0F, true);
    a(er.b("HalleyOperInfo_" + bt.c(), "", true), false);
    AppMethodBeat.o(98739);
  }

  public static ds a()
  {
    return a;
  }

  public static String a(int paramInt)
  {
    String str = "";
    if (paramInt == 1)
      str = "cm";
    while (true)
    {
      return str;
      if (paramInt == 3)
        str = "ct";
      else if (paramInt == 2)
        str = "uni";
    }
  }

  public final String a(String paramString)
  {
    AppMethodBeat.i(98743);
    if ((eu.a(paramString)) || ("unknown".equals(paramString)))
    {
      paramString = "";
      AppMethodBeat.o(98743);
    }
    while (true)
    {
      return paramString;
      synchronized (this.b)
      {
        paramString = (String)this.b.get(paramString);
        if (!eu.a(paramString))
        {
          AppMethodBeat.o(98743);
          continue;
        }
        paramString = "";
        AppMethodBeat.o(98743);
      }
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98741);
    if ((eu.a(paramString1)) || ("unknown".equals(paramString1)) || (eu.a(paramString2)) || ("unknown".equals(paramString2)))
      AppMethodBeat.o(98741);
    while (true)
    {
      return;
      synchronized (this.b)
      {
        if (!paramString2.equals((String)this.b.get(paramString1)))
        {
          this.b.put(paramString1, paramString2);
          paramString1 = b();
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>("HalleyOperInfo_");
          er.a(bt.c(), paramString1, true);
        }
        AppMethodBeat.o(98741);
      }
    }
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(98740);
    try
    {
      if (!eu.a(paramString));
      synchronized (this.b)
      {
        this.b.clear();
        String[] arrayOfString = paramString.split("h;l");
        if (arrayOfString != null)
        {
          int j = arrayOfString.length;
          while (i < j)
          {
            Object localObject2 = arrayOfString[i].split("h,l");
            if (localObject2.length == 2)
            {
              Object localObject3 = localObject2[0];
              localObject2 = localObject2[1];
              this.b.put(localObject3, localObject2);
            }
            i++;
          }
        }
        if (paramBoolean)
        {
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>("HalleyOperInfo_");
          er.a(bt.c(), paramString, true);
        }
        AppMethodBeat.o(98740);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(98740);
    }
  }

  public final String b()
  {
    AppMethodBeat.i(98742);
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (this.b)
    {
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>(this.b.keySet());
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>(this.b.values());
      for (int i = 0; i < localArrayList1.size(); i++)
      {
        String str1 = (String)localArrayList1.get(i);
        String str2 = (String)localArrayList2.get(i);
        localStringBuilder.append(str1).append("h,l").append(str2).append("h;l");
      }
      ??? = localStringBuilder.toString();
      AppMethodBeat.o(98742);
      return ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ds
 * JD-Core Version:    0.6.2
 */